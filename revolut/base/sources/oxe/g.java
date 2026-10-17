package oxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f230789c;
    public final String d;

    public g(String maskedCardNumber, String expireDate, int i, String cvv) {
        Intrinsics.checkNotNullParameter(maskedCardNumber, "maskedCardNumber");
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.f230787a = maskedCardNumber;
        this.f230788b = expireDate;
        this.f230789c = i;
        this.d = cvv;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f230787a, gVar.f230787a) && Intrinsics.f(this.f230788b, gVar.f230788b) && this.f230789c == gVar.f230789c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f230789c, p.a.c(this.f230787a.hashCode() * 31, 31, this.f230788b), 31);
    }
}
