package wmd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f298648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f298649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f298650c;

    public h(p payment, int i, LocalDate nearestDate) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(nearestDate, "nearestDate");
        this.f298648a = payment;
        this.f298649b = i;
        this.f298650c = nearestDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f298648a, hVar.f298648a) && this.f298649b == hVar.f298649b && Intrinsics.f(this.f298650c, hVar.f298650c);
    }

    public final int hashCode() {
        return this.f298650c.hashCode() + j6.a.b(this.f298649b, this.f298648a.hashCode() * 31, 31);
    }
}
