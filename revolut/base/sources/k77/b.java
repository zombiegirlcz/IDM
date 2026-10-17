package k77;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f181825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f181826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f181827c;
    public final LocalDate d;

    public b(BigDecimal current, LocalDate updatedAt, BigDecimal bigDecimal, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f181825a = current;
        this.f181826b = updatedAt;
        this.f181827c = bigDecimal;
        this.d = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f181825a, bVar.f181825a) && Intrinsics.f(this.f181826b, bVar.f181826b) && Intrinsics.f(this.f181827c, bVar.f181827c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iA = y.a(this.f181825a.hashCode() * 31, 31, this.f181826b);
        BigDecimal bigDecimal = this.f181827c;
        int iHashCode = (iA + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        LocalDate localDate = this.d;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }
}
