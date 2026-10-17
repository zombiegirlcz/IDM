package g2f;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRedeemOption;
import ip0.xk;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f140046a;

    public j(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f140046a = uiKitResources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v11 */
    public static List b(j jVar, u2f.d agent) {
        ?? r132;
        List listC;
        int i;
        Iterator it8;
        int i2;
        ActionCardDelegate.Model model;
        TextLocalisedClause textLocalisedClause;
        Object moneyClause;
        int i3 = 2;
        int i5 = 1;
        Intrinsics.checkNotNullParameter(agent, "agent");
        List list = agent.f276627q;
        ArrayList arrayList = new ArrayList();
        Iterator it9 = list.iterator();
        int i6 = 0;
        int i21 = 0;
        while (it9.hasNext()) {
            Object next = it9.next();
            int i22 = i21 + 1;
            if (i21 < 0) {
                v.s();
                throw null;
            }
            TradeRevPointsRedeemOption tradeRevPointsRedeemOption = (TradeRevPointsRedeemOption) next;
            Integer numJ = hx7.e.j(jVar.f140046a, tradeRevPointsRedeemOption.f91196b);
            if (numJ != null) {
                int iIntValue = numJ.intValue();
                dj0.d dVar = tradeRevPointsRedeemOption.e;
                if (dVar != null) {
                    i = i3;
                    int i32 = R$string.miles_airline_details_redeem_option_starting_price;
                    i2 = i5;
                    o9 sensitivity = o9.NON_SENSITIVE;
                    Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
                    nub.c cVar = nub.a.f219272a;
                    nub.e format = new nub.e(i6);
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
                    Intrinsics.checkNotNullParameter(format, "format");
                    if (Intrinsics.f(dVar.f115083b.f306286a, "PTS")) {
                        it8 = it9;
                        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar.f115082a, 6);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                        moneyClause = nub.a.c(bigDecimalValueOf, sensitivity, false, format, numValueOf, 14.0f, null);
                    } else {
                        it8 = it9;
                        moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    }
                    textLocalisedClause = new TextLocalisedClause(i32, u.c(moneyClause), null, 12);
                } else {
                    i = i3;
                    it8 = it9;
                    i2 = i5;
                    textLocalisedClause = null;
                }
                ActionCardDelegate.Model model2 = new ActionCardDelegate.Model(a0.d.n("REDEEM_OPTIONS_ITEM_LIST_ID", i21), new TextClause(tradeRevPointsRedeemOption.f91195a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new GlyphImage(iIntValue, null, null, 6), null, textLocalisedClause != null ? new com.revolut.core.ui_kit.delegates.f(textLocalisedClause, com.revolut.core.ui_kit.delegates.e.SMALL) : null, tradeRevPointsRedeemOption, null, !tradeRevPointsRedeemOption.f91197c.isEmpty(), 14024);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                model = model2;
            } else {
                i = i3;
                it8 = it9;
                i2 = i5;
                model = null;
            }
            if (model != null) {
                arrayList.add(model);
            }
            i21 = i22;
            it9 = it8;
            i3 = i;
            i5 = i2;
            i6 = 0;
        }
        int i33 = i3;
        int i43 = i5;
        if (arrayList.isEmpty()) {
            r132 = 0;
            listC = f0.f322471a;
        } else if (arrayList.size() == i43) {
            int i59 = R$attr.uikit_dp0;
            int i66 = R$attr.uikit_dp4;
            listC = u.c(new xk("REDEEM_OPTIONS_GRID_LIST_ID", arrayList, 1, null, null, i59, 0, i66, i66, 63864));
            r132 = 0;
        } else if (arrayList.size() % 2 == 1) {
            List listSubList = arrayList.subList(0, arrayList.size() - 1);
            int i74 = R$attr.uikit_dp0;
            int i92 = R$attr.uikit_dp4;
            r132 = 0;
            xk xkVar = new xk("REDEEM_OPTIONS_GRID_LIST_ID", listSubList, 2, null, null, i74, i92, i92, i92, 63608);
            List listC2 = u.c(d0.m0(arrayList));
            int i96 = R$attr.uikit_dp4;
            listC = v.k(xkVar, new xk("REDEEM_OPTIONS_GRID_LIST_ID1", listC2, 1, null, null, i96, 0, i96, i96, 63864));
        } else {
            r132 = 0;
            int i99 = R$attr.uikit_dp0;
            int i100 = R$attr.uikit_dp4;
            listC = u.c(new xk("REDEEM_OPTIONS_GRID_LIST_ID", arrayList, 2, null, null, i99, 0, i100, i100, 63864));
        }
        if (listC.isEmpty()) {
            return listC;
        }
        TradeRevPointsRate tradeRevPointsRate = agent.f276624m.f276642h;
        ?? r87 = tradeRevPointsRate != null ? tradeRevPointsRate.f91192c : r132;
        int i101 = r87 == 0 ? -1 : i.f140045a[r87.ordinal()];
        return d0.E0(listC, u.c(new ListSubheaderDelegate.Model("REDEEM_OPTIONS_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(i101 != 1 ? i101 != i33 ? i101 != 3 ? R$string.trade_rev_points_agent_details_redeem_options_list_title_no_extra : R$string.trade_rev_points_agent_details_redeem_options_euro_star_title : R$string.trade_rev_points_agent_details_redeem_options_avios_title : R$string.trade_rev_points_agent_details_redeem_options_miles_title, r132, r132, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
    }

    public final List a(u2f.d agent, int i) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        List list = agent.f276628r;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it8.hasNext()) {
                return !arrayList.isEmpty() ? yp0.b.g(arrayList, new ListSubheaderDelegate.Model("EXTRA_REDEEM_OPTIONS_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : f0.f322471a;
            }
            Object next = it8.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            TradeRevPointsRedeemOption tradeRevPointsRedeemOption = (TradeRevPointsRedeemOption) next;
            Integer numJ = hx7.e.j(this.f140046a, tradeRevPointsRedeemOption.f91196b);
            RowDelegate.Model model = numJ != null ? new RowDelegate.Model(a0.d.n("EXTRA_REDEEM_OPTIONS_ITEM_LIST_ID_", i2), new RowDelegate.Model.MainImage.Image40(new GlyphImage(numJ.intValue(), null, null, 6), null, null, false, null, false, 62), new TextClause(tradeRevPointsRedeemOption.f91195a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, !tradeRevPointsRedeemOption.f91197c.isEmpty(), null, false, null, null, null, null, null, null, tradeRevPointsRedeemOption, null, 0, 0, 0, 0, 532674552) : null;
            if (model != null) {
                arrayList.add(model);
            }
            i2 = i3;
        }
    }
}
