package l33;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.b;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.cards_core.R$plurals;
import com.revolut.feature.cards_core.R$string;
import hha.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;
import rp0.t;
import rp0.v;
import rp0.y;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    @NotNull
    public static final C1090a Companion = new C1090a();

    /* JADX INFO: renamed from: l33.a$a, reason: collision with other inner class name */
    public static final class C1090a {
        private C1090a() {
        }
    }

    public static Clause a(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Period period = zVar.f152375a;
        if (period.getYears() == 0 && period.getMonths() == 0 && period.getWeeks() == 0 && period.getDays() > 0) {
            return new TextLocalisedQuantityClause(R$plurals.card_order_plan_free_trial_charge_dialog_subtitle_3_days, Integer.valueOf(period.getDays()), (List) null, (Style) null, 28);
        }
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (period.getYears() == 0 && period.getMonths() == 0 && period.getWeeks() > 0 && period.getDays() == 0) {
            return new TextLocalisedQuantityClause(R$plurals.card_order_plan_free_trial_charge_dialog_subtitle_3_weeks, Integer.valueOf(period.getWeeks()), (List) null, (Style) null, 28);
        }
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (period.getYears() == 0 && period.getMonths() > 0 && period.getWeeks() == 0 && period.getDays() == 0) {
            return new TextLocalisedQuantityClause(R$plurals.card_order_plan_free_trial_charge_dialog_subtitle_3_months, Integer.valueOf(period.getMonths()), (List) null, (Style) null, 28);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static y b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        t tVar = new t(textLocalisedClause, textLocalisedClause2, new v("PLAN_CANCELLATION_DIALOG_ICON", b.c("3D018", new ImageTransformations(null, null, null, null, null, 64, 64, 31), null, null, 28)), 24);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ACTION_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.card_order_plan_free_trial_charge_dialog_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ACTION_BUTTON_SKIP", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.card_order_plan_free_trial_charge_dialog_skip, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new y(zhm.v.k(model, model2), tVar, null, null, null, null, 1020);
    }
}
