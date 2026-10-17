package oa6;

import ba6.u;
import bla.c;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import jla.h;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import xii.b;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.a f223544a;

    public a(a31.a donationsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        this.f223544a = donationsAvailabilityInteractor;
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"donations", "donations/terms", "donations/{charity_id}", "donations/{charity_id}/donate", "donations/charities-collection/{collection_id}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements);
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (((h) this.f223544a.f955b).d(y96.b.f311752c.a(), null) == c.ENABLED) {
            ytb.b bVar = new ytb.b(deeplink);
            if (Intrinsics.f(bVar.c(0), "donations")) {
                String strC = bVar.c(1);
                if (Intrinsics.f(strC, "charities-collection")) {
                    String strD = bVar.d("collection_id");
                    return strD != null ? ytb.b.f(bVar, new DonationsKompotFeatureConfig.CollectionDestination(strD, true)) : ytb.b.f(bVar, new DonationsKompotFeatureConfig.CharitiesOverviewDestination(bVar.a()));
                }
                if (Intrinsics.f(strC, "terms")) {
                    return ytb.b.f(bVar, new DonationsKompotFeatureConfig.CharitiesOverviewDestination(bVar.a()));
                }
                String strC2 = bVar.c(2);
                String strD2 = bVar.d("charity_id");
                if (strD2 == null) {
                    return ytb.b.f(bVar, new DonationsKompotFeatureConfig.CharitiesOverviewDestination(bVar.a()));
                }
                if (strC2.length() == 0) {
                    return ytb.b.f(bVar, new DonationsKompotFeatureConfig.CharityDestination(strD2));
                }
                String strE = bVar.e("pageid");
                return ytb.b.f(bVar, new DonationsKompotFeatureConfig.AmountSuggestionDestination(strD2, u.MAJOR_EVENT, strE != null ? a0.d.x("pageid", strE) : r0.g()));
            }
        }
        return null;
    }
}
