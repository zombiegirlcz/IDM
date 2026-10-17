package uhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f280261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f280262b;

    public d(hha.d selectedPlan, hha.i selectedBilling) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f280261a = selectedPlan;
        this.f280262b = selectedBilling;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f280261a, dVar.f280261a) && this.f280262b == dVar.f280262b;
    }

    public final int hashCode() {
        return this.f280262b.hashCode() + (this.f280261a.hashCode() * 31);
    }
}
