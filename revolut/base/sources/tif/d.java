package tif;

import com.revolut.domain.interactors.transactions.Priority;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface d {
    static pfm.r a(d dVar, List transactions) {
        q qVar = (q) dVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return qVar.e.d(new Priority.HIGH("Insert new transactions to the database"), new qg7.k(qVar, 8, transactions, (Object) null));
    }
}
