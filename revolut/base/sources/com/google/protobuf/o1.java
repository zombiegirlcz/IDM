package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends p1 {
    @Override // com.google.protobuf.p1
    public final void a(Object obj2, long j2) {
        c cVar = (c) ((i1) w3.f49823c.k(obj2, j2));
        if (cVar.f49688a) {
            cVar.f49688a = false;
        }
    }

    @Override // com.google.protobuf.p1
    public final void b(Object obj2, Object obj3, long j2) {
        v3 v3Var = w3.f49823c;
        i1 i1VarMutableCopyWithCapacity = (i1) v3Var.k(obj2, j2);
        i1 i1Var = (i1) v3Var.k(obj3, j2);
        int size = i1VarMutableCopyWithCapacity.size();
        int size2 = i1Var.size();
        if (size > 0 && size2 > 0) {
            if (!((c) i1VarMutableCopyWithCapacity).f49688a) {
                i1VarMutableCopyWithCapacity = i1VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            i1VarMutableCopyWithCapacity.addAll(i1Var);
        }
        if (size > 0) {
            i1Var = i1VarMutableCopyWithCapacity;
        }
        w3.p(obj2, j2, i1Var);
    }

    @Override // com.google.protobuf.p1
    public final List c(Object obj2, long j2) {
        i1 i1Var = (i1) w3.f49823c.k(obj2, j2);
        if (((c) i1Var).f49688a) {
            return i1Var;
        }
        int size = i1Var.size();
        i1 i1VarMutableCopyWithCapacity = i1Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        w3.p(obj2, j2, i1VarMutableCopyWithCapacity);
        return i1VarMutableCopyWithCapacity;
    }
}
