package t18;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f267226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f267227b;

    public r(LocalDate date, List insights) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(insights, "insights");
        this.f267226a = date;
        this.f267227b = insights;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f267226a, rVar.f267226a) && Intrinsics.f(this.f267227b, rVar.f267227b);
    }

    public final int hashCode() {
        return this.f267227b.hashCode() + (this.f267226a.hashCode() * 31);
    }
}
