package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class k0 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f49379c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj2, long j2, int i) {
        List list = (List) s1.f49412c.i(obj2, j2);
        if (list.isEmpty()) {
            List i0Var = list instanceof j0 ? new i0(i) : ((list instanceof b1) && (list instanceof f0)) ? ((f0) list).mutableCopyWithCapacity(i) : new ArrayList(i);
            s1.p(obj2, j2, i0Var);
            return i0Var;
        }
        if (f49379c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            s1.p(obj2, j2, arrayList);
            return arrayList;
        }
        if (list instanceof n1) {
            i0 i0Var2 = new i0(list.size() + i);
            i0Var2.addAll((n1) list);
            s1.p(obj2, j2, i0Var2);
            return i0Var2;
        }
        if ((list instanceof b1) && (list instanceof f0)) {
            f0 f0Var = (f0) list;
            if (!((b) f0Var).f49346a) {
                f0 f0VarMutableCopyWithCapacity = f0Var.mutableCopyWithCapacity(list.size() + i);
                s1.p(obj2, j2, f0VarMutableCopyWithCapacity);
                return f0VarMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void a(Object obj2, long j2) {
        Object objUnmodifiableList;
        List list = (List) s1.f49412c.i(obj2, j2);
        if (list instanceof j0) {
            objUnmodifiableList = ((j0) list).getUnmodifiableView();
        } else {
            if (f49379c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof b1) && (list instanceof f0)) {
                b bVar = (b) ((f0) list);
                if (bVar.f49346a) {
                    bVar.f49346a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        s1.p(obj2, j2, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void b(Object obj2, Object obj3, long j2) {
        List list = (List) s1.f49412c.i(obj3, j2);
        List listD = d(obj2, j2, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        s1.p(obj2, j2, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final List c(Object obj2, long j2) {
        return d(obj2, j2, 10);
    }
}
