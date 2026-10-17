package mpd;

import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import ip0.pb0;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mpd.q;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static koi.j a(String str, TextLocalisedClause textLocalisedClause, LocalDate localDate, q qVar) {
        String str2 = localDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model(str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause, null, false, null, null, null, null, null, null, false, null, null, false, true, 524288, 0, null, false, false, null, false, null, false, false, false, qVar, null, 0, -35913736, 65023));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        return modelA;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        boolean z3;
        List listK;
        TextLocalisedClause textLocalisedClause;
        TimeClause timeClauseA;
        LocalDate localDate;
        n0 n0Var;
        mpd.a domainState = (mpd.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b bVar = domainState.f207787g;
        LocalDate localDate2 = domainState.f207784a;
        ?? r4 = 0;
        q.a aVar = q.a.f207806a;
        q.b bVar2 = q.b.f207807a;
        if (bVar != null) {
            aim.e eVarB = u.b();
            LocalDate localDate3 = bVar.f207789b;
            LocalDate localDate4 = bVar.f207788a;
            for (c cVar : c.a()) {
                boolean z4 = cVar == c.START_DATE;
                LocalDate localDate5 = z4 ? localDate4 : localDate3;
                boolean z6 = z4;
                LocalDate localDate6 = localDate3;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(z4 ? R$string.analytics_custom_period_start_date : R$string.analytics_custom_period_end_date, r4, r4, 14);
                boolean z11 = bVar.f207790c == cVar;
                String str = z6 ? "start_date" : "end_date";
                if (localDate5 != null) {
                    com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                    if (localDate4 == null || localDate6 == null) {
                        textLocalisedClause = textLocalisedClause2;
                    } else {
                        textLocalisedClause = textLocalisedClause2;
                        if (localDate4.getYear() != localDate6.getYear()) {
                            n0Var = n0.DEFAULT;
                        }
                        LocalDateClause$DateFormat.DateMedium dateMedium = new LocalDateClause$DateFormat.DateMedium(n0Var);
                        jVar2.getClass();
                        timeClauseA = com.revolut.core.ui_kit.models.j.a(localDate5, dateMedium, null);
                    }
                    n0Var = n0.HIDE_CURRENT_YEAR;
                    LocalDateClause$DateFormat.DateMedium dateMedium2 = new LocalDateClause$DateFormat.DateMedium(n0Var);
                    jVar2.getClass();
                    timeClauseA = com.revolut.core.ui_kit.models.j.a(localDate5, dateMedium2, null);
                } else {
                    textLocalisedClause = textLocalisedClause2;
                    timeClauseA = null;
                }
                InputTextDelegate.Model model = new InputTextDelegate.Model(str, timeClauseA, textLocalisedClause, null, false, null, false, null, null, null, null, new ResourceImage(z11 ? R$drawable.uikit_icn_16_chevron_up_small : R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, null, false, !bVar.f && (z6 || localDate4 != null), false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, z6 ? bVar2 : aVar, null, null, 0, 0, 0, 0, -33820680, 65023);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
                if (z11) {
                    if (localDate2 == null) {
                        pb0 pb0Var = new pb0("date_bounds_loading");
                        yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(pb0Var);
                    } else {
                        g5 g5Var = new g5(z6 ? "custom_period_start_calendar" : "custom_period_end_calendar", bVar.d, localDate5, true, null, (z6 || localDate4 == null || (localDate = (LocalDate) kotlin.ranges.f.c(localDate4, localDate2)) == null) ? localDate2 : localDate, bVar.e, null, null, null, 0, 0, 1048368);
                        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
                        eVarB.add(g5Var);
                    }
                }
                localDate3 = localDate6;
                r4 = 0;
            }
            z = true;
            z3 = false;
            listK = u.a(eVarB);
        } else {
            z = true;
            z3 = false;
            listK = v.k(a("start_date", new TextLocalisedClause(R$string.analytics_custom_period_start_date, null, null, 14), domainState.d, bVar2), a("end_date", new TextLocalisedClause(R$string.analytics_custom_period_end_date, null, null, 14), domainState.e, aVar));
        }
        return new e(listK, bVar != null ? (!bVar.b(localDate2) || bVar.f) ? z3 : z : domainState.f);
    }
}
