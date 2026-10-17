package lq4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f199188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f199189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f199190c;

    public a(dj0.d balance, dj0.d disbursedReward, LocalDate disbursedDate) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(disbursedDate, "disbursedDate");
        Intrinsics.checkNotNullParameter(disbursedReward, "disbursedReward");
        this.f199188a = balance;
        this.f199189b = disbursedDate;
        this.f199190c = disbursedReward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f199188a, aVar.f199188a) && Intrinsics.f(this.f199189b, aVar.f199189b) && Intrinsics.f(this.f199190c, aVar.f199190c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + v7.c(y.a(this.f199188a.hashCode() * 31, 31, this.f199189b), 31, this.f199190c);
    }
}
