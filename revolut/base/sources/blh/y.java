package blh;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_savings.impl.R$string;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeOnboarding;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.impl.ui.card_pin.card_pin.CardPINFlowContract$Step;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16699a;

    public /* synthetic */ y(int i) {
        this.f16699a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f16699a) {
            case 0:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Iterator it8 = accounts.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (next instanceof WealthAccount.Securities) {
                            obj3 = next;
                        }
                    }
                }
                WealthAccount.Securities securities = (WealthAccount.Securities) obj3;
                return Boolean.valueOf(securities != null && securities.available());
            case 1:
                List accounts2 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                Iterator it9 = accounts2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        if (next2 instanceof WealthAccount.Securities) {
                            obj3 = next2;
                        }
                    }
                }
                WealthAccount.Securities securities2 = (WealthAccount.Securities) obj3;
                return Boolean.valueOf(securities2 != null && securities2.available());
            case 2:
                ybl.g it10 = (ybl.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10.a(zhm.v.k(cfl.p.PRIVATE_MARKETS, cfl.p.PRIVATE_BANK)));
            case 3:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : instruments) {
                    nel.n nVar = (nel.n) obj4;
                    if (io3.h.l(nVar.f214597c) && nVar.f.d) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 4:
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return Boolean.valueOf(j.a(instrument) && instrument.f214597c == nel.z.MUTUAL_FUND);
            case 5:
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return Boolean.TRUE;
            case 6:
                List accounts3 = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts3, "accounts");
                Iterator it11 = accounts3.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next3 = it11.next();
                        if (next3 instanceof WealthAccount.Securities) {
                            obj3 = next3;
                        }
                    }
                }
                WealthAccount.Securities securities3 = (WealthAccount.Securities) obj3;
                return Boolean.valueOf(securities3 != null && securities3.available());
            case 7:
                blj.h update = (blj.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return blj.h.a(update, null, new Data(null, null, true, 3, null), null, 5);
            case 8:
                return Boolean.valueOf(((FlowStep) obj2) instanceof CardPINFlowContract$Step.EnterCardNumber);
            case 9:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new wla.b((do3.n) pair.f186385a, (List) pair.f186386b);
            case 10:
                List challengeOnboardingList = (List) obj2;
                Intrinsics.checkNotNullParameter(challengeOnboardingList, "challengeOnboardingList");
                SavingsChallengeOnboarding savingsChallengeOnboarding = (SavingsChallengeOnboarding) zhm.d0.d0(challengeOnboardingList);
                od0.i.Companion.getClass();
                return od0.h.a(savingsChallengeOnboarding);
            case 11:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 12:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new bmb.r((List) getDefaultLoadingItems.invoke(), bmb.p.f16799a);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.a(nb0Var, "ID_PHONE_NUMBER_ACTIVE_UNTIL", false, 6), nb0.a(nb0Var, "ID_PHONE_NUMBER_PARTIAL_REFUND", false, 6), nb0.a(nb0Var, "ID_PHONE_NUMBER_PLAN_PRICE", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 15:
                od0.i.Companion.getClass();
                return od0.h.a((iha.h) obj2);
            case 16:
                PersistedBackground it12 = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f63743a.f63741a;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return r0.g();
            case 18:
                return null;
            case 19:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (CreditCard) zhm.d0.b0(it13);
            case 20:
                CreditCard creditCard = (CreditCard) obj2;
                Intrinsics.checkNotNullParameter(creditCard, "creditCard");
                String facilityId = creditCard.f69792a;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return new FeatureCommand(new CreditCardKompotFeatureConfig.Topup(facilityId));
            case 21:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return ((yw4.p) zhm.d0.b0(it14)).f317326b;
            case 22:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (yw4.p) zhm.d0.b0(it15);
            case 23:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return ((yw4.p) zhm.d0.b0(it16)).f317325a;
            case 24:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                Iterator it17 = facilities.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        Object next4 = it17.next();
                        if (((yw4.p) next4).i == yw4.h.SECURED) {
                            obj3 = next4;
                        }
                    }
                }
                return (yw4.p) obj3;
            case 25:
                yhm.r rVar = (yhm.r) obj2;
                List<rcd.a> list = (List) rVar.f314201a;
                Map map = (Map) rVar.f314202b;
                String str = (String) rVar.f314203c;
                if (Intrinsics.f(str, "")) {
                    return zhm.f0.f322471a;
                }
                ArrayList<Pair> arrayList2 = new ArrayList();
                for (rcd.a aVar : list) {
                    JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) map.get(aVar.f253251b);
                    Pair pair2 = juniorBankingProfile != null ? new Pair(juniorBankingProfile, aVar) : null;
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (Pair pair3 : arrayList2) {
                    JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) pair3.f186385a;
                    rcd.a aVar2 = (rcd.a) pair3.f186386b;
                    arrayList3.add(new ActionWidgetDelegate.Model(aVar2.f253250a, new TextLocalisedClause(R$string.junior_saving_request_pending_action_review_card_title, null, null, 14), new TextLocalisedClause(R$string.junior_saving_request_pending_action_review_card_message, zhm.u.c(juniorBankingProfile2.f77099b), null, 12), new com.revolut.core.ui_kit.delegates.m(new ContactImage(juniorBankingProfile2.f77103j, (String) null, (String) null, (String) null, (String) null, ta6.a.t(juniorBankingProfile2), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), (LayeredImage) null, (ProgressStyle) null, 6), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.junior_saving_request_pending_action_review_card_action, null, null, 14), null, false), null, new bn8.a(aVar2, str), null, false, 8016));
                }
                return arrayList3;
            case 26:
                return Boolean.valueOf(((Map) obj2).containsValue(Boolean.TRUE));
            case 27:
                xi0.b it18 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new CurrencyImage(it18.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            case 28:
                xi0.b it19 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return new CurrencyImage(it19.f306286a, new ImageTransformations(null, HexagonalTransformation.f60062a, null, null, null, null, null, ISO781611.SMT_TAG), (TextLocalisedClause) null, 10);
            default:
                do3.n it20 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20.f116415m == do3.s.LOCKED);
        }
    }

    public /* synthetic */ y(Object obj2, int i) {
        this.f16699a = i;
    }
}
