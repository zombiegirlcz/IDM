package ip0;

import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx f165277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YearMonth f165278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f165279c;

    public lx(mx originalModel, YearMonth yearMonth, int i) {
        Intrinsics.checkNotNullParameter(originalModel, "originalModel");
        this.f165277a = originalModel;
        this.f165278b = yearMonth;
        this.f165279c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lx)) {
            return false;
        }
        lx lxVar = (lx) obj2;
        return Intrinsics.f(this.f165277a, lxVar.f165277a) && Intrinsics.f(this.f165278b, lxVar.f165278b) && this.f165279c == lxVar.f165279c;
    }

    public final int hashCode() {
        int iHashCode = this.f165277a.hashCode() * 31;
        YearMonth yearMonth = this.f165278b;
        return Integer.hashCode(this.f165279c) + ((iHashCode + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31);
    }
}
