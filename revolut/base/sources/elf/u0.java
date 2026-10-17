package elf;

import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.declaration.LinkedTransactionDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rhf.d f127416l;

    public u0(rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f127416l = entryPoint;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (kotlin.text.a0.H(str, "TransactionListItem_", false) && (obj2 instanceof aof.b)) {
            aof.b bVar = (aof.b) obj2;
            A2(new LinkedTransactionDestination(bVar.f7981a, bVar.f7982b, this.f127416l, bVar.f7983c));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
