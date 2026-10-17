package com.revolut.feature.store.impl.ui.brand_detail.flow;

import aw0.m6;
import aw0.n6;
import cli.n;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t1e.e;
import t1e.g;
import t1e.h;
import t1e.i;
import t1e.j;
import t1e.k;
import z92.f;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static AnalyticsContext a(StoreCampaignOffer storeCampaignOffer, String str) {
        if (str == null) {
            str = storeCampaignOffer.f88460t;
        }
        String str2 = str;
        if (str2 != null) {
            return new AnalyticsContext(c2e.a.a(new m2e.a(24, null, storeCampaignOffer.f88459s, storeCampaignOffer.u, str2), Boolean.TRUE));
        }
        return null;
    }

    public static TextLocalisedClause b(StoreCampaignOffer storeCampaignOffer, boolean z, Instant instant) {
        k kVarA = storeCampaignOffer.a();
        String str = storeCampaignOffer.e;
        if (kVarA instanceof e) {
            return new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_action_get_directions, null, null, 14);
        }
        if (kVarA instanceof i) {
            return new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_action_visit_brand, u.c(str), null, 12);
        }
        if (kVarA instanceof h) {
            if (Intrinsics.f(storeCampaignOffer.f88450g, Boolean.TRUE)) {
                Instant instantNow = Instant.now();
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                if (!f.p(instant, instantNow)) {
                    return new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_action_activate_and_shop, null, null, 14);
                }
            }
            return new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_action_visit_brand, u.c(str), null, 12);
        }
        if (kVarA instanceof t1e.f) {
            return z ? new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_action_shop_now, null, null, 14) : new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_action_redeem_offer, null, null, 14);
        }
        if (!(kVarA instanceof g) && !(kVarA instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_action_shop_now, null, null, 14);
    }

    public static aw0.e d(StoreCampaignOffer storeCampaignOffer, boolean z, Instant instant, String str) {
        return new aw0.e(true, null, null, m6.c(n6.Companion, b(storeCampaignOffer, z, instant), LargeActionButton.ButtonStyle.f58725a, null, "TAG_EARN_CTA", false, a(storeCampaignOffer, str), null, storeCampaignOffer, 428), null, null, 54);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0255  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r37) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.store.impl.ui.brand_detail.flow.d.c(cli.j):cli.o");
    }
}
