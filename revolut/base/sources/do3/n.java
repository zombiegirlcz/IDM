package do3;

import com.revolut.feature.address.models.Address;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116410c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f116411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f116412h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f116413j;
    public final Address k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f116414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f116415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v f116416n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f116417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Long f116418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f116419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f116420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Boolean f116421t;
    public final b u;
    public final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f116422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u f116423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f116424y;

    public n(String id10, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String phone, LocalDate localDate, Address address, String str7, s state, v vVar, Integer num, Boolean bool, Long l2, p pVar, String str8, Boolean bool2, b appMode, List list, h salariedUser, u uVar, String str9) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(salariedUser, "salariedUser");
        this.f116408a = id10;
        this.f116409b = str;
        this.f116410c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f116411g = str6;
        this.f116412h = z;
        this.i = phone;
        this.f116413j = localDate;
        this.k = address;
        this.f116414l = str7;
        this.f116415m = state;
        this.f116416n = vVar;
        this.o = num;
        this.f116417p = bool;
        this.f116418q = l2;
        this.f116419r = pVar;
        this.f116420s = str8;
        this.f116421t = bool2;
        this.u = appMode;
        this.v = list;
        this.f116422w = salariedUser;
        this.f116423x = uVar;
        this.f116424y = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f116408a, nVar.f116408a) && Intrinsics.f(this.f116409b, nVar.f116409b) && Intrinsics.f(this.f116410c, nVar.f116410c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f116411g, nVar.f116411g) && this.f116412h == nVar.f116412h && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f116413j, nVar.f116413j) && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f116414l, nVar.f116414l) && this.f116415m == nVar.f116415m && this.f116416n == nVar.f116416n && Intrinsics.f(this.o, nVar.o) && Intrinsics.f(this.f116417p, nVar.f116417p) && Intrinsics.f(this.f116418q, nVar.f116418q) && Intrinsics.f(this.f116419r, nVar.f116419r) && Intrinsics.f(this.f116420s, nVar.f116420s) && Intrinsics.f(this.f116421t, nVar.f116421t) && this.u == nVar.u && Intrinsics.f(this.v, nVar.v) && Intrinsics.f(this.f116422w, nVar.f116422w) && Intrinsics.f(this.f116423x, nVar.f116423x) && Intrinsics.f(this.f116424y, nVar.f116424y);
    }

    public final int hashCode() {
        int iHashCode = this.f116408a.hashCode() * 31;
        String str = this.f116409b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f116410c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f116411g;
        int iC = p.a.c(j6.a.c((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f116412h), 31, this.i);
        LocalDate localDate = this.f116413j;
        int iHashCode7 = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Address address = this.k;
        int iHashCode8 = (iHashCode7 + (address == null ? 0 : address.hashCode())) * 31;
        String str7 = this.f116414l;
        int iHashCode9 = (this.f116415m.hashCode() + ((iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        v vVar = this.f116416n;
        int iHashCode10 = (iHashCode9 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        Integer num = this.o;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f116417p;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.f116418q;
        int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        p pVar = this.f116419r;
        int iHashCode14 = (iHashCode13 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str8 = this.f116420s;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.f116421t;
        int iHashCode16 = (this.u.hashCode() + ((iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31)) * 31;
        List list = this.v;
        int iHashCode17 = (this.f116422w.hashCode() + ((iHashCode16 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        u uVar = this.f116423x;
        int iHashCode18 = (iHashCode17 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str9 = this.f116424y;
        return iHashCode18 + (str9 != null ? str9.hashCode() : 0);
    }
}
