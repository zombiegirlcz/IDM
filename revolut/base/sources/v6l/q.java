package v6l;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h93.j0 f286491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h93.l0 f286492c;
    public final Set d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f286493g;

    public q(String str, h93.j0 j0Var, h93.l0 l0Var, String str2, String str3, List list) {
        zhm.h0 additionalSubProductTypes = zhm.h0.f322473a;
        Intrinsics.checkNotNullParameter(additionalSubProductTypes, "additionalSubProductTypes");
        this.f286490a = str;
        this.f286491b = j0Var;
        this.f286492c = l0Var;
        this.d = additionalSubProductTypes;
        this.e = str2;
        this.f = str3;
        this.f286493g = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f286490a, qVar.f286490a) && this.f286491b == qVar.f286491b && this.f286492c == qVar.f286492c && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f286493g, qVar.f286493g);
    }

    public final int hashCode() {
        String str = this.f286490a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        h93.j0 j0Var = this.f286491b;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        h93.l0 l0Var = this.f286492c;
        int iF = p.a.f((iHashCode2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode3 = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f286493g;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
