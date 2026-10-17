package qo5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248047c;
    public final j d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f248048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ep5.c f248049h;
    public final String i;

    public n(String id10, String address, String addressType, j jVar, List linkedBeneficiaries, boolean z, String status, ep5.c cVar, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(linkedBeneficiaries, "linkedBeneficiaries");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f248045a = id10;
        this.f248046b = address;
        this.f248047c = addressType;
        this.d = jVar;
        this.e = linkedBeneficiaries;
        this.f = z;
        this.f248048g = status;
        this.f248049h = cVar;
        this.i = str;
    }

    public final String a() {
        return this.f248046b;
    }

    public final String b() {
        return this.f248047c;
    }

    public final String c() {
        return this.f248045a;
    }

    public final String d() {
        return this.i;
    }

    public final ep5.c e() {
        return this.f248049h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f248045a, nVar.f248045a) && Intrinsics.f(this.f248046b, nVar.f248046b) && Intrinsics.f(this.f248047c, nVar.f248047c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f && Intrinsics.f(this.f248048g, nVar.f248048g) && Intrinsics.f(this.f248049h, nVar.f248049h) && Intrinsics.f(this.i, nVar.i);
    }

    public final List f() {
        return this.e;
    }

    public final j g() {
        return this.d;
    }

    public final String h() {
        return this.f248048g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f248045a.hashCode() * 31, 31, this.f248046b), 31, this.f248047c);
        j jVar = this.d;
        int iC2 = p.a.c(j6.a.c(p.a.d((iC + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f248048g);
        ep5.c cVar = this.f248049h;
        int iHashCode = (iC2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean i() {
        return this.f;
    }
}
