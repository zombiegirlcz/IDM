package kkf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class b5 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t1j.b f184610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rhf.d f184611n;

    public b5(klf.h0 commonDataSource, t1j.b refundsUIStateProvider, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(refundsUIStateProvider, "refundsUIStateProvider");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f184609l = commonDataSource;
        this.f184610m = refundsUIStateProvider;
        this.f184611n = entryPoint;
    }

    public final cmf.p Z2() {
        klf.h0 h0Var = this.f184609l;
        return new cmf.p(new t38.e(h0Var.d(), 24, (Flow) h0Var.f185501s.getValue(), new ael.l0(3, this, b5.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/common/refunds/RefundsInfo;)Ljava/util/List;", 4, 19)), new chc.c0(23), zhm.u.c(this), "Refunds");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (kotlin.text.a0.H(str, "TransactionListItem_", false) && (obj2 instanceof tof.a3)) {
            A2(new TransactionDetailsDestination(ofm.q.P((tof.a3) obj2), (rhf.d) null, 6));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
