package t2e;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2e.g f267561a;

    public r(k3e.d storeTagViewDataMapper, o2e.g revPayCardMapper, o2e.b campaignBannerMapper, o2e.d campaignInstructionsMapper, o2e.a termsItemMapper) {
        Intrinsics.checkNotNullParameter(storeTagViewDataMapper, "storeTagViewDataMapper");
        Intrinsics.checkNotNullParameter(revPayCardMapper, "revPayCardMapper");
        Intrinsics.checkNotNullParameter(campaignBannerMapper, "campaignBannerMapper");
        Intrinsics.checkNotNullParameter(campaignInstructionsMapper, "campaignInstructionsMapper");
        Intrinsics.checkNotNullParameter(termsItemMapper, "termsItemMapper");
        this.f267561a = revPayCardMapper;
    }

    public static o d(StoreCampaignOffer storeCampaignOffer) {
        return new o(storeCampaignOffer, "STORE_BRAND_DETAIL_EARN_IN_STORE_BOOSTER_RATE_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_DESCRIPTION_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_AVAILABLE_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_COUNTRIES_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_STATUS_LIST_ID", new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_in_store, null, null, 14));
    }

    public static o f(StoreCampaignOffer storeCampaignOffer) {
        return new o(storeCampaignOffer, "STORE_BRAND_DETAIL_EARN_ONLINE_BOOSTER_RATE_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_DESCRIPTION_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_AVAILABLE_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_COUNTRIES_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_STATUS_LIST_ID", new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_online, null, null, 14));
    }

    public static o g(h hVar, f fVar) {
        int i = q.f267560b[fVar.ordinal()];
        if (i == 1) {
            StoreCampaignOffer storeCampaignOffer = hVar.f267547a;
            if (storeCampaignOffer != null) {
                return f(storeCampaignOffer);
            }
            StoreCampaignOffer storeCampaignOffer2 = hVar.f267548b;
            if (storeCampaignOffer2 != null) {
                return d(storeCampaignOffer2);
            }
            return null;
        }
        if (i == 2) {
            StoreCampaignOffer storeCampaignOffer3 = hVar.f267548b;
            if (storeCampaignOffer3 != null) {
                return d(storeCampaignOffer3);
            }
            StoreCampaignOffer storeCampaignOffer4 = hVar.f267547a;
            if (storeCampaignOffer4 != null) {
                return f(storeCampaignOffer4);
            }
            return null;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        StoreCampaignOffer storeCampaignOffer5 = hVar.f267547a;
        StoreCampaignOffer storeCampaignOffer6 = hVar.f267548b;
        if (storeCampaignOffer5 != null && storeCampaignOffer6 == null) {
            return f(storeCampaignOffer5);
        }
        if (storeCampaignOffer6 == null || storeCampaignOffer5 != null) {
            return null;
        }
        return d(storeCampaignOffer6);
    }

    public final RowDelegate.Model a(StoreCampaignOffer storeCampaignOffer, boolean z, String str) {
        return o2e.b.a(z ? "STORE_BRAND_DETAIL_EARN_REV_PAY_BANNER_ID" : "STORE_BRAND_DETAIL_EARN_BOOSTER_BANNER_ID", z ? new TextLocalisedClause(R$string.store_mega_offer_details_banner_earn_rev_pay_title, null, null, 14) : new TextLocalisedClause(R$string.store_mega_offer_details_banner_earn_booster_title, null, null, 14), z ? new TextLocalisedClause(R$string.store_mega_offer_details_banner_earn_rev_pay_subtitle, null, null, 14) : new TextLocalisedClause(R$string.store_mega_offer_details_banner_earn_booster_subtitle, null, null, 14), z ? R$drawable.uikit_icn_24_revolut : R$drawable.uikit_icn_24_revpoints, storeCampaignOffer, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final List b(h hVar, f fVar, Instant instant, Instant instant2, boolean z) {
        StoreCampaignOffer storeCampaignOffer;
        StoreCampaignOffer storeCampaignOffer2;
        int i;
        ?? r142;
        List listE;
        List list;
        int i2;
        StoreCampaignOffer storeCampaignOffer3;
        ?? E;
        ?? E2;
        StoreCampaignOffer storeCampaignOffer4 = hVar.f267547a;
        StoreCampaignOffer storeCampaignOffer5 = hVar.f267548b;
        StoreCampaignOffer storeCampaignOffer6 = hVar.f267549c;
        if (storeCampaignOffer4 != null && storeCampaignOffer5 != null) {
            FixedTabsDelegate.Model model = new FixedTabsDelegate.Model("STORE_BRAND_DETAIL_EARN_CAMPAIGN_TABS_ID", v.k(new FixedTabs.Item("ONLINE", new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_online, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("IN_STORE", new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_in_store, null, null, 14), (AnalyticsContext) null, 12)), fVar.name(), false, null, SyslogConstants.LOG_CLOCK);
            o oVarG = g(hVar, fVar);
            return oVarG == null ? f0.f322471a : e(oVarG.f267555a, model, false, true, oVarG.f267556b, oVarG.f267557c, oVarG.d, oVarG.e, oVarG.f, oVarG.f267558g, instant, instant2, z);
        }
        if (storeCampaignOffer4 != null) {
            storeCampaignOffer = storeCampaignOffer5;
            storeCampaignOffer2 = storeCampaignOffer6;
            i = 14;
            r142 = 0;
            listE = e(storeCampaignOffer4, null, true, true, "STORE_BRAND_DETAIL_EARN_ONLINE_BOOSTER_RATE_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_DESCRIPTION_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_AVAILABLE_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_COUNTRIES_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_STATUS_LIST_ID", new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_online, null, null, 14), instant, instant2, z);
        } else {
            storeCampaignOffer = storeCampaignOffer5;
            storeCampaignOffer2 = storeCampaignOffer6;
            i = 14;
            r142 = 0;
            listE = null;
        }
        if (storeCampaignOffer != null) {
            list = listE;
            E2 = r142;
            i2 = i;
            StoreCampaignOffer storeCampaignOffer7 = storeCampaignOffer;
            storeCampaignOffer3 = storeCampaignOffer2;
            E = e(storeCampaignOffer7, null, true, true, "STORE_BRAND_DETAIL_EARN_IN_STORE_BOOSTER_RATE_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_DESCRIPTION_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_AVAILABLE_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_COUNTRIES_LIST_ID", "STORE_BRAND_DETAIL_EARN_IN_STORE_STATUS_LIST_ID", new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_in_store, r142, r142, i), null, instant2, z);
        } else {
            list = listE;
            ?? r06 = r142;
            i2 = i;
            storeCampaignOffer3 = storeCampaignOffer2;
            E = r06;
            E2 = r06;
        }
        if (storeCampaignOffer3 != null) {
            E2 = e(storeCampaignOffer3, null, true, false, "STORE_BRAND_DETAIL_EARN_ONLINE_BOOSTER_RATE_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_DESCRIPTION_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_AVAILABLE_LIST_ID", "STORE_BRAND_DETAIL_EARN_REV_PAY_COUNTRIES_LIST_ID", "STORE_BRAND_DETAIL_EARN_ONLINE_STATUS_LIST_ID", new TextLocalisedClause(R$string.store_mega_offer_details_campaign_info_availability_option_online, E2, E2, i2), null, instant2, z);
        }
        return E2 == 0 ? list == null ? E == 0 ? f0.f322471a : E : list : E2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f267545b, new szb.g(this, 25), new szb.f(this, 11), new si5.c(domainState, this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(com.revolut.feature.store.api.model.StoreCampaignOffer r34, com.revolut.core.ui_kit.delegates.FixedTabsDelegate.Model r35, boolean r36, boolean r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, com.revolut.core.ui_kit.models.TextLocalisedClause r43, java.time.Instant r44, java.time.Instant r45, boolean r46) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2e.r.e(com.revolut.feature.store.api.model.StoreCampaignOffer, com.revolut.core.ui_kit.delegates.FixedTabsDelegate$Model, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.revolut.core.ui_kit.models.TextLocalisedClause, java.time.Instant, java.time.Instant, boolean):java.util.List");
    }
}
