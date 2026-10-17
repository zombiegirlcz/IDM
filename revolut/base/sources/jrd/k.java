package jrd;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.common.ui.R$string;
import ip0.a10;
import ip0.c10;
import ip0.re;
import ip0.te;
import ip0.ue;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        jrd.a aVar = domainState.f177990a;
        int i = domainState.f177991b;
        List list = domainState.e;
        List list2 = domainState.d;
        int i2 = l.f178002a[aVar.ordinal()];
        if (i2 == 1) {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                int iIntValue = ((Number) it8.next()).intValue();
                arrayList.add(new c10(new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Integer.valueOf(iIntValue)));
            }
            a10 a10Var = new a10("year_picker", arrayList, list2.indexOf(Integer.valueOf(i)));
            yp0.b.l(a10Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(a10Var);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List list4 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                int iIntValue2 = ((Number) it9.next()).intValue();
                String displayName = Month.of(iIntValue2).getDisplayName(TextStyle.FULL, Locale.getDefault());
                Intrinsics.h(displayName);
                arrayList2.add(new ue(new TextClause(displayName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Integer.valueOf(iIntValue2)));
            }
            List list5 = list2;
            ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                int iIntValue3 = ((Number) it10.next()).intValue();
                arrayList3.add(new ue(new TextClause(String.valueOf(iIntValue3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Integer.valueOf(iIntValue3)));
            }
            re reVar = new re("month_year_picker", new te(null, arrayList2, Integer.valueOf(list.indexOf(Integer.valueOf(domainState.f177992c))), 25), new te(null, arrayList3, Integer.valueOf(list2.indexOf(Integer.valueOf(i))), 25));
            yp0.b.l(reVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(reVar);
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("confirm_button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_done, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        eVarB.add(model);
        return new d(u.a(eVarB));
    }
}
