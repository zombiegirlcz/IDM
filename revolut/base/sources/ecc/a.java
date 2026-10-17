package ecc;

import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.MerchantCategoryDetails;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import fcc.c;
import fcc.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.j;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final PromotedMerchant a(e eVar) {
        PromotedMerchant.Reward reward;
        PromotedMerchant.ShoppingOffer shoppingOffer;
        j jVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String name = eVar.getName();
        String logo = eVar.getLogo();
        List<c> categories = eVar.getCategories();
        ArrayList arrayList = new ArrayList(w.t(categories, 10));
        for (c cVar : categories) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new MerchantCategoryDetails(cVar.getKey(), cVar.getName()));
        }
        String website = eVar.getWebsite();
        e.b reward2 = eVar.getReward();
        EarningBadge earningBadge = null;
        if (reward2 != null) {
            Intrinsics.checkNotNullParameter(reward2, "<this>");
            reward = new PromotedMerchant.Reward(reward2.getRevPointsMultiplier());
        } else {
            reward = null;
        }
        e.c shoppingOffer2 = eVar.getShoppingOffer();
        if (shoppingOffer2 != null) {
            Intrinsics.checkNotNullParameter(shoppingOffer2, "<this>");
            shoppingOffer = new PromotedMerchant.ShoppingOffer(shoppingOffer2.getBrandId(), shoppingOffer2.getCampaignId());
        } else {
            shoppingOffer = null;
        }
        e.a badge = eVar.getBadge();
        if (badge != null) {
            Intrinsics.checkNotNullParameter(badge, "<this>");
            String type = badge.getType();
            j[] jVarArrValues = j.values();
            int length = jVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i];
                if (a0.z(jVar.name(), type, true)) {
                    break;
                }
                i++;
            }
            if (jVar != null) {
                earningBadge = new EarningBadge(jVar, badge.getText());
            }
        }
        return new PromotedMerchant(name, logo, arrayList, website, reward, shoppingOffer, earningBadge, eVar.getInstructionsId());
    }
}
