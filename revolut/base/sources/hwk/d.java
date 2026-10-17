package hwk;

import aah.m;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f156286a;

    public d(q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f156286a = wealthDisclaimersMapper;
    }

    public static CompositeClause a(int i, List list) {
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new DotDividerClause((Integer) null), new TextLocalisedClause(i, list, null, 12)));
    }

    public static PercentageClause b(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return new PercentageClause(bigDecimalValueOf, (PercentageClause.Format) null, (Style) null, 6);
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_recommended_buys_title, null, null, 14);
        List listK = v.k(new Pair(Integer.valueOf(R$string.recommended_buys_info_how_are_recommended_buys_selected_title), Integer.valueOf(R$string.recommended_buys_info_how_are_recommended_buys_selected_description)), new Pair(Integer.valueOf(R$string.recommended_buys_info_expected_annual_return_title), Integer.valueOf(R$string.recommended_buys_info_expected_annual_return_description)));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        int i = 0;
        for (Object obj2 : listK) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Pair pair = (Pair) obj2;
            RowDelegate.Model model = new RowDelegate.Model(a0.d.n("RECOMMENDED_BUY_INFO_LIST_ID_", i), null, new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), null, 0, new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i = i2;
        }
        RowDelegate.Model model2 = new RowDelegate.Model("RECOMMENDED_BUY_INFO_LIST_ID_RISK", null, new TextLocalisedClause(R$string.recommended_buys_info_risk_title, null, null, 14), null, 0, yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.recommended_buys_info_risk_description, null, null, 14), a(R$string.recommended_buys_info_risk_description_first_range, u.c(b(20))), a(R$string.recommended_buys_info_risk_description_second_range, v.k(b(20), b(40))), a(R$string.recommended_buys_info_risk_description_third_range, u.c(yoj.b.w(b(40), new TextClause("+", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)))))), null, null, Integer.MAX_VALUE, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868568);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        ArrayList arrayListF0 = d0.F0(model2, arrayList);
        Data data = domainState.f156282a;
        List listB = data != null ? ((m) this.f156286a).b(data) : null;
        if (listB == null) {
            listB = f0.f322471a;
        }
        return new b(textLocalisedClause, d0.E0(listB, arrayListF0));
    }
}
