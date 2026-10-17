package ylh;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f314707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f314708b;

    public a0(ArrayList availablePeriods, a selectedPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f314707a = availablePeriods;
        this.f314708b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f314707a.equals(a0Var.f314707a) && this.f314708b.equals(a0Var.f314708b);
    }

    public final int hashCode() {
        return this.f314708b.hashCode() + (this.f314707a.hashCode() * 31);
    }
}
