package lua;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f200202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hua.c f200203b;

    public a(LocalDate selectedDate, hua.c selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f200202a = selectedDate;
        this.f200203b = selectedPeriod;
    }

    public static a a(a aVar, LocalDate selectedDate, hua.c selectedPeriod, int i) {
        if ((i & 1) != 0) {
            selectedDate = aVar.f200202a;
        }
        if ((i & 2) != 0) {
            selectedPeriod = aVar.f200203b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        return new a(selectedDate, selectedPeriod);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200202a, aVar.f200202a) && this.f200203b == aVar.f200203b;
    }

    public final int hashCode() {
        return this.f200203b.hashCode() + (this.f200202a.hashCode() * 31);
    }
}
