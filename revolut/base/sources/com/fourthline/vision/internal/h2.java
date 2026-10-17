package com.fourthline.vision.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class h2 implements x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36311a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void collectApiSupport(Context context, Map<String, Object> map) {
        boolean zIsOpenGLES3Supported = isOpenGLES3Supported(context);
        boolean zIsVulkanSupported = isVulkanSupported(context);
        map.put("opengles3_supported", Boolean.valueOf(zIsOpenGLES3Supported));
        map.put("vulkan_supported", Boolean.valueOf(zIsVulkanSupported));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void collectGlStrings(Map<String, Object> map) throws Throwable {
        Throwable th10;
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLSurface eGLSurface2;
        EGLContext eGLContext2;
        Object obj2;
        Object obj3;
        EGLDisplay eGLDisplay = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        eGLSurfaceEglCreatePbufferSurface = null;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = null;
        EGLDisplay eGLDisplay2 = null;
        try {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            try {
                if (!Intrinsics.f(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr2 = new int[1];
                        if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                            Integer.toHexString(EGL14.eglGetError());
                            if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                                EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                            }
                        } else if (iArr2[0] != 0) {
                            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            try {
                                if (Intrinsics.f(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                                    Integer.toHexString(EGL14.eglGetError());
                                    if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                                        EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                                        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                                        if (eGLContextEglCreateContext != null) {
                                            EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                        }
                                        EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                                    }
                                } else {
                                    eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
                                    if (Intrinsics.f(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
                                        Integer.toHexString(EGL14.eglGetError());
                                        if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                                            EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
                                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface5, eGLSurface5, EGL14.EGL_NO_CONTEXT);
                                            if (eGLSurfaceEglCreatePbufferSurface != null) {
                                                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                            }
                                            if (eGLContextEglCreateContext != null) {
                                                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                            }
                                            EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                                        }
                                    } else if (EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                                        String strGlGetString = GLES20.glGetString(7937);
                                        if (strGlGetString != null) {
                                            map.put("gpu_renderer", strGlGetString);
                                        }
                                        String strGlGetString2 = GLES20.glGetString(7936);
                                        if (strGlGetString2 != null) {
                                            map.put("gpu_vendor", strGlGetString2);
                                        }
                                        map.containsKey("gpu_renderer");
                                        map.containsKey("gpu_vendor");
                                        if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                                            EGLSurface eGLSurface6 = EGL14.EGL_NO_SURFACE;
                                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface6, eGLSurface6, EGL14.EGL_NO_CONTEXT);
                                            if (eGLSurfaceEglCreatePbufferSurface != null) {
                                                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                            }
                                            if (eGLContextEglCreateContext != null) {
                                                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                            }
                                            EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                                        }
                                    } else {
                                        Integer.toHexString(EGL14.eglGetError());
                                        if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                                            EGLSurface eGLSurface7 = EGL14.EGL_NO_SURFACE;
                                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface7, eGLSurface7, EGL14.EGL_NO_CONTEXT);
                                            if (eGLSurfaceEglCreatePbufferSurface != null) {
                                                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                            }
                                            if (eGLContextEglCreateContext != null) {
                                                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                                            }
                                            EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                eGLSurface2 = null;
                                obj3 = eGLContextEglCreateContext;
                                eGLDisplay2 = eGLDisplayEglGetDisplay;
                                eGLContext2 = obj3;
                                if (eGLDisplay2 == null || eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                                    return;
                                }
                                EGLSurface eGLSurface8 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface8, eGLSurface8, EGL14.EGL_NO_CONTEXT);
                                if (eGLSurface2 != null) {
                                    EGL14.eglDestroySurface(eGLDisplay2, eGLSurface2);
                                }
                                if (eGLContext2 != 0) {
                                    EGL14.eglDestroyContext(eGLDisplay2, eGLContext2);
                                }
                                EGL14.eglTerminate(eGLDisplay2);
                            } catch (Throwable th11) {
                                th10 = th11;
                                eGLSurface = null;
                                obj2 = eGLContextEglCreateContext;
                                eGLDisplay = eGLDisplayEglGetDisplay;
                                eGLContext = obj2;
                                if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                                    throw th10;
                                }
                                EGLSurface eGLSurface9 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface9, eGLSurface9, EGL14.EGL_NO_CONTEXT);
                                if (eGLSurface != null) {
                                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                }
                                if (eGLContext != 0) {
                                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                                }
                                EGL14.eglTerminate(eGLDisplay);
                                throw th10;
                            }
                        } else if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGLSurface eGLSurface10 = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface10, eGLSurface10, EGL14.EGL_NO_CONTEXT);
                            EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        }
                    } else {
                        Integer.toHexString(EGL14.eglGetError());
                        if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGLSurface eGLSurface11 = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface11, eGLSurface11, EGL14.EGL_NO_CONTEXT);
                            EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                        }
                    }
                } else if (eGLDisplayEglGetDisplay != null && !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLSurface eGLSurface12 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface12, eGLSurface12, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglTerminate(eGLDisplayEglGetDisplay);
                }
            } catch (Exception unused2) {
                eGLSurface2 = eGLSurfaceEglCreatePbufferSurface;
                obj3 = eGLSurface2;
            } catch (Throwable th12) {
                th10 = th12;
                eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                obj2 = eGLSurface;
            }
        } catch (Exception unused3) {
            eGLSurface2 = null;
            eGLContext2 = 0;
        } catch (Throwable th13) {
            th10 = th13;
            eGLSurface = null;
            eGLContext = 0;
        }
    }

    private final boolean isOpenGLES3Supported(Context context) {
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        return activityManager != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608;
    }

    private final boolean isVulkanSupported(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.vulkan.version");
    }

    @Override // com.fourthline.vision.internal.x6
    @NotNull
    public Map<String, Object> collect(@NotNull Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        collectGlStrings(linkedHashMap);
        collectApiSupport(context, linkedHashMap);
        Objects.toString(linkedHashMap.keySet());
        return linkedHashMap;
    }
}
