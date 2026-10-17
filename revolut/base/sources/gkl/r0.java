package gkl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f144487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144488c;
    public final cjl.s d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f144489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f144490h;
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f144491j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f144492l;

    public r0(String id10, u0 type, String sessionToken, cjl.s routingContext, List list, String str, Set rejectedClaims, Set rejectedMethods, Boolean bool, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(routingContext, "routingContext");
        Intrinsics.checkNotNullParameter(rejectedClaims, "rejectedClaims");
        Intrinsics.checkNotNullParameter(rejectedMethods, "rejectedMethods");
        this.f144486a = id10;
        this.f144487b = type;
        this.f144488c = sessionToken;
        this.d = routingContext;
        this.e = list;
        this.f = str;
        this.f144489g = rejectedClaims;
        this.f144490h = rejectedMethods;
        this.i = bool;
        this.f144491j = str2;
        this.k = str3;
        this.f144492l = z;
    }

    @Override // gkl.v0
    public final String a() {
        return this.f144486a;
    }

    public final boolean b() {
        return this.f144492l;
    }

    public final String c() {
        return this.f144491j;
    }

    public final String d() {
        return this.k;
    }

    public final Set e() {
        return this.f144489g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f144486a, r0Var.f144486a) && this.f144487b == r0Var.f144487b && Intrinsics.f(this.f144488c, r0Var.f144488c) && this.d == r0Var.d && Intrinsics.f(this.e, r0Var.e) && Intrinsics.f(this.f, r0Var.f) && Intrinsics.f(this.f144489g, r0Var.f144489g) && Intrinsics.f(this.f144490h, r0Var.f144490h) && Intrinsics.f(this.i, r0Var.i) && Intrinsics.f(this.f144491j, r0Var.f144491j) && Intrinsics.f(this.k, r0Var.k) && this.f144492l == r0Var.f144492l;
    }

    public final Set f() {
        return this.f144490h;
    }

    public final cjl.s g() {
        return this.d;
    }

    public final List h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c((this.f144487b.hashCode() + (this.f144486a.hashCode() * 31)) * 31, 31, this.f144488c)) * 31;
        List list = this.e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        int iF = p.a.f(p.a.f((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f144489g), 31, this.f144490h);
        Boolean bool = this.i;
        int iHashCode3 = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f144491j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return Boolean.hashCode(this.f144492l) + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f144488c;
    }

    public final Boolean j() {
        return this.i;
    }

    public final String k() {
        return this.f;
    }

    public final u0 l() {
        return this.f144487b;
    }
}
