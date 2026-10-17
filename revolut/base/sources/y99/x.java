package y99;

import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.feature.onboarding.api.missinginfo.MissingInfoDestination;
import com.revolut.feature.onboarding.api.missinginfo.code.uscodes.UsIdentificationNumbersContract$Configuration;
import com.revolut.feature.referrals.code.data.api.ReferrerDetailsState;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelButtonParams;
import com.revolut.feature.remote_stories.models.params.RemoteStoryModelParams;
import com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.pcw_auth.impl.stories.PigeonOnboardingStoriesKey;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import retrofit2.Response;
import yhm.m;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311808a;

    public /* synthetic */ x(int i) {
        this.f311808a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        ba6.q qVar;
        ba6.p pVar;
        boolean z;
        RepaymentSource jointAccount;
        switch (this.f311808a) {
            case 0:
                m89.a step = (m89.a) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                switch (a0.f311764a[step.ordinal()]) {
                    case 1:
                        rfm.u uVarG = efm.k.g(vhi.c.a(new MissingInfoDestination.OccupationChooser(null), 4));
                        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                        return uVarG;
                    case 2:
                        rfm.u uVarG2 = efm.k.g(new FragmentNavigateCommand(a.f311761a, new UsIdentificationNumbersContract$Configuration(6), false, 2044));
                        Intrinsics.checkNotNullExpressionValue(uVarG2, "just(...)");
                        return uVarG2;
                    case 3:
                        rfm.u uVarG3 = efm.k.g(new FeatureCommand(TaxResidencyFeatureConfig.TaxResidencyMissingInfo.f89983a));
                        Intrinsics.checkNotNullExpressionValue(uVarG3, "just(...)");
                        return uVarG3;
                    case 4:
                        rfm.u uVarG4 = efm.k.g(new FragmentNavigateCommand(a.f311762b, null, false, 2046));
                        Intrinsics.checkNotNullExpressionValue(uVarG4, "just(...)");
                        return uVarG4;
                    case 5:
                        rfm.u uVarG5 = efm.k.g(vhi.c.a(new MissingInfoDestination.PurposeOfAccount(null), 4));
                        Intrinsics.checkNotNullExpressionValue(uVarG5, "just(...)");
                        return uVarG5;
                    case 6:
                        rfm.u uVarG6 = efm.k.g(new FragmentNavigateCommand(a.f311763c, null, false, 2046));
                        Intrinsics.checkNotNullExpressionValue(uVarG6, "just(...)");
                        return uVarG6;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                aim.e eVarB = zhm.u.b();
                int i = R$attr.uikit_dp8;
                eVarB.add(new ip0.c0("ACTIONS_LOADING_ID", u.b.f54794a, i, i, 48));
                ArrayList arrayList = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(nb0.b(pb0.Companion, "ROWS_LOADING_ID", false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                zhm.a0.x(arrayList, eVarB);
                s7 s7Var = new s7("CELL_DETAILS_LOADING", 0, 0, 0, 0, false, null, 94);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(s7Var);
                return new y9a.o(zhm.u.a(eVarB));
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.TRUE;
            case 3:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.TRUE;
            case 4:
                od0.i it11 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (z95.b) it11.c();
            case 5:
                z95.b it12 = (z95.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                PigeonOnboardingStoriesKey pigeonOnboardingStoriesKey = PigeonOnboardingStoriesKey.APP_PCW_ONBOARDING_STORY_US;
                PigeonOnboardingStoriesKey.Companion aVar = PigeonOnboardingStoriesKey.INSTANCE;
                String name = it12.f320309a;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                return new FeatureCommand(new RemoteStoriesFeatureConfig.Key(pigeonOnboardingStoriesKey, q0.c(new Pair("firstName", name)), null, null, null, new RemoteStoryModelParams(new RemoteStoryModelButtonParams((tza.a) null, 1), new RemoteStoryModelButtonParams(tza.a.BLACK, DummyCommand.f98635a), false, 16), 0, 6972));
            case 6:
                ya2.e update = (ya2.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ya2.e.a(update, null, null, true, 3);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new ya5.e((CreditPostTerminationPlanDetails) pair.f186385a, (dj0.d) pair.f186386b);
            case 8:
                CreditPostTerminationPlanDetails it13 = (CreditPostTerminationPlanDetails) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.i;
            case 9:
                va6.f campaigns = (va6.f) obj2;
                Intrinsics.checkNotNullParameter(campaigns, "campaigns");
                List<va6.e> activeCampaigns = campaigns.getActiveCampaigns();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(activeCampaigns, 10));
                for (va6.e eVar : activeCampaigns) {
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    String id10 = eVar.getId();
                    String type = eVar.getType();
                    ba6.q[] qVarArrValues = ba6.q.values();
                    int length = qVarArrValues.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            qVar = qVarArrValues[i3];
                            if (!kotlin.text.a0.z(qVar.name(), type, true)) {
                                i3++;
                            }
                        } else {
                            qVar = null;
                        }
                    }
                    if (qVar == null) {
                        qVar = ba6.q.UNKNOWN;
                    }
                    ba6.q qVar2 = qVar;
                    va6.b cardDesign = eVar.getCardDesign();
                    Intrinsics.checkNotNullParameter(cardDesign, "<this>");
                    ba6.n nVar = new ba6.n(new b93.b(cardDesign.getCode()), cardDesign.getUrl());
                    String status = eVar.getStatus();
                    ba6.p[] pVarArrValues = ba6.p.values();
                    int length2 = pVarArrValues.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length2) {
                            pVar = pVarArrValues[i5];
                            if (!kotlin.text.a0.z(pVar.name(), status, true)) {
                                i5++;
                            }
                        } else {
                            pVar = null;
                        }
                    }
                    if (pVar == null) {
                        pVar = ba6.p.UNKNOWN;
                    }
                    ba6.p pVar2 = pVar;
                    List minDonationsToUnlock = eVar.getMinDonationsToUnlock();
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(minDonationsToUnlock, 10));
                    Iterator it14 = minDonationsToUnlock.iterator();
                    while (it14.hasNext()) {
                        arrayList3.add(mo3.a.o((jo3.a) it14.next()));
                    }
                    arrayList2.add(new ba6.r(id10, qVar2, nVar, pVar2, arrayList3));
                }
                return arrayList2;
            case 10:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it15 = list2.iterator();
                while (it15.hasNext()) {
                    arrayList4.add(x5d.b.z((va6.c) it15.next()));
                }
                return arrayList4;
            case 11:
                va6.c dto = (va6.c) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                return zhm.u.c(x5d.b.z(dto));
            case 12:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (za6.b) zhm.d0.b0(it16);
            case 13:
                va6.d it17 = (va6.d) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Intrinsics.checkNotNullParameter(it17, "<this>");
                return new ba6.h(it17.getTotalDonors(), mo3.a.o(it17.getTotalDonation()));
            case 14:
                List<va6.k> it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Intrinsics.checkNotNullParameter(it18, "<this>");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (va6.k kVar : it18) {
                    String currency = kVar.getCurrency();
                    Object objO = linkedHashMap.get(currency);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, currency);
                    }
                    ((List) objO).add(kVar.getAmount());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), (List) zhm.d0.b0((List) entry.getValue()));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String upperCase = ((String) entry2.getKey()).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    linkedHashMap3.put(upperCase, entry2.getValue());
                }
                return linkedHashMap3;
            case 15:
                va6.g it19 = (va6.g) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return zhm.u.c(ta6.a.M(it19));
            case 16:
                Response it20 = (Response) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (it20.isSuccessful()) {
                    return it20.code() == 202 ? ba6.g0.PENDING : ba6.g0.PROCESSED;
                }
                throw new HttpException(it20);
            case 17:
                od0.i it21 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                Set set = (Set) it21.f224257a;
                return set == null ? h0.f322473a : set;
            case 18:
                yai.k it22 = (yai.k) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f312032a;
            case 19:
                return yai.k.a((yai.k) obj2, null, null, false, new ReferrerDetailsState.Enabled(null), null, 47);
            case 20:
                yb0.d state = (yb0.d) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return state.f312144b;
            case 21:
                return yb0.d.a((yb0.d) obj2, null, null, new Data(null, null, true, 3, null), null, 11);
            case 22:
                return yb0.d.a((yb0.d) obj2, null, null, new Data(Unit.f186387a, null, false, 6, null), null, 11);
            case 23:
                yb0.d update2 = (yb0.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yb0.d.a(update2, null, null, null, null, 7);
            case 24:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 25:
                v9l.a sharedTransaction = (v9l.a) obj2;
                Intrinsics.checkNotNullParameter(sharedTransaction, "sharedTransaction");
                return sharedTransaction;
            case 26:
                CreditCardAutopayConfig config = (CreditCardAutopayConfig) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList arrayList5 = config.f70693a;
                if (arrayList5.isEmpty()) {
                    z = false;
                } else {
                    Iterator it23 = arrayList5.iterator();
                    while (it23.hasNext()) {
                        if (!(((CreditCardAutopayType) it23.next()) instanceof CreditCardAutopayType.Unsupported)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                Throwable it24 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.FALSE;
            case 28:
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                ArrayList<BalanceWrapper> arrayList6 = new ArrayList();
                Iterator it25 = groups.iterator();
                while (it25.hasNext()) {
                    zhm.a0.x(((k1j.b) it25.next()).f180284c, arrayList6);
                }
                ArrayList arrayList7 = new ArrayList();
                for (BalanceWrapper balanceWrapper : arrayList6) {
                    balanceWrapper.getClass();
                    Long l2 = balanceWrapper.f99405b;
                    String str = balanceWrapper.f99404a;
                    int i6 = yb5.a.f312191a[balanceWrapper.getF99407g().ordinal()];
                    if (i6 == 1) {
                        jointAccount = new RepaymentSource.JointAccount(str, balanceWrapper.getF99406c(), l2 != null ? new dj0.d(l2.longValue(), balanceWrapper.getF99406c()) : null, new TextLocalisedClause(R$string.credit_card_auto_pay_source_joint, null, null, 14));
                    } else if (i6 == 2) {
                        jointAccount = new RepaymentSource.Pocket(str, balanceWrapper.getF99406c(), l2 != null ? new dj0.d(l2.longValue(), balanceWrapper.getF99406c()) : null, new TextLocalisedClause(R$string.credit_card_auto_pay_source_personal, null, null, 14));
                    } else {
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            throw new IllegalStateException("Unexpected balance type: " + balanceWrapper.getF99407g());
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                            if (thA != null) {
                                hx7.e.n(thA);
                            }
                            jointAccount = null;
                        }
                    }
                    if (jointAccount != null) {
                        arrayList7.add(jointAccount);
                    }
                }
                return arrayList7;
            default:
                Function0 it26 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return iii.c.c(3);
        }
    }

    public /* synthetic */ x(Object obj2, int i) {
        this.f311808a = i;
    }
}
