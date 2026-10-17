package veh;

import aw0.c7;
import aw0.ka;
import ch.qos.logback.core.net.SyslogConstants;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.options.ui.impl.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ip0.ck0;
import ip0.p10;
import ip0.s7;
import ip0.t10;
import ip0.yj0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import u3a.p;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f288342a;

    public n() {
        int i;
        List<qel.b> listK = v.k(qel.b.CALL, qel.b.PUT);
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        for (qel.b bVar : listK) {
            String strM = s.m(bVar);
            int i2 = m.f288341a[bVar.ordinal()];
            if (i2 == 1) {
                i = R$string.wealth_trading_options_call;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_trading_options_put;
            }
            arrayList.add(new FixedTabs.Item(strM, new TextLocalisedClause(i, null, null, 14), (AnalyticsContext) null, 12));
        }
        this.f288342a = arrayList;
    }

    public static aim.e a(InstrumentTicker instrumentTicker) {
        aim.e eVarB = u.b();
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            String strN = a0.d.n("LOWER_OPTION_LIST_ID_", 9 - i);
            int i2 = R$attr.uikit_dp16;
            arrayList.add(new s7(strN, i2, i2, 0, 0, false, null, SyslogConstants.LOG_CLOCK));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp0, 0, 0, 29);
        eVarB.addAll(arrayList);
        eVarB.add(instrumentTicker != null ? d(instrumentTicker) : new t10("UNDERLYING_PRICE_LIST_ID", p10.f165755a));
        ArrayList arrayList2 = new ArrayList(10);
        for (int i3 = 0; i3 < 10; i3++) {
            String strN2 = a0.d.n("HIGHER_OPTION_LIST_ID_", i3);
            int i5 = R$attr.uikit_dp16;
            arrayList2.add(new s7(strN2, i5, i5, 0, 0, false, null, SyslogConstants.LOG_CLOCK));
        }
        yp0.b.k(arrayList2, R$attr.uikit_dp0, 0, 0, 0, 30);
        eVarB.addAll(arrayList2);
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.RowDelegate.Model b(com.revolut.shared.feature.wealth.models.options.OptionWithTicker r36, java.lang.String r37, com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r38) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: veh.n.b(com.revolut.shared.feature.wealth.models.options.OptionWithTicker, java.lang.String, com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public static TextDelegate.Model d(InstrumentTicker instrumentTicker) {
        int i = R$string.wealth_trading_options_share_price;
        ej0.b bVar = instrumentTicker.f;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new MoneyClause(bVar != null ? mif.a.Q(bVar) : instrumentTicker.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 8);
        ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
        int i2 = R$attr.uikit_dp12;
        return new TextDelegate.Model("UNDERLYING_PRICE_LIST_ID", textLocalisedClause, false, ck0Var, null, null, i2, i2, 0, 0, 1652);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        ?? arrayList;
        qel.b bVar;
        LocalDate localDate;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f288323c;
        Data data2 = domainState.f288321a;
        Data data3 = domainState.f288322b;
        String strM = null;
        List list = (data == null || data2 == null || data3 == null) ? null : (List) iii.c.f(t1.t(data, data2), new vea.n(this), new p(this, data, data2), new tvh.e(data3, this, 27));
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        Iterator it8 = list2.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((koi.j) it8.next()).getF53795a(), "UNDERLYING_PRICE_LIST_ID")) {
                break;
            }
            i++;
        }
        Integer numValueOf = i >= 0 ? Integer.valueOf(i) : null;
        f fVar = data2 != null ? (f) data2.getContent() : null;
        if (fVar != null) {
            List<LocalDate> list3 = fVar.f288324a;
            arrayList = new ArrayList(w.t(list3, 10));
            for (LocalDate localDate2 : list3) {
                String string = localDate2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
                jVar2.getClass();
                arrayList.add(new q(string, new t(com.revolut.core.ui_kit.models.j.a(localDate2, dayAndMonth, null)), 58));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        ?? r56 = arrayList;
        String string2 = (fVar == null || (localDate = fVar.f288325b) == null) ? null : localDate.toString();
        List list4 = fVar != null ? this.f288342a : f0.f322471a;
        if (fVar != null && (bVar = fVar.f288326c) != null) {
            strM = s.m(bVar);
        }
        return new h(list2, r56, string2, list4, strM, numValueOf);
    }
}
