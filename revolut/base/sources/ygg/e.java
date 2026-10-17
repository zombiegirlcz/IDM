package ygg;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOptionItem;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.redeem_option.TravelMilesRedeemOptionScreenContract$InputData;
import hx7.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesRedeemOptionScreenContract$InputData f313664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f313665b;

    public e(TravelMilesRedeemOptionScreenContract$InputData inputData, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f313664a = inputData;
        this.f313665b = uiKitResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelMilesRedeemOptionScreenContract$InputData travelMilesRedeemOptionScreenContract$InputData = this.f313664a;
        ArrayList arrayList = travelMilesRedeemOptionScreenContract$InputData.f94279a.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            RowDelegate.Model model = null;
            if (!it8.hasNext()) {
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                TravelMilesRedeemOption travelMilesRedeemOption = travelMilesRedeemOptionScreenContract$InputData.f94279a;
                String str = travelMilesRedeemOption.f94118b;
                if (str == null) {
                    str = travelMilesRedeemOption.f94117a;
                }
                return new cii.b(new aw0.e(false, new TextLocalisedClause(R$string.miles_airline_details_footer_prices_info, null, null, 14), null, new n6(new TextLocalisedClause(R$string.miles_airline_details_footer_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53), arrayList2, new lw0.a(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            TravelMilesRedeemOptionItem travelMilesRedeemOptionItem = (TravelMilesRedeemOptionItem) next;
            Integer numZ = q.z(this.f313665b, travelMilesRedeemOptionItem.f94121b);
            if (numZ != null) {
                CircleBadgeModel circleBadgeModel = null;
                ProgressStyle progressStyle = null;
                boolean z = false;
                NewBadgeContent newBadgeContent = null;
                model = new RowDelegate.Model(a0.d.n("REDEEM_SUB_OPTIONS_ITEM_LIST_ID_", i), new RowDelegate.Model.MainImage.Image40(new GlyphImage(numZ.intValue(), null, null, 6), circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), new TextClause(travelMilesRedeemOptionItem.f94120a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(R$string.miles_airline_details_redeem_option_starting_price, u.c(nub.a.k(travelMilesRedeemOptionItem.f94122c, o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED, null, 54)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
            }
            if (model != null) {
                arrayList2.add(model);
            }
            i = i2;
        }
    }
}
