package hk5;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.v6;
import tof.y6;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static boolean a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (transaction.e == y6.CRYPTO_WITHDRAWAL && transaction.f == v6.PENDING) {
            return Intrinsics.f(transaction.f272611s, "suspicious_transaction_user_action_required");
        }
        return false;
    }
}
