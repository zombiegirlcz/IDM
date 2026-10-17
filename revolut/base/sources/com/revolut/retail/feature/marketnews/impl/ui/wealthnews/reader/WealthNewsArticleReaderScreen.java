package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherBigTileDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreen;
import efm.r;
import java.util.List;
import jii.m;
import jki.o;
import kkf.r6;
import kkf.z7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import l0k.g;
import l1k.b;
import l1k.f;
import l1k.j;
import l1k.k;
import n0h.a;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/reader/WealthNewsArticleReaderScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ll1k/k;", "Lcom/revolut/retail/feature/marketnews/impl/ui/wealthnews/reader/WealthNewsArticleReaderScreenContract$InputData;", "Laii/q;", "Ln0h/a;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthNewsArticleReaderScreen extends BaseRecyclerViewScreen<k, WealthNewsArticleReaderScreenContract$InputData, q> implements a {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(WealthNewsArticleReaderScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final Object V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f101874a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ReferralContactDelegate f101875b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final WebViewDelegate f101876d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f101877e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthNewsArticleReaderScreen(WealthNewsArticleReaderScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: l1k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthNewsArticleReaderScreen f191556b;

            {
                this.f191556b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthNewsArticleReaderScreen wealthNewsArticleReaderScreen = this.f191556b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthNewsArticleReaderScreen.f0;
                        return (t60.b) ((l0k.g) wealthNewsArticleReaderScreen.Y.getValue()).f191291h.get();
                    default:
                        KProperty[] kPropertyArr2 = WealthNewsArticleReaderScreen.f0;
                        return (j) ((l0k.g) wealthNewsArticleReaderScreen.Y.getValue()).k.get();
                }
            }
        });
        this.W = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.X = true;
        this.Y = w.y0(new kpl.b(this, inputData, 11));
        this.Z = w.y0(new Function0(this) { // from class: l1k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthNewsArticleReaderScreen f191556b;

            {
                this.f191556b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthNewsArticleReaderScreen wealthNewsArticleReaderScreen = this.f191556b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthNewsArticleReaderScreen.f0;
                        return (t60.b) ((l0k.g) wealthNewsArticleReaderScreen.Y.getValue()).f191291h.get();
                    default:
                        KProperty[] kPropertyArr2 = WealthNewsArticleReaderScreen.f0;
                        return (j) ((l0k.g) wealthNewsArticleReaderScreen.Y.getValue()).k.get();
                }
            }
        });
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f101874a0 = fullScreenStateDelegate;
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.f101875b0 = referralContactDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.c0 = textDelegate;
        WebViewDelegate webViewDelegate = new WebViewDelegate();
        this.f101876d0 = webViewDelegate;
        this.f101877e0 = v.k(webViewDelegate, new PlainTextLoadingDelegate(), new VoucherBigTileDelegate(), new RewardsGridDelegate(), new ScrollerBoxDelegate(u.c(referralContactDelegate)), new ListSubheaderDelegate(), textDelegate, fullScreenStateDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (g) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(this.f101875b0.q(), new l0g.a(18))), null, new l1k.g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f101874a0.f52371h.f121375b), null, new l1k.h(this, null), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, new r6(new z7(new f0(e.b(((t60.g) ((t60.b) this.V.getValue())).d), 6), this, 16), 10), null, new f(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f101876d0.f), null, new l1k.g(this, continuation, i), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101877e0() {
        return this.f101877e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Clause clause = uiState.f191564a;
        Clause clause2 = uiState.f191565b;
        if (clause != null) {
            navBarWithToolbar.setTitle(clause, null);
            navBarWithToolbar.setToolbarTitle(clause);
        }
        navBarWithToolbar.setSecondDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause2 != null);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final m h3() {
        ViewBinding value = this.U.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // n0h.a
    public final r m0() {
        return this.c0.d;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
