package com.revolut.feature.transaction_details_pager.impl.ui.flow;

import abf.n;
import aii.q;
import ali.g;
import cli.l;
import cli.o;
import cli.y;
import com.revolut.feature.transaction_details_pager.R$id;
import com.revolut.feature.transaction_details_pager.R$layout;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlow;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import igf.b;
import igf.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.a;
import te0.w;
import vkm.j2;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transaction_details_pager/impl/ui/flow/TransactionDetailsPagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lcli/l;", "Lcom/revolut/feature/transaction_details_pager/impl/ui/flow/TransactionDetailsPagerFlowContract$DetailsPage;", "feature_transaction_details_pager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionDetailsPagerFlow extends ViewController<q> implements g {
    public final TransactionDetailsPagerFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TransactionDetailsPagerFlow(TransactionDetailsPagerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_transaction_details_pager;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: igf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsPagerFlow f161185b;

            {
                this.f161185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((hgf.b) this.f161185b.O.getValue()).f152179b.get();
                    case 1:
                        int i2 = R$id.flow_pager;
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow = this.f161185b;
                        return mif.a.a(transactionDetailsPagerFlow, 0, i2, (b) transactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow2 = this.f161185b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionDetailsPagerFlow2.m2()).a().get(hgf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hgf.a.class, " is not found"));
                        }
                        hgf.a aVar3 = ((hgf.a) aVar2.b()).f152177c;
                        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = transactionDetailsPagerFlow2.K;
                        transactionDetailsPagerFlowContract$InputData.getClass();
                        return new hgf.b(aVar3, transactionDetailsPagerFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: igf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsPagerFlow f161185b;

            {
                this.f161185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((hgf.b) this.f161185b.O.getValue()).f152179b.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow = this.f161185b;
                        return mif.a.a(transactionDetailsPagerFlow, 0, i22, (b) transactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow2 = this.f161185b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionDetailsPagerFlow2.m2()).a().get(hgf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hgf.a.class, " is not found"));
                        }
                        hgf.a aVar3 = ((hgf.a) aVar2.b()).f152177c;
                        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = transactionDetailsPagerFlow2.K;
                        transactionDetailsPagerFlowContract$InputData.getClass();
                        return new hgf.b(aVar3, transactionDetailsPagerFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: igf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsPagerFlow f161185b;

            {
                this.f161185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((hgf.b) this.f161185b.O.getValue()).f152179b.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow = this.f161185b;
                        return mif.a.a(transactionDetailsPagerFlow, 0, i22, (b) transactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow2 = this.f161185b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionDetailsPagerFlow2.m2()).a().get(hgf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hgf.a.class, " is not found"));
                        }
                        hgf.a aVar3 = ((hgf.a) aVar2.b()).f152177c;
                        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = transactionDetailsPagerFlow2.K;
                        transactionDetailsPagerFlowContract$InputData.getClass();
                        return new hgf.b(aVar3, transactionDetailsPagerFlowContract$InputData);
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
        TransactionDetailsPagerFlowContract$DetailsPage page = (TransactionDetailsPagerFlowContract$DetailsPage) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        igf.g gVar = (igf.g) ((b) this.M.getValue());
        gVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        y yVar = gVar.f161193s;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        int iIndexOf = ((c) j2Var.getValue()).f161187b.indexOf(page);
        if (iIndexOf < 0) {
            return;
        }
        int size = ((c) j2Var2.getValue()).f161187b.size();
        Integer num = ((c) j2Var2.getValue()).f161188c;
        boolean z = false;
        boolean z3 = num != null && iIndexOf > num.intValue();
        if (num != null && iIndexOf < num.intValue()) {
            z = true;
        }
        if (z3) {
            if (size - iIndexOf < 5) {
                gVar.I2(page);
            }
        } else if (z && iIndexOf < 5) {
            gVar.I2(page);
        }
        gVar.H2(yVar, new n(page, iIndexOf, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hgf.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (hgf.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (ali.c) this.N.getValue();
    }
}
