package p4c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IppProductType f232886a;

    public m(IppProductType productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f232886a = productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f232886a, ((m) obj2).f232886a);
    }

    public final int hashCode() {
        return this.f232886a.hashCode();
    }
}
