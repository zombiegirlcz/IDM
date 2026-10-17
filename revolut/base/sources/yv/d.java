package yv;

import android.util.Size;
import androidx.camera.core.CameraSelector;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw.e;
import yw.h;

/* JADX INFO: loaded from: classes16.dex */
public abstract class d {
    public static final CameraSelector a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i = c.f317060a[hVar.d().ordinal()];
        if (i == 1) {
            CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
            return DEFAULT_FRONT_CAMERA;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.DEFAULT_BACK_CAMERA;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
        return DEFAULT_BACK_CAMERA;
    }

    public static final Size b(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i = c.f317061b[eVar.ordinal()];
        if (i == 1) {
            return new Size(720, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i == 3) {
            return new Size(1920, 1080);
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return new Size(3840, 2160);
    }
}
