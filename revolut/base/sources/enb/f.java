package enb;

import a83.p0;
import android.view.View;
import au6.r3;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.bottom_sheet.limit_exceeded.CryptoSendLimitExceededBottomSheetControllerContract$InputData;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import com.revolut.feature.push_to_card.api.navigation.PushToCardEditDetailsDestination;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreen;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreenContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.username.ui.UsernameScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker.TravelItineraryTimePickerScreen;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.PasskeysListController;
import com.youTransactor.uCube.rpc.Constants;
import eol.l;
import ep2.k;
import epb.j;
import eq5.n;
import eq5.p;
import eq8.f0;
import eql.c0;
import esj.o;
import et6.r1;
import euj.m;
import ev4.q;
import fue.b;
import gim.i;
import hjb.x;
import ip0.a10;
import ip0.c10;
import java.io.File;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.l1;
import nii.n1;
import tof.a3;
import tof.q6;
import tof.ya;
import vkm.j2;
import wp5.d1;
import yhm.r;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f127796w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f127796w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f((g) this.f127796w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                return new f((enf.c) this.v, (File) this.f127796w, continuation, 1);
            case 2:
                return new f((com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c) this.v, (String) this.f127796w, continuation, 2);
            case 3:
                f fVar2 = new f(continuation, (eob.b) this.f127796w);
                fVar2.v = obj2;
                return fVar2;
            case 4:
                f fVar3 = new f((eob.f) this.f127796w, continuation, 4);
                fVar3.v = obj2;
                return fVar3;
            case 5:
                f fVar4 = new f((PasskeysListController) this.f127796w, continuation, 5);
                fVar4.v = obj2;
                return fVar4;
            case 6:
                f fVar5 = new f((l) this.f127796w, continuation, 6);
                fVar5.v = obj2;
                return fVar5;
            case 7:
                f fVar6 = new f((com.revolut.feature.bank_account_switching.impl.ui.review_joint.a) this.f127796w, continuation, 7);
                fVar6.v = obj2;
                return fVar6;
            case 8:
                f fVar7 = new f((EligibilityScreen) this.f127796w, continuation, 8);
                fVar7.v = obj2;
                return fVar7;
            case 9:
                f fVar8 = new f((j) this.f127796w, continuation, 9);
                fVar8.v = obj2;
                return fVar8;
            case 10:
                return new f((View) this.v, (CategoryManagementCustomController) this.f127796w, continuation, 10);
            case 11:
                f fVar9 = new f((com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) this.f127796w, continuation, 11);
                fVar9.v = obj2;
                return fVar9;
            case 12:
                return new f((View) this.v, (UsernameScreen) this.f127796w, continuation, 12);
            case 13:
                f fVar10 = new f((CryptoSendAmountInputScreen) this.f127796w, continuation, 13);
                fVar10.v = obj2;
                return fVar10;
            case 14:
                f fVar11 = new f((f0) this.f127796w, continuation, 14);
                fVar11.v = obj2;
                return fVar11;
            case 15:
                f fVar12 = new f((eqb.b) this.f127796w, continuation, 15);
                fVar12.v = obj2;
                return fVar12;
            case 16:
                f fVar13 = new f((eqd.g) this.f127796w, continuation, 16);
                fVar13.v = obj2;
                return fVar13;
            case 17:
                f fVar14 = new f((c0) this.f127796w, continuation, 17);
                fVar14.v = obj2;
                return fVar14;
            case 18:
                f fVar15 = new f((CardRecipientDetailsScreen) this.f127796w, continuation, 18);
                fVar15.v = obj2;
                return fVar15;
            case 19:
                f fVar16 = new f((esj.c0) this.f127796w, continuation, 19);
                fVar16.v = obj2;
                return fVar16;
            case 20:
                f fVar17 = new f((r10.f) this.f127796w, continuation, 20);
                fVar17.v = obj2;
                return fVar17;
            case 21:
                f fVar18 = new f((com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a) this.f127796w, continuation, 21);
                fVar18.v = obj2;
                return fVar18;
            case 22:
                f fVar19 = new f((RewardsHubDirectRewardScreen) this.f127796w, continuation, 22);
                fVar19.v = obj2;
                return fVar19;
            case 23:
                f fVar20 = new f((m) this.f127796w, continuation, 23);
                fVar20.v = obj2;
                return fVar20;
            case 24:
                f fVar21 = new f((CreditCardStatementScreen) this.f127796w, continuation, 24);
                fVar21.v = obj2;
                return fVar21;
            case 25:
                f fVar22 = new f((q) this.f127796w, continuation, 25);
                fVar22.v = obj2;
                return fVar22;
            case 26:
                f fVar23 = new f((eve.b) this.f127796w, continuation, 26);
                fVar23.v = obj2;
                return fVar23;
            case 27:
                f fVar24 = new f((AsftTimeSlotPickerScreen) this.f127796w, continuation, 27);
                fVar24.v = obj2;
                return fVar24;
            case 28:
                f fVar25 = new f((evi.g) this.f127796w, continuation, 28);
                fVar25.v = obj2;
                return fVar25;
            default:
                f fVar26 = new f((TravelItineraryTimePickerScreen) this.f127796w, continuation, 29);
                fVar26.v = obj2;
                return fVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((d1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((eve.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v194, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CryptoAddress cryptoAddress;
        nqi.c cVar;
        dj0.d dVar;
        xi0.b bVar;
        Object obj3;
        aue.c cVarValueOf;
        Iterator it8;
        dj0.d dVar2;
        Object iVar;
        dj0.d dVar3;
        aue.j jVar;
        Object kVar;
        aue.j jVar2;
        int i = this.u;
        int i2 = 20;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i3 = 6;
        int i5 = 2;
        int i6 = 15;
        int i21 = 0;
        int i22 = 26;
        String str = null;
        Object obj4 = this.f127796w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = (List) ((g) obj4).f127799c.T2(j6.a.q("STORAGE_KEY_STATEMENT_OPTIONS", g.d(list)), h.f127803b);
                if (list2 == null) {
                    return null;
                }
                List list3 = list2;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList.add(v04.b.B((cnb.f) it9.next()));
                }
                return arrayList;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                enf.c cVar2 = (enf.c) this.v;
                File fileB = enf.c.b((File) obj4);
                File file = fileB.exists() ? fileB : null;
                if (file != null) {
                    zk0.b bVar2 = cVar2.f127823b;
                    String absolutePath = file.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    ((a80.h) bVar2).d(absolutePath);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.c) this.v).C2(new eo6.c((String) obj4));
                return Unit.f186387a;
            case 3:
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                Object obj5 = rVar.f314201a;
                Object obj6 = rVar.f314202b;
                Object obj7 = rVar.f314203c;
                Object obj8 = pair2.f186385a;
                wi0.b bVar3 = (wi0.b) pair2.f186386b;
                uib.a aVar5 = (uib.a) obj8;
                List list4 = (List) obj6;
                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                n38.a aVar6 = (n38.a) ((od0.i) obj7).g();
                if (!zBooleanValue || aVar6 == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                x xVar = new x(qf1.f.JOINT_SAVINGS_ACCOUNT.getId(), eob.j.a(bVar3.f297794a, list4), new hjb.e(aVar6.f211923a), aVar5.f280366a);
                hVar.getClass();
                return od0.h.a(xVar);
            case 4:
                List list5 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eob.f fVar = (eob.f) obj4;
                if (list5.isEmpty()) {
                    return new go.g(new Data(Optional.empty(), null, false, 6, null), 2);
                }
                List list6 = list5;
                ArrayList arrayList2 = new ArrayList(w.t(list6, 10));
                Iterator it10 = list6.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(((psg.a) it10.next()).f239485b);
                }
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it11 = arrayList2.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(fVar.f127890b.a((String) it11.next(), w4l.h.f294642c));
                }
                return nim.a.v(u0.k(arrayList3), new elb.a(i2));
            case 5:
                String listId = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eol.d dVar4 = (eol.d) ((PasskeysListController) obj4).P.getValue();
                Intrinsics.h(listId);
                l lVar = (l) dVar4;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("LIST_ID_NEW_PASSKEY")) {
                    lVar.l2(new ebg.o(lVar, null, i2), new yi5.b(i22));
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", listId.concat(" is not supported"), null, h0Var);
                }
                return Unit.f186387a;
            case 6:
                Data data = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar2 = (l) obj4;
                lVar2.H2(lVar2.f128008w, new eed.j(data, lVar2, i22));
                return Unit.f186387a;
            case 7:
                n1 n1Var = (n1) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    com.revolut.feature.bank_account_switching.impl.ui.review_joint.a aVar11 = (com.revolut.feature.bank_account_switching.impl.ui.review_joint.a) obj4;
                    aVar11.l2(new k(aVar11, null, i5), new yi5.b(i22));
                }
                return Unit.f186387a;
            case 8:
                ty0.a aVar12 = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ep7.h hVar2 = (ep7.h) ((EligibilityScreen) obj4).Z.getValue();
                String listId2 = aVar12.f275445a;
                ep7.k kVar2 = (ep7.k) hVar2;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (Intrinsics.f(listId2, "FOOTER_ACTION_ITEM")) {
                    tl7.f.R(kVar2.f128102p, R$string.car_insurance_eligibility_questions_footer_popup_title, R$string.car_insurance_eligibility_questions_footer_popup_text, null, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                }
                return Unit.f186387a;
            case 9:
                Data data2 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar3 = (j) obj4;
                jVar3.H2(jVar3.f128135q, new ec6.l(data2, 29));
                return Unit.f186387a;
            case 10:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kli.c.c((View) this.v, false);
                com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b bVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) ((CategoryManagementCustomController) obj4).R2();
                epd.a aVar16 = (epd.a) ((epd.b) ((j2) bVar4.f87654r.f22677a).getValue()).f128159a.getContent();
                if (aVar16 != null) {
                    bVar4.l2(new com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.a(bVar4, aVar16.f128158c, null), new yi5.b(i22));
                }
                return Unit.f186387a;
            case 11:
                Data data3 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b bVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.b) obj4;
                bVar5.H2(bVar5.f87654r, new epd.m(data3, i21));
                return Unit.f186387a;
            case 12:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0m.e.a((View) this.v);
                ((UsernameScreen) obj4).m2().onBackPressed();
                return Unit.f186387a;
            case 13:
                d1 parcel = (d1) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar4 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) ((CryptoSendAmountInputScreen) obj4).d();
                y yVar = jVar4.F;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                p pVar = parcel.f299114b;
                n nVar = pVar instanceof n ? (n) pVar : null;
                if (nVar != null) {
                    wp5.b bVar6 = nVar.f128293a;
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    FiatCryptoWithdrawLimits fiatCryptoWithdrawLimits = (FiatCryptoWithdrawLimits) ((eq5.r) j2Var.getValue()).o.getContent();
                    if (fiatCryptoWithdrawLimits != null && (cryptoAddress = (CryptoAddress) ((eq5.r) j2Var2.getValue()).e.getContent()) != null && (cVar = ((eq5.r) j2Var2.getValue()).f) != null && (dVar = cVar.f218471a) != null && (bVar = dVar.f115083b) != null) {
                        eq5.n1 n1Var2 = (eq5.n1) ((eq5.r) j2Var2.getValue()).f128314m.getContent();
                        List list7 = n1Var2 != null ? n1Var2.f128295a : null;
                        if (list7 == null) {
                            list7 = zhm.f0.f322471a;
                        }
                        FiatCryptoWithdrawLimits fiatCryptoWithdrawLimitsC = jVar4.f71278q.c(cryptoAddress.f71060b, cryptoAddress.f71067n, list7);
                        Intrinsics.checkNotNullParameter(bVar6, "<this>");
                        if ((bVar6 != wp5.b.MonthlyAddressLimitExceeded && bVar6 != wp5.b.DailyAddressLimitExceeded) || fiatCryptoWithdrawLimitsC != null) {
                            oki.h.v2(jVar4.G, new CryptoSendAmountInputScreenContract$ModalStep.LimitExceeded(new CryptoSendLimitExceededBottomSheetControllerContract$InputData(bVar6, fiatCryptoWithdrawLimits, fiatCryptoWithdrawLimitsC, bVar)), bottom_dialog);
                        }
                    }
                }
                return Unit.f186387a;
            case 14:
                Pair pair3 = (Pair) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) obj4;
                f0Var.H2(f0Var.f128380r, new p0((Data) pair3.f186385a, (Data) pair3.f186386b, i6));
                return Unit.f186387a;
            case 15:
                String str2 = (String) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cqb.f fVar2 = (cqb.f) j6.a.k(cqb.f.class, ((eqb.b) obj4).f128419c, eqb.b.a(str2));
                if (fVar2 != null) {
                    return a.a.G(fVar2);
                }
                return null;
            case 16:
                Data data4 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eqd.g gVar = (eqd.g) obj4;
                gVar.H2(gVar.f128444q, new epd.m(data4, 7));
                return Unit.f186387a;
            case 17:
                List list8 = (List) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c0) obj4).d3(new do2.o(list8, i6));
                return Unit.f186387a;
            case 18:
                Object obj9 = this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                esa.f fVar3 = (esa.f) ((CardRecipientDetailsScreen) obj4).T.getValue();
                String listId3 = ((koi.j) obj9).getF55009b();
                Object f52053j = ((qv0.p) obj9).getF55012h();
                com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a aVar25 = (com.revolut.feature.push_to_card.impl.ui.card_recipient_details.a) fVar3;
                aVar25.getClass();
                com.revolut.kompot.navigable.vc.modal.a aVar26 = aVar25.u;
                Intrinsics.checkNotNullParameter(listId3, "listId");
                if (f52053j instanceof a3) {
                    a3 transaction = (a3) f52053j;
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    aVar25.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(transaction), null, null, null, 126))));
                } else if (!(f52053j instanceof iy9.b)) {
                    switch (listId3.hashCode()) {
                        case -1733430648:
                            if (listId3.equals("ITEM_ID_CARD")) {
                                aVar25.C1(new PushToCardEditDetailsDestination(aVar25.I2()));
                            }
                            break;
                        case -1668528987:
                            if (listId3.equals("ITEM_ID_CHANGE_BACKGROUND")) {
                                oki.h.v2(aVar26, CardRecipientDetailsScreenContract$ModalStep.ChangeBackgroundDialog.f81602a, ModalDestination.Style.POPUP.f98311a);
                            }
                            break;
                        case 652606243:
                            if (listId3.equals("ITEM_ID_DELETE")) {
                                oki.h.v2(aVar26, new CardRecipientDetailsScreenContract$ModalStep.DeleteConfirmationDialog(aVar25.I2().a()), bottom_dialog);
                            }
                            break;
                        case 1053543084:
                            if (listId3.equals("ITEM_ID_REPORT")) {
                                aVar25.C1(u0.b(new FeatureCommand(SupportFeatureConfig.f89363a)));
                            }
                            break;
                        case 1418501635:
                            if (listId3.equals("ITEM_ID_TRANSACTIONS_SEE_ALL")) {
                                aVar25.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new ya(aVar25.I2().f81490a), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65519)));
                            }
                            break;
                    }
                } else {
                    aVar25.l2(new esa.i(aVar25, (iy9.b) f52053j, null, i21), new yi5.b(i22));
                }
                return Unit.f186387a;
            case 19:
                o oVar = (o) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((esj.c0) obj4).x2(new eq4.g(oVar, 16));
                return Unit.f186387a;
            case 20:
                List list9 = (List) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Iterator it12 = list9.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next = it12.next();
                        if (((FreelancerTaxProfile) next).f73475b == ds6.j.VAT) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                FreelancerTaxProfile freelancerTaxProfile = (FreelancerTaxProfile) obj3;
                if (freelancerTaxProfile == null) {
                    od0.i.Companion.getClass();
                    return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                }
                String taxProfileId = freelancerTaxProfile.f73474a;
                Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                r3 r3Var = (r3) ((r10.f) obj4).b;
                r3Var.getClass();
                Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(r3Var.f9615g.b(taxProfileId, loadingStrategy), new a07.q(freelancerTaxProfile, 1));
            case 21:
                Data data5 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a aVar30 = (com.revolut.feature.credit.card.impl.ui.repay.choose_payments.a) obj4;
                aVar30.H2(aVar30.u, new epd.m(data5, 13));
                return Unit.f186387a;
            case 22:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                euj.k kVarE3 = ((RewardsHubDirectRewardScreen) obj4).R2();
                Intrinsics.h(clickData);
                m mVar = (m) kVarE3;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ELIGIBILITY_CLICK_ITEM_ID")) {
                    mVar.C2(new euj.i(mVar.o.f101587b));
                }
                return Unit.f186387a;
            case 23:
                Data data6 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar2 = (m) obj4;
                y yVar2 = mVar2.f129629s;
                mVar2.H2(yVar2, new epd.m(data6, 14));
                if (mVar2.o.d && !((euj.g) ((j2) yVar2.f22677a).getValue()).f129621b && data6.getContent() != null) {
                    mVar2.H2(yVar2, new r1(24));
                    mVar2.f129626p.R(h60.a.f149577a);
                }
                return Unit.f186387a;
            case 24:
                Object obj10 = this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ev4.h hVar3 = (ev4.h) ((CreditCardStatementScreen) obj4).f69651a0.getValue();
                yx4.a aVar34 = yx4.b.Companion;
                Intrinsics.h(obj10);
                aVar34.getClass();
                ((q) hVar3).z2(yx4.a.a(obj10));
                return Unit.f186387a;
            case 25:
                Data data7 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) obj4).x2(new epd.m(data7, i6));
                return Unit.f186387a;
            case 26:
                eve.a aVar36 = (eve.a) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eve.b bVar7 = (eve.b) obj4;
                fue.c entity = (fue.c) j6.a.k(fue.c.class, bVar7.e, eve.b.a(bVar7, aVar36.f129779a, aVar36.f129780b));
                if (entity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity, "entity");
                if (entity.getLimitsBaseCurrency() == null) {
                    return zhm.f0.f322471a;
                }
                xi0.a aVar38 = xi0.b.Companion;
                String limitsBaseCurrency = entity.getLimitsBaseCurrency();
                aVar38.getClass();
                xi0.b bVarA = xi0.a.a(limitsBaseCurrency);
                String topupCurrency = entity.getTopupCurrency();
                xi0.b bVarA2 = topupCurrency != null ? xi0.a.a(topupCurrency) : null;
                List limits = entity.getLimits();
                ArrayList arrayList4 = new ArrayList();
                Iterator it13 = limits.iterator();
                while (it13.hasNext()) {
                    fue.b bVar8 = (fue.b) it13.next();
                    try {
                        cVarValueOf = aue.c.valueOf(bVar8.getType());
                    } catch (Exception e) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, str, str, e, h0Var2);
                        cVarValueOf = str;
                    }
                    if (cVarValueOf == 0) {
                        it8 = it13;
                        kVar = str;
                        iVar = kVar;
                    } else {
                        switch (lue.e.f200233a[cVarValueOf.ordinal()]) {
                            case 1:
                                it8 = it13;
                                b.C0806b singleValueLimit = bVar8.getSingleValueLimit();
                                if (singleValueLimit != null) {
                                    dj0.d dVar5 = new dj0.d(singleValueLimit.getTotal(), bVarA);
                                    Long limitInTopupCurrency = singleValueLimit.getLimitInTopupCurrency();
                                    if (limitInTopupCurrency == null) {
                                        dVar2 = null;
                                        iVar = new aue.i(cVarValueOf, dVar5, dVar2);
                                    } else {
                                        long jLongValue = limitInTopupCurrency.longValue();
                                        if (bVarA2 != null) {
                                            dVar2 = new dj0.d(jLongValue, bVarA2);
                                            iVar = new aue.i(cVarValueOf, dVar5, dVar2);
                                        } else {
                                            IllegalStateException illegalStateException = new IllegalStateException("Limit in top-up currency was present " + jLongValue + ", but topUpCurrency was null: " + bVarA2);
                                            h0 h0Var3 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var3);
                                            dVar2 = null;
                                            iVar = new aue.i(cVarValueOf, dVar5, dVar2);
                                        }
                                    }
                                } else {
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Limit of type " + cVarValueOf + " is expected to contain singleValueLimit");
                                    h0 h0Var4 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var4);
                                    iVar = null;
                                }
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                b.c upperBoundLimit = bVar8.getUpperBoundLimit();
                                if (upperBoundLimit != null) {
                                    dj0.d dVar6 = new dj0.d(upperBoundLimit.getTotal(), bVarA);
                                    dj0.d dVar7 = new dj0.d(upperBoundLimit.getUsed(), bVarA);
                                    dj0.d dVar8 = new dj0.d(upperBoundLimit.getTotal() - upperBoundLimit.getUsed(), bVarA);
                                    b.a limitInTopupCurrency2 = upperBoundLimit.getLimitInTopupCurrency();
                                    if (limitInTopupCurrency2 != null) {
                                        if (bVarA2 == null) {
                                            long total = limitInTopupCurrency2.getTotal();
                                            it8 = it13;
                                            dVar3 = dVar8;
                                            long used = limitInTopupCurrency2.getUsed();
                                            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(total, "Limit in top-up currency was present ", " ");
                                            sbV.append(used);
                                            sbV.append(", but topUpCurrency was null: ");
                                            sbV.append(bVarA2);
                                            IllegalStateException illegalStateException3 = new IllegalStateException(sbV.toString());
                                            h0 h0Var5 = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var5);
                                            jVar2 = null;
                                        } else {
                                            it8 = it13;
                                            dVar3 = dVar8;
                                            jVar2 = new aue.j(new dj0.d(limitInTopupCurrency2.getTotal(), bVarA2), new dj0.d(limitInTopupCurrency2.getUsed(), bVarA2), new dj0.d(limitInTopupCurrency2.getTotal() - limitInTopupCurrency2.getUsed(), bVarA2));
                                        }
                                        jVar = jVar2;
                                    } else {
                                        it8 = it13;
                                        dVar3 = dVar8;
                                        jVar = null;
                                    }
                                    kVar = new aue.k(cVarValueOf, dVar6, dVar7, dVar3, jVar);
                                    iVar = kVar;
                                } else {
                                    IllegalStateException illegalStateException4 = new IllegalStateException("Limit of type " + cVarValueOf + " is expected to contain upperBoundLimit");
                                    h0 h0Var6 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, str, str, illegalStateException4, h0Var6);
                                    it8 = it13;
                                    kVar = str;
                                    iVar = kVar;
                                }
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (iVar != null) {
                        arrayList4.add(iVar);
                    }
                    it13 = it8;
                    str = null;
                }
                return arrayList4;
            case 27:
                Pair pair4 = (Pair) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c10 c10Var = (c10) d0.e0(((Number) pair4.f186386b).intValue(), ((a10) pair4.f186385a).f163364b);
                Object obj11 = c10Var != null ? c10Var.f163673b : null;
                AsftTimeSlot asftTimeSlot = obj11 instanceof AsftTimeSlot ? (AsftTimeSlot) obj11 : null;
                evi.g gVar2 = (evi.g) ((AsftTimeSlotPickerScreen) obj4).Q.getValue();
                if (asftTimeSlot == null) {
                    gVar2.getClass();
                }
                gVar2.H2(gVar2.f129968s, new eu7.c(asftTimeSlot, i3));
                return Unit.f186387a;
            case 28:
                Data data8 = (Data) this.v;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                evi.g gVar3 = (evi.g) obj4;
                gVar3.H2(gVar3.f129968s, new eq4.c(data8, gVar3, 25));
                return Unit.f186387a;
            default:
                Pair pair5 = (Pair) this.v;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                LocalTime time = (LocalTime) pair5.f186386b;
                evj.i iVar2 = (evj.i) ((evj.c) ((TravelItineraryTimePickerScreen) obj4).Q.getValue());
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(time, "time");
                iVar2.H2(iVar2.o, new evj.g(time, 0));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f127796w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, eob.b bVar) {
        super(2, continuation);
        this.u = 3;
        this.f127796w = bVar;
    }
}
