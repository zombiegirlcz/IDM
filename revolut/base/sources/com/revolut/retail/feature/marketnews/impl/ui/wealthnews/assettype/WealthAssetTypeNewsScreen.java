package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import avk.j;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendPreviewDelegate;
import com.revolut.core.ui_kit.delegates.TrendPreviewLoadingDelegate;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import gzg.a0;
import h1k.i;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l0k.k;
import rd0.e;
import sji.b;
import te0.w;
import u0k.a;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/assettype/WealthAssetTypeNewsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lh1k/i;", "Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/assettype/WealthAssetTypeNewsScreenContract$InputData;", "Laii/q;", "Lu0k/a;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthAssetTypeNewsScreen extends BaseRecyclerViewScreen<i, WealthAssetTypeNewsScreenContract$InputData, q> implements a {
    public final TextDelegate U;
    public final TrendPreviewDelegate V;
    public final NewsDelegate W;
    public final ListSubheaderDelegate X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f101865a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final j f101866b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthAssetTypeNewsScreen(WealthAssetTypeNewsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        TextDelegate textDelegate = new TextDelegate();
        this.U = textDelegate;
        TrendPreviewDelegate trendPreviewDelegate = new TrendPreviewDelegate();
        this.V = trendPreviewDelegate;
        NewsDelegate newsDelegate = new NewsDelegate();
        this.W = newsDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.X = listSubheaderDelegate;
        NewsLoadingDelegate newsLoadingDelegate = new NewsLoadingDelegate();
        this.Y = w.y0(new h1k.a(this, inputData, 0));
        this.Z = w.y0(new h1g.a(this, 1));
        this.f101865a0 = v.k(new ScrollerDelegate(v.k(newsDelegate, newsLoadingDelegate), false), new ScrollerBoxDelegate(v.k(trendPreviewDelegate, new TrendPreviewLoadingDelegate())), new FullScreenStateDelegate(), new ListSubheaderLoadingDelegate(), newsLoadingDelegate, listSubheaderDelegate, newsDelegate, textDelegate);
        this.f101866b0 = new j(this, 9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (k) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (h1k.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NewsDelegate newsDelegate = this.W;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, new g9j.q(e.b(newsDelegate.p()), 28), null, new h1k.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new g9j.q(e.b(this.X.f52707c), 29), null, new h1k.e(this, continuation, 1), 3);
        r rVarMerge = r.merge(w.a0(newsDelegate.q(), new a0(11)), w.a0(newsDelegate.r(), new a0(12)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge), null, new h1k.e(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        RecyclerView recyclerViewH = h();
        WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData = (WealthAssetTypeNewsScreenContract$InputData) this.G;
        recyclerViewH.setTag(wealthAssetTypeNewsScreenContract$InputData.f101867a.f101803a + "|" + wealthAssetTypeNewsScreenContract$InputData.f101868b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f101865a0;
    }
}
