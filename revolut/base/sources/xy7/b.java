package xy7;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f309623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f309624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f309625c;
    public final LocalDate d;

    public b(d0 d0Var, dj0.d newPrice, dj0.d oldPrice, LocalDate newPriceStartingDate) {
        Intrinsics.checkNotNullParameter(newPrice, "newPrice");
        Intrinsics.checkNotNullParameter(oldPrice, "oldPrice");
        Intrinsics.checkNotNullParameter(newPriceStartingDate, "newPriceStartingDate");
        this.f309623a = d0Var;
        this.f309624b = newPrice;
        this.f309625c = oldPrice;
        this.d = newPriceStartingDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f309623a, bVar.f309623a) && Intrinsics.f(this.f309624b, bVar.f309624b) && Intrinsics.f(this.f309625c, bVar.f309625c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        d0 d0Var = this.f309623a;
        return this.d.hashCode() + v7.c(v7.c((d0Var == null ? 0 : d0Var.hashCode()) * 31, 31, this.f309624b), 31, this.f309625c);
    }
}
