package pcd;

import java.io.Serializable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f234882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f234883c;
    public final j0 d;
    public final l0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f234884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f234885h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f234886j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f234887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f234888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f234889n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f234890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DateTime f234891q;

    public s(String id10, String str, h0 state, j0 j0Var, l0 type, String ownerId, long j2, g0 vaultOrigin, DateTime createdDate, String str2, List list, Long l2, List list2, b accountType, String str3, o oVar, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(vaultOrigin, "vaultOrigin");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f234881a = id10;
        this.f234882b = str;
        this.f234883c = state;
        this.d = j0Var;
        this.e = type;
        this.f = ownerId;
        this.f234884g = j2;
        this.f234885h = vaultOrigin;
        this.i = createdDate;
        this.f234886j = str2;
        this.k = list;
        this.f234887l = l2;
        this.f234888m = list2;
        this.f234889n = accountType;
        this.o = str3;
        this.f234890p = oVar;
        this.f234891q = dateTime;
    }

    public final b a() {
        return this.f234889n;
    }

    public final long b() {
        return this.f234885h.f234861c;
    }

    public final dj0.d c() {
        return new dj0.d(this.f234885h.f234861c, kii.e.u(this, xi0.b.Companion));
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        a aVar;
        g0 g0Var = this.f234885h;
        e0 e0Var = g0Var instanceof e0 ? (e0) g0Var : null;
        if (e0Var == null || (aVar = e0Var.d) == null) {
            return null;
        }
        return aVar.f234842b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f234881a, sVar.f234881a) && Intrinsics.f(this.f234882b, sVar.f234882b) && this.f234883c == sVar.f234883c && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e && Intrinsics.f(this.f, sVar.f) && this.f234884g == sVar.f234884g && Intrinsics.f(this.f234885h, sVar.f234885h) && Intrinsics.f(this.i, sVar.i) && Intrinsics.f(this.f234886j, sVar.f234886j) && Intrinsics.f(this.k, sVar.k) && Intrinsics.f(this.f234887l, sVar.f234887l) && Intrinsics.f(this.f234888m, sVar.f234888m) && this.f234889n == sVar.f234889n && Intrinsics.f(this.o, sVar.o) && this.f234890p == sVar.f234890p && Intrinsics.f(this.f234891q, sVar.f234891q);
    }

    public final String f() {
        g0 g0Var = this.f234885h;
        if (g0Var instanceof f0) {
            return ((f0) g0Var).d.f234875a;
        }
        if (g0Var instanceof e0) {
            return this.f234881a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getCurrency() {
        return this.f234885h.f234860b.f306286a;
    }

    public final g0 h() {
        return this.f234885h;
    }

    public final int hashCode() {
        int iHashCode = this.f234881a.hashCode() * 31;
        String str = this.f234882b;
        int iHashCode2 = (this.f234883c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        j0 j0Var = this.d;
        int iF = m72.b.f(this.i, (this.f234885h.hashCode() + a0.d.c(p.a.c((this.e.hashCode() + ((iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31)) * 31, 31, this.f), 31, this.f234884g)) * 31, 31);
        String str2 = this.f234886j;
        int iHashCode3 = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.k;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.f234887l;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list2 = this.f234888m;
        int iHashCode6 = (this.f234889n.hashCode() + ((iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str3 = this.o;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        o oVar = this.f234890p;
        int iHashCode8 = (iHashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        DateTime dateTime = this.f234891q;
        return iHashCode8 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public final a i() {
        a aVar;
        g0 g0Var = this.f234885h;
        e0 e0Var = g0Var instanceof e0 ? (e0) g0Var : null;
        if (e0Var == null || (aVar = e0Var.d) == null) {
            throw new ClassCastException(j6.a.s("Vault(id=", this.f234881a, ", vaultOriginType=", o0.f186429a.b(g0Var.getClass()).m(), ") must have vaultOrigin as VaultOrigin.Deposit}"));
        }
        return aVar;
    }
}
