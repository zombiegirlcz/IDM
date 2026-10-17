package wxd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f300853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f300854b;

    public a(LocalDate from, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f300853a = from;
        this.f300854b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f300853a, aVar.f300853a) && Intrinsics.f(this.f300854b, aVar.f300854b);
    }

    public final int hashCode() {
        int iHashCode = this.f300853a.hashCode() * 31;
        LocalDate localDate = this.f300854b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
