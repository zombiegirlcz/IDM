package n61;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f212693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f212694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f212695c;
    public final Boolean d;
    public final Boolean e;

    public n(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.f212693a = bool;
        this.f212694b = bool2;
        this.f212695c = bool3;
        this.d = bool4;
        this.e = bool5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f212693a, nVar.f212693a) && Intrinsics.f(this.f212694b, nVar.f212694b) && Intrinsics.f(this.f212695c, nVar.f212695c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.f212693a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f212694b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f212695c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }
}
