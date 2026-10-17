package v6l;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h93.j0 f286484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h93.l0 f286485c;
    public final Set d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f286486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286487h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f286488j;
    public final String k;

    public p(String walletId, h93.j0 j0Var, h93.l0 l0Var, String str, String str2, String str3, String str4, List list, String str5, String str6, int i) {
        zhm.h0 additionalSubProductTypes = zhm.h0.f322473a;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        list = (i & 256) != 0 ? null : list;
        str5 = (i & 512) != 0 ? null : str5;
        str6 = (i & 1024) != 0 ? null : str6;
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(additionalSubProductTypes, "additionalSubProductTypes");
        this.f286483a = walletId;
        this.f286484b = j0Var;
        this.f286485c = l0Var;
        this.d = additionalSubProductTypes;
        this.e = str;
        this.f = str2;
        this.f286486g = str3;
        this.f286487h = str4;
        this.i = list;
        this.f286488j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f286483a, pVar.f286483a) && this.f286484b == pVar.f286484b && this.f286485c == pVar.f286485c && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f286486g, pVar.f286486g) && Intrinsics.f(this.f286487h, pVar.f286487h) && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f286488j, pVar.f286488j) && Intrinsics.f(this.k, pVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.f286483a.hashCode() * 31;
        h93.j0 j0Var = this.f286484b;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        h93.l0 l0Var = this.f286485c;
        int iF = p.a.f((iHashCode2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode3 = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f286486g;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f286487h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.i;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f286488j;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }
}
