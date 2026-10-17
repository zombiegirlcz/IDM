package v6l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f286478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f286479c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f286480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f286481h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f286482j;

    public o(String str, Boolean bool, boolean z, boolean z3, boolean z4, String str2, String str3, String str4, String str5, List list) {
        this.f286477a = str;
        this.f286478b = bool;
        this.f286479c = z;
        this.d = z3;
        this.e = z4;
        this.f = str2;
        this.f286480g = str3;
        this.f286481h = str4;
        this.i = str5;
        this.f286482j = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f286477a, oVar.f286477a) && Intrinsics.f(this.f286478b, oVar.f286478b) && this.f286479c == oVar.f286479c && this.d == oVar.d && this.e == oVar.e && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f286480g, oVar.f286480g) && Intrinsics.f(this.f286481h, oVar.f286481h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f286482j, oVar.f286482j);
    }

    public final int hashCode() {
        String str = this.f286477a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f286478b;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f286479c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f286480g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f286481h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f286482j;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }
}
