package nbh;

import aw0.c7;
import aw0.ka;
import aw0.o9;
import aw0.wa;
import com.revolut.core.ui_kit.delegates.lf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.e0;
import nel.n;
import nel.u;
import nel.z;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p1h.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f214081a;

    public f(c instrumentInfoProvider) {
        Intrinsics.checkNotNullParameter(instrumentInfoProvider, "instrumentInfoProvider");
        this.f214081a = instrumentInfoProvider;
    }

    public static CompositeClause b(n nVar) {
        TextClause textClause = new TextClause(nVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = nVar.o;
        TextClause[] elements = {textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return v1.c.f(kotlin.collections.d.L(elements), null);
    }

    public final Clause c(n instrument) {
        LocalDate localDate;
        BigDecimal bigDecimal;
        PeriodClause periodClause;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        z zVar = instrument.f214597c;
        nel.a aVar = instrument.f214599h;
        Style style = null;
        switch (e.f214080a[zVar.ordinal()]) {
            case 1:
                nel.d dVar = aVar instanceof nel.d ? (nel.d) aVar : null;
                if (dVar != null && (localDate = dVar.f214563b) != null && (bigDecimal = dVar.f214562a) != null) {
                    int i = R$string.wealth_trading_bond_coupon_rate_maturity_subtitle;
                    PercentageClause percentageClause = new PercentageClause(bigDecimal, new PercentageClause.Format.Custom(3, 4, null, wa.STRIP_ONE_TRAILING_ZERO, RoundingMode.HALF_UP), style, 4);
                    j jVar = c7.Companion;
                    LocalDateClause$DateFormat.MonthAndYear monthAndYear = new LocalDateClause$DateFormat.MonthAndYear(ka.SHORT);
                    jVar.getClass();
                    return new TextLocalisedClause(i, v.k(percentageClause, j.a(localDate, monthAndYear, null)), null, 12);
                }
                return null;
            case 2:
                String str = instrument.o;
                return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 3:
            case 4:
            case 5:
                return new TextClause(instrument.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 6:
            case 7:
            case 8:
            case 9:
                u uVar = instrument.f214607s;
                return (!instrument.b() || uVar == null) ? b(instrument) : new TextLocalisedClause(R$string.invest_discover_section_ipo_spotlight_launch_title, zhm.u.c(new TimeClause(uVar.f214625b.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return b(instrument);
            case 13:
                e0 e0Var = aVar instanceof e0 ? (e0) aVar : null;
                if (e0Var != null) {
                    Integer num = e0Var.f214565a;
                    TextLocalisedClause textLocalisedClause = num != null ? new TextLocalisedClause(R$string.trading_structured_notes_instrument_widget_risk_template, zhm.u.c(Integer.valueOf(num.intValue())), null, 12) : null;
                    Integer num2 = e0Var.f214567c;
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        periodClause = new PeriodClause(iIntValue % 12 == 0 ? new PeriodClause.PeriodComponents(iIntValue / 12, 0, 0, 0, 0, 0, 62) : new PeriodClause.PeriodComponents(0, iIntValue, 0, 0, 0, 0, 61), null);
                    } else {
                        periodClause = null;
                    }
                    Object[] elements = {textLocalisedClause, periodClause};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    return v1.c.f(kotlin.collections.d.L(elements), null);
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final TextClause d(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        switch (e.f214080a[instrument.f214597c.ordinal()]) {
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return null;
            case 3:
            case 4:
            case 5:
                String str = instrument.o;
                if (str != null) {
                    return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final lf e(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        z zVar = instrument.f214597c;
        xi0.b bVar = instrument.i;
        switch (e.f214080a[zVar.ordinal()]) {
            case 1:
                nel.a aVar = instrument.f214599h;
                nel.d dVar = aVar instanceof nel.d ? (nel.d) aVar : null;
                if ((dVar != null ? dVar.f214563b : null) != null && dVar.f214562a != null) {
                    return new lf(new TextClause(cp5.d.J(bVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 6);
                }
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return null;
            case 3:
            case 4:
            case 5:
            case 13:
                return new lf(new TextClause(cp5.d.J(bVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 6);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.TextClause f(nel.n r10) {
        /*
            r9 = this;
            java.lang.String r0 = "instrument"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            nel.z r0 = r10.f214597c
            int[] r1 = nbh.e.f214080a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L27;
                case 2: goto L18;
                case 3: goto L18;
                case 4: goto L18;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L18;
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                case 11: goto L18;
                case 12: goto L18;
                case 13: goto L18;
                case 14: goto L18;
                case 15: goto L18;
                default: goto L12;
            }
        L12:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L18:
            com.revolut.core.ui_kit.models.TextClause r0 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r1 = r10.d
            r6 = 0
            r7 = 126(0x7e, float:1.77E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L27:
            nel.a r0 = r10.f214599h
            boolean r1 = r0 instanceof nel.d
            r2 = 0
            if (r1 == 0) goto L31
            nel.d r0 = (nel.d) r0
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L45
            java.time.LocalDate r1 = r0.f214563b
            if (r1 == 0) goto L3d
            java.math.BigDecimal r1 = r0.f214562a
            if (r1 == 0) goto L3d
            r2 = r0
        L3d:
            if (r2 == 0) goto L45
            java.lang.String r0 = r2.f214564c
            if (r0 == 0) goto L45
        L43:
            r2 = r0
            goto L48
        L45:
            java.lang.String r0 = r10.d
            goto L43
        L48:
            com.revolut.core.ui_kit.models.TextClause r1 = new com.revolut.core.ui_kit.models.TextClause
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 126(0x7e, float:1.77E-43)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nbh.f.f(nel.n):com.revolut.core.ui_kit.models.TextClause");
    }
}
