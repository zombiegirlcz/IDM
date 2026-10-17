package mel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f204758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f204759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f204760c;

    public j(long j2, BigDecimal original, BigDecimal movingAverage) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(movingAverage, "movingAverage");
        this.f204758a = j2;
        this.f204759b = original;
        this.f204760c = movingAverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f204758a == jVar.f204758a && Intrinsics.f(this.f204759b, jVar.f204759b) && Intrinsics.f(this.f204760c, jVar.f204760c);
    }

    public final int hashCode() {
        return this.f204760c.hashCode() + t61.a.d(this.f204759b, Long.hashCode(this.f204758a) * 31, 31);
    }
}
