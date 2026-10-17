package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class l0 extends m0 {
    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void a(Object obj2, long j2) {
        ((b) ((f0) s1.f49412c.i(obj2, j2))).f49346a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void b(Object obj2, Object obj3, long j2) {
        r1 r1Var = s1.f49412c;
        f0 f0VarMutableCopyWithCapacity = (f0) r1Var.i(obj2, j2);
        f0 f0Var = (f0) r1Var.i(obj3, j2);
        int size = f0VarMutableCopyWithCapacity.size();
        int size2 = f0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((b) f0VarMutableCopyWithCapacity).f49346a) {
                f0VarMutableCopyWithCapacity = f0VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            f0VarMutableCopyWithCapacity.addAll(f0Var);
        }
        if (size > 0) {
            f0Var = f0VarMutableCopyWithCapacity;
        }
        s1.p(obj2, j2, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final List c(Object obj2, long j2) {
        f0 f0Var = (f0) s1.f49412c.i(obj2, j2);
        if (((b) f0Var).f49346a) {
            return f0Var;
        }
        int size = f0Var.size();
        f0 f0VarMutableCopyWithCapacity = f0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        s1.p(obj2, j2, f0VarMutableCopyWithCapacity);
        return f0VarMutableCopyWithCapacity;
    }
}
