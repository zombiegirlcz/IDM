package dej;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f113560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f113561c;
    public final Long d;
    public final Boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f113562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimCoverage f113563h;
    public final n3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f113564j;
    public final c2 k;

    public i3(String name, Long l2, Long l3, Long l4, Boolean bool, boolean z, Boolean bool2, EsimCoverage coverage, n3 n3Var, long j2, c2 c2Var) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f113559a = name;
        this.f113560b = l2;
        this.f113561c = l3;
        this.d = l4;
        this.e = bool;
        this.f = z;
        this.f113562g = bool2;
        this.f113563h = coverage;
        this.i = n3Var;
        this.f113564j = j2;
        this.k = c2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return Intrinsics.f(this.f113559a, i3Var.f113559a) && Intrinsics.f(this.f113560b, i3Var.f113560b) && Intrinsics.f(this.f113561c, i3Var.f113561c) && Intrinsics.f(this.d, i3Var.d) && Intrinsics.f(this.e, i3Var.e) && this.f == i3Var.f && Intrinsics.f(this.f113562g, i3Var.f113562g) && Intrinsics.f(this.f113563h, i3Var.f113563h) && Intrinsics.f(this.i, i3Var.i) && this.f113564j == i3Var.f113564j && Intrinsics.f(this.k, i3Var.k);
    }

    public final int hashCode() {
        int iHashCode = this.f113559a.hashCode() * 31;
        Long l2 = this.f113560b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f113561c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Boolean bool = this.e;
        int iC = j6.a.c((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f);
        Boolean bool2 = this.f113562g;
        int iHashCode5 = (this.f113563h.hashCode() + ((iC + (bool2 == null ? 0 : bool2.hashCode())) * 31)) * 31;
        n3 n3Var = this.i;
        int iC2 = a0.d.c((iHashCode5 + (n3Var == null ? 0 : n3Var.hashCode())) * 31, 31, this.f113564j);
        c2 c2Var = this.k;
        return iC2 + (c2Var != null ? c2Var.hashCode() : 0);
    }
}
