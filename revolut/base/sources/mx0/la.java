package mx0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;

/* JADX INFO: loaded from: classes20.dex */
public final class la extends ix0.s1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ la(Object obj2, int i) {
        this.d = i;
        this.e = obj2;
    }

    @Override // ix0.s1
    public final void b() {
        switch (this.d) {
            case 0:
                ((com.revolut.core.ui_kit.views.o) this.e).getKnob$ui_kit_components_release().animate().alpha(BitmapDescriptorFactory.HUE_RED).start();
                break;
            case 1:
                ((com.revolut.core.ui_kit.views.o) this.e).getHideKnobActivator().d(this);
                break;
            default:
                ModalViewContainerBehavior.a((ModalViewContainerBehavior) this.e, false);
                break;
        }
    }

    @Override // ix0.s1
    public final void c() {
        switch (this.d) {
            case 0:
                ((com.revolut.core.ui_kit.views.o) this.e).getKnob$ui_kit_components_release().animate().alpha(1.0f).start();
                break;
            case 1:
                ((com.revolut.core.ui_kit.views.o) this.e).getHideKnobActivator().e(this);
                break;
            default:
                ModalViewContainerBehavior.a((ModalViewContainerBehavior) this.e, true);
                break;
        }
    }
}
