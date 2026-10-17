package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection.CommodityOrderTypeSelectionScreen;
import dli.a;
import dli.c;
import j3c.y;
import j7j.e;
import j7j.f;
import j7j.g;
import j7j.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import pki.b;
import te0.w;
import vc.s;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/order_type_selection/CommodityOrderTypeSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj7j/i;", "Ldli/a;", "Lj7j/j;", "Lno/k;", "Lno/m;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityOrderTypeSelectionScreen extends ViewController<i> implements a, k, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CommodityOrderTypeSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public AnalyticsContext P;
    public final Lazy Q;
    public final Object R;

    public CommodityOrderTypeSelectionScreen(CommodityOrderTypeSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_bottom_sheet_list;
        this.L = s.t(this, f.f);
        this.M = w.y0(new y(21));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j7j.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderTypeSelectionScreen f171927b;

            {
                this.f171927b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderTypeSelectionScreen.S;
                        CommodityOrderTypeSelectionScreen commodityOrderTypeSelectionScreen = this.f171927b;
                        return dli.f.a(commodityOrderTypeSelectionScreen, (k) commodityOrderTypeSelectionScreen.R.getValue(), u.c((AccountCellItemDelegate) commodityOrderTypeSelectionScreen.M.getValue()), commodityOrderTypeSelectionScreen.d3().f174520c.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CommodityOrderTypeSelectionScreen.S;
                        return (k) ((r6j.f) this.f171927b.O.getValue()).f251908c.get();
                }
            }
        });
        this.O = w.y0(new j68.a(this, inputData, 1));
        this.Q = j.b(e.f171928a);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: j7j.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderTypeSelectionScreen f171927b;

            {
                this.f171927b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderTypeSelectionScreen.S;
                        CommodityOrderTypeSelectionScreen commodityOrderTypeSelectionScreen = this.f171927b;
                        return dli.f.a(commodityOrderTypeSelectionScreen, (k) commodityOrderTypeSelectionScreen.R.getValue(), u.c((AccountCellItemDelegate) commodityOrderTypeSelectionScreen.M.getValue()), commodityOrderTypeSelectionScreen.d3().f174520c.getId(), null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CommodityOrderTypeSelectionScreen.S;
                        return (k) ((r6j.f) this.f171927b.O.getValue()).f251908c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j7j.j uiState = (j7j.j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        this.P = uiState.f171934a;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.P = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return (AnalyticsProduct) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r6j.f) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j7j.k) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.wealth_commodities_order_flow_order_type_selection_dialog_title, null, null, 14), null, null, null, false, 30));
        d3().f174519b.H();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((AccountCellItemDelegate) this.M.getValue()).f51551c.f53218h), new g(this, null), 3);
    }

    public final jii.f d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
