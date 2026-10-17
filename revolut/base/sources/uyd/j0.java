package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f284213c;
    public final StatementsFormat d;
    public final boolean e;

    public j0(LocalDate from, LocalDate to6, wi0.b countryCode, StatementsFormat format, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f284211a = from;
        this.f284212b = to6;
        this.f284213c = countryCode;
        this.d = format;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f284211a, j0Var.f284211a) && Intrinsics.f(this.f284212b, j0Var.f284212b) && Intrinsics.f(this.f284213c, j0Var.f284213c) && this.d == j0Var.d && this.e == j0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + p.a.c(wp5.y.a(this.f284211a.hashCode() * 31, 31, this.f284212b), 31, this.f284213c.f297794a)) * 31);
    }
}
