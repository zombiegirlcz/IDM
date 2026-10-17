package ba6;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Serializable {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13940c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f13942h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f13943j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f13944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f13945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f13946n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f13947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f13948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f13949r;

    public l(String id10, String name, String pocketId, String brief, String description, String iconUrl, String bannerUrl, dj0.d totalDonation, dj0.d myDonation, d dVar, boolean z, String code, i availabilityArea, long j2, boolean z3, int i, j availability, boolean z4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(brief, "brief");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(bannerUrl, "bannerUrl");
        Intrinsics.checkNotNullParameter(totalDonation, "totalDonation");
        Intrinsics.checkNotNullParameter(myDonation, "myDonation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(availabilityArea, "availabilityArea");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f13938a = id10;
        this.f13939b = name;
        this.f13940c = pocketId;
        this.d = brief;
        this.e = description;
        this.f = iconUrl;
        this.f13941g = bannerUrl;
        this.f13942h = totalDonation;
        this.i = myDonation;
        this.f13943j = dVar;
        this.k = z;
        this.f13944l = code;
        this.f13945m = availabilityArea;
        this.f13946n = j2;
        this.o = z3;
        this.f13947p = i;
        this.f13948q = availability;
        this.f13949r = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f13938a, lVar.f13938a) && Intrinsics.f(this.f13939b, lVar.f13939b) && Intrinsics.f(this.f13940c, lVar.f13940c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f13941g, lVar.f13941g) && Intrinsics.f(this.f13942h, lVar.f13942h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f13943j, lVar.f13943j) && this.k == lVar.k && Intrinsics.f(this.f13944l, lVar.f13944l) && this.f13945m == lVar.f13945m && this.f13946n == lVar.f13946n && this.o == lVar.o && this.f13947p == lVar.f13947p && this.f13948q == lVar.f13948q && this.f13949r == lVar.f13949r;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f13938a.hashCode() * 31, 31, this.f13939b), 31, this.f13940c), 31, this.d), 31, this.e), 31, this.f), 31, this.f13941g), 31, this.f13942h), 31, this.i);
        d dVar = this.f13943j;
        return Boolean.hashCode(this.f13949r) + ((this.f13948q.hashCode() + j6.a.b(this.f13947p, j6.a.c(a0.d.c((this.f13945m.hashCode() + p.a.c(j6.a.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.k), 31, this.f13944l)) * 31, 31, this.f13946n), 31, this.o), 31)) * 31);
    }
}
