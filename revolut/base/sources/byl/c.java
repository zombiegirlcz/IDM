package byl;

import android.animation.Animator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.ui_kit.payments.personalisation.AmountPersonalisationTransitionContainer;
import kotlin.Pair;
import lki.z;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountPersonalisationTransitionContainer f19857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f19858c;
    public final /* synthetic */ Pair d;

    public /* synthetic */ c(AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer, View view, Pair pair, int i) {
        this.f19856a = i;
        this.f19857b = amountPersonalisationTransitionContainer;
        this.f19858c = view;
        this.d = pair;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f19856a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        switch (this.f19856a) {
            case 0:
                AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer = this.f19857b;
                amountPersonalisationTransitionContainer.d = false;
                amountPersonalisationTransitionContainer.e = false;
                amountPersonalisationTransitionContainer.invalidate();
                AmountPersonalisationTransitionContainer.h(this.f19858c);
                Pair pair = this.d;
                if (pair != null && (recyclerView = (RecyclerView) pair.f186385a) != null) {
                    recyclerView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
                z zVar = amountPersonalisationTransitionContainer.f107117c;
                if (zVar != null) {
                    zVar.r();
                }
                z zVar2 = amountPersonalisationTransitionContainer.f107117c;
                if (zVar2 != null) {
                    zVar2.q();
                }
                break;
            default:
                AmountPersonalisationTransitionContainer amountPersonalisationTransitionContainer2 = this.f19857b;
                amountPersonalisationTransitionContainer2.e = false;
                amountPersonalisationTransitionContainer2.invalidate();
                AmountPersonalisationTransitionContainer.h(this.f19858c);
                Pair pair2 = this.d;
                if (pair2 != null && (recyclerView2 = (RecyclerView) pair2.f186385a) != null) {
                    recyclerView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                }
                z zVar3 = amountPersonalisationTransitionContainer2.f107117c;
                if (zVar3 != null) {
                    zVar3.r();
                }
                z zVar4 = amountPersonalisationTransitionContainer2.f107117c;
                if (zVar4 != null) {
                    zVar4.q();
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f19856a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f19856a;
    }
}
