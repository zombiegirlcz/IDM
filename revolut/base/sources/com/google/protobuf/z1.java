package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {
    public static y1 a(Object obj2, Object obj3) {
        y1 y1VarC = (y1) obj2;
        y1 y1Var = (y1) obj3;
        if (!y1Var.isEmpty()) {
            if (!y1VarC.f49837a) {
                y1VarC = y1VarC.c();
            }
            y1VarC.b();
            if (!y1Var.isEmpty()) {
                y1VarC.putAll(y1Var);
            }
        }
        return y1VarC;
    }
}
