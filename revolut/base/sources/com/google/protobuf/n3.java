package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends l3 {
    @Override // com.google.protobuf.l3
    public final m3 a(Object obj2) {
        w0 w0Var = (w0) obj2;
        m3 m3Var = w0Var.unknownFields;
        if (m3Var != m3.f) {
            return m3Var;
        }
        m3 m3Var2 = new m3();
        w0Var.unknownFields = m3Var2;
        return m3Var2;
    }

    @Override // com.google.protobuf.l3
    public final void c(Object obj2, Object obj3) {
        ((w0) obj2).unknownFields = (m3) obj3;
    }
}
