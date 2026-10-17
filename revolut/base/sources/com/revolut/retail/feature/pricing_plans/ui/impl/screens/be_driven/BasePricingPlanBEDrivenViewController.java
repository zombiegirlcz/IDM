package com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven;

import aii.r;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.kompot.navigable.vc.ViewController;
import ihm.f;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mkd.g;
import njj.l;
import nkd.b;
import o10.c;
import ojk.c0;
import ojk.h;
import ojk.i;
import ojk.j;
import ojk.k;
import ojk.m;
import ojk.n;
import rd0.e;
import te0.w;
import v0.a;
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/be_driven/BasePricingPlanBEDrivenViewController;", "Laii/r;", "OUTPUT", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnkd/b;", "Lmkd/g;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BasePricingPlanBEDrivenViewController<OUTPUT extends r> extends ViewController<OUTPUT> implements b, g {
    public final f K = a.d("create(...)");
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final TextDelegate N;
    public final PromotionalMediumTileDelegate O;
    public final LargeActionButtonDelegate P;
    public final CenteredContentTileDelegate Q;
    public final TwinHorizontalButtonDelegate R;
    public final FixedTabsDelegate S;
    public final Object T;
    public final ListSubheaderDelegate U;
    public final ActionWidgetDelegate V;
    public final EsimDelegate W;
    public final VoucherSmallTileDelegate X;
    public final LargeVoucherTileDelegate Y;
    public final BigTileDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ScrollerDelegate f103365a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f103366b0;

    public BasePricingPlanBEDrivenViewController() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.M = fullScreenStateDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.N = textDelegate;
        PromotionalMediumTileDelegate promotionalMediumTileDelegate = new PromotionalMediumTileDelegate();
        this.O = promotionalMediumTileDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.P = largeActionButtonDelegate;
        CenteredContentTileDelegate centeredContentTileDelegate = new CenteredContentTileDelegate();
        this.Q = centeredContentTileDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        CellDetailsStandaloneNoteDelegate cellDetailsStandaloneNoteDelegate = new CellDetailsStandaloneNoteDelegate();
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = new TwinHorizontalButtonDelegate();
        this.R = twinHorizontalButtonDelegate;
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        this.S = fixedTabsDelegate;
        Lazy lazyY0 = w.y0(new c(this, 20));
        this.T = lazyY0;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.U = listSubheaderDelegate;
        ActionCardDelegate actionCardDelegate = new ActionCardDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.V = actionWidgetDelegate;
        EsimDelegate esimDelegate = new EsimDelegate();
        this.W = esimDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.X = voucherSmallTileDelegate;
        LargeVoucherTileDelegate largeVoucherTileDelegate = new LargeVoucherTileDelegate();
        this.Y = largeVoucherTileDelegate;
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.Z = bigTileDelegate;
        ScrollerDelegate scrollerDelegate = new ScrollerDelegate(v.k(new ActionCardLoadingDelegate(), actionCardDelegate, actionWidgetDelegate, heroBannerDelegate, voucherSmallTileDelegate, centeredContentTileDelegate), false);
        this.f103365a0 = scrollerDelegate;
        this.f103366b0 = v.k(rowDelegate, fullScreenStateDelegate, textDelegate, promotionalMediumTileDelegate, largeActionButtonDelegate, (GridBoxDelegate) lazyY0.getValue(), cellDetailsDelegate, cellDetailsStandaloneNoteDelegate, twinHorizontalButtonDelegate, fixedTabsDelegate, listSubheaderDelegate, new BannerLoadingDelegate(), scrollerDelegate, actionWidgetDelegate, new ActionWidgetLoadingDelegate(), voucherSmallTileDelegate, largeVoucherTileDelegate, bigTileDelegate, new SimpleMediaDelegate(), esimDelegate);
    }

    @Override // mkd.g
    public final efm.r F1() {
        return this.f103365a0.i;
    }

    @Override // jkd.b
    public final efm.r X1() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        h().setItemAnimator(null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.L;
        efm.r rVarMergeWith = w.a0(rowDelegate.f53218h, new oh3.a(22)).mergeWith(w.a0(this.U.f52707c, new oh3.a(25))).mergeWith(w.a0(this.Q.e, new oh3.a(26)));
        LargeVoucherTileDelegate largeVoucherTileDelegate = this.Y;
        efm.r rVarMergeWith2 = rVarMergeWith.mergeWith(w.a0(largeVoucherTileDelegate.d, new oh3.a(27))).mergeWith(w.a0(largeVoucherTileDelegate.f52628c.f121375b, new oh3.a(28))).mergeWith(w.a0(this.Z.d, new oh3.a(29)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith2, "mergeWith(...)");
        Continuation continuation = null;
        ViewController.P2(this, e.b(rVarMergeWith2), new h(this, continuation, 4), 3);
        EsimDelegate esimDelegate = this.W;
        ViewController.P2(this, e.b(w.a0(esimDelegate.d, new ojk.a(0))), new n(this, null), 3);
        ViewController.P2(this, e.b(w.a0(esimDelegate.e, new ojk.a(1))), new ojk.f(this, null), 3);
        ViewController.P2(this, e.b(w.a0(rowDelegate.f53220l, new ojk.a(2))), new ojk.g(this, null), 3);
        ViewController.P2(this, y.x(rowDelegate.f53226s, this.N.d, "mergeWith(...)"), new h(this, continuation, 0), 3);
        ViewController.P2(this, e.b(this.M.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, e.b(this.P.d.f121375b), new j(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.R;
        ViewController.P2(this, e.b(w.a0(twinHorizontalButtonDelegate.f53572c.f121375b, new oh3.a(23))), new h(this, continuation, 1), 3);
        ViewController.P2(this, e.b(w.a0(twinHorizontalButtonDelegate.d.f121375b, new oh3.a(24))), new h(this, continuation, 2), 3);
        ViewController.P2(this, e.b(this.S.f52339c.f121375b), new h(this, continuation, 3), 3);
        ActionWidgetDelegate actionWidgetDelegate = this.V;
        int i = 6;
        ViewController.P2(this, new l(new o9a.e(e.b(actionWidgetDelegate.f51589c.f121375b), i), i), new k(this, null), 3);
        int i2 = 7;
        ViewController.P2(this, new l(new o9a.e(e.b(actionWidgetDelegate.f51589c.f121375b), i2), i2), new ojk.l(this, null), 3);
        ViewController.P2(this, e.b(this.X.f53608c), new m(this, null), 3);
        new xv0.w(new nzj.n(1, this.K, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 27), null).b(h());
    }

    public abstract c0 d3();

    public abstract RecyclerView h();

    @Override // nkd.b
    public final efm.r q0() {
        PromotionalMediumTileDelegate promotionalMediumTileDelegate = this.O;
        efm.r rVarMergeWith = promotionalMediumTileDelegate.f53038c.mergeWith(promotionalMediumTileDelegate.e);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    @Override // nkd.b
    public final f w1() {
        return this.O.d;
    }
}
