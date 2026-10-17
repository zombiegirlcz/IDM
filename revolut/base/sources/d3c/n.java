package d3c;

import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IppProductType f111048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f111049c;

    public n(String sku, IppProductType type, int i) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f111047a = sku;
        this.f111048b = type;
        this.f111049c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f111047a, nVar.f111047a) && Intrinsics.f(this.f111048b, nVar.f111048b) && this.f111049c == nVar.f111049c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f111049c) + ((this.f111048b.hashCode() + (this.f111047a.hashCode() * 31)) * 31);
    }
}
