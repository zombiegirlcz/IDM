package igk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f161265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161267c;
    public final hha.i d;

    public o(dj0.d dVar, String selectedPlanId, String selectedPlanName, hha.i selectedBilling) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        Intrinsics.checkNotNullParameter(selectedPlanName, "selectedPlanName");
        Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
        this.f161265a = dVar;
        this.f161266b = selectedPlanId;
        this.f161267c = selectedPlanName;
        this.d = selectedBilling;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f161265a, oVar.f161265a) && Intrinsics.f(this.f161266b, oVar.f161266b) && Intrinsics.f(this.f161267c, oVar.f161267c) && this.d == oVar.d;
    }

    public final int hashCode() {
        dj0.d dVar = this.f161265a;
        return this.d.hashCode() + p.a.c(p.a.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f161266b), 31, this.f161267c);
    }
}
