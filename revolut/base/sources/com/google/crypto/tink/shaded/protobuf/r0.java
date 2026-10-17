package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class r0 {
    public static void a(Object obj2, Object obj3) {
        q0 q0Var = (q0) obj2;
        if (obj3 != null) {
            throw new ClassCastException();
        }
        if (q0Var.isEmpty()) {
            return;
        }
        Iterator it8 = q0Var.entrySet().iterator();
        if (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static q0 b(Object obj2, Object obj3) {
        q0 q0VarC = (q0) obj2;
        q0 q0Var = (q0) obj3;
        if (!q0Var.isEmpty()) {
            if (!q0VarC.f49404a) {
                q0VarC = q0VarC.c();
            }
            q0VarC.b();
            if (!q0Var.isEmpty()) {
                q0VarC.putAll(q0Var);
            }
        }
        return q0VarC;
    }
}
