package s6c;

import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f260232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f260233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f260234c;
    public final RevPoints d;

    public p(long j2, dj0.d dVar, BigDecimal bigDecimal, RevPoints revPoints) {
        this.f260232a = j2;
        this.f260233b = dVar;
        this.f260234c = bigDecimal;
        this.d = revPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return RevPoints.a(this.f260232a, pVar.f260232a) && Intrinsics.f(this.f260233b, pVar.f260233b) && Intrinsics.f(this.f260234c, pVar.f260234c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f260232a) * 31;
        dj0.d dVar = this.f260233b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        BigDecimal bigDecimal = this.f260234c;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        RevPoints revPoints = this.d;
        return iHashCode3 + (revPoints != null ? Long.hashCode(revPoints.f84427a) : 0);
    }
}
