package glf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import elf.s0;
import kotlin.coroutines.Continuation;
import kotlin.text.a0;
import ofm.q;
import rhf.d;
import tof.a3;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends n implements s0 {
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (a0.H(str, "TransactionListItem_", false) && (obj2 instanceof a3)) {
            A2(new TransactionDetailsDestination(q.P((a3) obj2), (d) null, 6));
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
