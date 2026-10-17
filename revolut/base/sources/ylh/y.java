package ylh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f314738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f314739b;

    public y(a availablePeriod, a selectedPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f314738a = availablePeriod;
        this.f314739b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f314738a, yVar.f314738a) && Intrinsics.f(this.f314739b, yVar.f314739b);
    }

    public final int hashCode() {
        return this.f314739b.hashCode() + (this.f314738a.hashCode() * 31);
    }
}
