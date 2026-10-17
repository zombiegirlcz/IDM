package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class f2 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f215792c;
    public final Long d;
    public final Long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f215794h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f215795j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f215796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f215797m;

    public /* synthetic */ f2(int i, String str, String str2, Long l2, Long l3, Long l4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l5) {
        if (8191 != (i & 8191)) {
            qlm.j1.f(d2.f215755a.getDescriptor(), i, 8191);
            throw null;
        }
        this.f215790a = str;
        this.f215791b = str2;
        this.f215792c = l2;
        this.d = l3;
        this.e = l4;
        this.f = str3;
        this.f215793g = str4;
        this.f215794h = str5;
        this.i = str6;
        this.f215795j = str7;
        this.k = str8;
        this.f215796l = str9;
        this.f215797m = l5;
    }

    public final Long a() {
        return this.f215792c;
    }

    public final Long b() {
        return this.e;
    }

    public final Long c() {
        return this.d;
    }

    public final String d() {
        return this.f215796l;
    }

    public final String e() {
        return this.f215795j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f215790a, f2Var.f215790a) && Intrinsics.f(this.f215791b, f2Var.f215791b) && Intrinsics.f(this.f215792c, f2Var.f215792c) && Intrinsics.f(this.d, f2Var.d) && Intrinsics.f(this.e, f2Var.e) && Intrinsics.f(this.f, f2Var.f) && Intrinsics.f(this.f215793g, f2Var.f215793g) && Intrinsics.f(this.f215794h, f2Var.f215794h) && Intrinsics.f(this.i, f2Var.i) && Intrinsics.f(this.f215795j, f2Var.f215795j) && Intrinsics.f(this.k, f2Var.k) && Intrinsics.f(this.f215796l, f2Var.f215796l) && Intrinsics.f(this.f215797m, f2Var.f215797m);
    }

    public final String f() {
        return this.k;
    }

    public final Long g() {
        return this.f215797m;
    }

    public final String h() {
        return this.i;
    }

    public final int hashCode() {
        String str = this.f215790a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215791b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f215792c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f215793g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f215794h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f215795j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f215796l;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l5 = this.f215797m;
        return iHashCode12 + (l5 != null ? l5.hashCode() : 0);
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        return this.f215790a;
    }

    public final String k() {
        return this.f215793g;
    }

    public final String l() {
        return this.f215791b;
    }

    public final String m() {
        return this.f215794h;
    }

    public f2(String str, String str2, Long l2, Long l3, Long l4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l5) {
        this.f215790a = str;
        this.f215791b = str2;
        this.f215792c = l2;
        this.d = l3;
        this.e = l4;
        this.f = str3;
        this.f215793g = str4;
        this.f215794h = str5;
        this.i = str6;
        this.f215795j = str7;
        this.k = str8;
        this.f215796l = str9;
        this.f215797m = l5;
    }
}
