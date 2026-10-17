package j2e;

import com.revolut.feature.store.api.navigation.BrandDetailTab;
import com.revolut.feature.store.api.navigation.StoreDestination;
import com.revolut.kompot.common.ParcelableDestination;
import h30.q;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import xii.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f170841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f170842b;

    public a(q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f170841a = storeAvailabilityInteractor;
        String[] elements = {"shops/offer/{brandId}/earn", "shops/offer/{brandId}/redeem", "shops/offer/{brandId}/msi", "shops/offer/{brandId}/discount"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f170842b = d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f170842b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        ytb.b bVar;
        String strD;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f170841a.F0() && (strD = (bVar = new ytb.b(deeplink)).d("brandId")) != null) {
            String strE = bVar.e("adSetId");
            String strC = bVar.c(3);
            switch (strC.hashCode()) {
                case -934889060:
                    if (strC.equals("redeem")) {
                        return new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(strD, null, BrandDetailTab.Redeem.f88611a, strE), 2);
                    }
                    break;
                case 108419:
                    if (strC.equals("msi")) {
                        return new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(strD, null, BrandDetailTab.Msi.f88610a, strE), 2);
                    }
                    break;
                case 3105752:
                    if (strC.equals("earn")) {
                        return new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(strD, null, BrandDetailTab.Earn.f88609a, strE), 2);
                    }
                    break;
                case 273184065:
                    if (strC.equals("discount")) {
                        return new StoreDestination(new StoreDestination.StartType.OpenBrandDetail(strD, null, BrandDetailTab.Discount.f88608a, strE), 2);
                    }
                    break;
            }
        }
        return null;
    }
}
