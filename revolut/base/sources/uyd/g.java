package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementsFormat f284184c;
    public final boolean d;

    public g(LocalDate from, LocalDate to6, StatementsFormat format, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f284182a = from;
        this.f284183b = to6;
        this.f284184c = format;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f284182a, gVar.f284182a) && Intrinsics.f(this.f284183b, gVar.f284183b) && this.f284184c == gVar.f284184c && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f284184c.hashCode() + wp5.y.a(this.f284182a.hashCode() * 31, 31, this.f284183b)) * 31);
    }
}
