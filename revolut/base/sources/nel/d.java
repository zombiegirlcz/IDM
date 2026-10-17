package nel;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f214562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f214563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214564c;
    public final b d;

    public d(BigDecimal bigDecimal, LocalDate localDate, String str, b bondType) {
        Intrinsics.checkNotNullParameter(bondType, "bondType");
        this.f214562a = bigDecimal;
        this.f214563b = localDate;
        this.f214564c = str;
        this.d = bondType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f214562a, dVar.f214562a) && Intrinsics.f(this.f214563b, dVar.f214563b) && Intrinsics.f(this.f214564c, dVar.f214564c) && this.d == dVar.d;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f214562a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        LocalDate localDate = this.f214563b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.f214564c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
