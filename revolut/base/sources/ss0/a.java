package ss0;

import android.animation.ValueAnimator;
import com.revolut.core.ui_kit.internal.views.card_design.CardsEmptyStateView;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardsEmptyStateView f265252b;

    public /* synthetic */ a(CardsEmptyStateView cardsEmptyStateView, int i) {
        this.f265251a = i;
        this.f265252b = cardsEmptyStateView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f265251a) {
            case 0:
                CardsEmptyStateView.b(this.f265252b, valueAnimator);
                break;
            default:
                CardsEmptyStateView.a(this.f265252b, valueAnimator);
                break;
        }
    }
}
