package y2e;

import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreMegaOffer f310636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BrandDetailTab f310637c;

    public b(String brandId, StoreMegaOffer storeMegaOffer, BrandDetailTab brandDetailTab) {
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        this.f310635a = brandId;
        this.f310636b = storeMegaOffer;
        this.f310637c = brandDetailTab;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f310635a, bVar.f310635a) && Intrinsics.f(this.f310636b, bVar.f310636b) && Intrinsics.f(this.f310637c, bVar.f310637c);
    }

    public final int hashCode() {
        int iHashCode = this.f310635a.hashCode() * 31;
        StoreMegaOffer storeMegaOffer = this.f310636b;
        int iHashCode2 = (iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode())) * 31;
        BrandDetailTab brandDetailTab = this.f310637c;
        return iHashCode2 + (brandDetailTab != null ? brandDetailTab.hashCode() : 0);
    }
}
