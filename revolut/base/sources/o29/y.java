package o29;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f221590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f221591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f221592c;

    public y(String enabledFeatures, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        this.f221590a = localDate;
        this.f221591b = localDate2;
        this.f221592c = enabledFeatures;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f221590a, yVar.f221590a) && Intrinsics.f(this.f221591b, yVar.f221591b) && Intrinsics.f(this.f221592c, yVar.f221592c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f221590a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f221591b;
        return this.f221592c.hashCode() + ((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
    }
}
