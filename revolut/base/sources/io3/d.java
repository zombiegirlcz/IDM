package io3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f163144x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f163147c;
    public final String d;
    public final l e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f163148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f163149h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f163150j;
    public final Long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f163151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f163152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f163153n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f163154p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f163155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f163156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f163157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f163158t;
    public final Long u;
    public final Long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LocalDate f163159w;

    static {
        l lVar = l.UNKNOWN;
        k kVar = k.UNKNOWN;
        j jVar = j.PERSONAL;
        LocalDate localDateI = oc.c.I(0L);
        f0 f0Var = f0.f322471a;
        o.Companion.getClass();
        f163144x = new d("", "", "", "", lVar, kVar, jVar, i.INTERNAL, 0L, localDateI, f0Var, o.f163166c, null);
    }

    public d(String id10, String walletId, String currency, String name, l type, k state, j ownershipType, i originType, long j2, LocalDate createdDate, Long l2, long j3, Long l3, Long l4, String str, String str2, boolean z, b bVar, List accounts, o topupSettings, Long l5, Long l22, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        Intrinsics.checkNotNullParameter(originType, "originType");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(topupSettings, "topupSettings");
        this.f163145a = id10;
        this.f163146b = walletId;
        this.f163147c = currency;
        this.d = name;
        this.e = type;
        this.f = state;
        this.f163148g = ownershipType;
        this.f163149h = originType;
        this.i = j2;
        this.f163150j = createdDate;
        this.k = l2;
        this.f163151l = j3;
        this.f163152m = l3;
        this.f163153n = l4;
        this.o = str;
        this.f163154p = str2;
        this.f163155q = z;
        this.f163156r = bVar;
        this.f163157s = accounts;
        this.f163158t = topupSettings;
        this.u = l5;
        this.v = l22;
        this.f163159w = localDate;
    }

    public static d a(d dVar, String str, k kVar, long j2, Long l2, int i) {
        String id10 = dVar.f163145a;
        String walletId = dVar.f163146b;
        String currency = dVar.f163147c;
        String name = (i & 8) != 0 ? dVar.d : str;
        l type = dVar.e;
        k state = (i & 32) != 0 ? dVar.f : kVar;
        j ownershipType = dVar.f163148g;
        i originType = dVar.f163149h;
        long j3 = (i & 256) != 0 ? dVar.i : j2;
        LocalDate createdDate = dVar.f163150j;
        Long l3 = dVar.k;
        long j5 = dVar.f163151l;
        Long l4 = dVar.f163152m;
        Long l5 = dVar.f163153n;
        String str2 = dVar.o;
        String str3 = dVar.f163154p;
        boolean z = dVar.f163155q;
        b bVar = dVar.f163156r;
        List accounts = dVar.f163157s;
        long j16 = j3;
        o topupSettings = dVar.f163158t;
        Long l22 = (i & PKIFailureInfo.badCertTemplate) != 0 ? dVar.u : l2;
        Long l31 = dVar.v;
        LocalDate localDate = dVar.f163159w;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        Intrinsics.checkNotNullParameter(originType, "originType");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(topupSettings, "topupSettings");
        return new d(id10, walletId, currency, name, type, state, ownershipType, originType, j16, createdDate, l3, j5, l4, l5, str2, str3, z, bVar, accounts, topupSettings, l22, l31, localDate);
    }

    public final List b() {
        return this.f163157s;
    }

    public final boolean c() {
        return this.f163155q;
    }

    public final long d() {
        return this.i;
    }

    public final Long e() {
        return this.u;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f163145a, dVar.f163145a) && Intrinsics.f(this.f163146b, dVar.f163146b) && Intrinsics.f(this.f163147c, dVar.f163147c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && this.f163148g == dVar.f163148g && this.f163149h == dVar.f163149h && this.i == dVar.i && Intrinsics.f(this.f163150j, dVar.f163150j) && Intrinsics.f(this.k, dVar.k) && this.f163151l == dVar.f163151l && Intrinsics.f(this.f163152m, dVar.f163152m) && Intrinsics.f(this.f163153n, dVar.f163153n) && Intrinsics.f(this.o, dVar.o) && Intrinsics.f(this.f163154p, dVar.f163154p) && this.f163155q == dVar.f163155q && Intrinsics.f(this.f163156r, dVar.f163156r) && Intrinsics.f(this.f163157s, dVar.f163157s) && Intrinsics.f(this.f163158t, dVar.f163158t) && Intrinsics.f(this.u, dVar.u) && Intrinsics.f(this.v, dVar.v) && Intrinsics.f(this.f163159w, dVar.f163159w);
    }

    public final Long f() {
        return this.k;
    }

    public final String getCurrency() {
        return this.f163147c;
    }

    public final String getId() {
        return this.f163145a;
    }

    public final String getName() {
        return this.d;
    }

    public final long h() {
        return this.f163151l;
    }

    public final int hashCode() {
        int iA = y.a(a0.d.c((this.f163149h.hashCode() + ((this.f163148g.hashCode() + ((this.f.hashCode() + t61.a.c(this.e, p.a.c(p.a.c(p.a.c(this.f163145a.hashCode() * 31, 31, this.f163146b), 31, this.f163147c), 31, this.d), 31)) * 31)) * 31)) * 31, 31, this.i), 31, this.f163150j);
        Long l2 = this.k;
        int iC = a0.d.c((iA + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f163151l);
        Long l3 = this.f163152m;
        int iHashCode = (iC + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f163153n;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.o;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f163154p;
        int iC2 = j6.a.c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f163155q);
        b bVar = this.f163156r;
        int iHashCode4 = (this.f163158t.hashCode() + p.a.d((iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f163157s)) * 31;
        Long l5 = this.u;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.v;
        int iHashCode6 = (iHashCode5 + (l22 == null ? 0 : l22.hashCode())) * 31;
        LocalDate localDate = this.f163159w;
        return iHashCode6 + (localDate != null ? localDate.hashCode() : 0);
    }

    public final LocalDate i() {
        return this.f163150j;
    }

    public final Long k() {
        return this.f163152m;
    }

    public final String l() {
        return this.o;
    }

    public final String m() {
        return this.f163154p;
    }

    public final b n() {
        return this.f163156r;
    }

    public final i o() {
        return this.f163149h;
    }

    public final String o1() {
        return this.f163146b;
    }

    public final Long p() {
        return this.f163153n;
    }

    public final j q() {
        return this.f163148g;
    }

    public final k r() {
        return this.f;
    }

    public final o s() {
        return this.f163158t;
    }

    public final Long t() {
        return this.v;
    }

    public final l u() {
        return this.e;
    }

    public final LocalDate v() {
        return this.f163159w;
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, l lVar, k kVar, j jVar, i iVar, long j2, LocalDate localDate, f0 f0Var, o oVar, LocalDate localDate2) {
        this(str, str2, str3, str4, lVar, kVar, jVar, iVar, j2, localDate, null, 0L, null, null, null, null, false, null, f0Var, oVar, null, null, localDate2);
    }
}
