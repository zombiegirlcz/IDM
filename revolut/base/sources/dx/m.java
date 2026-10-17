package dx;

import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.camerakit.ui.views.view.MaskHintView;
import kotlin.jvm.internal.Intrinsics;
import rz.u;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitPreviewView f120505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaskHintView f120506b;

    public m(CameraKitPreviewView previewView, MaskHintView maskView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(maskView, "maskView");
        this.f120505a = previewView;
        this.f120506b = maskView;
    }

    public final rz.a a() {
        u f50856a = this.f120505a.getF50856a();
        u absoluteMaskLocation = this.f120506b.getAbsoluteMaskLocation();
        return new rz.a(f50856a, (absoluteMaskLocation == null || f50856a == null) ? null : new u(absoluteMaskLocation.f258457a - f50856a.f258457a, absoluteMaskLocation.f258458b - f50856a.f258458b, absoluteMaskLocation.f258459c, absoluteMaskLocation.d));
    }
}
