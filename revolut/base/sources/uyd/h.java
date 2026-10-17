package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementsFormat f284187c;
    public final boolean d;

    public h(LocalDate from, LocalDate to6, StatementsFormat format, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f284185a = from;
        this.f284186b = to6;
        this.f284187c = format;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f284185a, hVar.f284185a) && Intrinsics.f(this.f284186b, hVar.f284186b) && this.f284187c == hVar.f284187c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f284187c.hashCode() + wp5.y.a(this.f284185a.hashCode() * 31, 31, this.f284186b)) * 31);
    }
}
