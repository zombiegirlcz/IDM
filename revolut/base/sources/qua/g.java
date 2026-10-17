package qua;

import java.io.Serializable;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249294c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f249295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f249296h;
    public final String i;

    /* JADX WARN: Illegal instructions before constructor call */
    public g() {
        String str = null;
        this(str, str, str, 511);
    }

    public static g a(g gVar, boolean z, LocalDate localDate, int i) {
        String str = gVar.f249292a;
        String str2 = gVar.f249293b;
        String str3 = gVar.f249294c;
        String str4 = gVar.d;
        if ((i & 16) != 0) {
            z = gVar.e;
        }
        boolean z3 = z;
        boolean z4 = gVar.f;
        String str5 = gVar.f249295g;
        if ((i & 128) != 0) {
            localDate = gVar.f249296h;
        }
        return new g(str, str2, str3, str4, z3, z4, str5, localDate, gVar.i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f249292a, gVar.f249292a) && Intrinsics.f(this.f249293b, gVar.f249293b) && Intrinsics.f(this.f249294c, gVar.f249294c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && Intrinsics.f(this.f249295g, gVar.f249295g) && Intrinsics.f(this.f249296h, gVar.f249296h) && Intrinsics.f(this.i, gVar.i);
    }

    public final int hashCode() {
        String str = this.f249292a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f249293b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f249294c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iC = j6.a.c(j6.a.c((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.e), 31, this.f);
        String str5 = this.f249295g;
        int iHashCode4 = (iC + (str5 == null ? 0 : str5.hashCode())) * 31;
        LocalDate localDate = this.f249296h;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str6 = this.i;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public /* synthetic */ g(String str, String str2, String str3, int i) {
        this(null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, false, false, null, null, null);
    }

    public g(String str, String str2, String str3, String str4, boolean z, boolean z3, String str5, LocalDate localDate, String str6) {
        this.f249292a = str;
        this.f249293b = str2;
        this.f249294c = str3;
        this.d = str4;
        this.e = z;
        this.f = z3;
        this.f249295g = str5;
        this.f249296h = localDate;
        this.i = str6;
    }
}
