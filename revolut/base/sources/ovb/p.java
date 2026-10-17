package ovb;

import ajd.t;
import aw0.n6;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.exclusive_store.api.R$string;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.store.core.api.model.StoreProduct;
import com.revolut.feature.store.core.api.model.StoreProductVariant;
import com.revolut.feature.store.core.api.model.StoreProductVariantValue;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.n {
    public static StoreProductVariantValue a(StoreProduct storeProduct, StoreProductVariantValue storeProductVariantValue) {
        Object obj2 = null;
        if (storeProductVariantValue == null) {
            return null;
        }
        String str = storeProductVariantValue.f88648a;
        StoreProductVariant storeProductVariant = storeProduct.f88636m;
        if (storeProductVariant == null) {
            return null;
        }
        Iterator it8 = storeProductVariant.f88647b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            StoreProductVariantValue storeProductVariantValue2 = (StoreProductVariantValue) next;
            String str2 = storeProductVariantValue2.f88648a;
            if (str2 != null ? str2.equals(str) : str == null && storeProductVariantValue2.equals(storeProductVariantValue)) {
                obj2 = next;
                break;
            }
        }
        return (StoreProductVariantValue) obj2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        aw0.i eVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f230014b instanceof g;
        Data data = domainState.f230013a;
        List list = (List) iii.c.f(data, new ou6.o(this, 13), new oq3.e(23), new t(this, domainState, z));
        aw0.i iVar = null;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.exclusive_store_product_checkout_title, null, null, 14), null, null, null, false, 30);
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.b bVar = domainState.f230014b;
        if (bVar != null) {
            if (bVar instanceof g) {
                StoreProduct storeProduct = (StoreProduct) data.getContent();
                if (storeProduct != null) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(storeProduct.i ? R$string.exclusive_store_product_checkout_footer_deadline_and_terms : !storeProduct.f88634j ? R$string.exclusive_store_product_checkout_footer_non_refundable_terms : R$string.exclusive_store_product_checkout_footer_regular_terms, u.c(new TextLocalisedClause(R$string.exclusive_store_product_checkout_footer_exclusive_terms_title, null, new Click(30, (Integer) null, (Object) null, "TERMS_LINK_ID", false), 10)), null, 12);
                    int i = o.f230027a[storeProduct.f88633h.ordinal()];
                    if (i == 1) {
                        boolean z3 = storeProduct.f88636m != null && domainState.d == null;
                        boolean zD = i.d(domainState);
                        boolean z4 = domainState.f230016g;
                        RevPoints revPointsB = i.b(domainState);
                        if (zD || !z4) {
                            eVar = new aw0.e(false, textLocalisedClause, null, z3 ? new n6(new TextLocalisedClause(R$string.exclusive_store_product_checkout_action_button_title_size_selection_required, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 988) : zD ? new n6(new TextLocalisedClause(R$string.exclusive_store_product_checkout_action_button_title_pay, u.c(nub.a.q(revPointsB, null, null, null, 7)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, "PURCHASE_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION) : new n6(new TextLocalisedClause(R$string.exclusive_store_product_checkout_action_button_title_low_balance, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "DISCOVER_EARN_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 53);
                        } else {
                            eVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.exclusive_store_product_checkout_action_button_title_buy_points, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "BUY_POINTS_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.exclusive_store_product_checkout_action_button_title_discover_more, null, null, 14), LargeActionButton.ButtonStyle.o, null, "DISCOVER_EARN_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), textLocalisedClause, null, null, 113);
                        }
                    } else {
                        if (i != 2 && i != 3 && i != 4 && i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = new aw0.e(false, textLocalisedClause, null, new n6(new TextLocalisedClause(R$string.exclusive_store_product_checkout_action_button_title_sold_out, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 988), null, null, 53);
                    }
                }
            } else {
                eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.exclusive_store_product_checkout_action_button_title_join_rev_points, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "OPT_IN_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 55);
            }
            iVar = eVar;
        }
        return new cii.b(iVar, list, aVar);
    }
}
