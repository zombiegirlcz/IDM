package zp9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.messaging.common.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class x {
    public static TextLocalisedClause a(wp9.b0 b0Var, dj0.d dVar) {
        ArrayList arrayList = b0Var.f299171a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((wp9.t) obj2).e) {
                arrayList2.add(obj2);
            }
        }
        dj0.d.Companion.getClass();
        dj0.d dVar2 = dj0.d.e;
        int i = 0;
        dj0.d dVarO = dVar2;
        for (Object obj3 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarO = i == 0 ? ((wp9.t) obj3).f299201c : pyd.c.O(dVarO, ((wp9.t) obj3).f299201c);
            i = i2;
        }
        return new TextLocalisedClause(R$string.payments_split_bill_summary_of, zhm.v.k(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }

    public static TextLocalisedClause b(wp9.b0 b0Var) {
        ArrayList arrayList = b0Var.f299171a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((wp9.t) obj2).e) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(Long.valueOf(((wp9.t) it8.next()).f299200b));
        }
        return new TextLocalisedClause(R$string.payments_split_bill_summary_of, zhm.v.k(new TextClause(ch.qos.logback.core.util.a.p(zhm.d0.U0(arrayList3), "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("100%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }
}
