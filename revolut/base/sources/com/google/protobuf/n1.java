package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f49753c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj2, long j2, int i) {
        List list = (List) w3.f49823c.k(obj2, j2);
        if (list.isEmpty()) {
            List l1Var = list instanceof m1 ? new l1(i) : ((list instanceof n2) && (list instanceof i1)) ? ((i1) list).mutableCopyWithCapacity(i) : new ArrayList(i);
            w3.p(obj2, j2, l1Var);
            return l1Var;
        }
        if (f49753c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            w3.p(obj2, j2, arrayList);
            return arrayList;
        }
        if (list instanceof q3) {
            l1 l1Var2 = new l1(list.size() + i);
            l1Var2.addAll((q3) list);
            w3.p(obj2, j2, l1Var2);
            return l1Var2;
        }
        if ((list instanceof n2) && (list instanceof i1)) {
            i1 i1Var = (i1) list;
            if (!((c) i1Var).f49688a) {
                i1 i1VarMutableCopyWithCapacity = i1Var.mutableCopyWithCapacity(list.size() + i);
                w3.p(obj2, j2, i1VarMutableCopyWithCapacity);
                return i1VarMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.p1
    public final void a(Object obj2, long j2) {
        Object objUnmodifiableList;
        List list = (List) w3.f49823c.k(obj2, j2);
        if (list instanceof m1) {
            objUnmodifiableList = ((m1) list).getUnmodifiableView();
        } else {
            if (f49753c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof n2) && (list instanceof i1)) {
                c cVar = (c) ((i1) list);
                boolean z = cVar.f49688a;
                if (z && z) {
                    cVar.f49688a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        w3.p(obj2, j2, objUnmodifiableList);
    }

    @Override // com.google.protobuf.p1
    public final void b(Object obj2, Object obj3, long j2) {
        List list = (List) w3.f49823c.k(obj3, j2);
        List listD = d(obj2, j2, list.size());
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        w3.p(obj2, j2, list);
    }

    @Override // com.google.protobuf.p1
    public final List c(Object obj2, long j2) {
        return d(obj2, j2, 10);
    }
}
