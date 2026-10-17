package u3e;

import com.revolut.feature.store.api.model.StoreExclusivesOfferContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.NewsDelegate.Model a(com.revolut.feature.store.api.model.StoreExclusivesTile r27, int r28) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3e.c.a(com.revolut.feature.store.api.model.StoreExclusivesTile, int):com.revolut.core.ui_kit.delegates.NewsDelegate$Model");
    }

    public static m2e.a b(StoreExclusivesOfferContext storeExclusivesOfferContext, String placementId, int i) {
        String str;
        Intrinsics.checkNotNullParameter(storeExclusivesOfferContext, "<this>");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Product) {
            str = ((StoreExclusivesOfferContext.Product) storeExclusivesOfferContext).f88515a.e;
        } else if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Auction) {
            str = ((StoreExclusivesOfferContext.Auction) storeExclusivesOfferContext).f88512a.e;
        } else if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.SoldOutProduct) {
            str = ((StoreExclusivesOfferContext.SoldOutProduct) storeExclusivesOfferContext).f88516a.f88604b;
        } else if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.LockedProduct) {
            str = ((StoreExclusivesOfferContext.LockedProduct) storeExclusivesOfferContext).f88514a.d;
        } else {
            if (!(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.ComingSoonProduct)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((StoreExclusivesOfferContext.ComingSoonProduct) storeExclusivesOfferContext).f88513a.f88470b;
        }
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        return new m2e.a(16, Integer.valueOf(i), null, placementId, str2);
    }
}
