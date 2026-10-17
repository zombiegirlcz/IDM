package rg3;

import android.os.Parcelable;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeState;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentConfiguration;
import com.revolut.feature.devicemanagement.api.model.UserDevice;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.junior_core.models.configuration.Links;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.junior_onboarding.impl.R$plurals;
import com.revolut.feature.junior_onboarding.impl.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dej.q3;
import do3.q;
import grl.k9;
import ip0.kg;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import rh8.f0;
import te0.w;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254002a;

    public /* synthetic */ d(int i) {
        this.f254002a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        char c2;
        char c3;
        Object next = null;
        switch (this.f254002a) {
            case 0:
                ChecklistChallenge checklistChallenge = (ChecklistChallenge) obj2;
                return Boolean.valueOf(checklistChallenge == null || (checklistChallenge.f65777c instanceof ChecklistChallengeState.OptIn));
            case 1:
                rg4.n update = (rg4.n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return rg4.n.a(update, null, true, 1);
            case 2:
                rg4.n update2 = (rg4.n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return rg4.n.a(update2, null, false, 1);
            case 3:
                return rg4.n.a((rg4.n) obj2, new Data(null, null, true, 3, null), false, 2);
            case 4:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(Intrinsics.f(it8.f53228a, "ID_PRICING_PLAN_UPGRADE_ITEM"));
            case 5:
                HighlightTileDelegate.Model it9 = (HighlightTileDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f52438a, "ID_PRICING_PLAN_UPGRADE_ITEM"));
            case 6:
                rgf.f update3 = (rgf.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return rgf.f.a(update3, null, null, null, update3.f254150b, null, update3.e, null, null, null, 727);
            case 7:
                rgf.f update4 = (rgf.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return rgf.f.a(update4, null, null, null, update4.f254151c, null, update4.f254152g, null, null, null, 727);
            case 8:
                Map it10 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.values();
            case 9:
                JuniorPlanConfiguration it11 = (JuniorPlanConfiguration) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new qf1.m(new TextLocalisedClause(R$string.junior_widgets_add_new_widget_title, null, null, 14), new TextLocalisedClause(R$string.junior_widgets_add_new_widget_subtitle, v.k(Integer.valueOf(it11.f76899b), Integer.valueOf(it11.d - 1)), null, 12), new TextLocalisedClause(R$string.junior_widgets_add_new_widget_action, null, null, 14), R$drawable.uikit_icn_24_children, null, new qf1.a(new ColorImage(new ColorImage.ColorInteger(-16777216), null)), null, SyslogConstants.LOG_LOCAL6);
            case 10:
                mf8.e it12 = (mf8.e) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f204961a;
            case 11:
                psg.a it13 = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f239484a;
            case 12:
                List configurations = (List) obj2;
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_signup_prompt_accounts_limit_title, null, null, 14);
                CompositeClause compositeClause = new CompositeClause(u.c(new TextLocalisedQuantityClause(R$plurals.rev_u18_signup_prompt_accounts_limit_subtitle, Integer.valueOf(uc0.b.m(configurations)), (List) null, (Style) null, 28)), null, null, null, 14);
                BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D037b", null, null, null, 30));
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.junior_accounts_limit_close, null, null, 14);
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                k9 k9Var = k9.Junior;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, compositeClause, mediaContent, null, textLocalisedClause2, null, finishCommand, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33291953);
            case 13:
                List workflows = (List) obj2;
                Intrinsics.checkNotNullParameter(workflows, "workflows");
                Iterator it14 = workflows.iterator();
                if (it14.hasNext()) {
                    next = it14.next();
                    if (it14.hasNext()) {
                        int i = f0.f254335a[((mh8.g) next).f205429b.ordinal()];
                        if (i == 1) {
                            c2 = 0;
                        } else if (i == 2) {
                            c2 = 2;
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2 = 1;
                        }
                        do {
                            Object next2 = it14.next();
                            int i2 = f0.f254335a[((mh8.g) next2).f205429b.ordinal()];
                            if (i2 == 1) {
                                c3 = 0;
                            } else if (i2 == 2) {
                                c3 = 2;
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                c3 = 1;
                            }
                            if (c2 > c3) {
                                next = next2;
                                c2 = c3;
                            }
                        } while (it14.hasNext());
                    }
                }
                return (mh8.g) next;
            case 14:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                do3.n nVar = (do3.n) pair.f186385a;
                Links links = (Links) pair.f186386b;
                wi0.b.Companion.getClass();
                return new OnboardingTerms(w.S(nVar, wi0.b.f297770q3), q.y(nVar), links);
            case 15:
                rhg.j update5 = (rhg.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return rhg.j.a(update5, null, new TravelMilesSearchAppliedFilters(0), 1);
            case 16:
                rhg.j update6 = (rhg.j) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return rhg.j.a(update6, null, TravelMilesSearchAppliedFilters.a(update6.f254453b, null, null, null, null, h0.f322473a, null, 47), 1);
            case 17:
                rhg.j update7 = (rhg.j) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return rhg.j.a(update7, null, TravelMilesSearchAppliedFilters.a(update7.f254453b, null, null, null, null, null, h0.f322473a, 31), 1);
            case 18:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 4);
                for (int i3 = 0; i3 < 4; i3++) {
                    arrayListP.add(t61.a.o("STOPS_SECTION_LOADING_ID_", i3, pb0.Companion, false, 4));
                }
                ArrayList arrayListG = yp0.b.g(arrayListP, rhg.w.d(), null, 0, 0, 126);
                ArrayList arrayList = new ArrayList(4);
                for (int i5 = 0; i5 < 4; i5++) {
                    arrayList.add(t61.a.o("CABIN_SECTION_LOADING_ID_", i5, pb0.Companion, false, 4));
                }
                return zhm.w.u(v.k(arrayListG, yp0.b.g(arrayList, rhg.w.a(), null, 0, 0, 126)));
            case 19:
                od0.i optionalTradingAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalTradingAccount, "optionalTradingAccount");
                TradingAccount tradingAccount = (TradingAccount) optionalTradingAccount.f224257a;
                if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa)) {
                    if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) && !(tradingAccount instanceof TradingAccount.GIA) && !(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                        if (tradingAccount == null) {
                            throw new IllegalStateException("Account not found for portfolio id.");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(("Account with id " + tradingAccount.getF105262a() + " is not tax advantage account.").toString());
                }
                return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_isa_withdrawal_title, null, null, 14);
            case 20:
                Map subscriptionsByDevice = (Map) obj2;
                Intrinsics.checkNotNullParameter(subscriptionsByDevice, "subscriptionsByDevice");
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(subscriptionsByDevice.size()));
                for (Map.Entry entry : subscriptionsByDevice.entrySet()) {
                    linkedHashMap.put(new q3((UserDevice) entry.getKey()), entry.getValue());
                }
                return linkedHashMap;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                kg kgVar = new kg("0", 14);
                yp0.b.l(kgVar, 0, 0, 0, 0, null, false, 63);
                kg kgVar2 = new kg("1", 14);
                yp0.b.l(kgVar2, 0, 0, 0, 0, null, false, 63);
                kg kgVar3 = new kg("2", 14);
                yp0.b.l(kgVar3, 0, 0, 0, 0, null, false, 63);
                return v.k(kgVar, kgVar2, kgVar3);
            case 22:
                kha.d it15 = (kha.d) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it15);
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 24:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.FALSE;
            case 25:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var2);
                return Boolean.FALSE;
            case 26:
                ri4.e updateState = (ri4.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ri4.e.a(updateState, new Data(null, null, true, 3, null), null, 2);
            case 27:
                SpousalConsentPartnerScreenConfig spousalConsentPartnerScreenConfig = (SpousalConsentPartnerScreenConfig) obj2;
                return new GiveConsentConfiguration(spousalConsentPartnerScreenConfig.f66424a, spousalConsentPartnerScreenConfig.f66425b, spousalConsentPartnerScreenConfig.f66426c, spousalConsentPartnerScreenConfig.d);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0Var = new pb0("LOADING_ITEM_ID_1");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                List listC = u.c(pb0Var);
                List listK = v.k(new pb0("LOADING_ITEM_ID_2"), new pb0("LOADING_ITEM_ID_3"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                List listO = i2b.a.o(listC, listK);
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new ri4.j(textClause, null, null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listO, false, false);
            default:
                CellDetailsActionDelegate.Model it16 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceCoverageInfoScreen.c0;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj3 = it16.f51787l;
                if (obj3 instanceof String) {
                    return (String) obj3;
                }
                return null;
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f254002a = i;
    }
}
