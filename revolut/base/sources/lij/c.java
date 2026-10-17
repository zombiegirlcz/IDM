package lij;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f195532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195533b;

    public c(List plans, String selectedPlanId) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        this.f195532a = plans;
        this.f195533b = selectedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f195532a, cVar.f195532a) && Intrinsics.f(this.f195533b, cVar.f195533b);
    }

    public final int hashCode() {
        return this.f195533b.hashCode() + (this.f195532a.hashCode() * 31);
    }
}
