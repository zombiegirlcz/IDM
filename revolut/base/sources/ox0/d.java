package ox0;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements vy0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230476a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy0.a f230477b;

    public d(ActionFooterView actionFooterView) {
        this.f230477b = actionFooterView;
    }

    public static void a(View view, View view2, boolean z) {
        view.setAlpha(z ? 0.0f : 1.0f);
        view.setVisibility(z ? 4 : 0);
        view2.setAlpha(z ? 1.0f : 0.0f);
        view2.setVisibility(z ? 0 : 4);
    }

    private final void b(boolean z) {
    }

    @Override // vy0.a
    public final boolean A() {
        switch (this.f230476a) {
            case 0:
                e eVar = ((ActionFooterView) this.f230477b).f58962q;
                if (eVar != null) {
                    return eVar.f230478a;
                }
                return false;
            default:
                return this.f230477b.A();
        }
    }

    @Override // vy0.a
    public final boolean i() {
        switch (this.f230476a) {
            case 0:
                return true;
            default:
                return this.f230477b.i();
        }
    }

    @Override // vy0.a
    public final void setCollapsed(boolean z, boolean z3) {
        FormsActionButton formsActionButton;
        int i = this.f230476a;
        vy0.a aVar = this.f230477b;
        switch (i) {
            case 0:
                ActionFooterView actionFooterView = (ActionFooterView) aVar;
                e eVar = actionFooterView.f58962q;
                if (eVar == null || eVar.f230478a != z) {
                    actionFooterView.f58962q = eVar != null ? new e(z) : null;
                    View currentButtonView = actionFooterView.getCurrentButtonView();
                    if (currentButtonView != null && (formsActionButton = actionFooterView.f58963r) != null) {
                        if (z3 && actionFooterView.v) {
                            currentButtonView.setVisibility(0);
                            formsActionButton.setVisibility(0);
                            ValueAnimator valueAnimator = actionFooterView.f58965t;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                            actionFooterView.f58965t = valueAnimatorOfFloat;
                            if (valueAnimatorOfFloat != null) {
                                c cVar = new c(valueAnimatorOfFloat, this, currentButtonView, formsActionButton, z, currentButtonView, z, formsActionButton);
                                valueAnimatorOfFloat.addListener(cVar);
                                valueAnimatorOfFloat.addUpdateListener(cVar);
                            }
                            ValueAnimator valueAnimator2 = actionFooterView.f58965t;
                            if (valueAnimator2 != null) {
                                valueAnimator2.setInterpolator(jq0.r.f177392a);
                            }
                            ValueAnimator valueAnimator3 = actionFooterView.f58965t;
                            if (valueAnimator3 != null) {
                                valueAnimator3.start();
                            }
                        } else {
                            a(currentButtonView, formsActionButton, z);
                        }
                    }
                }
                break;
            default:
                aVar.setCollapsed(z, z3);
                break;
        }
    }

    @Override // vy0.a
    public final void setCollapsible(boolean z) {
        switch (this.f230476a) {
            case 0:
                break;
            default:
                this.f230477b.setCollapsible(z);
                break;
        }
    }

    public d(vy0.a collapsibleButton) {
        Intrinsics.checkNotNullParameter(collapsibleButton, "collapsibleButton");
        this.f230477b = collapsibleButton;
    }
}
