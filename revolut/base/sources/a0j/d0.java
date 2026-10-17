package a0j;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f398b;

    public d0(dj0.d money, LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f397a = date;
        this.f398b = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f397a, d0Var.f397a) && Intrinsics.f(this.f398b, d0Var.f398b);
    }

    public final int hashCode() {
        return this.f398b.hashCode() + (this.f397a.hashCode() * 31);
    }
}
