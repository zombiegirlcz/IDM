package mr6;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f208061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f208062b;

    public c(dj0.d amount, LocalDate date) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f208061a = amount;
        this.f208062b = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f208061a, cVar.f208061a) && Intrinsics.f(this.f208062b, cVar.f208062b);
    }

    public final int hashCode() {
        return this.f208062b.hashCode() + (this.f208061a.hashCode() * 31);
    }
}
