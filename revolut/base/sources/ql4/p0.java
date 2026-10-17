package ql4;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p0 {
    private p0() {
    }

    public static q0 a(String type) {
        Object next;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<E> it8 = q0.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((q0) next).name(), type)) {
                break;
            }
        }
        q0 q0Var = (q0) next;
        return q0Var == null ? q0.UNSUPPORTED : q0Var;
    }
}
