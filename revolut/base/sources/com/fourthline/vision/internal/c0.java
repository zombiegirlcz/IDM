package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36032b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36033c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f36034a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c0 documentCamera$fourthline_vision_release() {
            return new c0(new z2());
        }

        @NotNull
        public final c0 selfieCamera$fourthline_vision_release() {
            return new c0(new xa());
        }

        private a() {
        }
    }

    public c0(@NotNull a0 cameraInfoInstanceProvider) {
        Intrinsics.checkNotNullParameter(cameraInfoInstanceProvider, "cameraInfoInstanceProvider");
        this.f36034a = cameraInfoInstanceProvider;
    }

    @NotNull
    public final s provideCamera2(@NotNull CameraManager cameraManager, @NotNull Handler handler, @NotNull b0 cameraInfoProvider) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(cameraInfoProvider, "cameraInfoProvider");
        return new s(cameraManager, handler, cameraInfoProvider);
    }

    @NotNull
    public final x provideCameraFocusManager(@NotNull s camera2, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(camera2, "camera2");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new x(camera2, skm.e0.D(skm.e0.c(coroutineContext), skm.e0.d()));
    }

    @NotNull
    public b0 provideCameraInfoProvider(@NotNull CameraManager cameraManager, @NotNull Display display, @NotNull la scannerConfig) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        return this.f36034a.provideCameraInfoProvider(cameraManager, display, scannerConfig);
    }

    @NotNull
    public final CameraManager provideCameraManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("camera");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    @NotNull
    public final Display provideDisplay(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "getDefaultDisplay(...)");
        return defaultDisplay;
    }
}
