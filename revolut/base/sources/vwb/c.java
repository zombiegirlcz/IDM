package vwb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcardshome.RevPointsGiftcardsHomeScreen;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import ip0.ej;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends ScreenGridLayoutManager.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RevPointsGiftcardsHomeScreen f292688a;

    public c(RevPointsGiftcardsHomeScreen revPointsGiftcardsHomeScreen) {
        this.f292688a = revPointsGiftcardsHomeScreen;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        koi.j jVarA = this.f292688a.R.a(i);
        return ((jVarA instanceof FullScreenStateDelegate.Model) || (jVarA instanceof ej)) ? 2 : 1;
    }
}
