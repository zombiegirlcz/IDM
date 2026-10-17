package mx0;

import android.view.View;
import android.view.ViewTreeObserver;
import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.uicomponent.slidingbottomsheet.BottomExpandableDialogView;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f209849b;

    public /* synthetic */ n1(View view, int i) {
        this.f209848a = i;
        this.f209849b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f209848a) {
            case 0:
                m2 m2Var = (m2) this.f209849b;
                View view = m2Var.u;
                if (view != null) {
                    m2Var.f209817n.d0(view.getHeight());
                }
                break;
            case 1:
                uz.d.a((uz.d) this.f209849b);
                break;
            case 2:
                CameraKitPreviewView cameraKitPreviewView = (CameraKitPreviewView) this.f209849b;
                cameraKitPreviewView.getLocationOnScreen(cameraKitPreviewView.f50857b);
                int[] iArr = cameraKitPreviewView.f50857b;
                cameraKitPreviewView.f50856a = new rz.u(iArr[0], iArr[1], cameraKitPreviewView.getWidth(), cameraKitPreviewView.getHeight());
                break;
            default:
                BottomExpandableDialogView.f0((BottomExpandableDialogView) this.f209849b);
                break;
        }
    }
}
