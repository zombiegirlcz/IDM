package wyc;

import aw0.k7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.dg;
import ip0.pb0;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements cli.n {

    @NotNull
    private static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f301210a;

    public d0(v mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f301210a = mapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        ?? arrayList;
        RowDelegate.Model model;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f301214b;
        IncomeSource incomeSource = domainState.d;
        Data data2 = domainState.f301215c;
        if (data.getLoading() || data2.getLoading()) {
            arrayList = new ArrayList(8);
            for (int i = 0; i < 8; i++) {
                arrayList.add(new pb0(a0.d.n("loading_", i)));
            }
        } else if (data2.getContent() == null) {
            arrayList = zhm.u.c(new dg("ERROR_ITEM_LIST_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14)));
        } else {
            a3 a3Var = (a3) data.getContent();
            Object content = data2.getContent();
            Intrinsics.h(content);
            List incomeSources = (List) content;
            Intrinsics.checkNotNullParameter(incomeSources, "incomeSources");
            if (a3Var != null) {
                TimeClause.Format dayAndMonth = a3Var.f272624y.f273145c == io3.i.EXTERNAL ? new TimeClause.Format.DayAndMonth(ka.SHORT) : new TimeClause.Format.Pretty(0);
                v vVar = this.f301210a;
                model = new RowDelegate.Model("chosen_transaction", thf.d.a(vVar.f301233b, a3Var, r0.g(), r0.g(), null, null, null, null, null, null, null, null, 2040), null, null, new TextClause(thf.m.a(vVar.f301232a, a3Var, r0.g(), r0.g(), r0.g(), null, null, null, 240), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TimeClause(a3Var.f272593h.getMillis(), dayAndMonth, null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(k71.k.b(a3Var), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126), false, false, null, null, null, null, null, new hyc.d(a3Var), null, 0, 0, 0, 0, 1056958316);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            } else {
                model = null;
            }
            List<IncomeSource> list = incomeSources;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            for (IncomeSource incomeSource2 : list) {
                String str = incomeSource2.f85873a;
                String strQ = j6.a.q("income_source_", str);
                String strQ2 = j6.a.q("income_source_", str);
                TextClause textClause = new TextClause(incomeSource2.f85874b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i2 = R$attr.uikit_dp0;
                arrayList2.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, null, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, incomeSource2, null, i2, i2, 0, 0, 482344954), Intrinsics.f(str, incomeSource != null ? incomeSource.f85873a : null) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, incomeSource2, null, false, 32504));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            arrayList = zhm.d0.E0(arrayList2, zhm.v.l(model));
        }
        return new o((incomeSource == null || domainState.f301214b.getLoading() || data2.getLoading()) ? false : true, arrayList);
    }
}
