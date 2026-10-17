package ev4;

import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YearMonth f129733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YearMonth f129734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final YearMonth f129735c;

    public s(YearMonth firstMonth, YearMonth lastMonth, YearMonth selectedMonth) {
        Intrinsics.checkNotNullParameter(firstMonth, "firstMonth");
        Intrinsics.checkNotNullParameter(lastMonth, "lastMonth");
        Intrinsics.checkNotNullParameter(selectedMonth, "selectedMonth");
        this.f129733a = firstMonth;
        this.f129734b = lastMonth;
        this.f129735c = selectedMonth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f129733a, sVar.f129733a) && Intrinsics.f(this.f129734b, sVar.f129734b) && Intrinsics.f(this.f129735c, sVar.f129735c);
    }

    public final int hashCode() {
        return this.f129735c.hashCode() + ((this.f129734b.hashCode() + (this.f129733a.hashCode() * 31)) * 31);
    }
}
