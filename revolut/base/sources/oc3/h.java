package oc3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f224064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co3.a f224065c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final co3.a f224066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final co3.a f224067h;
    public final boolean i;

    public h() {
        this(0);
    }

    public static h a(h hVar, boolean z, List list, co3.a aVar, String str, boolean z3, boolean z4, co3.a aVar2, co3.a aVar3, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = hVar.f224063a;
        }
        boolean z11 = z;
        if ((i & 2) != 0) {
            list = hVar.f224064b;
        }
        List allLocations = list;
        if ((i & 4) != 0) {
            aVar = hVar.f224065c;
        }
        co3.a aVar4 = aVar;
        if ((i & 8) != 0) {
            str = hVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z3 = hVar.e;
        }
        boolean z12 = z3;
        boolean z29 = (i & 32) != 0 ? hVar.f : z4;
        co3.a aVar5 = (i & 64) != 0 ? hVar.f224066g : aVar2;
        co3.a aVar6 = (i & 128) != 0 ? hVar.f224067h : aVar3;
        boolean z31 = (i & 256) != 0 ? hVar.i : z6;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(allLocations, "allLocations");
        return new h(z11, allLocations, aVar4, str2, z12, z29, aVar5, aVar6, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f224063a == hVar.f224063a && Intrinsics.f(this.f224064b, hVar.f224064b) && Intrinsics.f(this.f224065c, hVar.f224065c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && Intrinsics.f(this.f224066g, hVar.f224066g) && Intrinsics.f(this.f224067h, hVar.f224067h) && this.i == hVar.i;
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.f224063a) * 31, 31, this.f224064b);
        co3.a aVar = this.f224065c;
        int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.d;
        int iC = j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        co3.a aVar2 = this.f224066g;
        int iHashCode2 = (iC + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        co3.a aVar3 = this.f224067h;
        return Boolean.hashCode(this.i) + ((iHashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31);
    }

    public h(boolean z, List allLocations, co3.a aVar, String str, boolean z3, boolean z4, co3.a aVar2, co3.a aVar3, boolean z6) {
        Intrinsics.checkNotNullParameter(allLocations, "allLocations");
        this.f224063a = z;
        this.f224064b = allLocations;
        this.f224065c = aVar;
        this.d = str;
        this.e = z3;
        this.f = z4;
        this.f224066g = aVar2;
        this.f224067h = aVar3;
        this.i = z6;
    }

    public h(int i) {
        this(true, f0.f322471a, null, null, true, false, null, null, false);
    }
}
