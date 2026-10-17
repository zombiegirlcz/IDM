package k10;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.cards.shared.ui.screen.BaseCardsCarouselScreen;
import tw0.k;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends DefaultItemAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseCardsCarouselScreen f180075a;

    public a(BaseCardsCarouselScreen baseCardsCarouselScreen) {
        this.f180075a = baseCardsCarouselScreen;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onAddStarting(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof k) {
            BaseCardsCarouselScreen baseCardsCarouselScreen = this.f180075a;
            baseCardsCarouselScreen.d3(baseCardsCarouselScreen.N);
        }
        super.onAddStarting(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof k) {
            BaseCardsCarouselScreen baseCardsCarouselScreen = this.f180075a;
            baseCardsCarouselScreen.d3(baseCardsCarouselScreen.N);
        }
        super.onMoveStarting(viewHolder);
    }
}
