package e0e;

import a0e.w;
import aw0.ka;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.youTransactor.uCube.rpc.Constants;
import ip0.a10;
import ip0.c10;
import ip0.oc;
import ip0.re;
import ip0.tc;
import ip0.te;
import ip0.ue;
import ip0.xc;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements n {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f121578a = v.k(StatementPeriodType.TAX_YEAR, StatementPeriodType.MONTH, StatementPeriodType.CUSTOM, StatementPeriodType.ALL_TIME);

    public static xc a(e eVar, d dVar) {
        xxd.b bVar;
        LocalDate start;
        d dVar2 = d.FROM;
        String str = dVar == dVar2 ? "statement-date-from-section" : "statement-date-to-section";
        aim.e eVarB = u.b();
        String str2 = dVar == dVar2 ? "statement-date-from" : "statement-date-to";
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(dVar == dVar2 ? R$string.statement_period_from : R$string.statement_period_to, null, null, 14);
        StatementPeriod statementPeriod = eVar.f121571c;
        xxd.b bVar2 = eVar.f121569a;
        d dVar3 = eVar.d;
        InputTextDelegate.Model model = new InputTextDelegate.Model(str2, d(dVar, statementPeriod), textLocalisedClause, null, false, null, false, null, null, null, null, new ResourceImage(dVar3 == dVar ? R$drawable.uikit_icn_16_chevron_up_small : R$drawable.uikit_icn_16_chevron_down_small, Integer.valueOf(R$color.internal_color_input_dropdown), (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_FC_SPEED_MODE), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, dVar, null, null, 0, 0, 0, 0, -33558536, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        if (dVar3 == dVar) {
            LocalDate start2 = dVar == dVar2 ? statementPeriod.getStart() : statementPeriod.getEnd();
            if (dVar == dVar2) {
                bVar = bVar2;
                start = bVar.f309508a.getStart();
            } else {
                bVar = bVar2;
                start = statementPeriod.getStart();
            }
            g5 g5Var = new g5(dVar == dVar2 ? "statement-date-from-picker" : "statement-date-to-picker", start2, start2, true, null, start, dVar == dVar2 ? statementPeriod.getEnd() : bVar.f309508a.getEnd(), null, null, null, 0, 0, 1048368);
            yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(g5Var);
        }
        return new xc(str, u.a(eVarB), 0, new tc(oc.f165651a), null, 0, 0, 0, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
    }

    public static xc b(d dVar, StatementPeriod statementPeriod) {
        d dVar2 = d.FROM;
        String str = dVar == dVar2 ? "statement-date-from-section" : "statement-date-to-section";
        InputTextDelegate.Model model = new InputTextDelegate.Model(dVar == dVar2 ? "statement-date-from" : "statement-date-to", d(dVar, statementPeriod), new TextLocalisedClause(dVar == dVar2 ? R$string.statement_period_from : R$string.statement_period_to, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, 65023);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new xc(str, u.c(model), 0, new tc(oc.f165651a), null, 0, 0, 0, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
    }

    public static TimeClause d(d dVar, StatementPeriod statementPeriod) {
        return new TimeClause(dVar == d.FROM ? oc.c.N(statementPeriod.getStart()) : oc.c.N(statementPeriod.getEnd()), TimeClause.Format.DateLong.f57962b, null, null, 12);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        a10 a10Var;
        q qVar;
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.common_word_period, null, null, 14), null, null, null, false, 30);
        aim.e eVarB = u.b();
        List<StatementPeriodType> list = f121578a;
        ArrayList arrayList = new ArrayList();
        for (StatementPeriodType statementPeriodType : list) {
            if ((domainState.f121570b.contains(statementPeriodType) ? statementPeriodType : null) != null) {
                String strName = statementPeriodType.name();
                int i2 = k.f121577a[statementPeriodType.ordinal()];
                if (i2 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.statement_period_tax_year, null, null, 14);
                } else if (i2 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.statement_period_month, null, null, 14);
                } else if (i2 == 3) {
                    textLocalisedClause = new TextLocalisedClause(R$string.statement_period_date, null, null, 14);
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException(("Unsupported period type: " + statementPeriodType).toString());
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.statement_period_all_time, null, null, 14);
                }
                qVar = new q(strName, new t(textLocalisedClause), 58);
            } else {
                qVar = null;
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        xxd.b bVar = domainState.f121569a;
        StatementPeriod statementPeriod = domainState.f121571c;
        eVarB.add(new TabsDelegate.Model("statement-period-types", arrayList, bVar.f309510c.f88217a.name(), null, null, null, 0, 0, null, 8120));
        StatementPeriodSelection statementPeriodSelection = bVar.f309510c;
        StatementPeriod statementPeriod2 = bVar.f309508a;
        int i3 = 0;
        if (statementPeriodSelection.f88217a == StatementPeriodType.TAX_YEAR) {
            List list2 = domainState.e;
            TaxPeriod taxPeriod = domainState.f;
            StatementPeriod statementPeriodF = w.f(list2, statementPeriod);
            if (list2.isEmpty() || taxPeriod == null) {
                a10Var = null;
            } else {
                List<StatementPeriod> list3 = list2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                for (StatementPeriod statementPeriod3 : list3) {
                    Intrinsics.checkNotNullParameter(statementPeriod3, "statementPeriod");
                    Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
                    LocalDate localDateWithYear = statementPeriod3.getStart().withYear(0).isBefore(taxPeriod.getFrom()) ? taxPeriod.getFrom().withYear(statementPeriod3.getStart().getYear() - 1) : taxPeriod.getFrom().withYear(statementPeriod3.getStart().getYear());
                    LocalDate localDateWithYear2 = statementPeriod3.getEnd().withYear(0).isAfter(taxPeriod.getTo()) ? taxPeriod.getTo().withYear(statementPeriod3.getEnd().getYear() + 1) : taxPeriod.getTo().withYear(statementPeriod3.getEnd().getYear());
                    Intrinsics.h(localDateWithYear);
                    Intrinsics.h(localDateWithYear2);
                    StatementPeriod statementPeriod4 = new StatementPeriod(localDateWithYear, localDateWithYear2);
                    arrayList2.add(new c10(statementPeriod4.getStart().getYear() != statementPeriod4.getEnd().getYear() ? new CompositeClause(v.k(new TimeClause(oc.c.N(statementPeriod4.getStart()), new TimeClause.Format.Year(0), null, null, 12), new TimeClause(oc.c.N(statementPeriod4.getEnd()), new TimeClause.Format.Year(0), null, null, 12)), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : new TimeClause(oc.c.N(statementPeriod4.getStart()), new TimeClause.Format.Year(0), null, null, 12), null));
                }
                Iterator it8 = list2.iterator();
                int i5 = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (Intrinsics.f((StatementPeriod) it8.next(), statementPeriodF)) {
                        break;
                    }
                    i5++;
                }
                a10Var = new a10("statement-tax-year-picker", arrayList2, i5);
            }
            if (a10Var != null) {
                yp0.b.l(a10Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(a10Var);
            }
        }
        StatementPeriodType statementPeriodType2 = statementPeriodSelection.f88217a;
        StatementPeriodType statementPeriodType3 = statementPeriodSelection.f88217a;
        if (statementPeriodType2 == StatementPeriodType.MONTH) {
            aim.e eVarA = bzd.a.a(statementPeriod2);
            StatementPeriod statementPeriodB = bzd.a.b(eVarA, statementPeriod);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.statement_period_from, null, null, 14);
            ArrayList arrayList3 = new ArrayList(zhm.w.t(eVarA, 10));
            ListIterator listIterator = eVarA.listIterator(0);
            while (true) {
                aim.b bVar2 = (aim.b) listIterator;
                if (!bVar2.hasNext()) {
                    break;
                }
                StatementPeriod statementPeriod5 = (StatementPeriod) bVar2.next();
                arrayList3.add(new ue(new TimeClause(oc.c.N(statementPeriod5.getStart()), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), statementPeriod5.getStart()));
            }
            ListIterator listIterator2 = eVarA.listIterator(0);
            int i6 = 0;
            while (true) {
                aim.b bVar3 = (aim.b) listIterator2;
                if (!bVar3.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (Intrinsics.f(((StatementPeriod) bVar3.next()).getStart(), statementPeriodB.getStart())) {
                    break;
                }
                i6++;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            te teVar = new te(textLocalisedClause2, arrayList3, Integer.valueOf(i6), 24);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.statement_period_to, null, null, 14);
            ArrayList arrayList4 = new ArrayList(zhm.w.t(eVarA, 10));
            ListIterator listIterator3 = eVarA.listIterator(0);
            while (true) {
                aim.b bVar4 = (aim.b) listIterator3;
                if (!bVar4.hasNext()) {
                    break;
                }
                StatementPeriod statementPeriod6 = (StatementPeriod) bVar4.next();
                arrayList4.add(new ue(new TimeClause(oc.c.N(statementPeriod6.getEnd()), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), statementPeriod6.getEnd()));
                i3 = 0;
            }
            int i21 = i3;
            ListIterator listIterator4 = eVarA.listIterator(i21);
            int i22 = i21;
            while (true) {
                aim.b bVar5 = (aim.b) listIterator4;
                if (!bVar5.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.f(((StatementPeriod) bVar5.next()).getEnd(), statementPeriodB.getEnd())) {
                    i = i22;
                    break;
                }
                i22++;
            }
            re reVar = new re("statement-month-picker", teVar, new te(textLocalisedClause3, arrayList4, Integer.valueOf(i < 0 ? i21 : i), 24));
            yp0.b.l(reVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(reVar);
        }
        if (statementPeriodType3 == StatementPeriodType.CUSTOM) {
            eVarB.addAll(v.k(a(domainState, d.FROM), a(domainState, d.TO)));
        }
        if (statementPeriodType3 == StatementPeriodType.ALL_TIME) {
            eVarB.addAll(v.k(b(d.FROM, statementPeriod2), b(d.TO, statementPeriod2)));
        }
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.documents_hub_common_apply, null, null, 14), LargeActionButton.ButtonStyle.e, null, null, false, null, null, null, 1020), null, null, 55), u.a(eVarB), aVar);
    }
}
