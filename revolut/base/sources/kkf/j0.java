package kkf;

import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.declaration.LinkedTransactionDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final aof.a f184764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rhf.d f184765n;

    public j0(klf.h0 commonDataSource, aof.a cryptoCardLinkedTransactionMapper, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoCardLinkedTransactionMapper, "cryptoCardLinkedTransactionMapper");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f184763l = commonDataSource;
        this.f184764m = cryptoCardLinkedTransactionMapper;
        this.f184765n = entryPoint;
    }

    public final cmf.p Z2() {
        klf.h0 h0Var = this.f184763l;
        return new cmf.p(new t38.e(h0Var.d(), 24, h0Var.j(), new ael.l0(3, this, j0.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/core/model/domain/user/User;)Ljava/util/List;", 4, 10)), new i0(0), zhm.u.c(this), "CryptoCardLinkedTransaction");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (kotlin.text.a0.H(str, "TransactionListItem_", false) && (obj2 instanceof aof.b)) {
            aof.b bVar = (aof.b) obj2;
            A2(new LinkedTransactionDestination(bVar.f7981a, bVar.f7982b, this.f184765n, bVar.f7983c));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
