package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts;

import a0.d;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.LoanRepaymentAccountsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.LoanRepaymentAccountsRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qji.b;
import te0.w;
import u45.h;
import u45.t0;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentaccounts/LoanRepaymentAccountsRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "Lno/m;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRepaymentAccountsRootFlow extends ViewController<Object> implements f, m {
    public final LoanRepaymentAccountsFlowContract$InputData K;
    public final k9 L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public LoanRepaymentAccountsRootFlow(LoanRepaymentAccountsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 value = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.L = value;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: v75.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsRootFlow f286559b;

            {
                this.f286559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (a) ((t0) this.f286559b.O.getValue()).d.get();
                    case 1:
                        LoanRepaymentAccountsRootFlow loanRepaymentAccountsRootFlow = this.f286559b;
                        phm.a aVar = (phm.a) e.j(loanRepaymentAccountsRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.di.RepaymentAccountsFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanRepaymentAccountsFlowContract$InputData loanRepaymentAccountsFlowContract$InputData = loanRepaymentAccountsRootFlow.K;
                        loanRepaymentAccountsFlowContract$InputData.getClass();
                        return new t0(hVar, loanRepaymentAccountsFlowContract$InputData);
                    default:
                        LoanRepaymentAccountsRootFlow loanRepaymentAccountsRootFlow2 = this.f286559b;
                        return c.d(R$id.screen_transparent_container, 4, null, loanRepaymentAccountsRootFlow2, (a) loanRepaymentAccountsRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: v75.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsRootFlow f286559b;

            {
                this.f286559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (a) ((t0) this.f286559b.O.getValue()).d.get();
                    case 1:
                        LoanRepaymentAccountsRootFlow loanRepaymentAccountsRootFlow = this.f286559b;
                        phm.a aVar = (phm.a) e.j(loanRepaymentAccountsRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.di.RepaymentAccountsFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanRepaymentAccountsFlowContract$InputData loanRepaymentAccountsFlowContract$InputData = loanRepaymentAccountsRootFlow.K;
                        loanRepaymentAccountsFlowContract$InputData.getClass();
                        return new t0(hVar, loanRepaymentAccountsFlowContract$InputData);
                    default:
                        LoanRepaymentAccountsRootFlow loanRepaymentAccountsRootFlow2 = this.f286559b;
                        return c.d(R$id.screen_transparent_container, 4, null, loanRepaymentAccountsRootFlow2, (a) loanRepaymentAccountsRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: v75.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentAccountsRootFlow f286559b;

            {
                this.f286559b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (a) ((t0) this.f286559b.O.getValue()).d.get();
                    case 1:
                        LoanRepaymentAccountsRootFlow loanRepaymentAccountsRootFlow = this.f286559b;
                        phm.a aVar = (phm.a) e.j(loanRepaymentAccountsRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.di.RepaymentAccountsFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanRepaymentAccountsFlowContract$InputData loanRepaymentAccountsFlowContract$InputData = loanRepaymentAccountsRootFlow.K;
                        loanRepaymentAccountsFlowContract$InputData.getClass();
                        return new t0(hVar, loanRepaymentAccountsFlowContract$InputData);
                    default:
                        LoanRepaymentAccountsRootFlow loanRepaymentAccountsRootFlow2 = this.f286559b;
                        return c.d(R$id.screen_transparent_container, 4, null, loanRepaymentAccountsRootFlow2, (a) loanRepaymentAccountsRootFlow2.N.getValue());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return new AnalyticsProduct.Retail(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (t0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (v75.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
