package r3e;

import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreMegaOffer f251285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BrandDetailTab f251286c;

    public i(String brandId, StoreMegaOffer storeMegaOffer, BrandDetailTab brandDetailTab) {
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        this.f251284a = brandId;
        this.f251285b = storeMegaOffer;
        this.f251286c = brandDetailTab;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f251284a, iVar.f251284a) && Intrinsics.f(this.f251285b, iVar.f251285b) && Intrinsics.f(this.f251286c, iVar.f251286c);
    }

    public final int hashCode() {
        int iHashCode = this.f251284a.hashCode() * 31;
        StoreMegaOffer storeMegaOffer = this.f251285b;
        int iHashCode2 = (iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode())) * 31;
        BrandDetailTab brandDetailTab = this.f251286c;
        return iHashCode2 + (brandDetailTab != null ? brandDetailTab.hashCode() : 0);
    }
}
