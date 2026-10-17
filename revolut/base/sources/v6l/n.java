package v6l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f286470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f286471c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f286472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286473h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f286474j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f286475l;

    public n(String walletId, Boolean bool, boolean z, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f286469a = walletId;
        this.f286470b = bool;
        this.f286471c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f286472g = str4;
        this.f286473h = str5;
        this.i = str6;
        this.f286474j = list;
        this.k = str7;
        this.f286475l = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f286469a, nVar.f286469a) && Intrinsics.f(this.f286470b, nVar.f286470b) && this.f286471c == nVar.f286471c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f286472g, nVar.f286472g) && Intrinsics.f(this.f286473h, nVar.f286473h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f286474j, nVar.f286474j) && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f286475l, nVar.f286475l);
    }

    public final int hashCode() {
        int iHashCode = this.f286469a.hashCode() * 31;
        Boolean bool = this.f286470b;
        int iC = j6.a.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f286471c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f286472g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f286473h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.f286474j;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f286475l;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
