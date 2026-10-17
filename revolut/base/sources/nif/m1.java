package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215937c;
    public final l1 d;
    public final j1 e;
    public final Long f;

    public m1(String id10, String str, String str2, l1 l1Var, j1 j1Var, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f215935a = id10;
        this.f215936b = str;
        this.f215937c = str2;
        this.d = l1Var;
        this.e = j1Var;
        this.f = l2;
    }

    public final j1 a() {
        return this.e;
    }

    public final String b() {
        return this.f215935a;
    }

    public final l1 c() {
        return this.d;
    }

    public final String d() {
        return this.f215937c;
    }

    public final Long e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f215935a, m1Var.f215935a) && Intrinsics.f(this.f215936b, m1Var.f215936b) && Intrinsics.f(this.f215937c, m1Var.f215937c) && Intrinsics.f(this.d, m1Var.d) && Intrinsics.f(this.e, m1Var.e) && Intrinsics.f(this.f, m1Var.f);
    }

    public final String f() {
        return this.f215936b;
    }

    public final int hashCode() {
        int iHashCode = this.f215935a.hashCode() * 31;
        String str = this.f215936b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215937c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        l1 l1Var = this.d;
        int iHashCode4 = (iHashCode3 + (l1Var == null ? 0 : l1Var.hashCode())) * 31;
        j1 j1Var = this.e;
        int iHashCode5 = (iHashCode4 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }
}
