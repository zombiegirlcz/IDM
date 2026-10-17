package zim;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {
    static {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = Class.forName("java.lang.ClassValue");
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (!(objA instanceof yhm.n)) {
            objA = Boolean.TRUE;
        }
        Object obj2 = Boolean.FALSE;
        if (objA instanceof yhm.n) {
            objA = obj2;
        }
    }

    public static final e a(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        return new e(compute);
    }
}
