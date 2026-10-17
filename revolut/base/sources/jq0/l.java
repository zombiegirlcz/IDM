package jq0;

import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import om4.d0;
import ox0.u;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l implements DynamicAnimation.OnAnimationEndListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177373b;

    public /* synthetic */ l(Object obj2, int i) {
        this.f177372a = i;
        this.f177373b = obj2;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f4) {
        u uVar;
        gu0.a aVar;
        switch (this.f177372a) {
            case 0:
                p pVar = (p) this.f177373b;
                if (!z && pVar.i) {
                    pVar.a();
                    break;
                }
                break;
            default:
                ox0.t tVar = (ox0.t) this.f177373b;
                tVar.d.setBackgroundDrawableLockedBoundsEnabled$ui_kit_components_release(false);
                if (!tVar.f230511p && !z && (uVar = tVar.o) != null) {
                    TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ((d0) uVar).f226551b;
                    if (twinVerticalButton.o) {
                        if (twinVerticalButton.f59021p || twinVerticalButton.f59022q) {
                            twinVerticalButton.t0();
                            gu0.a aVar2 = twinVerticalButton.f59024s;
                            if (aVar2 != null) {
                                aVar2.cancel();
                            }
                            if (!ViewCompat.isLaidOut(twinVerticalButton) || twinVerticalButton.isLayoutRequested()) {
                                aVar = new gu0.a(twinVerticalButton, 5, twinVerticalButton);
                                twinVerticalButton.addOnLayoutChangeListener(aVar);
                            } else {
                                aVar = null;
                                twinVerticalButton.f59024s = null;
                                TwinVerticalButton.h0(twinVerticalButton);
                            }
                            twinVerticalButton.f59024s = aVar;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
