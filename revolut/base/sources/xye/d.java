package xye;

import aue.j;
import aue.k;
import aw0.e;
import aw0.n6;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import ste.r;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model c(int i, aue.a aVar) {
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ROLLING_CARD_TOP_UP_LIMIT_INDICATOR_LIST_ID", new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.topup_card_limits_prompt_limit_remainder, v.k(new MoneyClause(aVar.f9805c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(aVar.f9804b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, null, false, 60);
        return model;
    }

    public final r a(dj0.d limitUsedMoney, dj0.d limitMoney) {
        Intrinsics.checkNotNullParameter(limitUsedMoney, "limitUsedMoney");
        Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.topup_card_limits_prompt_title, null, null, 14), new TextLocalisedClause(R$string.topup_card_limits_prompt_subtitle, u.c(new TextLocalisedClause(R$string.topup_card_limits_prompt_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID", false), 10)), null, 12), null, null, false, 28);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ROLLING_CARD_TOP_UP_LIMIT_INDICATOR_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.topup_card_limits_prompt_limit_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.topup_card_limits_prompt_limit_remainder, v.k(new MoneyClause(limitUsedMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(limitMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, null, false, 60);
        return new r(new e(false, new TextLocalisedClause(R$string.topup_card_limits_prompt_limit_cta_subtitle, null, null, 14), null, new n6(new TextLocalisedClause(R$string.topup_card_limits_prompt_limit_cta_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53), u.c(model), aVar);
    }

    public final r b(List appliedLimits, boolean z) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(appliedLimits, "appliedLimits");
        Intrinsics.checkNotNullParameter(appliedLimits, "<this>");
        List list = appliedLimits;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((aue.b) next).a() == aue.c.COUNTRY_SPECIFIC_LIMIT) {
                break;
            }
        }
        aue.a aVar = next instanceof aue.a ? (aue.a) next : null;
        Intrinsics.checkNotNullParameter(appliedLimits, "<this>");
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((aue.b) next2).a() == aue.c.UNVERIFIED_CARDS_LIMIT) {
                break;
            }
        }
        aue.a aVar2 = next2 instanceof aue.a ? (aue.a) next2 : null;
        boolean z3 = false;
        if (aVar == null && aVar2 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("None of the required limits were present for unverified card limits bottom sheet");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else if ((aVar != null && aVar2 == null) || (aVar != null && aVar2 != null && aVar.e.compareTo(aVar2.e) < 0)) {
            z3 = true;
        }
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.topup_card_limits_verify_card_prompt_title, null, null, 14), new TextLocalisedClause(z3 ? R$string.topup_card_limits_verify_card_prompt_subtitle_country_group : R$string.topup_card_limits_verify_card_prompt_subtitle, u.c(new TextLocalisedClause(R$string.topup_card_limits_prompt_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "ROLLING_CARD_TOP_UP_LIMIT_DESCRIPTION_LEARN_MORE_ID", false), 10)), null, 12), null, null, false, 28);
        aim.e eVarB = u.b();
        if (z3 && aVar != null) {
            eVarB.add(c(R$string.topup_card_limits_verify_card_prompt_limit_title_country_group, aVar));
        } else if (aVar2 != null) {
            eVarB.add(c(R$string.topup_card_limits_verify_card_prompt_limit_title, aVar2));
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected state when creating input for card rolling limit bottom sheet " + appliedLimits + " " + z);
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
        }
        return new r(new e(false, z ? new TextLocalisedClause(R$string.topup_card_limits_verify_card_prompt_limit_cta_subtitle, null, null, 14) : null, null, new n6(new TextLocalisedClause(z ? R$string.topup_card_limits_verify_card_prompt_limit_cta_title : com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53), u.a(eVarB), aVar3);
    }

    public final y0 d(dj0.d remainingLimit) {
        Intrinsics.checkNotNullParameter(remainingLimit, "remainingLimit");
        return new y0(null, new z(new TextLocalisedClause(R$string.topup_card_limit_reached_prompt_title, null, null, 14), new TextLocalisedClause(R$string.topup_card_limits_limit_reached_with_remainder_prompt_subtitle, u.c(new MoneyClause(remainingLimit, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), new TextLocalisedClause(R$string.topup_card_limits_action_see_limits, null, null, 14), null, null, false, null, null, null, null, null, null, 32724), false, 5);
    }

    public final r e(k limit) {
        dj0.d dVar;
        dj0.d dVar2;
        Intrinsics.checkNotNullParameter(limit, "limit");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_card_limits_prompt_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "UAE_COUNTRY_LIMIT_DESCRIPTION_LEARN_MORE_ID", false), 10);
        j jVar = limit.e;
        if (jVar == null || (dVar = jVar.f9813b) == null) {
            dVar = limit.f9817c;
        }
        dj0.d dVar3 = dVar;
        if (jVar == null || (dVar2 = jVar.f9812a) == null) {
            dVar2 = limit.f9816b;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.topup_card_limits_uae_prompt_title, null, null, 14), jVar != null ? new TextLocalisedClause(R$string.topup_card_limits_uae_account_another_currency_limit_prompt_subtitle, v.k(new MoneyClause(jVar.f9812a, new MoneyClause.Format.Asset(0), null, null, 12), new MoneyClause(limit.f9816b, new MoneyClause.Format.Asset(0), null, null, 12), textLocalisedClause), null, 12) : new TextLocalisedClause(R$string.topup_card_limits_uae_account_limit_prompt_subtitle, v.k(new MoneyClause(limit.f9816b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), textLocalisedClause), null, 12), null, null, false, 28);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("UAE_COUNTRY_LIMIT_INDICATOR_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.topup_card_limits_uae_account_limit_prompt_account_limit, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.topup_card_limits_prompt_limit_remainder, v.k(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, null, false, 60);
        return new r(new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), u.c(model), aVar);
    }

    public final y0 f() {
        return new y0(null, new z(new TextLocalisedClause(R$string.topup_card_limit_reached_prompt_title, null, null, 14), new TextLocalisedClause(R$string.topup_card_limits_prompt_owner_not_confirmed_subtitle, u.c(new TextLocalisedClause(R$string.topup_card_limits_prompt_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "UNABLE_TO_CONFIRM_NAME_LEARN_MORE_ID", false), 10)), null, 12), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5);
    }
}
