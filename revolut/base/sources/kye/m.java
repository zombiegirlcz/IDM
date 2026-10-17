package kye;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.j {
    public final boolean A;
    public final boolean B;
    public final aue.a C;
    public final List D;
    public final List E;
    public final String F;
    public final Boolean G;
    public final List H;
    public final List I;
    public final List J;
    public final List K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f190774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f190776c;
    public final dj0.d d;
    public final String e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f190777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f190778h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f190779j;
    public final do3.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l71.d f190780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f190781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f190782n;
    public final n3 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jye.a f190783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fb3.d f190784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jye.b f190785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SelectedMethod f190786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TopupMethod.SuggestedMethod f190787t;
    public final bue.b u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f190788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qte.g f190789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f190790y;
    public final io3.d z;

    public m(boolean z, String selectedCurrencyCode, String str, dj0.d dVar, String rawAmount, dj0.d dVar2, List list, dj0.d dVar3, dj0.d dVar4, boolean z3, do3.n nVar, l71.d dVar5, boolean z4, boolean z6, n3 n3Var, jye.a aVar, fb3.d dVar6, jye.b bVar, SelectedMethod selectedMethod, TopupMethod.SuggestedMethod suggestedMethod, bue.b bVar2, boolean z11, boolean z12, qte.g gVar, boolean z29, io3.d dVar7, boolean z31, boolean z41, aue.a aVar2, List list2, List list3, String str2, Boolean bool, List list4, List list5, List list6, List list7) {
        Intrinsics.checkNotNullParameter(selectedCurrencyCode, "selectedCurrencyCode");
        Intrinsics.checkNotNullParameter(rawAmount, "rawAmount");
        this.f190774a = z;
        this.f190775b = selectedCurrencyCode;
        this.f190776c = str;
        this.d = dVar;
        this.e = rawAmount;
        this.f = dVar2;
        this.f190777g = list;
        this.f190778h = dVar3;
        this.i = dVar4;
        this.f190779j = z3;
        this.k = nVar;
        this.f190780l = dVar5;
        this.f190781m = z4;
        this.f190782n = z6;
        this.o = n3Var;
        this.f190783p = aVar;
        this.f190784q = dVar6;
        this.f190785r = bVar;
        this.f190786s = selectedMethod;
        this.f190787t = suggestedMethod;
        this.u = bVar2;
        this.v = z11;
        this.f190788w = z12;
        this.f190789x = gVar;
        this.f190790y = z29;
        this.z = dVar7;
        this.A = z31;
        this.B = z41;
        this.C = aVar2;
        this.D = list2;
        this.E = list3;
        this.F = str2;
        this.G = bool;
        this.H = list4;
        this.I = list5;
        this.J = list6;
        this.K = list7;
    }

    public static m a(m mVar, boolean z, String str, String str2, dj0.d dVar, String str3, dj0.d dVar2, List list, dj0.d dVar3, dj0.d dVar4, boolean z3, do3.n nVar, l71.d dVar5, boolean z4, n3 n3Var, jye.a aVar, fb3.d dVar6, jye.b bVar, SelectedMethod selectedMethod, TopupMethod.SuggestedMethod suggestedMethod, bue.b bVar2, boolean z6, boolean z11, qte.g gVar, boolean z12, io3.d dVar7, boolean z29, boolean z31, aue.a aVar2, List list2, List list3, String str4, Boolean bool, List list4, List list5, List list6, List list7, int i, int i2) {
        boolean z41 = (i & 1) != 0 ? mVar.f190774a : z;
        String selectedCurrencyCode = (i & 2) != 0 ? mVar.f190775b : str;
        String str5 = (i & 4) != 0 ? mVar.f190776c : str2;
        dj0.d dVar8 = (i & 8) != 0 ? mVar.d : dVar;
        String rawAmount = (i & 16) != 0 ? mVar.e : str3;
        dj0.d dVar9 = (i & 32) != 0 ? mVar.f : dVar2;
        List list8 = (i & 64) != 0 ? mVar.f190777g : list;
        dj0.d dVar10 = (i & 128) != 0 ? mVar.f190778h : dVar3;
        dj0.d dVar11 = (i & 256) != 0 ? mVar.i : dVar4;
        boolean z49 = (i & 512) != 0 ? mVar.f190779j : z3;
        do3.n nVar2 = (i & 1024) != 0 ? mVar.k : nVar;
        l71.d dVar12 = (i & 2048) != 0 ? mVar.f190780l : dVar5;
        boolean z54 = (i & 4096) != 0 ? mVar.f190781m : z4;
        boolean z74 = mVar.f190782n;
        boolean z83 = z41;
        n3 n3Var2 = (i & 16384) != 0 ? mVar.o : n3Var;
        jye.a aVar3 = (i & 32768) != 0 ? mVar.f190783p : aVar;
        fb3.d dVar13 = (i & 65536) != 0 ? mVar.f190784q : dVar6;
        jye.b bVar3 = (i & 131072) != 0 ? mVar.f190785r : bVar;
        mVar.getClass();
        jye.b bVar4 = bVar3;
        SelectedMethod selectedMethod2 = (i & 524288) != 0 ? mVar.f190786s : selectedMethod;
        TopupMethod.SuggestedMethod suggestedMethod2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? mVar.f190787t : suggestedMethod;
        bue.b bVar5 = (i & PKIFailureInfo.badSenderNonce) != 0 ? mVar.u : bVar2;
        boolean z89 = (i & 4194304) != 0 ? mVar.v : z6;
        boolean z96 = (i & 8388608) != 0 ? mVar.f190788w : z11;
        qte.g gVar2 = (i & 16777216) != 0 ? mVar.f190789x : gVar;
        boolean z100 = (i & 33554432) != 0 ? mVar.f190790y : z12;
        io3.d dVar14 = (i & 67108864) != 0 ? mVar.z : dVar7;
        boolean z101 = (i & 134217728) != 0 ? mVar.A : z29;
        boolean z102 = (i & 268435456) != 0 ? mVar.B : z31;
        aue.a aVar4 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? mVar.C : aVar2;
        List list9 = (i & 1073741824) != 0 ? mVar.D : list2;
        List list10 = (i & Integer.MIN_VALUE) != 0 ? mVar.E : list3;
        String str6 = (i2 & 1) != 0 ? mVar.F : str4;
        Boolean bool2 = (i2 & 2) != 0 ? mVar.G : bool;
        List list11 = (i2 & 4) != 0 ? mVar.H : list4;
        List list12 = (i2 & 8) != 0 ? mVar.I : list5;
        List list13 = (i2 & 16) != 0 ? mVar.J : list6;
        List list14 = (i2 & 32) != 0 ? mVar.K : list7;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(selectedCurrencyCode, "selectedCurrencyCode");
        Intrinsics.checkNotNullParameter(rawAmount, "rawAmount");
        return new m(z83, selectedCurrencyCode, str5, dVar8, rawAmount, dVar9, list8, dVar10, dVar11, z49, nVar2, dVar12, z54, z74, n3Var2, aVar3, dVar13, bVar4, selectedMethod2, suggestedMethod2, bVar5, z89, z96, gVar2, z100, dVar14, z101, z102, aVar4, list9, list10, str6, bool2, list11, list12, list13, list14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f190774a == mVar.f190774a && Intrinsics.f(this.f190775b, mVar.f190775b) && Intrinsics.f(this.f190776c, mVar.f190776c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f190777g, mVar.f190777g) && Intrinsics.f(this.f190778h, mVar.f190778h) && Intrinsics.f(this.i, mVar.i) && this.f190779j == mVar.f190779j && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f190780l, mVar.f190780l) && this.f190781m == mVar.f190781m && this.f190782n == mVar.f190782n && Intrinsics.f(this.o, mVar.o) && Intrinsics.f(this.f190783p, mVar.f190783p) && Intrinsics.f(this.f190784q, mVar.f190784q) && Intrinsics.f(this.f190785r, mVar.f190785r) && Intrinsics.f(this.f190786s, mVar.f190786s) && Intrinsics.f(this.f190787t, mVar.f190787t) && Intrinsics.f(this.u, mVar.u) && this.v == mVar.v && this.f190788w == mVar.f190788w && Intrinsics.f(this.f190789x, mVar.f190789x) && this.f190790y == mVar.f190790y && Intrinsics.f(this.z, mVar.z) && this.A == mVar.A && this.B == mVar.B && Intrinsics.f(this.C, mVar.C) && Intrinsics.f(this.D, mVar.D) && Intrinsics.f(this.E, mVar.E) && Intrinsics.f(this.F, mVar.F) && Intrinsics.f(this.G, mVar.G) && Intrinsics.f(this.H, mVar.H) && Intrinsics.f(this.I, mVar.I) && Intrinsics.f(this.J, mVar.J) && Intrinsics.f(this.K, mVar.K);
    }

    public final int hashCode() {
        int iC = p.a.c(Boolean.hashCode(this.f190774a) * 31, 31, this.f190775b);
        String str = this.f190776c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar = this.d;
        int iC2 = p.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e);
        dj0.d dVar2 = this.f;
        int iHashCode2 = (iC2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        List list = this.f190777g;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        dj0.d dVar3 = this.f190778h;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.i;
        int iC3 = j6.a.c((iHashCode4 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31, 31, this.f190779j);
        do3.n nVar = this.k;
        int iHashCode5 = (iC3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        l71.d dVar5 = this.f190780l;
        int iC4 = j6.a.c(j6.a.c((iHashCode5 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31, 31, this.f190781m), 31, this.f190782n);
        n3 n3Var = this.o;
        int iHashCode6 = (iC4 + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        jye.a aVar = this.f190783p;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.f179415a.hashCode())) * 31;
        fb3.d dVar6 = this.f190784q;
        int iHashCode8 = (iHashCode7 + (dVar6 == null ? 0 : dVar6.hashCode())) * 31;
        jye.b bVar = this.f190785r;
        int iHashCode9 = (iHashCode8 + (bVar == null ? 0 : bVar.f179416a.hashCode())) * 961;
        SelectedMethod selectedMethod = this.f190786s;
        int iHashCode10 = (iHashCode9 + (selectedMethod == null ? 0 : selectedMethod.hashCode())) * 31;
        TopupMethod.SuggestedMethod suggestedMethod = this.f190787t;
        int iHashCode11 = (iHashCode10 + (suggestedMethod == null ? 0 : suggestedMethod.hashCode())) * 31;
        bue.b bVar2 = this.u;
        int iC5 = j6.a.c(j6.a.c((iHashCode11 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.v), 31, this.f190788w);
        qte.g gVar = this.f190789x;
        int iC6 = j6.a.c((iC5 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f190790y);
        io3.d dVar7 = this.z;
        int iC7 = j6.a.c(j6.a.c((iC6 + (dVar7 == null ? 0 : dVar7.hashCode())) * 31, 31, this.A), 31, this.B);
        aue.a aVar2 = this.C;
        int iHashCode12 = (iC7 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        List list2 = this.D;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.E;
        int iHashCode14 = (iHashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.F;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.G;
        int iHashCode16 = (iHashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list4 = this.H;
        int iHashCode17 = (iHashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.I;
        int iHashCode18 = (iHashCode17 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.J;
        int iHashCode19 = (iHashCode18 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.K;
        return iHashCode19 + (list7 != null ? list7.hashCode() : 0);
    }
}
