package i93;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f159551c;
    public final dj0.d d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f159552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f159553h;
    public final String i;

    public c(boolean z, boolean z3, k kVar, dj0.d dVar, boolean z4, List list, List accountsAvailableForBinding, d dVar2, String str) {
        Intrinsics.checkNotNullParameter(accountsAvailableForBinding, "accountsAvailableForBinding");
        this.f159549a = z;
        this.f159550b = z3;
        this.f159551c = kVar;
        this.d = dVar;
        this.e = z4;
        this.f = list;
        this.f159552g = accountsAvailableForBinding;
        this.f159553h = dVar2;
        this.i = str;
    }

    public static c a(c cVar, boolean z, boolean z3, k kVar, int i) {
        if ((i & 1) != 0) {
            z = cVar.f159549a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z3 = cVar.f159550b;
        }
        dj0.d dVar = cVar.d;
        boolean z6 = cVar.e;
        List list = cVar.f;
        List accountsAvailableForBinding = cVar.f159552g;
        d dVar2 = cVar.f159553h;
        String str = cVar.i;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(accountsAvailableForBinding, "accountsAvailableForBinding");
        return new c(z4, z3, kVar, dVar, z6, list, accountsAvailableForBinding, dVar2, str);
    }

    public final List b() {
        ArrayList arrayList;
        List list = this.f;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((h) it8.next()).f159559a);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f159549a == cVar.f159549a && this.f159550b == cVar.f159550b && Intrinsics.f(this.f159551c, cVar.f159551c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f159552g, cVar.f159552g) && this.f159553h == cVar.f159553h && Intrinsics.f(this.i, cVar.i);
    }

    public final String getLabel() {
        return this.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f159549a) * 31, 31, this.f159550b);
        k kVar = this.f159551c;
        int iHashCode = (iC + (kVar == null ? 0 : kVar.hashCode())) * 31;
        dj0.d dVar = this.d;
        int iC2 = j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int iD = p.a.d((iC2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f159552g);
        d dVar2 = this.f159553h;
        int iHashCode2 = (iD + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str = this.i;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
