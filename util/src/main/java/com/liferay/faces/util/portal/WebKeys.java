/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.util.portal;

/**
 * This interface provides a means of backporting Liferay Portal 6.1.x constants to branches of Liferay Faces that are
 * designed to be used with older versions of the portal.
 *
 * @author  Neil Griffin
 */
@Deprecated
public interface WebKeys {

	/**
	 * @deprecated  No replacement available since this attribute does not exist in Liferay Portal 5.2.
	 */
	@Deprecated
	public static final String AUI_SCRIPT_DATA = "LIFERAY_SHARED_AUI_SCRIPT_DATA";

	/**
	 * @deprecated  No replacement available since this attribute does not exist in Liferay Portal 5.2.
	 */
	@Deprecated
	public static final String RENDER_PORTLET = "RENDER_PORTLET";

	/**
	 * @deprecated  Replaced by {@link com.liferay.portal.kernel.util.WebKeys#THEME_DISPLAY}.
	 */
	@Deprecated
	public static final String THEME_DISPLAY = "THEME_DISPLAY";
}
