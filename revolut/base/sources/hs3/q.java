package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f154929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f154930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h93.j0 f154931c;
    public final h93.l0 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f154932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f154933h;

    public q(boolean z, o1 selectionScreenType, h93.j0 j0Var, h93.l0 l0Var, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(selectionScreenType, "selectionScreenType");
        this.f154929a = z;
        this.f154930b = selectionScreenType;
        this.f154931c = j0Var;
        this.d = l0Var;
        this.e = str;
        this.f = str2;
        this.f154932g = str3;
        this.f154933h = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f154929a == qVar.f154929a && this.f154930b == qVar.f154930b && this.f154931c == qVar.f154931c && this.d == qVar.d && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f154932g, qVar.f154932g) && Intrinsics.f(this.f154933h, qVar.f154933h);
    }

    public final int hashCode() {
        int iHashCode = (this.f154930b.hashCode() + (Boolean.hashCode(this.f154929a) * 31)) * 31;
        h93.j0 j0Var = this.f154931c;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        h93.l0 l0Var = this.d;
        int iHashCode3 = (iHashCode2 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154932g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f154933h;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }
}
