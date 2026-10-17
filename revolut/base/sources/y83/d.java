package y83;

import android.content.Intent;
import au0.j4;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreen;
import com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.SwitchToNewCreditCardPromptScreenContract$Parcel;
import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.access_detail_au.AccessDetailsAuScreen;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home.RentAndBillsHomeScreen;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.support.impl.transfer_tracker.ui.date_picker.DatePickerScreen;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreen;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreen;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreen;
import ip0.vd;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import nii.l1;
import nii.n1;
import rea.p;
import skm.a2;
import wim.z;
import y9a.r;
import ya5.l;
import yc7.m;
import yef.h;
import yef.n;
import yfd.w;
import yff.h;
import yff.u;
import yg6.k;
import yg6.x;
import yhm.o;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f311621w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f311621w = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((SwitchToNewCreditCardPromptScreen) this.f311621w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((y8j.f) this.f311621w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((r) this.f311621w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((y9d.e) this.f311621w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                return new d((Function1) this.v, (lk0.g) this.f311621w, continuation);
            case 5:
                d dVar5 = new d((l) this.f311621w, continuation, 5);
                dVar5.v = obj2;
                return dVar5;
            case 6:
                d dVar6 = new d((com.revolut.feature_retail_user_declarations.email.screen.a) this.f311621w, continuation, 6);
                dVar6.v = obj2;
                return dVar6;
            case 7:
                d dVar7 = new d((SimpleConfirmationScreen) this.f311621w, continuation, 7);
                dVar7.v = obj2;
                return dVar7;
            case 8:
                d dVar8 = new d((yb0.i) this.f311621w, continuation, 8);
                dVar8.v = obj2;
                return dVar8;
            case 9:
                d dVar9 = new d((com.revolut.feature.pix.impl.flow.qr_request.a) this.f311621w, continuation, 9);
                dVar9.v = obj2;
                return dVar9;
            case 10:
                d dVar10 = new d((com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b) this.f311621w, continuation, 10);
                dVar10.v = obj2;
                return dVar10;
            case 11:
                return new d((m) this.v, (u68.h) this.f311621w, continuation, 11);
            case 12:
                d dVar11 = new d((yc9.g) this.f311621w, continuation, 12);
                dVar11.v = obj2;
                return dVar11;
            case 13:
                d dVar12 = new d((TravelHotelsDatesPickerScreen) this.f311621w, continuation, 13);
                dVar12.v = obj2;
                return dVar12;
            case 14:
                d dVar13 = new d((DatePickerScreen) this.f311621w, continuation, 14);
                dVar13.v = obj2;
                return dVar13;
            case 15:
                d dVar14 = new d((ydg.g) this.f311621w, continuation, 15);
                dVar14.v = obj2;
                return dVar14;
            case 16:
                d dVar15 = new d((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) this.f311621w, continuation, 16);
                dVar15.v = obj2;
                return dVar15;
            case 17:
                d dVar16 = new d((com.revolut.feature.pockets.impl.ui.add_new.c) this.f311621w, continuation, 17);
                dVar16.v = obj2;
                return dVar16;
            case 18:
                d dVar17 = new d((SharedCreateAlertScreen) this.f311621w, continuation, 18);
                dVar17.v = obj2;
                return dVar17;
            case 19:
                d dVar18 = new d((FinalChecksScreen) this.f311621w, continuation, 19);
                dVar18.v = obj2;
                return dVar18;
            case 20:
                d dVar19 = new d((yf4.j) this.f311621w, continuation, 20);
                dVar19.v = obj2;
                return dVar19;
            case 21:
                return new d((NavBarWithToolbar) this.v, (SharedFavouritesAddAssetScreen) this.f311621w, continuation, 21);
            case 22:
                d dVar20 = new d((TroubleshooterListScreen) this.f311621w, continuation, 22);
                dVar20.v = obj2;
                return dVar20;
            case 23:
                d dVar21 = new d(continuation, (k) this.f311621w, 23);
                dVar21.v = obj2;
                return dVar21;
            case 24:
                d dVar22 = new d(continuation, (x) this.f311621w, 24);
                dVar22.v = obj2;
                return dVar22;
            case 25:
                d dVar23 = new d((RecurringTransfersScreen) this.f311621w, continuation, 25);
                dVar23.v = obj2;
                return dVar23;
            case 26:
                d dVar24 = new d((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a) this.f311621w, continuation, 26);
                dVar24.v = obj2;
                return dVar24;
            case 27:
                d dVar25 = new d((AccessDetailsAuScreen) this.f311621w, continuation, 27);
                dVar25.v = obj2;
                return dVar25;
            case 28:
                d dVar26 = new d((RentAndBillsHomeScreen) this.f311621w, continuation, 28);
                dVar26.v = obj2;
                return dVar26;
            default:
                d dVar27 = new d((yj8.h) this.f311621w, continuation, 29);
                dVar27.v = obj2;
                return dVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((yai.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((PixQrRequestScreenContract$InputData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((MeshEvent) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Image) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v14, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v93, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        TextLocalisedClause textLocalisedClause;
        int i = this.u;
        int i2 = 23;
        int i3 = 13;
        int i5 = 14;
        InvoiceTemplate invoiceTemplateA = null;
        Object obj3 = this.f311621w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) ((SwitchToNewCreditCardPromptScreen) obj3).M.getValue();
                Intrinsics.h(clickData);
                com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.b bVar = (com.revolut.feature.card_screen.impl.prompts.switch_to_credit_card.b) gVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.d;
                SwitchToNewCreditCardPromptScreenContract$Parcel switchToNewCreditCardPromptScreenContract$Parcel = obj4 instanceof SwitchToNewCreditCardPromptScreenContract$Parcel ? (SwitchToNewCreditCardPromptScreenContract$Parcel) obj4 : null;
                if (switchToNewCreditCardPromptScreenContract$Parcel instanceof SwitchToNewCreditCardPromptScreenContract$Parcel.LinkedSubscriptions) {
                    bVar.C1(new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.CardSubscriptionList(((SwitchToNewCreditCardPromptScreenContract$Parcel.LinkedSubscriptions) switchToNewCreditCardPromptScreenContract$Parcel).f65516a, b9e.d.None)));
                } else {
                    if (switchToNewCreditCardPromptScreenContract$Parcel != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "SwitchToNewCreditCardPrompt", "Clause with parcel " + obj4 + " and id " + clickData.f275445a + " not handled", null, h0Var);
                }
                return Unit.f186387a;
            case 1:
                xi0.b bVar2 = (xi0.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((y8j.f) obj3).c3(bVar2);
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) obj3;
                rVar.H2(rVar.f311827r, new y4c.i(data, 15));
                return Unit.f186387a;
            case 3:
                String str = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y9d.e eVar = (y9d.e) obj3;
                ReentrantReadWriteLock.ReadLock lock = eVar.f311840g.readLock();
                lock.lock();
                try {
                    ue0.c cVar = eVar.d;
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(r9d.b.class);
                    companion.getClass();
                    Iterable iterable = (List) cVar.T2("invoices:templates:storage", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    Iterator it8 = iterable.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((r9d.b) next).getId(), str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    r9d.b bVar3 = (r9d.b) next;
                    if (bVar3 != null) {
                        invoiceTemplateA = x9d.a.a(bVar3);
                        break;
                    }
                    lock.unlock();
                    return invoiceTemplateA;
                } catch (Throwable th10) {
                    lock.unlock();
                    throw th10;
                }
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((q) this.v).invoke((lk0.g) obj3);
                return Unit.f186387a;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) obj3;
                lVar.H2(lVar.u, new y4c.i(data2, 16));
                return Unit.f186387a;
            case 6:
                yai.j jVar = (yai.j) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature_retail_user_declarations.email.screen.a aVar8 = (com.revolut.feature_retail_user_declarations.email.screen.a) obj3;
                aVar8.H2(aVar8.f97593w, new y8a.h(jVar, i3));
                return Unit.f186387a;
            case 7:
                ty0.a aVar9 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yal.c cVar2 = (yal.c) ((SimpleConfirmationScreen) obj3).Z.getValue();
                String url2 = aVar9.f275445a;
                yal.e eVar2 = (yal.e) cVar2;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                eVar2.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) eVar2.f312074p).f(url2), 0, null, 494));
                return Unit.f186387a;
            case 8:
                String searchQuery = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dc0.f fVar = ((yb0.i) obj3).f312149t;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                yb0.h hVar = fVar.f112783r;
                if (hVar == null) {
                    throw new IllegalArgumentException("PagedDataStorage should be initialized first");
                }
                yb0.i iVar = hVar.f312147a;
                iVar.H2(iVar.f312151x, new y99.x(i2));
                a2 a2Var = fVar.f112782q;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                fVar.f112782q = fVar.T2(new d3i.g(fVar, searchQuery, null == true ? 1 : 0, i5), new yi5.b(27));
                return Unit.f186387a;
            case 9:
                PixQrRequestScreenContract$InputData pixQrRequestScreenContract$InputData = (PixQrRequestScreenContract$InputData) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.pix.impl.flow.qr_request.a aVar13 = (com.revolut.feature.pix.impl.flow.qr_request.a) obj3;
                aVar13.H2(aVar13.o, new y8a.h(pixQrRequestScreenContract$InputData, 17));
                return Unit.f186387a;
            case 10:
                MeshEvent meshEvent = (MeshEvent) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b) obj3).f100072w.add(meshEvent);
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m) this.v).d.b(new fc7.d(((u68.f) ((u68.h) obj3)).f277506a));
                return Unit.f186387a;
            case 12:
                Image image = (Image) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yc9.g gVar2 = (yc9.g) obj3;
                RevolutCardReadyScreenContract$InputData revolutCardReadyScreenContract$InputData = gVar2.o;
                AccountId accountId = revolutCardReadyScreenContract$InputData.f78578b;
                h93.f0 f0Var = revolutCardReadyScreenContract$InputData.f78577a;
                boolean z = accountId instanceof AccountId.Joint;
                if (z && f0Var.f150112c) {
                    textLocalisedClause = new TextLocalisedClause(R$string.card_apple_wallet_joint_virtual_title, null, null, 14);
                } else if (!z || f0Var.f150112c) {
                    boolean zC = f0Var.C();
                    boolean z3 = f0Var.f150112c;
                    textLocalisedClause = (zC && z3) ? new TextLocalisedClause(R$string.card_apple_wallet_credit_virtual_title, null, null, 14) : z3 ? new TextLocalisedClause(R$string.get_virtual_card_prompt_title, null, null, 14) : new TextLocalisedClause(R$string.get_card_prompt_title, null, null, 14);
                } else {
                    textLocalisedClause = new TextLocalisedClause(R$string.card_apple_wallet_joint_title, null, null, 14);
                }
                h93.f0 f0Var2 = revolutCardReadyScreenContract$InputData.f78577a;
                boolean zJ = f0Var2.J();
                boolean z4 = f0Var2.f150112c;
                boolean z6 = zJ && cp5.c.j(gVar2.f312576q);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause((z6 && z4) ? R$string.get_virtual_card_prompt_gpay_subtitle : z6 ? R$string.get_card_prompt_gpay_subtitle : z4 ? R$string.get_virtual_card_prompt_subtitle_no_payment_system : R$string.get_card_prompt_subtitle_no_payment_system, null, null, 14);
                Intrinsics.h(image);
                gVar2.H2(gVar2.f312578s, new y8a.h(new yc9.e(textLocalisedClause, textLocalisedClause2, new TextLocalisedClause(R$string.get_virtual_card_prompt_action, null, null, 14), image), i2));
                return Unit.f186387a;
            case 13:
                LocalDate date = (LocalDate) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ycg.g gVar3 = (ycg.g) ((TravelHotelsDatesPickerScreen) obj3).O.getValue();
                Intrinsics.h(date);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.a aVar18 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.a) gVar3;
                aVar18.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                aVar18.H2(aVar18.f93955q, new t5g.h(aVar18, date, 9));
                return Unit.f186387a;
            case 14:
                vd vdVar = (vd) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yde.f fVar2 = (yde.f) ((DatePickerScreen) obj3).P.getValue();
                LocalDate newDate = vdVar.f166807b;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(newDate, "newDate");
                fVar2.H2(fVar2.o, new t5g.h(10, newDate));
                return Unit.f186387a;
            case 15:
                Data data3 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ydg.g gVar4 = (ydg.g) obj3;
                gVar4.H2(gVar4.f312696r, new y4c.i(data3, 25));
                return Unit.f186387a;
            case 16:
                Pair pair = (Pair) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar22 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) obj3;
                aVar22.H2(aVar22.f60829t, new eh1.d((List) pair.f186385a, i3, (List) pair.f186386b));
                return Unit.f186387a;
            case 17:
                n1 n1Var = (n1) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof l1) {
                    com.revolut.feature.pockets.impl.ui.add_new.c cVar3 = (com.revolut.feature.pockets.impl.ui.add_new.c) obj3;
                    cVar3.v.getClass();
                    cVar3.C1(p.b());
                }
                return Unit.f186387a;
            case 18:
                String amount = (String) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yed.q qVar = (yed.q) ((SharedCreateAlertScreen) obj3).Z.getValue();
                Intrinsics.h(amount);
                com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar4 = (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) qVar;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                String string = amount.toString();
                bVar4.x2(new xwd.o(bVar4, 12, string, bVar4.f86750w.d(string)));
                bVar4.E2();
                return Unit.f186387a;
            case 19:
                ty0.a data4 = (ty0.a) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yef.j jVar2 = (yef.j) ((FinalChecksScreen) obj3).f91832b0.getValue();
                Intrinsics.h(data4);
                n nVar = (n) jVar2;
                eff.a aVar26 = nVar.f312923p;
                Intrinsics.checkNotNullParameter(data4, "data");
                Object obj5 = data4.d;
                if (Intrinsics.f(obj5, h.a.f312918a)) {
                    ((eff.b) aVar26).getClass();
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.APP_EMAIL");
                    intent.addFlags(268435456);
                    nVar.C1(new ExternalDestination.ByIntent(intent, 1357));
                } else if (Intrinsics.f(obj5, h.b.f312919a)) {
                    ((eff.b) aVar26).getClass();
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setType("image/*");
                    intent2.addFlags(268435456);
                    Intent intentCreateChooser = Intent.createChooser(intent2, null);
                    Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
                    nVar.C1(new ExternalDestination.ByIntent(intentCreateChooser, null));
                } else if (obj5 instanceof yef.i) {
                    String message = ((yef.i) obj5).f312920a;
                    ((eff.b) aVar26).getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intent intent3 = new Intent("android.intent.action.SEND");
                    intent3.setType("text/plain");
                    intent3.putExtra("android.intent.extra.TEXT", message);
                    intent3.addFlags(268435456);
                    Intent intentCreateChooser2 = Intent.createChooser(intent3, null);
                    Intrinsics.checkNotNullExpressionValue(intentCreateChooser2, "createChooser(...)");
                    nVar.C1(new ExternalDestination.ByIntent(intentCreateChooser2, null));
                }
                return Unit.f186387a;
            case 20:
                Data data5 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yf4.j jVar3 = (yf4.j) obj3;
                jVar3.H2(jVar3.f313182r, new y4c.i(data5, 29));
                return Unit.f186387a;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.v;
                e0m.e.a(navBarWithToolbar);
                navBarWithToolbar.m0(j4.FADE);
                navBarWithToolbar.i0();
                ((w) ((SharedFavouritesAddAssetScreen) obj3).T2()).x2(new ye1.m(i3));
                return Unit.f186387a;
            case 22:
                String actionId = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yff.j jVarH3 = ((TroubleshooterListScreen) obj3).T2();
                Intrinsics.h(actionId);
                u uVar = (u) jVarH3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                if (Intrinsics.f(actionId, "DONE_ACTION_ID")) {
                    uVar.v2(h.a.f313340a);
                }
                return Unit.f186387a;
            case 23:
                Pair pair2 = (Pair) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yhm.r rVar2 = (yhm.r) pair2.f186385a;
                return ((k) obj3).d.a((List) rVar2.f314201a, (List) rVar2.f314202b, (List) rVar2.f314203c, ((kn2.a) pair2.f186386b).f185976c);
            case 24:
                Pair pair3 = (Pair) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yhm.r rVar3 = (yhm.r) pair3.f186385a;
                return ((x) obj3).f313570c.a((List) rVar3.f314201a, (List) rVar3.f314202b, (List) rVar3.f314203c, ((kn2.a) pair3.f186386b).f185976c);
            case 25:
                String id10 = (String) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ygf.e eVar3 = (ygf.e) ((RecurringTransfersScreen) obj3).X.getValue();
                Intrinsics.h(id10);
                ygf.i iVar2 = (ygf.i) eVar3;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("ADD_NEW_SUBSCRIPTION_MENU_ID")) {
                    iVar2.y2();
                }
                return Unit.f186387a;
            case 26:
                Data data6 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a aVar34 = (com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a) obj3;
                aVar34.H2(aVar34.f68370s, new yfd.u(data6, 4));
                return Unit.f186387a;
            case 27:
                ty0.a aVar35 = (ty0.a) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yi6.c cVar4 = (yi6.c) ((AccessDetailsAuScreen) obj3).Q.getValue();
                String id11 = aVar35.f275445a;
                yi6.e eVar4 = (yi6.e) cVar4;
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (Intrinsics.f(id11, "CDR_POLICY_CLICK_ID")) {
                    eVar4.C1(new ExternalDestination.Browser("https://www.revolut.com/en-AU/legal/cdrpolicy", null));
                }
                return Unit.f186387a;
            case 28:
                String listId = (String) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yic.r rVarE3 = ((RentAndBillsHomeScreen) obj3).R2();
                Intrinsics.h(listId);
                yic.x xVar = (yic.x) rVarE3;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("UPGRADE_NAV_BAR_MENU_ITEM_ID")) {
                    xVar.C1(u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.RENT_AND_BILLS_HOME, null == true ? 1 : 0, i5)));
                }
                return Unit.f186387a;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yj8.h hVar2 = (yj8.h) obj3;
                hVar2.H2(hVar2.f314440q, new yfd.u(data7, 11));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f311621w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Continuation continuation, Object obj2, int i) {
        super(2, continuation);
        this.u = i;
        this.f311621w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function1 function1, lk0.g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.v = (q) function1;
        this.f311621w = gVar;
    }
}
