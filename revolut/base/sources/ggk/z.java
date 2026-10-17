package ggk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f143804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f143805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f143806c;

    public z(b1 b1Var, List list, d1 d1Var) {
        this.f143804a = b1Var;
        this.f143805b = list;
        this.f143806c = d1Var;
    }

    public static z a(z zVar, ArrayList arrayList, int i) {
        b1 b1Var = (i & 1) != 0 ? zVar.f143804a : null;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = zVar.f143805b;
        }
        d1 d1Var = zVar.f143806c;
        zVar.getClass();
        return new z(b1Var, list, d1Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f143804a, zVar.f143804a) && Intrinsics.f(this.f143805b, zVar.f143805b) && Intrinsics.f(this.f143806c, zVar.f143806c);
    }

    public final int hashCode() {
        b1 b1Var = this.f143804a;
        int iHashCode = (b1Var == null ? 0 : b1Var.hashCode()) * 31;
        List list = this.f143805b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        d1 d1Var = this.f143806c;
        return iHashCode2 + (d1Var != null ? d1Var.hashCode() : 0);
    }
}
