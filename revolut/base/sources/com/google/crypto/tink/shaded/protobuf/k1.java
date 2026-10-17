package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public final class k1 extends i1 {
    @Override // com.google.crypto.tink.shaded.protobuf.i1
    public final j1 a(Object obj2) {
        b0 b0Var = (b0) obj2;
        j1 j1Var = b0Var.unknownFields;
        if (j1Var != j1.f) {
            return j1Var;
        }
        j1 j1VarC = j1.c();
        b0Var.unknownFields = j1VarC;
        return j1VarC;
    }
}
