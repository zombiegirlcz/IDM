package dej;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPlanChange;
import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t1 {
    public final Long A;
    public final boolean B;
    public final Long C;
    public final boolean D;
    public final n3 E;
    public final n2 F;
    public final f1 G;
    public final boolean H;
    public final List I;
    public final List J;
    public final List K;
    public final long L;
    public final c2 M;
    public final List N;
    public final EsimSubscriptionPlanChange O;
    public final k2 P;
    public final u2 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3 f113651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113652c;
    public final EsimCoverage d;
    public final EsimProfileEntry e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f113653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f113654h;
    public final c3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Period f113655j;
    public final w2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f113656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumber f113657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f113658n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x1 f113659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Instant f113660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Instant f113661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f113662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g3 f113663t;
    public final Instant u;
    public final Instant v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Instant f113664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f113665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Long f113666y;
    public final boolean z;

    public t1(String id10, j3 state, String name, EsimCoverage coverage, EsimProfileEntry simProfile, String dataPlanId, m mVar, l lVar, c3 c3Var, Period period, w2 w2Var, String str, EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber, Long l2, List list, x1 x1Var, Instant instant, Instant instant2, z1 z1Var, g3 g3Var, Instant createdDate, Instant instant3, Instant instant4, String duration, Long l3, boolean z, Long l4, boolean z3, Long l5, boolean z4, n3 n3Var, n2 n2Var, f1 f1Var, boolean z6, List list2, List list3, List list4, long j2, c2 c2Var, List list5, EsimSubscriptionPlanChange esimSubscriptionPlanChange, k2 k2Var, u2 u2Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f113650a = id10;
        this.f113651b = state;
        this.f113652c = name;
        this.d = coverage;
        this.e = simProfile;
        this.f = dataPlanId;
        this.f113653g = mVar;
        this.f113654h = lVar;
        this.i = c3Var;
        this.f113655j = period;
        this.k = w2Var;
        this.f113656l = str;
        this.f113657m = esimSubscriptionPhoneNumber;
        this.f113658n = l2;
        this.o = list;
        this.f113659p = x1Var;
        this.f113660q = instant;
        this.f113661r = instant2;
        this.f113662s = z1Var;
        this.f113663t = g3Var;
        this.u = createdDate;
        this.v = instant3;
        this.f113664w = instant4;
        this.f113665x = duration;
        this.f113666y = l3;
        this.z = z;
        this.A = l4;
        this.B = z3;
        this.C = l5;
        this.D = z4;
        this.E = n3Var;
        this.F = n2Var;
        this.G = f1Var;
        this.H = z6;
        this.I = list2;
        this.J = list3;
        this.K = list4;
        this.L = j2;
        this.M = c2Var;
        this.N = list5;
        this.O = esimSubscriptionPlanChange;
        this.P = k2Var;
        this.Q = u2Var;
    }

    public static t1 a(t1 t1Var, w2 w2Var, x1 x1Var, ArrayList arrayList, int i, int i2) {
        List list;
        List list2;
        String id10 = t1Var.f113650a;
        j3 state = t1Var.f113651b;
        String name = t1Var.f113652c;
        EsimCoverage coverage = t1Var.d;
        EsimProfileEntry simProfile = t1Var.e;
        String dataPlanId = t1Var.f;
        m mVar = t1Var.f113653g;
        l lVar = t1Var.f113654h;
        c3 c3Var = t1Var.i;
        Period period = t1Var.f113655j;
        w2 w2Var2 = (i & 1024) != 0 ? t1Var.k : w2Var;
        String str = t1Var.f113656l;
        w2 w2Var3 = w2Var2;
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = t1Var.f113657m;
        Long l2 = t1Var.f113658n;
        List list3 = t1Var.o;
        x1 x1Var2 = (i & 32768) != 0 ? t1Var.f113659p : x1Var;
        Instant instant = t1Var.f113660q;
        Instant instant2 = t1Var.f113661r;
        z1 z1Var = t1Var.f113662s;
        g3 g3Var = t1Var.f113663t;
        Instant createdDate = t1Var.u;
        Instant instant3 = t1Var.v;
        Instant instant4 = t1Var.f113664w;
        String duration = t1Var.f113665x;
        Long l3 = t1Var.f113666y;
        boolean z = t1Var.z;
        Long l4 = t1Var.A;
        boolean z3 = t1Var.B;
        Long l5 = t1Var.C;
        boolean z4 = t1Var.D;
        n3 n3Var = t1Var.E;
        n2 n2Var = t1Var.F;
        f1 f1Var = t1Var.G;
        boolean z6 = t1Var.H;
        List list4 = t1Var.I;
        List list5 = t1Var.J;
        if ((i2 & 16) != 0) {
            list = list5;
            list2 = t1Var.K;
        } else {
            list = list5;
            list2 = arrayList;
        }
        long j2 = t1Var.L;
        c2 c2Var = t1Var.M;
        List list6 = t1Var.N;
        EsimSubscriptionPlanChange esimSubscriptionPlanChange = t1Var.O;
        k2 k2Var = t1Var.P;
        u2 u2Var = t1Var.Q;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new t1(id10, state, name, coverage, simProfile, dataPlanId, mVar, lVar, c3Var, period, w2Var3, str, esimSubscriptionPhoneNumber, l2, list3, x1Var2, instant, instant2, z1Var, g3Var, createdDate, instant3, instant4, duration, l3, z, l4, z3, l5, z4, n3Var, n2Var, f1Var, z6, list4, list, list2, j2, c2Var, list6, esimSubscriptionPlanChange, k2Var, u2Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f113650a, t1Var.f113650a) && this.f113651b == t1Var.f113651b && Intrinsics.f(this.f113652c, t1Var.f113652c) && Intrinsics.f(this.d, t1Var.d) && Intrinsics.f(this.e, t1Var.e) && Intrinsics.f(this.f, t1Var.f) && this.f113653g == t1Var.f113653g && this.f113654h == t1Var.f113654h && Intrinsics.f(this.i, t1Var.i) && Intrinsics.f(this.f113655j, t1Var.f113655j) && Intrinsics.f(this.k, t1Var.k) && Intrinsics.f(this.f113656l, t1Var.f113656l) && Intrinsics.f(this.f113657m, t1Var.f113657m) && Intrinsics.f(this.f113658n, t1Var.f113658n) && Intrinsics.f(this.o, t1Var.o) && Intrinsics.f(this.f113659p, t1Var.f113659p) && Intrinsics.f(this.f113660q, t1Var.f113660q) && Intrinsics.f(this.f113661r, t1Var.f113661r) && Intrinsics.f(this.f113662s, t1Var.f113662s) && Intrinsics.f(this.f113663t, t1Var.f113663t) && Intrinsics.f(this.u, t1Var.u) && Intrinsics.f(this.v, t1Var.v) && Intrinsics.f(this.f113664w, t1Var.f113664w) && Intrinsics.f(this.f113665x, t1Var.f113665x) && Intrinsics.f(this.f113666y, t1Var.f113666y) && this.z == t1Var.z && Intrinsics.f(this.A, t1Var.A) && this.B == t1Var.B && Intrinsics.f(this.C, t1Var.C) && this.D == t1Var.D && Intrinsics.f(this.E, t1Var.E) && Intrinsics.f(this.F, t1Var.F) && Intrinsics.f(this.G, t1Var.G) && this.H == t1Var.H && Intrinsics.f(this.I, t1Var.I) && Intrinsics.f(this.J, t1Var.J) && Intrinsics.f(this.K, t1Var.K) && this.L == t1Var.L && Intrinsics.f(this.M, t1Var.M) && Intrinsics.f(this.N, t1Var.N) && Intrinsics.f(this.O, t1Var.O) && Intrinsics.f(this.P, t1Var.P) && Intrinsics.f(this.Q, t1Var.Q);
    }

    public final int hashCode() {
        int iC = p.a.c((this.e.hashCode() + ((this.d.hashCode() + p.a.c((this.f113651b.hashCode() + (this.f113650a.hashCode() * 31)) * 31, 31, this.f113652c)) * 31)) * 31, 31, this.f);
        m mVar = this.f113653g;
        int iHashCode = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l lVar = this.f113654h;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        c3 c3Var = this.i;
        int iHashCode3 = (iHashCode2 + (c3Var == null ? 0 : c3Var.hashCode())) * 31;
        Period period = this.f113655j;
        int iHashCode4 = (iHashCode3 + (period == null ? 0 : period.hashCode())) * 31;
        w2 w2Var = this.k;
        int iHashCode5 = (iHashCode4 + (w2Var == null ? 0 : w2Var.hashCode())) * 31;
        String str = this.f113656l;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = this.f113657m;
        int iHashCode7 = (iHashCode6 + (esimSubscriptionPhoneNumber == null ? 0 : esimSubscriptionPhoneNumber.hashCode())) * 31;
        Long l2 = this.f113658n;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.o;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        x1 x1Var = this.f113659p;
        int iHashCode10 = (iHashCode9 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        Instant instant = this.f113660q;
        int iHashCode11 = (iHashCode10 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f113661r;
        int iHashCode12 = (iHashCode11 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        z1 z1Var = this.f113662s;
        int iHashCode13 = (iHashCode12 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        g3 g3Var = this.f113663t;
        int iC2 = r6.b.c((iHashCode13 + (g3Var == null ? 0 : g3Var.hashCode())) * 31, 31, this.u);
        Instant instant3 = this.v;
        int iHashCode14 = (iC2 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        Instant instant4 = this.f113664w;
        int iC3 = p.a.c((iHashCode14 + (instant4 == null ? 0 : instant4.hashCode())) * 31, 31, this.f113665x);
        Long l3 = this.f113666y;
        int iC4 = j6.a.c((iC3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.z);
        Long l4 = this.A;
        int iC5 = j6.a.c((iC4 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.B);
        Long l5 = this.C;
        int iC6 = j6.a.c((iC5 + (l5 == null ? 0 : l5.hashCode())) * 31, 31, this.D);
        n3 n3Var = this.E;
        int iHashCode15 = (iC6 + (n3Var == null ? 0 : n3Var.hashCode())) * 31;
        n2 n2Var = this.F;
        int iHashCode16 = (iHashCode15 + (n2Var == null ? 0 : n2Var.hashCode())) * 31;
        f1 f1Var = this.G;
        int iC7 = j6.a.c((iHashCode16 + (f1Var == null ? 0 : f1Var.hashCode())) * 31, 31, this.H);
        List list2 = this.I;
        int iHashCode17 = (iC7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.J;
        int iHashCode18 = (iHashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.K;
        int iC8 = a0.d.c((iHashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.L);
        c2 c2Var = this.M;
        int iHashCode19 = (iC8 + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        List list5 = this.N;
        int iHashCode20 = (iHashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        EsimSubscriptionPlanChange esimSubscriptionPlanChange = this.O;
        int iHashCode21 = (iHashCode20 + (esimSubscriptionPlanChange == null ? 0 : esimSubscriptionPlanChange.hashCode())) * 31;
        k2 k2Var = this.P;
        int iHashCode22 = (iHashCode21 + (k2Var == null ? 0 : k2Var.hashCode())) * 31;
        u2 u2Var = this.Q;
        return iHashCode22 + (u2Var != null ? u2Var.hashCode() : 0);
    }
}
