package com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager;

import aii.q;
import ali.c;
import ali.g;
import cli.l;
import cli.o;
import cli.y;
import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$InputData;
import com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pki.a;
import te0.w;
import vkm.j2;
import xki.e;
import zah.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/invest/transactions/details/pager/InvestTransactionDetailsPagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestTransactionDetailsPagerFlow extends ViewController<q> implements g {
    public final InvestTransactionDetailsPagerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public InvestTransactionDetailsPagerFlow(InvestTransactionDetailsPagerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_pager;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionDetailsPagerFlow f320705b;

            {
                this.f320705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (g) ((z9h.e) this.f320705b.O.getValue()).f320412b.get();
                    case 1:
                        int i2 = R$id.flow_pager;
                        InvestTransactionDetailsPagerFlow investTransactionDetailsPagerFlow = this.f320705b;
                        return mif.a.a(investTransactionDetailsPagerFlow, 0, i2, (g) investTransactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        InvestTransactionDetailsPagerFlow investTransactionDetailsPagerFlow2 = this.f320705b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionDetailsPagerFlow2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionDetailsPagerContract$InputData investTransactionDetailsPagerContract$InputData = investTransactionDetailsPagerFlow2.K;
                        investTransactionDetailsPagerContract$InputData.getClass();
                        return new z9h.e(dVar, investTransactionDetailsPagerContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: zah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionDetailsPagerFlow f320705b;

            {
                this.f320705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (g) ((z9h.e) this.f320705b.O.getValue()).f320412b.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        InvestTransactionDetailsPagerFlow investTransactionDetailsPagerFlow = this.f320705b;
                        return mif.a.a(investTransactionDetailsPagerFlow, 0, i22, (g) investTransactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        InvestTransactionDetailsPagerFlow investTransactionDetailsPagerFlow2 = this.f320705b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionDetailsPagerFlow2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionDetailsPagerContract$InputData investTransactionDetailsPagerContract$InputData = investTransactionDetailsPagerFlow2.K;
                        investTransactionDetailsPagerContract$InputData.getClass();
                        return new z9h.e(dVar, investTransactionDetailsPagerContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: zah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestTransactionDetailsPagerFlow f320705b;

            {
                this.f320705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (g) ((z9h.e) this.f320705b.O.getValue()).f320412b.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        InvestTransactionDetailsPagerFlow investTransactionDetailsPagerFlow = this.f320705b;
                        return mif.a.a(investTransactionDetailsPagerFlow, 0, i22, (g) investTransactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        InvestTransactionDetailsPagerFlow investTransactionDetailsPagerFlow2 = this.f320705b;
                        phm.a aVar = (phm.a) ue0.e.j(investTransactionDetailsPagerFlow2.m2()).a().get(z9h.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z9h.d.class, " is not found"));
                        }
                        z9h.d dVar = ((z9h.d) aVar2.b()).f320410w;
                        InvestTransactionDetailsPagerContract$InputData investTransactionDetailsPagerContract$InputData = investTransactionDetailsPagerFlow2.K;
                        investTransactionDetailsPagerContract$InputData.getClass();
                        return new z9h.e(dVar, investTransactionDetailsPagerContract$InputData);
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
        final InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem page = (InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        zah.g gVar = (zah.g) this.M.getValue();
        gVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        y yVar = gVar.f320717s;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        final int iIndexOf = ((b) j2Var.getValue()).f320707b.indexOf(page);
        if (iIndexOf < 0) {
            return;
        }
        int size = ((b) j2Var2.getValue()).f320707b.size();
        Integer num = ((b) j2Var2.getValue()).d;
        final boolean zI2 = false;
        boolean z = num != null && iIndexOf > num.intValue();
        boolean z3 = num != null && iIndexOf < num.intValue();
        if (z && size - iIndexOf < 5) {
            zI2 = gVar.I2(page);
        } else if (z3 && iIndexOf < 5) {
            zI2 = gVar.I2(page);
        }
        gVar.H2(yVar, new Function1() { // from class: zah.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String id10 = page.f95576a.getId();
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (zI2) {
                    numValueOf = null;
                }
                return b.a(update, id10, null, null, numValueOf, 6);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z9h.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (z9h.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zah.g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (c) this.N.getValue();
    }
}
