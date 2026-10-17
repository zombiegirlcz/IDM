package q35;

import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f241799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f241800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f241801c;

    public a0(dj0.d borrowed, dj0.d available, LocalDate fundsExpirationDate) {
        Intrinsics.checkNotNullParameter(borrowed, "borrowed");
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(fundsExpirationDate, "fundsExpirationDate");
        this.f241799a = borrowed;
        this.f241800b = available;
        this.f241801c = fundsExpirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f241799a, a0Var.f241799a) && Intrinsics.f(this.f241800b, a0Var.f241800b) && Intrinsics.f(this.f241801c, a0Var.f241801c);
    }

    public final int hashCode() {
        return this.f241801c.hashCode() + v7.c(this.f241799a.hashCode() * 31, 31, this.f241800b);
    }
}
