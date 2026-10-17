package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d6 {

    @NotNull
    public static final i3 Companion = new i3();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Lazy[] f124518w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124521c;
    public final String d;
    public final n5 e;
    public final e5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t5 f124522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k4 f124523h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f124524j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f124525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f124526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f124527n;
    public final h3 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f124528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f124529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f124530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f124531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o3 f124532t;
    public final s3 u;
    public final c6 v;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f124518w = new Lazy[]{null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new ebl.a(11)), yhm.j.c(kVar, new ebl.a(12)), yhm.j.c(kVar, new ebl.a(13)), yhm.j.c(kVar, new ebl.a(14)), null, null, null, null, null, yhm.j.c(kVar, new ebl.a(15)), null, null, null};
    }

    public /* synthetic */ d6(int i, String str, String str2, String str3, String str4, n5 n5Var, e5 e5Var, t5 t5Var, k4 k4Var, String str5, List list, List list2, List list3, List list4, Long l2, h3 h3Var, String str6, String str7, String str8, List list5, o3 o3Var, s3 s3Var, c6 c6Var) {
        if (1048575 != (i & 1048575)) {
            qlm.j1.f(e3.f124537a.getDescriptor(), i, 1048575);
            throw null;
        }
        this.f124519a = str;
        this.f124520b = str2;
        this.f124521c = str3;
        this.d = str4;
        this.e = n5Var;
        this.f = e5Var;
        this.f124522g = t5Var;
        this.f124523h = k4Var;
        this.i = str5;
        this.f124524j = list;
        this.k = list2;
        this.f124525l = list3;
        this.f124526m = list4;
        this.f124527n = l2;
        this.o = h3Var;
        this.f124528p = str6;
        this.f124529q = str7;
        this.f124530r = str8;
        this.f124531s = list5;
        this.f124532t = o3Var;
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = s3Var;
        }
        if ((i & PKIFailureInfo.badSenderNonce) == 0) {
            this.v = null;
        } else {
            this.v = c6Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj2;
        return Intrinsics.f(this.f124519a, d6Var.f124519a) && Intrinsics.f(this.f124520b, d6Var.f124520b) && Intrinsics.f(this.f124521c, d6Var.f124521c) && Intrinsics.f(this.d, d6Var.d) && Intrinsics.f(this.e, d6Var.e) && Intrinsics.f(this.f, d6Var.f) && Intrinsics.f(this.f124522g, d6Var.f124522g) && Intrinsics.f(this.f124523h, d6Var.f124523h) && Intrinsics.f(this.i, d6Var.i) && Intrinsics.f(this.f124524j, d6Var.f124524j) && Intrinsics.f(this.k, d6Var.k) && Intrinsics.f(this.f124525l, d6Var.f124525l) && Intrinsics.f(this.f124526m, d6Var.f124526m) && Intrinsics.f(this.f124527n, d6Var.f124527n) && Intrinsics.f(this.o, d6Var.o) && Intrinsics.f(this.f124528p, d6Var.f124528p) && Intrinsics.f(this.f124529q, d6Var.f124529q) && Intrinsics.f(this.f124530r, d6Var.f124530r) && Intrinsics.f(this.f124531s, d6Var.f124531s) && Intrinsics.f(this.f124532t, d6Var.f124532t) && Intrinsics.f(this.u, d6Var.u) && Intrinsics.f(this.v, d6Var.v);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f124519a.hashCode() * 31, 31, this.f124520b), 31, this.f124521c), 31, this.d);
        n5 n5Var = this.e;
        int iHashCode = (iC + (n5Var == null ? 0 : n5Var.hashCode())) * 31;
        e5 e5Var = this.f;
        int iHashCode2 = (this.f124523h.hashCode() + ((this.f124522g.f124681a.hashCode() + ((iHashCode + (e5Var == null ? 0 : e5Var.hashCode())) * 31)) * 31)) * 31;
        String str = this.i;
        int iD = p.a.d(p.a.d(p.a.d(p.a.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f124524j), 31, this.k), 31, this.f124525l), 31, this.f124526m);
        Long l2 = this.f124527n;
        int iHashCode3 = (iD + (l2 == null ? 0 : l2.hashCode())) * 31;
        h3 h3Var = this.o;
        int iHashCode4 = (iHashCode3 + (h3Var == null ? 0 : h3Var.hashCode())) * 31;
        String str2 = this.f124528p;
        int iC2 = p.a.c(p.a.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f124529q), 31, this.f124530r);
        List list = this.f124531s;
        int iHashCode5 = (iC2 + (list == null ? 0 : list.hashCode())) * 31;
        o3 o3Var = this.f124532t;
        int iHashCode6 = (iHashCode5 + (o3Var == null ? 0 : o3Var.hashCode())) * 31;
        s3 s3Var = this.u;
        int iHashCode7 = (iHashCode6 + (s3Var == null ? 0 : s3Var.hashCode())) * 31;
        c6 c6Var = this.v;
        return iHashCode7 + (c6Var != null ? c6Var.hashCode() : 0);
    }

    public d6(String id10, String currency, String groupType, String state, n5 n5Var, e5 e5Var, t5 schedules, k4 interestRate, String str, ArrayList fees, ArrayList taxes, ArrayList limits, ArrayList documents, Long l2, h3 h3Var, String str2, String displayName, String accountType, ArrayList arrayList, o3 o3Var, s3 s3Var, c6 c6Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f124519a = id10;
        this.f124520b = currency;
        this.f124521c = groupType;
        this.d = state;
        this.e = n5Var;
        this.f = e5Var;
        this.f124522g = schedules;
        this.f124523h = interestRate;
        this.i = str;
        this.f124524j = fees;
        this.k = taxes;
        this.f124525l = limits;
        this.f124526m = documents;
        this.f124527n = l2;
        this.o = h3Var;
        this.f124528p = str2;
        this.f124529q = displayName;
        this.f124530r = accountType;
        this.f124531s = arrayList;
        this.f124532t = o3Var;
        this.u = s3Var;
        this.v = c6Var;
    }
}
