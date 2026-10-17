package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z1 {
    private z1() {
    }

    public static boolean a(io3.d dVar, tof.a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String str = transaction.f272611s;
        dj0.d dVar2 = transaction.k;
        return Intrinsics.f(str, "insufficient_balance") && dVar != null && Intrinsics.f(dVar.f163147c, dVar2.f115083b.f306286a) && dVar.i < Math.abs(dVar2.f115082a);
    }
}
