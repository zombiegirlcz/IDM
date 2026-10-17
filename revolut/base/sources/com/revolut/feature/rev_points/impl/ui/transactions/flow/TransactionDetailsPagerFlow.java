package com.revolut.feature.rev_points.impl.ui.transactions.flow;

import a94.e;
import ali.g;
import cli.o;
import cli.q;
import cli.y;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlow;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$DetailsPage;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import eub.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lk0.h;
import p0c.d;
import p0c.f;
import te0.w;
import vkm.j2;
import zxb.f0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/transactions/flow/TransactionDetailsPagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lp0c/d;", "Lali/g;", "Lp0c/f;", "Lcom/revolut/feature/rev_points/impl/ui/transactions/flow/TransactionDetailsPagerFlowContract$DetailsPage;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionDetailsPagerFlow extends ViewController<d> implements g {
    public final TransactionDetailsPagerFlowContract$InputData K;
    public final l L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;

    public TransactionDetailsPagerFlow(TransactionDetailsPagerFlowContract$InputData inputData, l revPointsTransactionsPagingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsTransactionsPagingInteractor, "revPointsTransactionsPagingInteractor");
        this.K = inputData;
        this.L = revPointsTransactionsPagingInteractor;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: p0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsPagerFlow f231496b;

            {
                this.f231496b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((f0) this.f231496b.O.getValue()).e.get();
                    case 1:
                        int i2 = R$id.flow_pager;
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow = this.f231496b;
                        return mif.a.a(transactionDetailsPagerFlow, 0, i2, (b) transactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow2 = this.f231496b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionDetailsPagerFlow2.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = transactionDetailsPagerFlow2.K;
                        transactionDetailsPagerFlowContract$InputData.getClass();
                        l lVar = transactionDetailsPagerFlow2.L;
                        lVar.getClass();
                        return new f0(eVar, transactionDetailsPagerFlowContract$InputData, lVar);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: p0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsPagerFlow f231496b;

            {
                this.f231496b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((f0) this.f231496b.O.getValue()).e.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow = this.f231496b;
                        return mif.a.a(transactionDetailsPagerFlow, 0, i22, (b) transactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow2 = this.f231496b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionDetailsPagerFlow2.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = transactionDetailsPagerFlow2.K;
                        transactionDetailsPagerFlowContract$InputData.getClass();
                        l lVar = transactionDetailsPagerFlow2.L;
                        lVar.getClass();
                        return new f0(eVar, transactionDetailsPagerFlowContract$InputData, lVar);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: p0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionDetailsPagerFlow f231496b;

            {
                this.f231496b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((f0) this.f231496b.O.getValue()).e.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow = this.f231496b;
                        return mif.a.a(transactionDetailsPagerFlow, 0, i22, (b) transactionDetailsPagerFlow.M.getValue(), 5);
                    default:
                        TransactionDetailsPagerFlow transactionDetailsPagerFlow2 = this.f231496b;
                        phm.a aVar = (phm.a) ue0.e.j(transactionDetailsPagerFlow2.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = transactionDetailsPagerFlow2.K;
                        transactionDetailsPagerFlowContract$InputData.getClass();
                        l lVar = transactionDetailsPagerFlow2.L;
                        lVar.getClass();
                        return new f0(eVar, transactionDetailsPagerFlowContract$InputData, lVar);
                }
            }
        });
        this.P = R$layout.flow_pager;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TransactionDetailsPagerFlowContract$DetailsPage page = (TransactionDetailsPagerFlowContract$DetailsPage) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        c cVar = (c) ((p0c.b) this.M.getValue());
        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = cVar.o;
        Intrinsics.checkNotNullParameter(page, "page");
        y yVar = cVar.f83869s;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        int iIndexOf = ((p0c.c) j2Var.getValue()).f231498b.indexOf(page);
        if (iIndexOf < 0) {
            return;
        }
        int size = ((p0c.c) j2Var2.getValue()).f231498b.size();
        Integer num = ((p0c.c) j2Var2.getValue()).f231499c;
        boolean z = false;
        boolean z3 = num != null && iIndexOf > num.intValue();
        if (num != null && iIndexOf < num.intValue()) {
            z = true;
        }
        h hVar = (!z3 || size - iIndexOf >= transactionDetailsPagerFlowContract$InputData.f83864c.f84104a / 2) ? (!z || iIndexOf >= transactionDetailsPagerFlowContract$InputData.f83864c.f84104a / 2) ? null : h.c.f196177a : h.b.f196176a;
        cVar.H2(yVar, new e(page, hVar, iIndexOf, 8));
        cVar.C2(new d(((TransactionDetailsPagerFlowContract$DetailsPage.Details) page).f83861a.f84054a, hVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (f0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (p0c.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.N.getValue();
    }
}
