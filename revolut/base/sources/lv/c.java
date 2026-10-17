package lv;

import com.revolut.camerakit.client.api.models.AnimationType;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.ui.views.view.CameraKitView;
import dv.j;
import dv.k;
import dv.l;
import dv.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rz.t;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitView f200270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitUiSettings f200271b;

    public c(CameraKitView cameraKitView, CameraKitUiSettings cameraKitUiSettings) {
        Intrinsics.checkNotNullParameter(cameraKitView, "cameraKitView");
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        this.f200270a = cameraKitView;
        this.f200271b = cameraKitUiSettings;
        cameraKitView.setMask(cameraKitUiSettings.f50709a);
        cameraKitView.setBackground(cameraKitUiSettings.f50710b);
    }

    public final void a(t shutterButtonState) {
        Intrinsics.checkNotNullParameter(shutterButtonState, "shutterButtonState");
        this.f200270a.setShutterButtonState(shutterButtonState);
    }

    public final void b(l maskAnimationState) {
        Intrinsics.checkNotNullParameter(maskAnimationState, "maskAnimationState");
        AnimationType animationType = this.f200271b.d;
        if (Intrinsics.f(animationType, AnimationType.None.f50690a)) {
            return;
        }
        boolean zF = Intrinsics.f(animationType, AnimationType.Scanning.f50691a);
        k kVar = k.f118011a;
        CameraKitView cameraKitView = this.f200270a;
        if (zF) {
            if (maskAnimationState instanceof j) {
                cameraKitView.f50860g.b(((j) maskAnimationState).f118010b);
                return;
            } else {
                if (!maskAnimationState.equals(kVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                cameraKitView.f50860g.c();
                return;
            }
        }
        if (!Intrinsics.f(animationType, AnimationType.Tilting.f50692a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (maskAnimationState instanceof j) {
            uz.c cVar = cameraKitView.f50860g.f50867a.f284502c;
            if (cVar != null) {
                cVar.n();
                return;
            }
            return;
        }
        if (!maskAnimationState.equals(kVar)) {
            throw new NoWhenBranchMatchedException();
        }
        uz.c cVar2 = cameraKitView.f50860g.f50867a.f284502c;
        if (cVar2 != null) {
            cVar2.p();
        }
    }
}
