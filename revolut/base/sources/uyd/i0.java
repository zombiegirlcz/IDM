package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementsFormat f284209c;
    public final boolean d;

    public i0(LocalDate from, LocalDate to6, StatementsFormat format, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f284207a = from;
        this.f284208b = to6;
        this.f284209c = format;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f284207a, i0Var.f284207a) && Intrinsics.f(this.f284208b, i0Var.f284208b) && this.f284209c == i0Var.f284209c && this.d == i0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f284209c.hashCode() + wp5.y.a(this.f284207a.hashCode() * 31, 31, this.f284208b)) * 31);
    }
}
