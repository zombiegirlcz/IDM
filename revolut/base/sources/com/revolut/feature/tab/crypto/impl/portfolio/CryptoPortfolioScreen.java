package com.revolut.feature.tab.crypto.impl.portfolio;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ash.j;
import bi5.e;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tab.crypto.impl.R$string;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import gfd.c;
import ihm.f;
import java.util.ArrayList;
import java.util.List;
import jki.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mw0.o;
import nb6.p;
import nhg.f0;
import nhl.s;
import nje.d;
import nje.g;
import pt5.r;
import qr5.b;
import te0.w;
import tw0.l0;
import ut5.l;
import v0.a;
import wp5.y;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\fB\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/portfolio/CryptoPortfolioScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lnje/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lut5/l;", "Lgfd/c;", "Lmkd/g;", "Lpt5/r;", "Lbi5/e;", "Lash/j;", "Lqr5/b;", "Lpr5/c;", "<init>", "()V", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoPortfolioScreen extends BaseRecyclerViewScreen<g, IOData$EmptyInput, q> implements l, c, mkd.g, r, e, j, b, pr5.c {
    public final int U;
    public final f V;
    public final Object W;
    public final RowDelegate X;
    public final LargeActionButtonDelegate Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SwipeToActionDelegate f89781a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FixedTabsDelegate f89782b0;
    public final ListSubheaderDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final TextDelegate f89783d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final FooterTextDelegate f89784e0;
    public final SingleChoiceDelegate f0;
    public final ActionWidgetDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final HighlightTileDelegate f89785h0;
    public final ScrollerDelegate i0;
    public final List j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final List f89786k0;
    public final ArrayList l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f89787n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f89788o0;

    public CryptoPortfolioScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$style.TransparentNavigationBarMarkerTheme;
        this.V = a.d("create(...)");
        this.W = w.y0(new s(22));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Y = largeActionButtonDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Z = fullScreenStateDelegate;
        final int i = 1;
        SwipeToActionDelegate swipeToActionDelegate = new SwipeToActionDelegate(rowDelegate, true);
        this.f89781a0 = swipeToActionDelegate;
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.f89782b0 = fixedTabsDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.c0 = listSubheaderDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.f89783d0 = textDelegate;
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.f89784e0 = footerTextDelegate;
        this.f0 = new SingleChoiceDelegate();
        BannerDelegate bannerDelegate = new BannerDelegate();
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        ActionWidgetLoadingDelegate actionWidgetLoadingDelegate = new ActionWidgetLoadingDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.g0 = actionWidgetDelegate;
        SmallActionButtonDelegate smallActionButtonDelegate = new SmallActionButtonDelegate();
        HighlightTileDelegate highlightTileDelegate = new HighlightTileDelegate();
        this.f89785h0 = highlightTileDelegate;
        final int i2 = 2;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(v.k(bannerDelegate, heroBannerDelegate, actionWidgetLoadingDelegate, actionWidgetDelegate), false);
        this.i0 = scrollerDelegate;
        List listK = v.k(rowDelegate, largeActionButtonDelegate, fullScreenStateDelegate, swipeToActionDelegate, fixedTabsDelegate, listSubheaderDelegate, textDelegate, footerTextDelegate, new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), scrollerDelegate, new ProductSelectionDelegate(), bannerDelegate, heroBannerDelegate, actionWidgetLoadingDelegate, actionWidgetDelegate, smallActionButtonDelegate, highlightTileDelegate);
        this.j0 = listK;
        List listA = a5.a();
        this.f89786k0 = listA;
        this.l0 = d0.E0(listA, listK);
        final int i3 = 0;
        this.m0 = w.y0(new Function0(this) { // from class: nje.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPortfolioScreen f216455b;

            {
                this.f216455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CryptoPortfolioScreen cryptoPortfolioScreen = this.f216455b;
                        qji.b bVarQ2 = cryptoPortfolioScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.tab.crypto.impl.portfolio.di.CryptoPortfolioScreenComponentInjector");
                        jje.g gVar = (jje.g) ((oje.b) bVarQ2).b().S(cryptoPortfolioScreen);
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174882g = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174882g = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.d = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.d = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.e = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.e = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174883h = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174883h = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.i = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.i = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174884j = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174884j = cryptoPortfolioScreen;
                                break;
                        }
                        return (oje.a) gVar.mo3800build();
                    case 1:
                        return ((oje.a) this.f216455b.m0.getValue()).c();
                    default:
                        return ((oje.a) this.f216455b.m0.getValue()).a();
                }
            }
        });
        this.f89787n0 = w.y0(new Function0(this) { // from class: nje.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPortfolioScreen f216455b;

            {
                this.f216455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoPortfolioScreen cryptoPortfolioScreen = this.f216455b;
                        qji.b bVarQ2 = cryptoPortfolioScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.tab.crypto.impl.portfolio.di.CryptoPortfolioScreenComponentInjector");
                        jje.g gVar = (jje.g) ((oje.b) bVarQ2).b().S(cryptoPortfolioScreen);
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174882g = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174882g = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.d = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.d = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.e = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.e = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174883h = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174883h = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.i = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.i = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174884j = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174884j = cryptoPortfolioScreen;
                                break;
                        }
                        return (oje.a) gVar.mo3800build();
                    case 1:
                        return ((oje.a) this.f216455b.m0.getValue()).c();
                    default:
                        return ((oje.a) this.f216455b.m0.getValue()).a();
                }
            }
        });
        this.f89788o0 = w.y0(new Function0(this) { // from class: nje.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPortfolioScreen f216455b;

            {
                this.f216455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoPortfolioScreen cryptoPortfolioScreen = this.f216455b;
                        qji.b bVarQ2 = cryptoPortfolioScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.tab.crypto.impl.portfolio.di.CryptoPortfolioScreenComponentInjector");
                        jje.g gVar = (jje.g) ((oje.b) bVarQ2).b().S(cryptoPortfolioScreen);
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174882g = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174882g = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.d = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.d = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.e = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.e = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174883h = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174883h = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.i = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.i = cryptoPortfolioScreen;
                                break;
                        }
                        switch (gVar.f174879a) {
                            case 0:
                                gVar.f174884j = cryptoPortfolioScreen;
                                break;
                            default:
                                gVar.f174884j = cryptoPortfolioScreen;
                                break;
                        }
                        return (oje.a) gVar.mo3800build();
                    case 1:
                        return ((oje.a) this.f216455b.m0.getValue()).c();
                    default:
                        return ((oje.a) this.f216455b.m0.getValue()).a();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.U);
    }

    @Override // mkd.g
    public final efm.r F1() {
        return this.i0.i;
    }

    @Override // ut5.l
    public final efm.r S() {
        return this.Y.d.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (oje.a) this.m0.getValue();
    }

    @Override // ut5.l
    public final efm.r T() {
        return this.X.f53218h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (nje.e) this.f89788o0.getValue();
    }

    @Override // gfd.c, pt5.r
    public final efm.r U() {
        return this.c0.f52707c;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(i0()), null, new nje.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, y.x(this.f89783d0.d, this.f89784e0.e.f121375b, "mergeWith(...)"), null, new naf.j(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f89785h0.f52437c), null, new nje.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.g0.d.f121375b), null, new d(this, null), 3);
    }

    @Override // ut5.l
    public final f W1() {
        return this.X.f53227t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((oje.a) this.m0.getValue()).b().d(v.k(this.f0, this.Y));
        pd.b.p(view, new TextLocalisedClause(R$string.tab_crypto_home_tab_portfolio, null, null, 14));
        RecyclerView recyclerViewH = h();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(boh.f.p(context), recyclerViewH);
        h().setClipToPadding(false);
        h().setHasFixedSize(true);
        new xv0.w(new p(1, this.V, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 11), null).b(h());
        l0.k(getP(), h(), d3(), (rp0.l0) this.f89787n0.getValue());
        h().setTag("CryptoPortfolioScreen_RecyclerView");
    }

    @Override // jkd.b
    public final efm.r X1() {
        return this.V;
    }

    @Override // ut5.l
    public final efm.r Y() {
        return this.f0.p();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF72058d0() {
        return this.l0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    /* JADX INFO: renamed from: e1 */
    public final l0 getP() {
        return (l0) this.W.getValue();
    }

    @Override // gfd.c, pt5.r
    public final efm.r h0() {
        return this.f89782b0.f52339c.f121375b;
    }

    @Override // gfd.c, pt5.r
    public final efm.r i0() {
        return this.Z.f52371h.f121375b;
    }

    @Override // pt5.r
    public final efm.r j1() {
        efm.r map = this.f89781a0.f.map(new nd3.a(new f0(16), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // ut5.l
    public final efm.r t() {
        return this.g0.f51589c.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final f t0() {
        return ((rp0.l0) this.f89787n0.getValue()).f256113c;
    }

    @Override // mkd.g
    public final koi.c v0() {
        return d3().f;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ash.j
    public final void z1(String anchorItemId, mw0.a menu) {
        Intrinsics.checkNotNullParameter(anchorItemId, "anchorItemId");
        Intrinsics.checkNotNullParameter(menu, "menu");
        ((rp0.l0) this.f89787n0.getValue()).e(anchorItemId, menu, o.VIEW_BOUNDS, new mw0.l(false));
    }
}
