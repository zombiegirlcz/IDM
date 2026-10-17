package jel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f173569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173571c;

    public u(v vVar, ArrayList arrayList, BigDecimal bigDecimal) {
        this.f173569a = vVar;
        this.f173570b = arrayList;
        this.f173571c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f173569a == uVar.f173569a && Intrinsics.f(this.f173570b, uVar.f173570b) && Intrinsics.f(this.f173571c, uVar.f173571c);
    }

    public final int hashCode() {
        v vVar = this.f173569a;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        List list = this.f173570b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BigDecimal bigDecimal = this.f173571c;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
