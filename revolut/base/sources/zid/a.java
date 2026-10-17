package zid;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.tracking.v3.ShopsContext;
import kotlin.jvm.internal.Intrinsics;
import mid.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final w0 a(ShopsCampaignOffer shopsCampaignOffer, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(shopsCampaignOffer, "<this>");
        String str2 = shopsCampaignOffer.u;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        ShopsContext.a aVarNewBuilder = ShopsContext.newBuilder();
        aVarNewBuilder.j(str2);
        if (str == null) {
            str = shopsCampaignOffer.f87036t;
        }
        aVarNewBuilder.h(str);
        if (bool != null) {
            aVarNewBuilder.i(bool.booleanValue());
        }
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static w0 b(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        ShopsContext.a aVarNewBuilder = ShopsContext.newBuilder();
        String str = hVar.f205707b;
        if (str != null) {
            aVarNewBuilder.j(str);
        }
        String str2 = hVar.f205708c;
        if (str2 != null) {
            aVarNewBuilder.h(str2);
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }
}
