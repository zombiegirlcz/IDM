package com.revolut.trading.orders.ui.details_pager;

import aii.q;
import ali.g;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.l;
import cli.o;
import com.revolut.feature.trading_orders.api.ui.details_pager.InvestOrderDetailsPagerFeatureContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.trading.orders.ui.details_pager.InvestOrderDetailsPagerFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.a;
import te0.w;
import vc.s;
import vq5.x;
import vsl.b;
import xki.e;
import xsl.c;
import xsl.p;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/details_pager/InvestOrderDetailsPagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderDetailsPagerFlow extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(InvestOrderDetailsPagerFlow.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/FlowPagerBinding;", 0))};
    public final InvestOrderDetailsPagerFeatureContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public InvestOrderDetailsPagerFlow(InvestOrderDetailsPagerFeatureContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_pager;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderDetailsPagerFlow f291846b;

            {
                this.f291846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestOrderDetailsPagerFlow investOrderDetailsPagerFlow = this.f291846b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderDetailsPagerFlow.Q;
                        return (g) ((xsl.c) investOrderDetailsPagerFlow.P.getValue()).f308584b.get();
                    case 1:
                        ViewBinding value = investOrderDetailsPagerFlow.M.getValue(investOrderDetailsPagerFlow, InvestOrderDetailsPagerFlow.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return mif.a.a(investOrderDetailsPagerFlow, 0, ((jii.b) value).f174497b.getId(), (g) investOrderDetailsPagerFlow.N.getValue(), 5);
                    default:
                        KProperty[] kPropertyArr2 = InvestOrderDetailsPagerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(investOrderDetailsPagerFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        InvestOrderDetailsPagerFeatureContract$InputData investOrderDetailsPagerFeatureContract$InputData = investOrderDetailsPagerFlow.K;
                        investOrderDetailsPagerFeatureContract$InputData.getClass();
                        return new xsl.c(pVar, investOrderDetailsPagerFeatureContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderDetailsPagerFlow f291846b;

            {
                this.f291846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestOrderDetailsPagerFlow investOrderDetailsPagerFlow = this.f291846b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderDetailsPagerFlow.Q;
                        return (g) ((xsl.c) investOrderDetailsPagerFlow.P.getValue()).f308584b.get();
                    case 1:
                        ViewBinding value = investOrderDetailsPagerFlow.M.getValue(investOrderDetailsPagerFlow, InvestOrderDetailsPagerFlow.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return mif.a.a(investOrderDetailsPagerFlow, 0, ((jii.b) value).f174497b.getId(), (g) investOrderDetailsPagerFlow.N.getValue(), 5);
                    default:
                        KProperty[] kPropertyArr2 = InvestOrderDetailsPagerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(investOrderDetailsPagerFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        InvestOrderDetailsPagerFeatureContract$InputData investOrderDetailsPagerFeatureContract$InputData = investOrderDetailsPagerFlow.K;
                        investOrderDetailsPagerFeatureContract$InputData.getClass();
                        return new xsl.c(pVar, investOrderDetailsPagerFeatureContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: vsl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestOrderDetailsPagerFlow f291846b;

            {
                this.f291846b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestOrderDetailsPagerFlow investOrderDetailsPagerFlow = this.f291846b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestOrderDetailsPagerFlow.Q;
                        return (g) ((xsl.c) investOrderDetailsPagerFlow.P.getValue()).f308584b.get();
                    case 1:
                        ViewBinding value = investOrderDetailsPagerFlow.M.getValue(investOrderDetailsPagerFlow, InvestOrderDetailsPagerFlow.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return mif.a.a(investOrderDetailsPagerFlow, 0, ((jii.b) value).f174497b.getId(), (g) investOrderDetailsPagerFlow.N.getValue(), 5);
                    default:
                        KProperty[] kPropertyArr2 = InvestOrderDetailsPagerFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(investOrderDetailsPagerFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).O;
                        InvestOrderDetailsPagerFeatureContract$InputData investOrderDetailsPagerFeatureContract$InputData = investOrderDetailsPagerFlow.K;
                        investOrderDetailsPagerFeatureContract$InputData.getClass();
                        return new xsl.c(pVar, investOrderDetailsPagerFeatureContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        InvestOrderDetailsPagerFlowContract$DetailsPagerItem page = (InvestOrderDetailsPagerFlowContract$DetailsPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        vsl.g gVar = (vsl.g) this.N.getValue();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        gVar.H2(gVar.f291852r, new x(page, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vsl.g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (ali.c) this.O.getValue();
    }
}
