package tel;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f270117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f270118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f270119c;

    public b(LocalDate date, c projectionRatios, BigDecimal contributionRatio) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(projectionRatios, "projectionRatios");
        Intrinsics.checkNotNullParameter(contributionRatio, "contributionRatio");
        this.f270117a = date;
        this.f270118b = projectionRatios;
        this.f270119c = contributionRatio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f270117a, bVar.f270117a) && Intrinsics.f(this.f270118b, bVar.f270118b) && Intrinsics.f(this.f270119c, bVar.f270119c);
    }

    public final int hashCode() {
        return this.f270119c.hashCode() + ((this.f270118b.hashCode() + (this.f270117a.hashCode() * 31)) * 31);
    }
}
