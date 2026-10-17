package elf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import kotlin.coroutines.Continuation;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends yji.n implements s0 {
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (kotlin.text.a0.H(str, "TransactionListItem_", false) && (obj2 instanceof a3)) {
            A2(new TransactionDetailsDestination(ofm.q.P((a3) obj2), (rhf.d) null, 6));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
