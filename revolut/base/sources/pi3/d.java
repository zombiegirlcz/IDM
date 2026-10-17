package pi3;

import h93.j0;
import h93.l0;
import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b93.b f236390c;
    public final e93.b d;
    public final String e;
    public final c93.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d93.b f236391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c93.j f236392h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c93.j f236393j;
    public final Instant k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h93.r f236394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f236395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l0 f236396n;
    public final dj0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f236397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f236398q;

    public /* synthetic */ d(String str, String str2, b93.b bVar, e93.b bVar2, String str3, c93.j jVar, d93.b bVar3, c93.j jVar2, boolean z, c93.j jVar3, Instant instant, h93.r rVar, j0 j0Var, l0 l0Var, dj0.d dVar, int i) {
        this(str, str2, bVar, bVar2, str3, jVar, bVar3, jVar2, z, (i & 512) != 0 ? null : jVar3, instant, (i & 2048) != 0 ? null : rVar, j0Var, l0Var, (i & 16384) != 0 ? null : dVar, (i) null);
    }

    public final String a() {
        return this.f236388a;
    }

    public final boolean b() {
        return this.f236398q;
    }

    public final boolean c() {
        return this.f236395m == j0.PRO;
    }

    public final boolean d() {
        return this.f236395m == j0.JOINT_ACCOUNT;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f236388a, dVar.f236388a) && Intrinsics.f(this.f236389b, dVar.f236389b) && Intrinsics.f(this.f236390c, dVar.f236390c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f236391g, dVar.f236391g) && Intrinsics.f(this.f236392h, dVar.f236392h) && this.i == dVar.i && Intrinsics.f(this.f236393j, dVar.f236393j) && Intrinsics.f(this.k, dVar.k) && this.f236394l == dVar.f236394l && this.f236395m == dVar.f236395m && this.f236396n == dVar.f236396n && Intrinsics.f(this.o, dVar.o) && Intrinsics.f(this.f236397p, dVar.f236397p);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f236390c.hashCode() + p.a.c(this.f236388a.hashCode() * 31, 31, this.f236389b)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        d93.b bVar = this.f236391g;
        int iC = j6.a.c((this.f236392h.hashCode() + ((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.i);
        c93.j jVar = this.f236393j;
        int iHashCode3 = (iC + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Instant instant = this.k;
        int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        h93.r rVar = this.f236394l;
        int iHashCode5 = (iHashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        j0 j0Var = this.f236395m;
        int iHashCode6 = (iHashCode5 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f236396n;
        int iHashCode7 = (iHashCode6 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        dj0.d dVar = this.o;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.f236397p;
        return iHashCode8 + (iVar != null ? iVar.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r2, java.lang.String r3, b93.b r4, e93.b r5, java.lang.String r6, c93.j r7, d93.b r8, c93.j r9, boolean r10, c93.j r11, java.time.Instant r12, h93.r r13, h93.j0 r14, h93.l0 r15, dj0.d r16, pi3.i r17) {
        /*
            r1 = this;
            java.lang.String r0 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "preorderId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "cardCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "brandDesign"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "designFee"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "deliveryFee"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r1.<init>()
            r1.f236388a = r2
            r1.f236389b = r3
            r1.f236390c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.f236391g = r8
            r1.f236392h = r9
            r1.i = r10
            r1.f236393j = r11
            r1.k = r12
            r1.f236394l = r13
            r1.f236395m = r14
            r1.f236396n = r15
            r2 = r16
            r1.o = r2
            r2 = r17
            r1.f236397p = r2
            b93.a r2 = b93.b.Companion
            r2.getClass()
            b93.b r3 = b93.b.i0
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r4, r3)
            if (r3 != 0) goto L6b
            r2.getClass()
            b93.b r3 = b93.b.c3
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r4, r3)
            if (r3 != 0) goto L6b
            r2.getClass()
            b93.b r2 = b93.b.E2
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r4, r2)
            if (r2 == 0) goto L69
            goto L6b
        L69:
            r2 = 0
            goto L6c
        L6b:
            r2 = 1
        L6c:
            r1.f236398q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi3.d.<init>(java.lang.String, java.lang.String, b93.b, e93.b, java.lang.String, c93.j, d93.b, c93.j, boolean, c93.j, java.time.Instant, h93.r, h93.j0, h93.l0, dj0.d, pi3.i):void");
    }
}
