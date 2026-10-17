package obg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.og;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f223952b;

    public /* synthetic */ p(r rVar, int i) {
        this.f223951a = i;
        this.f223952b = rVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f223951a) {
            case 0:
                yhm.r rVar = (yhm.r) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                TravelHotelsCampaign travelHotelsCampaign = (TravelHotelsCampaign) rVar.f314201a;
                List campaignLocations = (List) rVar.f314202b;
                Intrinsics.checkNotNullParameter(campaignLocations, "campaignLocations");
                List<uei.a> list = campaignLocations;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (uei.a aVar : list) {
                    String strQ = j6.a.q("CAMPAIGN_LOCATION_ITEM_ID", aVar.f279453a.f97953a);
                    UrlImage urlImage = new UrlImage(aVar.f279454b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    HotelsLocation hotelsLocation = aVar.f279453a;
                    SmallCardDelegate.Model model = new SmallCardDelegate.Model(strQ, null, new TextClause(hotelsLocation.f97955c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new SmallCardDelegate.b.C0425b(new TextLocalisedClause(R$string.hotels_stays_campaigns_discount_title, u.c(aVar.d), new Custom(Integer.valueOf(R$attr.uikit_colorWhite_80), false, null, false, null, 254), 8), null, null, 6), urlImage, new og(new CountryImage(hotelsLocation.f.f97951a, (Integer) null, (ez0.e) null, 14)), null, aVar, null, 1043922);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(model);
                }
                int i = R$attr.uikit_dp16;
                return new o(u.c(new xk("CAMPAIGN_LOCATION_GRID_ITEM_ID", arrayList, null, null, null, 0, 0, i, i, 63996)), this.f223952b.a(travelHotelsCampaign));
            default:
                TravelHotelsCampaign campaign = (TravelHotelsCampaign) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(campaign, "campaign");
                return this.f223952b.a(campaign);
        }
    }
}
