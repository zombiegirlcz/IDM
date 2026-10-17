package akf;

import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentCreateFlowDestination$CreateWithTransaction;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.g1 f5858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f5859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k71.i f5860n;

    public l0(klf.g1 instalmentsDataSource, klf.m1 juniorDataSource, k71.i transactionDescriptor) {
        Intrinsics.checkNotNullParameter(instalmentsDataSource, "instalmentsDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        this.f5858l = instalmentsDataSource;
        this.f5859m = juniorDataSource;
        this.f5860n = transactionDescriptor;
    }

    public final cmf.f Z2() {
        return new cmf.f(new t38.e((SharedFlow) this.f5858l.f.getValue(), 24, new a35.d(this.f5859m.a(), 12), new k0(3, 4, l0.class, this, "buildAction", "buildAction(Lcom/revolut/feature/transactions/impl/ui/transactiondetails/TransactionDetailsScreenContract$CreditCardInstalment;Z)Ljava/util/List;")), zhm.u.c(this), "CreateInstalment");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (a10.b.B(v1.Companion, t1.CREDIT_CARD_INSTALMENT_CREATE, str)) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.transactions.impl.ui.transactiondetails.TransactionDetailsScreenContract.CreditCardInstalment.Available");
            A2(new CreditCardInstalmentCreateFlowDestination$CreateWithTransaction(((rnf.n) obj2).f255683a, zhm.y0.b(this.f5860n.a()), CreditCardInstalmentCreateFlowDestination$CreateWithTransaction.TransactionType.Credit.f68932a));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
