package cm1;

import kotlin.jvm.internal.Intrinsics;
import xo1.g;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f25105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25107c;
    public final xo1.b d;

    public b(g paymentMethod, String str, int i, xo1.b bVar) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f25105a = paymentMethod;
        this.f25106b = str;
        this.f25107c = i;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f25105a == bVar.f25105a && Intrinsics.f(this.f25106b, bVar.f25106b) && this.f25107c == bVar.f25107c && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f25105a.hashCode() * 31;
        String str = this.f25106b;
        int iB = j6.a.b(this.f25107c, j6.a.b(100, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        xo1.b bVar = this.d;
        return iB + (bVar != null ? bVar.hashCode() : 0);
    }
}
