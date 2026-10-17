package vx9;

import android.os.Parcelable;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.google.gson.reflect.TypeToken;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.data.utils.gson.GsonHolder;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.checkout.models.PreorderPlanResult;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$Step;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.ContactsSyncOnboardingDescriptor$LaunchMode;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.OnboardingContactSyncFlowContract$Step;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rewards.api.navigation.RentAndBillsSelectPaymentDestination;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.support.impl.transfer_tracker.ui.InboundTransferTrackerFlowContract$Step;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalitiesInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalityInput;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Operation;
import com.youTransactor.uCube.rpc.Constants;
import ft3.h1;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kjk.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.joda.time.DateTime;
import rp0.m;
import vkm.j2;
import vy5.p0;
import wed.f0;
import wmk.b;
import wmk.l;
import wp9.b0;
import wp9.g0;
import zh9.u0;
import zhm.d0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f292889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f292890c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v(int i, Serializable serializable, Object obj2, Object obj3) {
        this.f292888a = i;
        this.f292890c = obj2;
        this.f292889b = obj3;
        this.d = serializable;
    }

    private final Object a(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        j0 j0Var;
        wmk.f fVar = (wmk.f) this.f292890c;
        hha.d currentPlan = (hha.d) this.d;
        PricingPlanOfferPeriod offer = (PricingPlanOfferPeriod) this.f292889b;
        wmk.l result = (wmk.l) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.f(result, l.a.f298697a)) {
            fVar.f298690m.getClass();
            Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
            Intrinsics.checkNotNullParameter(offer, "offer");
            if (offer instanceof PricingPlanOfferPeriod.Discount) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.plan_downgrade_discount_pitch_offer_kept_title, zhm.u.c(dok.g.d(currentPlan, null)), null, 12);
                int i = R$string.plan_downgrade_discount_pitch_offer_kept_subtitle;
                PricingPlanOfferPeriod.Discount discount = (PricingPlanOfferPeriod.Discount) offer;
                MoneyClause moneyClause = new MoneyClause(discount.f102843c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                long jR = oi0.d.R(discount.f102842b);
                TimeClause.Format.INSTANCE.getClass();
                j0Var = new j0((Clause) textLocalisedClause2, (Clause) new TextLocalisedClause(i, zhm.v.k(moneyClause, new TimeClause(jR, TimeClause.Format.f57959a, null, null, 12)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            } else {
                if (!(offer instanceof PricingPlanOfferPeriod.FreeTrial)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.plan_downgrade_free_trial_pitch_offer_kept_title, zhm.u.c(dok.g.d(currentPlan, null)), null, 12);
                LocalDateTime localDateTime = ((PricingPlanOfferPeriod.FreeTrial) offer).f102845b;
                if (localDateTime != null) {
                    int i2 = R$string.plan_downgrade_free_trial_pitch_offer_kept_subtitle;
                    Clause clauseD = dok.g.d(currentPlan, null);
                    long jR2 = oi0.d.R(localDateTime);
                    TimeClause.Format.INSTANCE.getClass();
                    textLocalisedClause = new TextLocalisedClause(i2, zhm.v.k(clauseD, new TimeClause(jR2, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                } else {
                    textLocalisedClause = null;
                }
                j0Var = new j0((Clause) textLocalisedClause3, (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            }
            yji.n.j2(fVar, fVar.L2(new y0(null, j0Var, false, 5)), null, new wmk.d(fVar, null), 3);
        } else {
            if (!Intrinsics.f(result, l.b.f298698a)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.o.k(b.a.c.f298684a);
        }
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        SplitBillsSummaryScreen splitBillsSummaryScreen = (SplitBillsSummaryScreen) this.f292890c;
        g0 g0Var = (g0) this.d;
        MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) this.f292889b;
        String newAmount = (String) obj2;
        KProperty[] kPropertyArr = SplitBillsSummaryScreen.Z;
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        splitBillsSummaryScreen.P.onNext(new wp9.p(g0Var, newAmount, maskedTextInputEditText.hasFocus()));
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[EDGE_INSN: B:41:0x00a5->B:25:0x00a5 BREAK  A[LOOP:0: B:20:0x008b->B:43:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx9.v.c(java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2) {
        Object next;
        com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = (com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c) this.f292890c;
        g0 parcel = (g0) this.d;
        cp9.a splitType = (cp9.a) this.f292889b;
        wp9.v update = (wp9.v) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        yp9.e eVar = cVar.o;
        b0 previousDistribution = ((wp9.v) ((j2) cVar.z.f22677a).getValue()).f299203b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(previousDistribution, "previousDistribution");
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        ArrayList arrayList = yp9.e.c(previousDistribution).f8125a;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(parcel.f299182a, ((ap9.g) next).f8127a)) {
                break;
            }
        }
        ap9.g gVar = (ap9.g) next;
        if (gVar == null) {
            throw new IllegalStateException();
        }
        ap9.g gVarA = ap9.g.a(gVar, 0L, !gVar.d, 7);
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (Object obj3 : arrayList) {
            if (Intrinsics.f(((ap9.g) obj3).f8127a, gVarA.f8127a)) {
                obj3 = gVarA;
            }
            arrayList2.add(obj3);
        }
        return wp9.v.a(update, null, eVar.b(arrayList2, splitType), null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        LinkedHashMap linkedHashMap;
        jq9.p pVar;
        zm3.j jVar;
        zm3.k kVarValueOf;
        Data data;
        Data data2;
        NationalitiesInput nationalitiesInput;
        LargeActionButtonDelegate.Model model;
        zcj.c cVar;
        List list;
        List listE;
        boolean zK;
        Pair pair;
        int i = this.f292888a;
        int i2 = 22;
        int i3 = 27;
        int i5 = 0;
        Object obj3 = this.d;
        Object obj4 = this.f292889b;
        Object obj5 = this.f292890c;
        switch (i) {
            case 0:
                z zVar = (z) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                List list2 = (List) obj4;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Set set = (Set) pair2.f186385a;
                String strK = do3.q.k((do3.n) pair2.f186386b);
                if (strK == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List list3 = list2;
                int iB = q0.b(zhm.w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                for (Object obj6 : list3) {
                    linkedHashMap2.put(((zm3.j) obj6).f, obj6);
                }
                ArrayList<ux9.s> arrayList2 = new ArrayList();
                for (Object obj7 : arrayList) {
                    if (obj7 instanceof ux9.s) {
                        arrayList2.add(obj7);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (ux9.s sVar : arrayList2) {
                    String str2 = sVar.f283948b;
                    String str3 = sVar.f283949c;
                    String str4 = sVar.d;
                    String str5 = sVar.e;
                    String str6 = sVar.f;
                    String str7 = sVar.f283950g;
                    String str8 = sVar.f283951h;
                    String str9 = sVar.i;
                    do3.b bVar = sVar.f283952j;
                    jq9.b bVar2 = sVar.k;
                    zm3.j jVar2 = (zm3.j) linkedHashMap2.get(str2);
                    if (jVar2 != null) {
                        if (str7 == null) {
                            str7 = jVar2.f323363h;
                        }
                        jVar = zm3.j.e(jVar2, null, null, str7, bVar, 0L, 0, 7807);
                    } else {
                        boolean z = (str9 == null || str9.length() == 0) && (str5 == null || str5.length() == 0 || str6 == null || str6.length() == 0);
                        if (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0 || z || str7 == null || str7.length() == 0) {
                            jVar = null;
                        } else {
                            if (!(bVar2 instanceof jq9.j) || ((jq9.j) bVar2).f177504a.y0 == null) {
                                boolean z3 = bVar2 instanceof jq9.g;
                                if (z3 && str8 != null) {
                                    kVarValueOf = zm3.k.valueOf(str8);
                                } else if (z3 && set.contains(str2)) {
                                    kVarValueOf = zm3.k.JUNIOR;
                                } else if (str8 == null || (kVarValueOf = zm3.k.valueOf(str8)) == null) {
                                    kVarValueOf = zm3.k.INDIVIDUAL;
                                }
                            } else {
                                kVarValueOf = zm3.k.JUNIOR;
                            }
                            jVar = new zm3.j(str4 == null ? "" : str4, str5 == null ? "" : str5, str6 == null ? "" : str6, str9, kVarValueOf, str2, str3, str7, bVar, null, null, 0L, 0);
                        }
                    }
                    if (jVar != null) {
                        arrayList3.add(jVar);
                    }
                }
                int iB2 = q0.b(zhm.w.t(arrayList3, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB2);
                for (Object obj8 : arrayList3) {
                    linkedHashMap3.put(((zm3.j) obj8).f, obj8);
                }
                LinkedHashMap linkedHashMapP = r0.p(linkedHashMap2, linkedHashMap3);
                ArrayList arrayList4 = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    String strB = z.b((ux9.t) it8.next());
                    if (strB != null) {
                        arrayList4.add(strB);
                    }
                }
                List listA = zVar.d.a(d0.U(arrayList4));
                int iB3 = q0.b(zhm.w.t(listA, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                for (Object obj9 : listA) {
                    linkedHashMap4.put(((nx9.b) obj9).f220483a, obj9);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Object obj10 : arrayList) {
                    String strB2 = z.b((ux9.t) obj10);
                    if (strB2 == null) {
                        strB2 = "";
                    }
                    Object objO = linkedHashMap5.get(strB2);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap5, strB2);
                    }
                    ((List) objO).add(obj10);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap5.entrySet()) {
                    if (((String) entry.getKey()).length() > 0) {
                        linkedHashMap6.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap6.entrySet()) {
                    String str10 = (String) entry2.getKey();
                    List list4 = (List) entry2.getValue();
                    nx9.b bVar3 = (nx9.b) linkedHashMap4.get(str10);
                    zm3.j jVarE = (zm3.j) linkedHashMapP.get(str10);
                    if (jVarE == null) {
                        str = strK;
                        linkedHashMap = linkedHashMapP;
                        pVar = null;
                    } else {
                        int i6 = bVar3 != null ? bVar3.e : 0;
                        List<ux9.t> list5 = list4;
                        ux9.t tVar = (ux9.t) d0.m0(d0.P0(list5, new x()));
                        long timestamp = bVar3 != null ? bVar3.f : 0L;
                        for (ux9.t tVar2 : list5) {
                            if (tVar2.getTimestamp() > timestamp && zVar.f292895c.a() != 0 && tVar2.b().b(strK)) {
                                i6++;
                            }
                        }
                        if (tVar.getTimestamp() > timestamp) {
                            timestamp = tVar.getTimestamp();
                        }
                        long j2 = timestamp;
                        jq9.b paymentItem = tVar.b();
                        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj11 : list5) {
                            String str11 = strK;
                            LinkedHashMap linkedHashMap7 = linkedHashMapP;
                            if (((ux9.t) obj11).getTimestamp() > jVarE.f323365l) {
                                arrayList6.add(obj11);
                            }
                            strK = str11;
                            linkedHashMapP = linkedHashMap7;
                        }
                        str = strK;
                        linkedHashMap = linkedHashMapP;
                        List listP0 = d0.P0(arrayList6, new y());
                        if (!listP0.isEmpty()) {
                            jVarE = zm3.j.e(jVarE, null, null, null, null, ((ux9.t) d0.m0(listP0)).getTimestamp(), listP0.size() + jVarE.f323366m, 2047);
                        }
                        pVar = new jq9.p(jVarE, paymentItem, i6, j2);
                    }
                    if (pVar != null) {
                        arrayList5.add(pVar);
                    }
                    strK = str;
                    linkedHashMapP = linkedHashMap;
                }
                return arrayList5;
            case 1:
                xi0.b bVar4 = (xi0.b) obj3;
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                efm.d0 d0VarB = ((p0) obj5).f293198a.B((List) obj4, bVar4, exchangeRates, false);
                w wVar = new w(new vgc.b(3, bVar4), 14);
                d0VarB.getClass();
                ufm.i iVar = new ufm.i(d0VarB, wVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 2:
                vzk.u uVar = (vzk.u) obj5;
                wi0.b bVar5 = (wi0.b) obj3;
                NationalityInput nationalityInput = (NationalityInput) obj4;
                vzk.g updateState = (vzk.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data data3 = updateState.f293548b;
                try {
                    Object content = data3.getContent();
                    if (content != null) {
                        List<NationalityInput> list6 = ((NationalitiesInput) content).f104193a;
                        ArrayList nationalities = new ArrayList(zhm.w.t(list6, 10));
                        for (NationalityInput nationalityInput2 : list6) {
                            if (Intrinsics.f(nationalityInput2.f104195a, bVar5)) {
                                nationalityInput2 = nationalityInput;
                            }
                            nationalities.add(nationalityInput2);
                        }
                        boolean zB2 = uVar.B2(nationalities);
                        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
                        nationalitiesInput = new NationalitiesInput(nationalities, zB2);
                    } else {
                        nationalitiesInput = null;
                    }
                    data = new Data(nationalitiesInput, data3.getError(), data3.getLoading());
                    data2 = null;
                } catch (Throwable th10) {
                    data2 = null;
                    data = new Data(null, th10, data3.getLoading());
                }
                return vzk.g.a(updateState, data, false, data2, 13);
            case 3:
                ((w21.o) obj5).d((String) obj3, (String) obj4);
                return Unit.f186387a;
            case 4:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return ((w38.q0) obj5).f294204a.c((dj0.d) hVar.f288433a, (n38.a) obj3, (List) hVar.f288434b, (do3.n) hVar.f288435c, (ProductAccountSubtitle) ((od0.i) hVar.d).g(), (io3.d) ((od0.i) obj4).g());
            case 5:
                ContactsSyncOnboardingDescriptor$LaunchMode contactsSyncOnboardingDescriptor$LaunchMode = (ContactsSyncOnboardingDescriptor$LaunchMode) obj5;
                com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.a aVar = (com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.a) obj3;
                yki.l lVar = (yki.l) obj4;
                x3a.h result = (x3a.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(contactsSyncOnboardingDescriptor$LaunchMode, ContactsSyncOnboardingDescriptor$LaunchMode.Onboarding.f80048a)) {
                    if (!(result instanceof x3a.f) && !(result instanceof x3a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(new g3a.a(result.c()));
                } else {
                    if (!(contactsSyncOnboardingDescriptor$LaunchMode instanceof ContactsSyncOnboardingDescriptor$LaunchMode.PostOnboarding)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(lVar);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.a aVar2 = (com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.a) obj5;
                yki.l lVar2 = (yki.l) obj3;
                OnboardingContactSyncFlowContract$Step onboardingContactSyncFlowContract$Step = (OnboardingContactSyncFlowContract$Step) obj4;
                z3a.h result2 = (z3a.h) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof z3a.f) {
                    oki.h.t2(aVar2, lVar2, new OnboardingContactSyncFlowContract$Step.NotifyStep(null, false, ((OnboardingContactSyncFlowContract$Step.PermissionStep) onboardingContactSyncFlowContract$Step).f80109a), true, null, false, 12);
                } else {
                    if (!(result2 instanceof z3a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C2(new g3a.a(((z3a.g) result2).f319232a));
                }
                return Unit.f186387a;
            case 7:
                JointDeeplinkFlowContract$Step jointDeeplinkFlowContract$Step = (JointDeeplinkFlowContract$Step) obj5;
                com.revolut.feature.joint.impl.ui.deeplink.a aVar3 = (com.revolut.feature.joint.impl.ui.deeplink.a) obj3;
                yki.b bVar6 = (yki.b) obj4;
                com.revolut.feature.full_screen_prompt.c output = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof c.C0497c) {
                    if (((JointDeeplinkFlowContract$Step.Prompt) jointDeeplinkFlowContract$Step).f76546b) {
                        aVar3.K2();
                    } else {
                        oki.h.t2(aVar3, bVar6, new JointDeeplinkFlowContract$Step.InviteFlow(null), false, null, false, 12);
                    }
                } else if ((output instanceof c.d) || (output instanceof c.a)) {
                    aVar3.K2();
                } else {
                    if (!(output instanceof d67.h) && !(output instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Output " + output + " not supported for Deeplink Invite prompt");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    aVar3.K2();
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) obj5;
                CongratulationsScreenConfig.Prompt prompt = (CongratulationsScreenConfig.Prompt) obj3;
                h1 h1Var = (h1) obj4;
                d67.u it9 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if ((it9 instanceof d67.s) || (it9 instanceof d67.q)) {
                    bVar7.l2(new w3k.i(bVar7, h1Var, null, 10), new yi5.b(26));
                } else if (Intrinsics.f(it9, d67.r.f111463a)) {
                    CongratulationsScreenConfig.CongratulationsInfoDialog congratulationsInfoDialog = prompt.e;
                    if (congratulationsInfoDialog == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    j60.a aVar4 = bVar7.f67258r;
                    m.b bVar8 = rp0.m.Companion;
                    rp0.t tVar3 = new rp0.t(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_info_title, zhm.u.c(congratulationsInfoDialog.f66343a), null, 12), congratulationsInfoDialog.f66345c, null, 28);
                    Clause clause = congratulationsInfoDialog.d;
                    if (clause != null) {
                        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("congratulations-info-dialog-button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_info_action, zhm.u.c(clause), null, 12), false, null, null, null, null, 1000);
                        int i21 = R$attr.uikit_dp24;
                        int i22 = R$attr.uikit_dp16;
                        yp0.b.l(model2, i21, i21, i22, i22, null, false, 48);
                        model = model2;
                    } else {
                        model = null;
                    }
                    aVar4.x(dy4.b.b(bVar8, zhm.v.l(model), tVar3, null, "CONGRATULATIONS_DELEGATES_KEY", null, null, 892));
                } else {
                    int i32 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 9:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                ael.t tVar4 = ((w88.g) obj5).f295613c;
                String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l((TradingAccount) obj3).f105210a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return nim.a.w(ael.t.d(tVar4, string, true, null, wallet.d, false, null, 52), new w3c.n((u98.a) obj4, 14));
            case 10:
                wc2.e eVar = (wc2.e) obj5;
                RegisterAlias$Alias registerAlias$Alias = (RegisterAlias$Alias) obj3;
                Function1 function1 = (Function1) obj4;
                jx1.g outputData = (jx1.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof jx1.f)) {
                    if (!(outputData instanceof jx1.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.T2(new sxe.g(29, eVar, registerAlias$Alias, outputData, function1, (Continuation) null), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 11:
                String str12 = (String) obj3;
                String str13 = (String) obj4;
                ((wcj.a) obj5).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM commodity_price_targets_info WHERE fromCcy = ? AND toCcy = ?");
                try {
                    if (str12 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str12);
                    }
                    if (str13 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str13);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCcy");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "toCcy");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "priceTargets");
                    if (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        Instant instantJ = b21.a.j(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3)));
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        if (text3 != null) {
                            kg.o oVarA = GsonHolder.a();
                            Type type = new TypeToken<List<? extends zcj.b>>() { // from class: com.revolut.retail.feature.cryptocommoditydetails.impl.data.database.typeconverters.PriceTargetsItemTypeConverter$fromJsonToPriceTargetsItemEmbeddedEntity$lambda$0$$inlined$fromJson$1
                            }.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            Object objD = oVarA.d(text3, type);
                            Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                            list = (List) objD;
                        } else {
                            list = null;
                        }
                        cVar = new zcj.c(text, text2, instantJ, list);
                    } else {
                        cVar = null;
                    }
                    sQLiteStatementPrepare.close();
                    return cVar;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 12:
                com.revolut.feature.support.impl.transfer_tracker.ui.a aVar5 = (com.revolut.feature.support.impl.transfer_tracker.ui.a) obj5;
                yki.l lVar3 = (yki.l) obj3;
                InboundTransferTrackerFlowContract$Step inboundTransferTrackerFlowContract$Step = (InboundTransferTrackerFlowContract$Step) obj4;
                lee.k outputData2 = (lee.k) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof lee.h) {
                    InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput swiftTransactionReferenceInput = (InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput) inboundTransferTrackerFlowContract$Step;
                    oki.h.t2(aVar5, lVar3, new InboundTransferTrackerFlowContract$Step.InboundSwiftTransferStatus(((lee.h) outputData2).f194533a, swiftTransactionReferenceInput.f89394a, swiftTransactionReferenceInput.f89396c), true, null, false, 12);
                } else if (Intrinsics.f(outputData2, lee.i.f194534a)) {
                    InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput swiftTransactionReferenceInput2 = (InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput) inboundTransferTrackerFlowContract$Step;
                    oki.h.t2(aVar5, lVar3, new InboundTransferTrackerFlowContract$Step.EstimationResult(swiftTransactionReferenceInput2.f89394a, swiftTransactionReferenceInput2.f89395b), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(outputData2, lee.j.f194535a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(lVar3, InboundTransferTrackerFlowContract$Step.TransactionReferenceInfo.f89397a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 13:
                f0 f0Var = (f0) obj5;
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) obj3;
                AssetIdWithSymbol assetIdWithSymbol = (AssetIdWithSymbol) obj4;
                Map assetTypeOrder = (Map) obj2;
                Intrinsics.checkNotNullParameter(assetTypeOrder, "assetTypeOrder");
                if (favouritesAssetTypeKey == null || (listE = zhm.u.c(favouritesAssetTypeKey)) == null) {
                    listE = oc.c.e(assetTypeOrder, ((wed.l) f0Var.t2()).f296742a);
                }
                f0Var.v2(new wed.m(listE, assetIdWithSymbol));
                return Unit.f186387a;
            case 14:
                wh3.i iVar2 = (wh3.i) obj5;
                iVar2.getClass();
                iVar2.T2(new wh3.d(iVar2, (CheckoutParams.CardOrder) ((CheckoutParams) obj3), (PreorderPlanResult) obj2, (ael.s) obj4, null), new yi5.b(i3));
                return Unit.f186387a;
            case 15:
                yki.b bVar9 = (yki.b) obj5;
                com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar2 = (com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c) obj3;
                RentAndBillsFlowContract$Step rentAndBillsFlowContract$Step = (RentAndBillsFlowContract$Step) obj4;
                ljc.j output2 = (ljc.j) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof ljc.i)) {
                    if (!Intrinsics.f(output2, ljc.h.f195625a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RentAndBillsFlowContract$Step.SelectPayment selectPayment = (RentAndBillsFlowContract$Step.SelectPayment) rentAndBillsFlowContract$Step;
                    CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new MainContainerScreenDestination.JustShow(ibb.c.e, (Parcelable) null, (AccountCreationTransitionAnimation) null, 14).e, u0.f(new RentAndBillsSelectPaymentDestination(selectPayment.f84968a, selectPayment.f84969b)));
                    m70.a.c(t0.f186434a);
                    WhoToTransferFilter[] elements = {WhoToTransferFilter.Revolut.f80005a, WhoToTransferFilter.Accounts.f79984a};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    cVar2.C1(u0.c(new RecipientSelectionFeatureConfig("", new RecipientSelectionInputData(null, true, true, kotlin.collections.d.y0(elements), null, null, new RecipientSelectionType.Transfer(TransferFlowType.Default.f92257b, com.revolut.feature.payments.who_to_transfer.api.navigation.a.SCHEDULE, new TransferMoneyPocket(null, new SourceAccount.Pocket(null, null, AccountId.Personal.f51414a, 2), 1), new FlowExtras(compositeCommandC)), null, 177))));
                } else if (!bVar9.e(false)) {
                    oki.h.t2(cVar2, cVar2.u, RentAndBillsFlowContract$Step.Home.f84960a, false, null, false, 12);
                }
                return Unit.f186387a;
            case 16:
                ggk.g0 entryPoint = (ggk.g0) obj3;
                w4l.k loadingStrategy = (w4l.k) obj4;
                PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                kjk.u uVar2 = ((wik.t) obj5).f297935a;
                String currentPlanId = subscription.f81129a.f152287a;
                kjk.f0 f0Var2 = (kjk.f0) uVar2;
                f0Var2.getClass();
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return ((w4l.f) f0Var2.f184438j.getValue()).e(new c0(currentPlanId, entryPoint), loadingStrategy);
            case 17:
                String str14 = (String) obj3;
                String str15 = (String) obj4;
                Long contactId = (Long) obj2;
                Intrinsics.checkNotNullParameter(contactId, "contactId");
                fl3.a aVar6 = ((wl3.c) obj5).f298374a;
                Set phones = zhm.y0.b(str14);
                sl3.k kVar = (sl3.k) aVar6;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(phones, "phones");
                ufm.i iVar3 = new ufm.i(kVar.f.e(phones), new sk2.g(i2, new sk2.f(25)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                rfm.j jVar3 = new rfm.j(iVar3, new wl3.b(new wb3.k(str14, 11), i5), 2);
                Intrinsics.checkNotNullExpressionValue(jVar3, "flatMapMaybe(...)");
                rfm.m mVar = new rfm.m(jVar3, new wf6.o(29, new v(contactId, 18, str14, str15)), 1);
                long jLongValue = contactId.longValue();
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return mVar.p(new zm3.f(str14, jLongValue, str15, "", "", null, 0L, 0));
            case 18:
                Long l2 = (Long) obj5;
                zm3.m contactRevolut = (zm3.m) obj2;
                Intrinsics.checkNotNullParameter(contactRevolut, "contactRevolut");
                Intrinsics.h(l2);
                long jLongValue2 = l2.longValue();
                String str16 = contactRevolut.f323367a;
                String str17 = contactRevolut.f323368b;
                String str18 = contactRevolut.f323369c;
                String str19 = contactRevolut.d;
                boolean z4 = contactRevolut.e;
                DateTime dateTime = contactRevolut.f;
                LocalDate localDate = contactRevolut.f323370g;
                do3.b bVar10 = contactRevolut.f323371h;
                zm3.h hVar2 = contactRevolut.i;
                do3.c cVar3 = contactRevolut.f323372j;
                long jLongValue3 = l2.longValue();
                t0 t0Var2 = t0.f186434a;
                m70.a.c(t0Var2);
                Intrinsics.checkNotNullParameter(t0Var2, "<this>");
                return new zm3.i(jLongValue2, str16, z4, dateTime, new zm3.f((String) obj3, jLongValue3, (String) obj4, "", "", null, 0L, 0), cVar3, str17, str18, str19, bVar10, hVar2, localDate, 0L, 0);
            case 19:
                return wl5.g.a((wl5.g) obj2, (Integer) obj3, null, null, (xi0.b) obj4, null, ((Data) obj5).getLoading(), null, 86);
            case 20:
                wm3.l lVar4 = (wm3.l) obj5;
                String name = (String) obj3;
                String input = (String) obj4;
                wm3.a aVar7 = (wm3.a) obj2;
                ym3.b bVar11 = lVar4.o;
                AddContactInputData.InputMode inputMode = ((wm3.a) ((j2) lVar4.f298607p.f22677a).getValue()).d;
                z80.b bVar12 = bVar11.d;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                boolean zW = kotlin.text.d0.W(name);
                if (inputMode instanceof AddContactInputData.InputMode.Phone) {
                    zK = bVar12.k(input, null);
                } else {
                    if (!(inputMode instanceof AddContactInputData.InputMode.Full)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zK = bVar12.k(input, null) || e0m.g.a(input);
                }
                return wm3.a.a(aVar7, null, null, !zW && zK, 27);
            case 21:
                AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) obj4;
                DateTime earliestTransaction = (DateTime) obj2;
                Intrinsics.checkNotNullParameter(earliestTransaction, "earliestTransaction");
                kzi.a aVar8 = ((wmd.f) obj5).e;
                org.joda.time.LocalDate localDate2 = earliestTransaction.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                ArrayList arrayListA = ((gqj.c) aVar8).a(jli.b.e(localDate2), (lzi.h) obj3);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj12 : arrayListA) {
                    if (((AnalyticsSpendingPeriod$Interval) obj12).f99211b.compareTo((ChronoLocalDate) analyticsSpendingPeriod$Interval.f99210a) < 0) {
                        arrayList7.add(obj12);
                    }
                }
                return d0.W0(6, arrayList7);
            case 22:
                uc.d dVar = (uc.d) obj5;
                xi0.b bVar13 = (xi0.b) obj4;
                List schedules = (List) obj2;
                Intrinsics.checkNotNullParameter(schedules, "schedules");
                l80.f fVar = (l80.f) ((l80.e) dVar.f278954c);
                List<wmd.h> listJ = nkm.y.J(nkm.y.F(nkm.y.z(nkm.y.n(d0.Q(schedules), new wg2.g(dVar, fVar.g(), i2)), new wmd.g(fVar.e(), (AnalyticsSpendingPeriod$Interval) obj3, i5)), new wmd.k()));
                ArrayList arrayList8 = new ArrayList();
                for (wmd.h hVar3 : listJ) {
                    if (Intrinsics.f(hVar3.f298648a.i, bVar13.f306286a)) {
                        pair = null;
                    } else {
                        xi0.a aVar9 = xi0.b.Companion;
                        String str20 = hVar3.f298648a.i;
                        aVar9.getClass();
                        pair = new Pair(xi0.a.a(str20), bVar13);
                    }
                    if (pair != null) {
                        arrayList8.add(pair);
                    }
                }
                return vkm.q.q(nim.a.v(rd0.e.b(((ppk.f) dVar.f278953b).b(d0.U(arrayList8), false)), new c9h.a(dVar, listJ, bVar13, 9)));
            case 23:
                return a(obj2);
            case 24:
                wol.m update = (wol.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                wol.i qrCodeState = new wol.i((i80.a) obj5, (String) obj3);
                Operation operation = ((Challenge) obj4).f106102h;
                wol.h operationBanner = operation != null ? new wol.f(operation.f106155a, operation.f106156b) : wol.e.f298961a;
                update.getClass();
                Intrinsics.checkNotNullParameter(qrCodeState, "qrCodeState");
                Intrinsics.checkNotNullParameter(operationBanner, "operationBanner");
                return new wol.m(qrCodeState, operationBanner);
            case 25:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return te0.w.o0(skm.p0.f264003c, new s56.d0(obj5, pair3.f186385a, (xi0.b) pair3.f186386b, (Serializable) obj3, obj4, (Continuation) null, 21));
            case 26:
                return b(obj2);
            case 27:
                return c(obj2);
            case 28:
                return d(obj2);
            default:
                return wsj.g.e((wsj.g) obj5, (String) obj4, (ArrayList) obj3);
        }
    }

    public /* synthetic */ v(Object obj2, int i, Object obj3, Object obj4) {
        this.f292888a = i;
        this.f292890c = obj2;
        this.d = obj3;
        this.f292889b = obj4;
    }
}
