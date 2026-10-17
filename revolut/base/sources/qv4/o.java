package qv4;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List<vl4.i> list = (List) entry.getValue();
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i = 0;
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i2 == 0 ? ((vl4.i) obj2).e : pyd.c.O(dVarO, ((vl4.i) obj2).e);
                i2 = i3;
            }
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (vl4.i iVar : list) {
                String strS = h30.l.s("id_credit_card_statement_hub_item_", iVar.f290264b);
                TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, iVar.f290263a, new LocalDateClause$DateFormat.Month(i));
                LocalDate localDate = iVar.d;
                vl4.c cVar = iVar.f;
                vl4.d dVar = iVar.f290267h;
                TextLocalisedClause textLocalisedClauseA = ev4.b.a(cVar, dVar);
                int i5 = i;
                Iterator it9 = it8;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_common_due_on, u.c(com.revolut.core.ui_kit.models.j.a(localDate, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT), null)), null, 12);
                Clause[] elements = new Clause[2];
                elements[i5] = textLocalisedClauseA;
                elements[1] = textLocalisedClause;
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.a(t0.f186434a);
                arrayList2.add(new RowDelegate.Model(strS, null, timeClauseB, null, 0, new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(sx4.f.b(3, null, null, ev4.b.b(cVar, dVar, iVar.i, iVar.e)), null, null, false, 126), false, null, false, null, null, null, null, null, null, new p(iVar.f290264b), null, 0, 0, 0, 0, 532675546));
                i = i5;
                it8 = it9;
            }
            arrayList.add(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(a0.d.n("id_credit_card_statement_hub_header_", iIntValue), (Image) null, (Clause) new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) sx4.f.b(3, null, null, dVarO), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514), null, 0, 0, 126));
            it8 = it8;
        }
        return w.u(arrayList);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f249528b, new qsa.p(this), new qsk.d(this, 11), new qbg.j(this, domainState, 15));
    }
}
