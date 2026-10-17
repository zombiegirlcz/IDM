package ulk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f281036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f281037b;

    public h(hha.d selectedPlan, hha.i selectedBilling) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f281036a = selectedPlan;
        this.f281037b = selectedBilling;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f281036a, hVar.f281036a) && this.f281037b == hVar.f281037b;
    }

    public final int hashCode() {
        return this.f281037b.hashCode() + (this.f281036a.hashCode() * 31);
    }
}
