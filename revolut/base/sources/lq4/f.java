package lq4;

import aw0.c7;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(dj0.d dVar, LocalDate localDate) {
        return new TextLocalisedClause(R$string.credit_card_cashback_details_earned_description, v.k(sx4.f.b(3, null, null, dVar), j.b(c7.Companion, localDate, new LocalDateClause$DateFormat.DayAndMonth(0))), null, 12);
    }

    public static List b(int i, Clause clause, Clause clause2) {
        List listK = v.k(new CellDetailsDelegate.Model("id_text", new TextLocalisedClause(R$string.credit_card_cashback_details_progress_start_text, null, null, 14), sx4.g.f(clause, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254)), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new VaultsProgressDelegate.Model("id_progress", null, null, null, null, sx4.g.f(clause2, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254)), null, null, false, Math.min(i, 100), null, false, null, null, 8384382));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public static List c(Clause clause, LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        LocalDate localDatePlusDays = localDate3.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jH = oc.c.h(localDate, localDatePlusDays);
        LocalDate localDatePlusDays2 = localDate3.plusDays(1L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
        long jH2 = oc.c.h(localDate2, localDatePlusDays2);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.credit_cashback_promo_end_date_day_left, Integer.valueOf((int) jH), (List) null, (Style) null, 28);
        int i = (int) (((jH2 - jH) / jH2) * 100);
        if (i < 1) {
            i = 1;
        }
        return b(i, textLocalisedQuantityClause, clause);
    }

    public static CompositeClause d(TextLocalisedClause textLocalisedClause) {
        return new CompositeClause(v.k(textLocalisedClause, sx4.g.e(1), new TextLocalisedClause(R$string.credit_common_learn_more, null, new Click(30, (Integer) null, (Object) null, "id_learn_more", false), 10)), null, null, null, 14);
    }
}
