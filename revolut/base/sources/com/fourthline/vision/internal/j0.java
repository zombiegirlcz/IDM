package com.fourthline.vision.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.view.Surface;
import com.fourthline.vision.internal.b0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class j0 {
    private static final b f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36385g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession f36386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraCharacteristics f36387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraDevice f36388c;
    private final b0.a d;
    private final Handler e;

    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b0.a.values().length];
            try {
                iArr[b0.a.f35981a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.a.f35982b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j0(@NotNull CameraCaptureSession cameraCaptureSession, @NotNull CameraCharacteristics cameraCharacteristics, @NotNull CameraDevice camera, @NotNull b0.a cameraTemplate, @NotNull Handler cameraHandler) {
        Intrinsics.checkNotNullParameter(cameraCaptureSession, "cameraCaptureSession");
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(cameraTemplate, "cameraTemplate");
        Intrinsics.checkNotNullParameter(cameraHandler, "cameraHandler");
        this.f36386a = cameraCaptureSession;
        this.f36387b = cameraCharacteristics;
        this.f36388c = camera;
        this.d = cameraTemplate;
        this.e = cameraHandler;
    }

    private final CaptureRequest.Builder createCaptureRequestBuilder(List<? extends Surface> list) throws CameraAccessException {
        int i = c.$EnumSwitchMapping$0[this.d.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 3;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = this.f36388c.createCaptureRequest(i2);
        Intrinsics.checkNotNullExpressionValue(builderCreateCaptureRequest, "createCaptureRequest(...)");
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it8.next());
        }
        return builderCreateCaptureRequest;
    }

    private final boolean isMeteringAreaAFSupported() {
        Integer num = (Integer) this.f36387b.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        int iIntValue = num != null ? num.intValue() : 0;
        if (j0.class.isAnonymousClass()) {
            String name = j0.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        return iIntValue > 0;
    }

    public static /* synthetic */ void setup$fourthline_vision_release$default(j0 j0Var, String str, List list, MeteringRectangle meteringRectangle, int i, Object obj2) throws CameraAccessException {
        if ((i & 4) != 0) {
            meteringRectangle = null;
        }
        j0Var.setup$fourthline_vision_release(str, list, meteringRectangle);
    }

    public final void setup$fourthline_vision_release(@NotNull String cameraId, @NotNull List<? extends Surface> targets, MeteringRectangle meteringRectangle) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(targets, "targets");
        if (j0.class.isAnonymousClass()) {
            String name = j0.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        targets.size();
        Objects.toString(meteringRectangle);
        this.f36386a.stopRepeating();
        CaptureRequest.Builder builderCreateCaptureRequestBuilder = createCaptureRequestBuilder(targets);
        builderCreateCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 4);
        if (isMeteringAreaAFSupported() && meteringRectangle != null) {
            builderCreateCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        this.f36386a.setRepeatingRequest(builderCreateCaptureRequestBuilder.build(), new a(), this.e);
    }
}
