package sjl;

import kotlin.jvm.internal.Intrinsics;
import vjl.p;

/* JADX INFO: loaded from: classes12.dex */
public final class c {
    public static p a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        p.Companion.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        p pVar = p.PERSONAL;
        if (Intrinsics.f(value, pVar.a())) {
            return pVar;
        }
        p pVar2 = p.BUSINESS;
        if (Intrinsics.f(value, pVar2.a())) {
            return pVar2;
        }
        p pVar3 = p.UNKNOWN;
        if (Intrinsics.f(value, pVar3.a())) {
            return pVar3;
        }
        throw new IllegalStateException((value + " is not supported").toString());
    }
}
