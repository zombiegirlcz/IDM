package oph;

import androidx.recyclerview.widget.GridLayoutManager;
import com.revolut.core.ui_kit.delegates.BasketDelegate;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewGridLayoutManager;
import ip0.pb0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScreenerCollectionsPageScreen f227665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerViewGridLayoutManager f227666b;

    public f(ScreenerCollectionsPageScreen screenerCollectionsPageScreen, BaseRecyclerViewGridLayoutManager baseRecyclerViewGridLayoutManager) {
        this.f227665a = screenerCollectionsPageScreen;
        this.f227666b = baseRecyclerViewGridLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        koi.j jVarA = ((dli.c) this.f227665a.T.getValue()).w().a(i);
        if ((jVarA instanceof BasketDelegate.Model) || (jVarA instanceof pb0)) {
            return 1;
        }
        return this.f227666b.getSpanCount();
    }
}
