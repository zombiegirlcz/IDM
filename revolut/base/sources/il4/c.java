package il4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f162066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f162067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f162068c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    public c(LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, dj0.d totalSpends, dj0.d targetSpends, dj0.d reward) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(totalSpends, "totalSpends");
        Intrinsics.checkNotNullParameter(targetSpends, "targetSpends");
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f162066a = startDate;
        this.f162067b = endDate;
        this.f162068c = disbursalDate;
        this.d = totalSpends;
        this.e = targetSpends;
        this.f = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f162066a, cVar.f162066a) && Intrinsics.f(this.f162067b, cVar.f162067b) && Intrinsics.f(this.f162068c, cVar.f162068c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + v7.c(v7.c(y.a(y.a(this.f162066a.hashCode() * 31, 31, this.f162067b), 31, this.f162068c), 31, this.d), 31, this.e);
    }
}
