package a83;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardListScreen f2054a;

    public j(CardListScreen cardListScreen) {
        this.f2054a = cardListScreen;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        this.f2054a.S.onNext(Integer.valueOf(i));
    }
}
