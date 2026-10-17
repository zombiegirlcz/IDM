package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.b f151147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f151148c;
    public final v2 d;
    public final v2 e;
    public final v2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f151149g;

    public s0(String ref2, jo3.b bVar, Long l2, v2 v2Var, v2 v2Var2, v2 v2Var3, Boolean bool) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f151146a = ref2;
        this.f151147b = bVar;
        this.f151148c = l2;
        this.d = v2Var;
        this.e = v2Var2;
        this.f = v2Var3;
        this.f151149g = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f151146a, s0Var.f151146a) && Intrinsics.f(this.f151147b, s0Var.f151147b) && Intrinsics.f(this.f151148c, s0Var.f151148c) && Intrinsics.f(this.d, s0Var.d) && Intrinsics.f(this.e, s0Var.e) && Intrinsics.f(this.f, s0Var.f) && Intrinsics.f(this.f151149g, s0Var.f151149g);
    }

    public final int hashCode() {
        int iHashCode = this.f151146a.hashCode() * 31;
        jo3.b bVar = this.f151147b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l2 = this.f151148c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        v2 v2Var = this.d;
        int iHashCode4 = (iHashCode3 + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        v2 v2Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (v2Var2 == null ? 0 : v2Var2.hashCode())) * 31;
        v2 v2Var3 = this.f;
        int iHashCode6 = (iHashCode5 + (v2Var3 == null ? 0 : v2Var3.hashCode())) * 31;
        Boolean bool = this.f151149g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }
}
