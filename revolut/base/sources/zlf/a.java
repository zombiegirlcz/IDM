package zlf;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.i2;
import tof.m3;
import xjf.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static cmf.a a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        d dVar = transaction.f272599l;
        m3 m3Var = transaction.f272589e1;
        z3l.a aVar = m3Var != null ? m3Var.f272930b : null;
        i2 i2Var = transaction.f272594h0;
        d dVarA = e.a(transaction, nrf.a.TransferDefault, nrf.a.TransferOther);
        if (dVarA == null) {
            dVarA = transaction.o;
        }
        return new cmf.a(dVar, aVar, i2Var, dVarA, transaction.f272601n);
    }
}
