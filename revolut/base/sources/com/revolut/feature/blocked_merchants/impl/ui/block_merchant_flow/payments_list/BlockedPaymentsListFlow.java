package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.blocked_merchants.impl.R$id;
import com.revolut.feature.blocked_merchants.impl.R$layout;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import fb6.j;
import ff4.z;
import fna.f;
import fs2.b;
import fs2.c;
import fs2.h;
import fs2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sr2.a;
import te0.w;
import tr2.n;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/payments_list/BlockedPaymentsListFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfs2/h;", "Lali/g;", "Lfs2/j;", "Lcom/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/payments_list/BlockedPaymentsListFlowContract$PagerItem;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockedPaymentsListFlow extends ViewController<h> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(BlockedPaymentsListFlow.class, "binding", "getBinding()Lcom/revolut/feature/blocked_merchants/impl/databinding/FlowBlockedPaymentsListBinding;", 0))};
    public final boolean K;
    public final ao.h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public BlockedPaymentsListFlow(BlockedPaymentsListFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = true;
        this.L = s.t(this, b.f);
        this.M = R$layout.flow_blocked_payments_list;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fs2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockedPaymentsListFlow f137554b;

            {
                this.f137554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BlockedPaymentsListFlow blockedPaymentsListFlow = this.f137554b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BlockedPaymentsListFlow.Q;
                        return mif.a.a(blockedPaymentsListFlow, 0, R$id.blockedPaymentsListFlow_viewPager, (c) blockedPaymentsListFlow.P.getValue(), 5);
                    default:
                        KProperty[] kPropertyArr2 = BlockedPaymentsListFlow.Q;
                        return (c) ((tr2.n) blockedPaymentsListFlow.O.getValue()).f273673c.get();
                }
            }
        });
        this.O = w.y0(new j(this, input, 23));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fs2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BlockedPaymentsListFlow f137554b;

            {
                this.f137554b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BlockedPaymentsListFlow blockedPaymentsListFlow = this.f137554b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BlockedPaymentsListFlow.Q;
                        return mif.a.a(blockedPaymentsListFlow, 0, R$id.blockedPaymentsListFlow_viewPager, (c) blockedPaymentsListFlow.P.getValue(), 5);
                    default:
                        KProperty[] kPropertyArr2 = BlockedPaymentsListFlow.Q;
                        return (c) ((tr2.n) blockedPaymentsListFlow.O.getValue()).f273673c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        fs2.j uiState = (fs2.j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f265109b;
        navBarWithToolbar.setTitle(uiState.f137562a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f137562a);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(uiState.f137563b);
        DraggableTabsView draggableTabsView = d3().f265110c;
        draggableTabsView.setVisibility(uiState.f137564c ? 0 : 8);
        draggableTabsView.setItems(uiState.d, uiState.e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        BlockedPaymentsListFlowContract$PagerItem pagerItem2 = (BlockedPaymentsListFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        fs2.o oVar = (fs2.o) ((c) this.P.getValue());
        oVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        oVar.H2(oVar.f137573r, new k(pagerItem2, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f265109b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f265109b.f59410q), new z(this, null, 28), 3);
        ViewController.P2(this, rd0.e.b(d3().f265110c.m()), new f(this, null, 9), 3);
    }

    public final a d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
