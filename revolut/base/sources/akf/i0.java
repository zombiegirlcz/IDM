package akf;

import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentCreateFlowDestination$CreateWithTransaction;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.m1 f5841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k71.i f5842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.h0 f5843n;
    public final al4.e o;

    public i0(klf.m1 juniorDataSource, k71.i transactionDescriptor, klf.h0 commonDataSource, al4.e debitToInstalmentInteractor) {
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(debitToInstalmentInteractor, "debitToInstalmentInteractor");
        this.f5841l = juniorDataSource;
        this.f5842m = transactionDescriptor;
        this.f5843n = commonDataSource;
        this.o = debitToInstalmentInteractor;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        dj0.d dVar;
        if (a10.b.B(v1.Companion, t1.DEBIT_TO_INSTALMENT_CREATE, str)) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.transactions.impl.ui.kompot.details.action_provider.CreateDebitInstalmentActionProvider.DebitToInstalment.Available");
            c0 c0Var = (c0) obj2;
            a3 a3VarB = this.f5843n.b();
            if (a3VarB == null || (dVar = a3VarB.k) == null) {
                throw new IllegalStateException("transaction is null");
            }
            A2(new CreditCardInstalmentCreateFlowDestination$CreateWithTransaction(c0Var.f5821a, zhm.y0.b(this.f5842m.a()), new CreditCardInstalmentCreateFlowDestination$CreateWithTransaction.TransactionType.Debit(dVar)));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
