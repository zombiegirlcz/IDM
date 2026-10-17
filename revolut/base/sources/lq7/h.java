package lq7;

import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.insurance_car.impl.data.model.MtaFlowVariant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MtaFlowVariant f199198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MtaAvailabilityContainer f199199b;

    public h(MtaFlowVariant variant, MtaAvailabilityContainer mtaAvailability) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(mtaAvailability, "mtaAvailability");
        this.f199198a = variant;
        this.f199199b = mtaAvailability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f199198a, hVar.f199198a) && Intrinsics.f(this.f199199b, hVar.f199199b);
    }

    public final int hashCode() {
        return this.f199199b.hashCode() + (this.f199198a.hashCode() * 31);
    }
}
