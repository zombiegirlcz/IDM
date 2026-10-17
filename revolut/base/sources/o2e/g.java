package o2e;

import aw0.o9;
import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.h2;
import com.revolut.core.ui_kit.delegates.i2;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.api.model.StoreCampaignBadge;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreInstructionList;
import ip0.o6;
import ip0.q6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public g(k3e.d storeTagViewDataMapper, b campaignBannerMapper, d campaignInstructionsMapper, c countriesRowMapper) {
        Intrinsics.checkNotNullParameter(storeTagViewDataMapper, "storeTagViewDataMapper");
        Intrinsics.checkNotNullParameter(campaignBannerMapper, "campaignBannerMapper");
        Intrinsics.checkNotNullParameter(campaignInstructionsMapper, "campaignInstructionsMapper");
        Intrinsics.checkNotNullParameter(countriesRowMapper, "countriesRowMapper");
    }

    public final aim.e a(StoreCampaignOffer campaign, String str, f listIds, boolean z) {
        CellDetailsDelegate.Model model;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(listIds, "listIds");
        StoreCampaignBadge storeCampaignBadge = campaign.f88455n;
        TagViewData tagViewDataA = storeCampaignBadge != null ? k3e.d.a(storeCampaignBadge) : null;
        aim.e eVarB = u.b();
        eVarB.add(b.a(listIds.f221613a, new TextLocalisedClause(R$string.store_mega_offer_details_banner_earn_rev_pay_title, null, null, 14), new TextLocalisedClause(R$string.store_mega_offer_details_banner_earn_rev_pay_subtitle, null, null, 14), R$drawable.uikit_icn_24_revolut, campaign, str));
        if (tagViewDataA != null) {
            eVarB.add(new q6(listIds.f221614b, new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_rate_title, null, null, 14), new o6(tagViewDataA)));
        }
        String str2 = campaign.f88452j;
        if (str2 != null) {
            eVarB.add(new PlainTextDelegate.Model(listIds.f221615c, (Clause) null, (Clause) new TextClause(str2, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422));
        }
        eVarB.add(new CellDetailsDelegate.Model(listIds.d, new t0((Clause) new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_online, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712));
        String listId = listIds.f221616g;
        if (listId != null) {
            List list = campaign.f88461w;
            Intrinsics.checkNotNullParameter(listId, "listId");
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                model = null;
            } else {
                List listU = d0.U(list);
                int size = listU.size() - 3;
                t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_countries, null, null, 14), (Image) null, 0, false, 30);
                Integer numValueOf = Integer.valueOf(size);
                if (size <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    textLocalisedClause = new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_more_countries, u.c("+" + iIntValue), null, 12);
                } else {
                    textLocalisedClause = null;
                }
                List listV0 = d0.V0(listU, 3);
                ArrayList arrayList = new ArrayList(w.t(listV0, 10));
                Iterator it8 = listV0.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new CountryImage((String) it8.next(), (Integer) null, (ez0.e) null, 14));
                }
                model = new CellDetailsDelegate.Model(listId, t0Var, textLocalisedClause, null, new m2e.c(listU), null, null, 0, null, false, true, new i2(arrayList, h2.END), null, 18360);
            }
            if (model != null) {
                eVarB.add(model);
            }
        }
        StoreInstructionList storeInstructionList = campaign.B;
        eVarB.addAll(d.b(storeInstructionList != null ? storeInstructionList.f88528a : null, z, listIds.e, listIds.f));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return eVarA;
    }
}
