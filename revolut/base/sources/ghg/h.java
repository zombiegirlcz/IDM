package ghg;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f143912a;

    public h(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f143912a = date;
    }

    @Override // ghg.j
    public final LocalDate a() {
        return this.f143912a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f143912a, ((h) obj2).f143912a);
    }

    public final int hashCode() {
        return this.f143912a.hashCode();
    }
}
