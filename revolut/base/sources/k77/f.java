package k77;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f181831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f181832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f181833c;
    public final LocalDate d;

    public f(BigDecimal current, LocalDate updatedAt, BigDecimal bigDecimal, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f181831a = current;
        this.f181832b = updatedAt;
        this.f181833c = bigDecimal;
        this.d = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f181831a, fVar.f181831a) && Intrinsics.f(this.f181832b, fVar.f181832b) && Intrinsics.f(this.f181833c, fVar.f181833c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iA = y.a(this.f181831a.hashCode() * 31, 31, this.f181832b);
        BigDecimal bigDecimal = this.f181833c;
        int iHashCode = (iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        LocalDate localDate = this.d;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
