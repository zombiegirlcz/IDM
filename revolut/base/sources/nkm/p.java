package nkm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class p {
    public static n a(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        n nVar = new n();
        nVar.d = fim.h.a(nVar, nVar, block);
        return nVar;
    }

    public static lim.q b(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new lim.q(block);
    }
}
