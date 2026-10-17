package h2f;

import aw0.e;
import aw0.m6;
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
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.redeem_options.TradeRevPointsRedeemOptionsScreenContract$InputData;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRedeemOption;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRedeemOptionItem;
import com.revolut.feature.travel.miles.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsRedeemOptionsScreenContract$InputData f148817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f148818b;

    public d(TradeRevPointsRedeemOptionsScreenContract$InputData inputData, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f148817a = inputData;
        this.f148818b = uiKitResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TradeRevPointsRedeemOptionsScreenContract$InputData tradeRevPointsRedeemOptionsScreenContract$InputData = this.f148817a;
        ArrayList arrayList = tradeRevPointsRedeemOptionsScreenContract$InputData.f91156a.f91197c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            RowDelegate.Model model = null;
            if (!it8.hasNext()) {
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                TradeRevPointsRedeemOption tradeRevPointsRedeemOption = tradeRevPointsRedeemOptionsScreenContract$InputData.f91156a;
                String str = tradeRevPointsRedeemOption.d;
                if (str == null) {
                    str = tradeRevPointsRedeemOption.f91195a;
                }
                return new cii.b(new e(false, new TextLocalisedClause(R$string.miles_airline_details_footer_prices_info, null, null, 14), null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_footer_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 53), arrayList2, new lw0.a(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            TradeRevPointsRedeemOptionItem tradeRevPointsRedeemOptionItem = (TradeRevPointsRedeemOptionItem) next;
            Integer numJ = hx7.e.j(this.f148818b, tradeRevPointsRedeemOptionItem.f91199b);
            if (numJ != null) {
                CircleBadgeModel circleBadgeModel = null;
                ProgressStyle progressStyle = null;
                boolean z = false;
                NewBadgeContent newBadgeContent = null;
                model = new RowDelegate.Model(a0.d.n("REDEEM_SUB_OPTIONS_ITEM_LIST_ID_", i), new RowDelegate.Model.MainImage.Image40(new GlyphImage(numJ.intValue(), null, null, 6), circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), new TextClause(tradeRevPointsRedeemOptionItem.f91198a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(com.revolut.feature.trade_rev_points.api.R$string.trade_rev_points_agent_details_redeem_option_starting_price, u.c(nub.a.l(qvb.a.c(tradeRevPointsRedeemOptionItem.f91200c), o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED, 54)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
            }
            if (model != null) {
                arrayList2.add(model);
            }
            i = i2;
        }
    }
}
