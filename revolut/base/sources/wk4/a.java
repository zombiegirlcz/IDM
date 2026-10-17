package wk4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mb5.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f298233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298235c;
    public final long d;
    public final u e;

    public a(Integer num, List unavailableDays, boolean z, long j2, u selectedPaymentType) {
        Intrinsics.checkNotNullParameter(unavailableDays, "unavailableDays");
        Intrinsics.checkNotNullParameter(selectedPaymentType, "selectedPaymentType");
        this.f298233a = num;
        this.f298234b = unavailableDays;
        this.f298235c = z;
        this.d = j2;
        this.e = selectedPaymentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298233a, aVar.f298233a) && Intrinsics.f(this.f298234b, aVar.f298234b) && this.f298235c == aVar.f298235c && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        Integer num = this.f298233a;
        return this.e.hashCode() + a0.d.c(j6.a.c(p.a.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f298234b), 31, this.f298235c), 31, this.d);
    }
}
