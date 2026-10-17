package emk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f127678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f127679b;

    public f(Data layout, Data pricingPlan) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f127678a = layout;
        this.f127679b = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f127678a, fVar.f127678a) && Intrinsics.f(this.f127679b, fVar.f127679b);
    }

    public final int hashCode() {
        return this.f127679b.hashCode() + (this.f127678a.hashCode() * 31);
    }
}
