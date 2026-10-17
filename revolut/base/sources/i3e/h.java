package i3e;

import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.navigation.BrandDetailTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends com.revolut.feature.store.impl.ui.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreMegaOffer f158189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BrandDetailTab f158190c;

    public h(String brandId, StoreMegaOffer storeMegaOffer, BrandDetailTab brandDetailTab) {
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        this.f158188a = brandId;
        this.f158189b = storeMegaOffer;
        this.f158190c = brandDetailTab;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f158188a, hVar.f158188a) && Intrinsics.f(this.f158189b, hVar.f158189b) && Intrinsics.f(this.f158190c, hVar.f158190c);
    }

    public final int hashCode() {
        int iHashCode = this.f158188a.hashCode() * 31;
        StoreMegaOffer storeMegaOffer = this.f158189b;
        int iHashCode2 = (iHashCode + (storeMegaOffer == null ? 0 : storeMegaOffer.hashCode())) * 31;
        BrandDetailTab brandDetailTab = this.f158190c;
        return iHashCode2 + (brandDetailTab != null ? brandDetailTab.hashCode() : 0);
    }
}
