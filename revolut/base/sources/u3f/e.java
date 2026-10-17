package u3f;

import dfl.s0;
import kotlin.jvm.internal.Intrinsics;
import n3f.d;
import w3f.l0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {
    public static final s0 a(String str, d.a aVar) {
        return new s0(str, aVar != null ? aVar.getCounterpartBrokerName() : null);
    }

    public static final s0 b(l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        return new s0(l0Var.getTransferRequestId(), l0Var.getCounterpartBrokerName());
    }
}
