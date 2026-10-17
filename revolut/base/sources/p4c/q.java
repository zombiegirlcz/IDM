package p4c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IppProductType f232890a;

    public q(IppProductType ippProductType) {
        Intrinsics.checkNotNullParameter(ippProductType, "ippProductType");
        this.f232890a = ippProductType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f232890a, ((q) obj2).f232890a);
    }

    public final int hashCode() {
        return this.f232890a.hashCode();
    }
}
