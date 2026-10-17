package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f215942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f215943c;
    public final Boolean d;
    public final h4 e;
    public final k4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4 f215944g;

    public m4(String str, Long l2, Long l3, Boolean bool, h4 h4Var, k4 k4Var, l4 l4Var) {
        this.f215941a = str;
        this.f215942b = l2;
        this.f215943c = l3;
        this.d = bool;
        this.e = h4Var;
        this.f = k4Var;
        this.f215944g = l4Var;
    }

    public final h4 a() {
        return this.e;
    }

    public final Boolean b() {
        return this.d;
    }

    public final Long c() {
        return this.f215942b;
    }

    public final String d() {
        return this.f215941a;
    }

    public final Long e() {
        return this.f215943c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj2;
        return Intrinsics.f(this.f215941a, m4Var.f215941a) && Intrinsics.f(this.f215942b, m4Var.f215942b) && Intrinsics.f(this.f215943c, m4Var.f215943c) && Intrinsics.f(this.d, m4Var.d) && Intrinsics.f(this.e, m4Var.e) && Intrinsics.f(this.f, m4Var.f) && Intrinsics.f(this.f215944g, m4Var.f215944g);
    }

    public final k4 f() {
        return this.f;
    }

    public final l4 g() {
        return this.f215944g;
    }

    public final int hashCode() {
        String str = this.f215941a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.f215942b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f215943c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        h4 h4Var = this.e;
        int iHashCode5 = (iHashCode4 + (h4Var == null ? 0 : h4Var.f215855a.hashCode())) * 31;
        k4 k4Var = this.f;
        int iHashCode6 = (iHashCode5 + (k4Var == null ? 0 : k4Var.f215904a.hashCode())) * 31;
        l4 l4Var = this.f215944g;
        return iHashCode6 + (l4Var != null ? l4Var.hashCode() : 0);
    }
}
