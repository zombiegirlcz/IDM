package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i2 {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Lazy[] f124572w = {null, null, null, null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ebl.a(1)), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124575c;
    public final a1 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f124576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h2 f124577h;
    public final z i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j1 f124578j;
    public final l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g1 f124579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f124580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f124581n;
    public final e2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f124582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f124583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f124584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f124585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s f124586t;
    public final l0 u;
    public final s1 v;

    public /* synthetic */ i2(int i, String str, String str2, String str3, a1 a1Var, String str4, String str5, String str6, h2 h2Var, z zVar, j1 j1Var, l0 l0Var, g1 g1Var, List list, String str7, e2 e2Var, o0 o0Var, o0 o0Var2, s sVar, c0 c0Var, s sVar2, l0 l0Var2, s1 s1Var) {
        if (2097151 != (i & 2097151)) {
            qlm.j1.f(p.f124640a.getDescriptor(), i, 2097151);
            throw null;
        }
        this.f124573a = str;
        this.f124574b = str2;
        this.f124575c = str3;
        this.d = a1Var;
        this.e = str4;
        this.f = str5;
        this.f124576g = str6;
        this.f124577h = h2Var;
        this.i = zVar;
        this.f124578j = j1Var;
        this.k = l0Var;
        this.f124579l = g1Var;
        this.f124580m = list;
        this.f124581n = str7;
        this.o = e2Var;
        this.f124582p = o0Var;
        this.f124583q = o0Var2;
        this.f124584r = sVar;
        this.f124585s = c0Var;
        this.f124586t = sVar2;
        this.u = l0Var2;
        if ((i & PKIFailureInfo.badSenderNonce) == 0) {
            this.v = null;
        } else {
            this.v = s1Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return Intrinsics.f(this.f124573a, i2Var.f124573a) && Intrinsics.f(this.f124574b, i2Var.f124574b) && Intrinsics.f(this.f124575c, i2Var.f124575c) && Intrinsics.f(this.d, i2Var.d) && Intrinsics.f(this.e, i2Var.e) && Intrinsics.f(this.f, i2Var.f) && Intrinsics.f(this.f124576g, i2Var.f124576g) && Intrinsics.f(this.f124577h, i2Var.f124577h) && Intrinsics.f(this.i, i2Var.i) && Intrinsics.f(this.f124578j, i2Var.f124578j) && Intrinsics.f(this.k, i2Var.k) && Intrinsics.f(this.f124579l, i2Var.f124579l) && Intrinsics.f(this.f124580m, i2Var.f124580m) && Intrinsics.f(this.f124581n, i2Var.f124581n) && Intrinsics.f(this.o, i2Var.o) && Intrinsics.f(this.f124582p, i2Var.f124582p) && Intrinsics.f(this.f124583q, i2Var.f124583q) && Intrinsics.f(this.f124584r, i2Var.f124584r) && Intrinsics.f(this.f124585s, i2Var.f124585s) && Intrinsics.f(this.f124586t, i2Var.f124586t) && Intrinsics.f(this.u, i2Var.u) && Intrinsics.f(this.v, i2Var.v);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f124573a.hashCode() * 31, 31, this.f124574b), 31, this.f124575c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f124576g;
        int iHashCode4 = (this.i.hashCode() + ((this.f124577h.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        j1 j1Var = this.f124578j;
        int iHashCode5 = (iHashCode4 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        l0 l0Var = this.k;
        int iHashCode6 = (iHashCode5 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        g1 g1Var = this.f124579l;
        int iHashCode7 = (iHashCode6 + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        List list = this.f124580m;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f124581n;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        e2 e2Var = this.o;
        int iHashCode10 = (iHashCode9 + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        o0 o0Var = this.f124582p;
        int iHashCode11 = (iHashCode10 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        o0 o0Var2 = this.f124583q;
        int iHashCode12 = (iHashCode11 + (o0Var2 == null ? 0 : o0Var2.hashCode())) * 31;
        s sVar = this.f124584r;
        int iHashCode13 = (iHashCode12 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        c0 c0Var = this.f124585s;
        int iHashCode14 = (iHashCode13 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        s sVar2 = this.f124586t;
        int iHashCode15 = (iHashCode14 + (sVar2 == null ? 0 : sVar2.hashCode())) * 31;
        l0 l0Var2 = this.u;
        int iHashCode16 = (iHashCode15 + (l0Var2 == null ? 0 : l0Var2.hashCode())) * 31;
        s1 s1Var = this.v;
        return iHashCode16 + (s1Var != null ? s1Var.hashCode() : 0);
    }

    public i2(String groupType, String accountType, String defaultCurrency, a1 interestRatesConfig, String str, String str2, String str3, h2 upsellConfig, z currencySelectionScreen, j1 j1Var, l0 l0Var, g1 g1Var, ArrayList arrayList, String str4, e2 e2Var, o0 o0Var, o0 o0Var2, s sVar, c0 c0Var, s sVar2, l0 l0Var2, s1 s1Var) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(interestRatesConfig, "interestRatesConfig");
        Intrinsics.checkNotNullParameter(upsellConfig, "upsellConfig");
        Intrinsics.checkNotNullParameter(currencySelectionScreen, "currencySelectionScreen");
        this.f124573a = groupType;
        this.f124574b = accountType;
        this.f124575c = defaultCurrency;
        this.d = interestRatesConfig;
        this.e = str;
        this.f = str2;
        this.f124576g = str3;
        this.f124577h = upsellConfig;
        this.i = currencySelectionScreen;
        this.f124578j = j1Var;
        this.k = l0Var;
        this.f124579l = g1Var;
        this.f124580m = arrayList;
        this.f124581n = str4;
        this.o = e2Var;
        this.f124582p = o0Var;
        this.f124583q = o0Var2;
        this.f124584r = sVar;
        this.f124585s = c0Var;
        this.f124586t = sVar2;
        this.u = l0Var2;
        this.v = s1Var;
    }
}
