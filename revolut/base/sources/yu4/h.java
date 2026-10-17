package yu4;

import aw0.c7;
import aw0.ka;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.s6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.core.R$string;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        int i = domainState.f316877b;
        int i2 = domainState.f316876a;
        List list = domainState.d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(String.valueOf(((Number) it8.next()).intValue()));
        }
        s6 s6Var = new s6("id_credit_card_select_due_date_picker", list.indexOf(Integer.valueOf(i)), arrayList, Integer.valueOf(list.indexOf(Integer.valueOf(i2))), null, YearClass.CLASS_2016);
        yp0.b.l(s6Var, 0, 0, 0, 0, null, false, 63);
        eVarB.add(s6Var);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.credit_card_select_due_date_item_current_statement_due, null, null, 14), (Image) null, 0, false, 30);
        com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
        LocalDate localDate = domainState.a().f68862b;
        ka kaVar = ka.SHORT;
        List listK = v.k(new CellDetailsDelegate.Model("id_credit_card_select_due_date_item_current_statement_due", t0Var, com.revolut.core.ui_kit.models.j.b(jVar2, localDate, new LocalDateClause$DateFormat.DayAndMonth(kaVar)), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("id_credit_card_select_due_date_item_nex_statement_due", new t0((Clause) new TextLocalisedClause(R$string.credit_card_select_due_date_item_next_statement_due, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.a(domainState.a().f68863c, new LocalDateClause$DateFormat.DayAndMonth(kaVar), null), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new e(u.a(eVarB), domainState.f316877b != i2);
    }
}
