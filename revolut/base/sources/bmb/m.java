package bmb;

import com.revolut.feature.shared.savings.models.product.ProductGroupOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductGroupOptions f16794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16795b;

    public m(ProductGroupOptions groupOptions, c cVar) {
        Intrinsics.checkNotNullParameter(groupOptions, "groupOptions");
        this.f16794a = groupOptions;
        this.f16795b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f16794a, mVar.f16794a) && Intrinsics.f(this.f16795b, mVar.f16795b);
    }

    public final int hashCode() {
        int iHashCode = this.f16794a.hashCode() * 31;
        c cVar = this.f16795b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
