package mx0;

import android.view.ViewGroup;
import android.view.animation.Animation;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.ChatInputView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class z2 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f210135b;

    public /* synthetic */ z2(ViewGroup viewGroup, int i) {
        this.f210134a = i;
        this.f210135b = viewGroup;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f210134a) {
            case 0:
                CardPersonalisationView cardPersonalisationView = (CardPersonalisationView) this.f210135b;
                if (cardPersonalisationView.f58385h != null) {
                    cardPersonalisationView.getDrawingView().setEditingEnabled(false);
                    cardPersonalisationView.getCustomisationAnimationView().setVisibility(0);
                    yy0.f.e(or0.u.k(cardPersonalisationView).Q(), cardPersonalisationView.f58385h, cardPersonalisationView.getCustomisationAnimationView(), null, null, 12);
                } else {
                    cardPersonalisationView.getDrawingView().setEditingEnabled(true);
                }
                cardPersonalisationView.u0();
                cardPersonalisationView.f58390p.onNext(Unit.f186387a);
                break;
            default:
                ((ChatInputView) this.f210135b).getPlayPauseInputActionView().setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f210134a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f210134a) {
            case 0:
                CardPersonalisationView cardPersonalisationView = (CardPersonalisationView) this.f210135b;
                cardPersonalisationView.getDrawingView().setEditingEnabled(false);
                cardPersonalisationView.o.onNext(Unit.f186387a);
                break;
        }
    }
}
