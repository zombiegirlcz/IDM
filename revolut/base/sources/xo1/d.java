package xo1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f307565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307567c;

    public d(g paymentMethod, String str, String str2, int i) {
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 16) != 0 ? null : str2;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f307565a = paymentMethod;
        this.f307566b = str;
        this.f307567c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f307565a == dVar.f307565a && Intrinsics.f(this.f307566b, dVar.f307566b) && Intrinsics.f(this.f307567c, dVar.f307567c);
    }

    public final int hashCode() {
        int iHashCode = this.f307565a.hashCode() * 961;
        String str = this.f307566b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.f307567c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
