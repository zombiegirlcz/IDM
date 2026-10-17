package fyk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139043c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f139044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f139045h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f139046j;

    public /* synthetic */ n(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9) {
        if (1023 != (i & 1023)) {
            j1.f(l.f139040a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f139041a = str;
        this.f139042b = str2;
        this.f139043c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f139044g = bool;
        this.f139045h = str7;
        this.i = str8;
        this.f139046j = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f139041a, nVar.f139041a) && Intrinsics.f(this.f139042b, nVar.f139042b) && Intrinsics.f(this.f139043c, nVar.f139043c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f139044g, nVar.f139044g) && Intrinsics.f(this.f139045h, nVar.f139045h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f139046j, nVar.f139046j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f139041a.hashCode() * 31, 31, this.f139042b);
        String str = this.f139043c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f139044g;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f139045h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f139046j;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
