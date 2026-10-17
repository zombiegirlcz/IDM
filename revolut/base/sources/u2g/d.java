package u2g;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesAvailabilityTimes;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionV2;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.youTransactor.uCube.rpc.Constants;
import ip0.e8;
import ip0.y7;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import ms0.e4;
import qv0.i;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1g.c f276658a;

    public d(b1g.c dateFormatter) {
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        this.f276658a = dateFormatter;
    }

    public static LargeActionButtonDelegate.Model a(TravelExperienceOptionSelectionV2 travelExperienceOptionSelectionV2) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BOTTOM_DIALOG_BUTTON_ITEM_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.experiences_common_action_confirm, null, null, 14), !Intrinsics.f(travelExperienceOptionSelectionV2, TravelExperienceOptionSelectionV2.NoSelection.f93095a), null, null, null, null, 968);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static y7 d(TravelExperienceOptionSelectionV2.OptionWithTimes optionWithTimes, Custom custom) {
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = optionWithTimes.f93098b.d;
        if (travelExperiencesPricingBreakdown == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_choose_option_option_price, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(travelExperiencesPricingBreakdown.f92878a, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, o9.NON_SENSITIVE);
        int i = R$attr.uikit_dp8;
        return new y7("BOTTOM_DIALOG_PRICE_ITEM_ID", moneyClause, textLocalisedClause, null, 0, null, i, i, 1656);
    }

    public final y b(TravelExperienceOptionSelectionV2 optionSelection, boolean z) {
        List listL;
        List listL2;
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(optionSelection, "optionSelection");
        e8 e8Var = null;
        t tVar = new t(new TextLocalisedClause(R$string.experiences_time_slots_title, null, null, 14), null, null, 30);
        if (optionSelection instanceof TravelExperienceOptionSelectionV2.OptionWithTimes) {
            s0 s0Var = new s0(3);
            TravelExperienceOptionSelectionV2.OptionWithTimes optionWithTimes = (TravelExperienceOptionSelectionV2.OptionWithTimes) optionSelection;
            TravelExperiencesOptionV2 travelExperiencesOptionV2 = optionWithTimes.f93097a;
            s0Var.a(c(travelExperiencesOptionV2, optionSelection));
            if (z) {
                y7 y7VarD = d(optionWithTimes, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, db.BODY2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST));
                TravelExperiencesPointsOption travelExperiencesPointsOption = travelExperiencesOptionV2.f92869a.i;
                if (travelExperiencesPointsOption != null && (travelExperiencesPricingBreakdown = optionWithTimes.f93098b.d) != null && (dVar = travelExperiencesPricingBreakdown.f92878a) != null) {
                    e8Var = new e8("BOTTOM_DIALOG_POINTS_ITEM_ID", new TextLocalisedClause(R$string.experiences_common_pay_with_points, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, new nw0.a(travelExperiencesPointsOption.f93195a.b(), new MoneyClause(pyd.c.H(dVar, travelExperiencesPointsOption.f93196b), new MoneyClause.Format.Shorts(false, 51), null, o9.NON_SENSITIVE, 4)), null, 0, 0, 500);
                }
                i[] elements = {y7VarD, e8Var};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL2 = kotlin.collections.d.L(elements);
                yp0.b.k(listL2, 0, 0, 0, 0, 31);
            } else {
                List listL3 = v.l(d(optionWithTimes, null));
                yp0.b.k(listL3, 0, 0, 0, 0, 31);
                listL2 = listL3;
            }
            s0Var.b(listL2.toArray(new i[0]));
            s0Var.a(a(optionSelection));
            ArrayList arrayList = s0Var.f186433a;
            listL = v.m(arrayList.toArray(new i[arrayList.size()]));
        } else if (optionSelection instanceof TravelExperienceOptionSelectionV2.Option) {
            i[] elements2 = {c(((TravelExperienceOptionSelectionV2.Option) optionSelection).f93096a, optionSelection), a(optionSelection)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        } else {
            listL = f0.f322471a;
        }
        return new y(listL, tVar, l.WINDOW, null, null, null, 1016);
    }

    public final z c(TravelExperiencesOptionV2 travelExperiencesOptionV2, TravelExperienceOptionSelectionV2 travelExperienceOptionSelectionV2) {
        Object obj2;
        ArrayList arrayList = travelExperiencesOptionV2.f92869a.f;
        ArrayList<TravelExperiencesAvailabilityTimes> arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((TravelExperiencesAvailabilityTimes) obj3).f92857b) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (TravelExperiencesAvailabilityTimes travelExperiencesAvailabilityTimes : arrayList2) {
            String strN = a0.d.n("BOTTOM_DIALOG_TIME_ITEM_ID", travelExperiencesAvailabilityTimes.hashCode());
            boolean z = travelExperienceOptionSelectionV2 instanceof TravelExperienceOptionSelectionV2.OptionWithTimes;
            mx0.d dVar = (z && Intrinsics.f(((TravelExperienceOptionSelectionV2.OptionWithTimes) travelExperienceOptionSelectionV2).f93098b, travelExperiencesAvailabilityTimes)) ? mx0.d.ACCENT : mx0.d.SEMIBLACK;
            mx0.d dVar2 = dVar;
            e4 e4Var = travelExperiencesAvailabilityTimes.f92857b ? e4.EnabledClickable : e4.DisabledNonClickable;
            TextClause textClause = new TextClause(this.f276658a.c(travelExperiencesAvailabilityTimes.f92856a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (z && Intrinsics.f(((TravelExperienceOptionSelectionV2.OptionWithTimes) travelExperienceOptionSelectionV2).f93098b, travelExperiencesAvailabilityTimes)) {
                obj2 = TravelExperienceOptionSelectionV2.NoSelection.f93095a;
                arrayList3.add(new ActionsView.Item(strN, dVar2, false, e4Var, null, textClause, null, null, null, null, false, null, null, obj2, null, 24468));
            } else {
                TravelExperienceOptionSelectionV2.OptionWithTimes optionWithTimes = new TravelExperienceOptionSelectionV2.OptionWithTimes(travelExperiencesOptionV2, travelExperiencesAvailabilityTimes);
                obj2 = optionWithTimes;
                arrayList3.add(new ActionsView.Item(strN, dVar2, false, e4Var, null, textClause, null, null, null, null, false, null, null, obj2, null, 24468));
            }
        }
        return new z("BOTTOM_DIALOG_TIME_ITEM_ID", arrayList3, null, mx0.l.FLEXBOX, 0, 0, 116);
    }
}
