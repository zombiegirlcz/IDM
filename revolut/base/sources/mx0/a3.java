package mx0;

import android.view.animation.Animation;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class a3 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardPersonalisationView f209575a;

    public a3(CardPersonalisationView cardPersonalisationView) {
        this.f209575a = cardPersonalisationView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f209575a.f58390p.onNext(Unit.f186387a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        CardPersonalisationView cardPersonalisationView = this.f209575a;
        cardPersonalisationView.getDrawingView().setEditingEnabled(false);
        CardPersonalisationView.setItems$default(cardPersonalisationView, null, null, 2, null);
        cardPersonalisationView.o.onNext(Unit.f186387a);
    }
}
