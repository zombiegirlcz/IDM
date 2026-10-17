package ghg;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f143913a;

    public i(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f143913a = date;
    }

    @Override // ghg.j
    public final LocalDate a() {
        return this.f143913a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f143913a, ((i) obj2).f143913a);
    }

    public final int hashCode() {
        return this.f143913a.hashCode();
    }
}
