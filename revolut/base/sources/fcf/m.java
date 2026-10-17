package fcf;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.trading_add_ons.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements k {
    public static LargeActionButtonDelegate.Model a(TextLocalisedClause textLocalisedClause) {
        return new LargeActionButtonDelegate.Model("ADD_ON_SUBSCRIPTION_CONFIRMATION_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, false, null, null, null, null, 1000);
    }

    public static RowDelegate.Model b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new RowDelegate.Model("ADD_ON_DESCRIPTION_ID", null, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
    }

    public static Object c(lbf.c cVar) {
        int i = l.f133741a[cVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.price_plan_add_ons_add_on_period_year_long, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.price_plan_add_ons_add_on_period_month_long, null, null, 14);
        }
        if (i == 3) {
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final y d(i payload) {
        TextLocalisedClause textLocalisedClause;
        int i;
        j jVar;
        int i2;
        t tVar;
        TextLocalisedClause textLocalisedClause2;
        int i3;
        lbf.c cVar;
        ListCellDelegate.Model model;
        TextLocalisedClause textLocalisedClause3;
        Object textLocalisedClause4;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof f) {
            f fVar = (f) payload;
            dj0.d dVar = fVar.f133731b;
            t tVar2 = new t(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_title_trading_pro, null, null, 14), null, null, 30);
            Period period = fVar.f133732c;
            j jVar2 = fVar.d;
            int i5 = jVar2.f133739a;
            lbf.c cVar2 = fVar.f133730a;
            List listC = u.c(b(period != null ? new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_eea_trial_description, v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar2)), null, 12) : new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_eea_no_trial_description, v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar2)), null, 12), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_subtitle, u.c(c(cVar2)), null, 12)));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            List list = listC;
            List listC2 = u.c(period != null ? new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_eea, u.c(new TextLocalisedClause(i5, null, new Click(28, (Integer) null, (Object) jVar2.f133740b, "ADD_ON_TPRO_TERMS_LINK_ID", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), "ADD_ON_DESCRIPTION_TERMS_ID") : new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_eea_no_trial, u.c(new TextLocalisedClause(i5, null, new Click(28, (Integer) null, (Object) jVar2.f133740b, "ADD_ON_TPRO_TERMS_LINK_ID", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), "ADD_ON_DESCRIPTION_TERMS_ID"));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            ArrayList arrayListE0 = d0.E0(listC2, list);
            LargeActionButtonDelegate.Model modelA = a(period != null ? new TextLocalisedClause(R$string.price_plan_add_ons_add_on_start_button, u.c(String.valueOf(period.getDays())), null, 12) : new TextLocalisedClause(R$string.price_plan_add_ons_add_on_start_button_no_trial, v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar2)), null, 12));
            yp0.b.l(modelA, R$attr.uikit_dp72, 0, 0, 0, null, false, 62);
            return new y(d0.F0(modelA, arrayListE0), tVar2, rp0.l.WINDOW, null, null, null, 1016);
        }
        if (!(payload instanceof h)) {
            if (!(payload instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            g gVar = (g) payload;
            dj0.d dVar2 = gVar.f133734b;
            Period period2 = gVar.f133735c;
            t tVar3 = new t(new TextLocalisedClause(R$string.price_plan_add_ons_add_on_title_trading_pro, null, null, 14), null, null, 30);
            lbf.c cVar3 = gVar.f133733a;
            if (period2 != null) {
                i = 12;
                textLocalisedClause = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_uk_title_monthly_freeTrial, v.k(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar3)), null, 12);
            } else {
                i = 12;
                textLocalisedClause = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_uk_no_trial_description, v.k(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar3)), null, 12);
            }
            List listC3 = u.c(b(textLocalisedClause, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_subtitle, u.c(c(cVar3)), null, i)));
            yp0.b.k(listC3, 0, 0, 0, 0, 31);
            int i6 = R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_uk;
            j jVar3 = gVar.d;
            List listC4 = u.c(new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(i6, u.c(new TextLocalisedClause(jVar3.f133739a, null, new Click(28, (Integer) null, (Object) jVar3.f133740b, "ADD_ON_TPRO_TERMS_LINK_ID", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), "ADD_ON_DESCRIPTION_TERMS_ID"));
            yp0.b.k(listC4, 0, 0, 0, 0, 31);
            ArrayList arrayListE02 = d0.E0(listC4, listC3);
            LargeActionButtonDelegate.Model modelA2 = a(period2 != null ? new TextLocalisedClause(R$string.price_plan_add_ons_add_on_start_button, u.c(String.valueOf(period2.getDays())), null, 12) : new TextLocalisedClause(R$string.price_plan_add_ons_add_on_start_button_no_trial, v.k(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar3)), null, 12));
            yp0.b.l(modelA2, R$attr.uikit_dp72, 0, 0, 0, null, false, 62);
            return new y(d0.F0(modelA2, arrayListE02), tVar3, rp0.l.WINDOW, null, null, null, 1016);
        }
        h hVar = (h) payload;
        dj0.d dVar3 = hVar.f133737b;
        Period period3 = hVar.f;
        Terms terms = hVar.e;
        j jVar4 = hVar.d;
        int i21 = jVar4.f133739a;
        j jVar5 = hVar.f133738c;
        int i22 = jVar5.f133739a;
        lbf.c cVar4 = hVar.f133736a;
        t tVar4 = new t(period3 != null ? new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_title_us_trial, u.c(Integer.valueOf(period3.getDays())), null, 12) : new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_title_us_no_trial, null, null, 14), null, null, 30);
        if (period3 != null) {
            tVar = tVar4;
            i2 = i22;
            jVar = jVar5;
            i3 = 12;
            textLocalisedClause2 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_us_trial_description, v.k(Integer.valueOf(period3.getDays()), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar4)), null, 12);
        } else {
            jVar = jVar5;
            i2 = i22;
            tVar = tVar4;
            i3 = 12;
            textLocalisedClause2 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_us_no_trial_description, v.k(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), c(cVar4)), null, 12);
        }
        List listC5 = u.c(b(textLocalisedClause2, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_subtitle, u.c(c(cVar4)), null, i3)));
        yp0.b.k(listC5, 0, 0, 0, 0, 31);
        List list2 = listC5;
        if (period3 != null) {
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_title_us_trial, null, new Custom(null, false, db.BODY2, false, null, Constants.TAG_FB_CHARGING_STATUS), 10);
            int i32 = R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_us_trial;
            MoneyClause moneyClause = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            String strValueOf = String.valueOf(period3.getDays());
            String str = strValueOf == null ? "" : strValueOf;
            String strValueOf2 = String.valueOf(period3.getDays());
            String str2 = strValueOf2 == null ? "" : strValueOf2;
            String strValueOf3 = String.valueOf(period3.getDays());
            String str3 = strValueOf3 == null ? "" : strValueOf3;
            MoneyClause moneyClause2 = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) jVar.f133740b, "ADD_ON_TPRO_TERMS_LINK_ID", false), 10);
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(i21, null, new Click(28, (Integer) null, (Object) jVar4.f133740b, "ADD_ON_REV_TERMS_LINK_ID", false), 10);
            TextClause textClause = new TextClause(terms.f90359h, (Style) new Click(28, (Integer) null, (Object) terms.f90357c, "ADD_ON_CARDHOLDER_TERMS_LINK_ID", false), (Integer) null, false, (o9) null, (List) null, 124);
            String strValueOf4 = String.valueOf(period3.getDays());
            model = new ListCellDelegate.Model("ADD_ON_DESCRIPTION_TERMS_TITLE_ID", null, textLocalisedClause5, new TextLocalisedClause(i32, v.k(moneyClause, str, str2, str3, moneyClause2, textLocalisedClause6, textLocalisedClause7, textClause, strValueOf4 == null ? "" : strValueOf4), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, null, null, 0, 0, 0, 0, 4064);
            cVar = cVar4;
        } else {
            cVar = cVar4;
            model = new ListCellDelegate.Model("ADD_ON_DESCRIPTION_TERMS_TITLE_ID", null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_title_us_no_trial, null, new Custom(null, false, db.BODY2, false, null, Constants.TAG_FB_CHARGING_STATUS), 10), new TextLocalisedClause(R$string.price_plan_add_ons_add_on_subscription_confirmation_terms_us_no_trial, v.k(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) jVar.f133740b, "ADD_ON_TPRO_TERMS_LINK_ID", false), 10), new TextLocalisedClause(i21, null, new Click(28, (Integer) null, (Object) jVar4.f133740b, "ADD_ON_REV_TERMS_LINK_ID", false), 10), new TextClause(terms.f90359h, (Style) new Click(28, (Integer) null, (Object) terms.f90357c, "ADD_ON_CARDHOLDER_TERMS_LINK_ID", false), (Integer) null, false, (o9) null, (List) null, 124)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, null, null, 0, 0, 0, 0, 4064);
        }
        List listC6 = u.c(model);
        yp0.b.k(listC6, 0, 0, 0, 0, 31);
        ArrayList arrayListE03 = d0.E0(listC6, list2);
        if (period3 != null) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_start_button, u.c(String.valueOf(period3.getDays())), null, 12);
        } else {
            int i33 = R$string.price_plan_add_ons_add_on_start_button_no_trial;
            MoneyClause moneyClause3 = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            int i43 = l.f133741a[cVar.ordinal()];
            if (i43 == 1) {
                textLocalisedClause4 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_period_year_short, null, null, 14);
            } else if (i43 == 2) {
                textLocalisedClause4 = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_period_month_short, null, null, 14);
            } else {
                if (i43 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause4 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            textLocalisedClause3 = new TextLocalisedClause(i33, v.k(moneyClause3, textLocalisedClause4), null, 12);
        }
        LargeActionButtonDelegate.Model modelA3 = a(textLocalisedClause3);
        yp0.b.l(modelA3, R$attr.uikit_dp72, 0, 0, 0, null, false, 62);
        return new y(d0.F0(modelA3, arrayListE03), tVar, rp0.l.WINDOW, null, null, null, 1016);
    }
}
