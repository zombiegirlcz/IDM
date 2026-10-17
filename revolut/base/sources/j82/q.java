package j82;

import ahd.w;
import android.net.Uri;
import cli.y;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreenContract$ModalStep;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreen;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.DebtDetailsControllerContract$InputData;
import com.revolut.feature.crypto.currency_pair.picker.impl.ui.currency_pair_picker.CryptoCurrencyPairPickerScreen;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker.ReservationDatePickerScreen;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.sorting.WatchlistSortingController;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.TravelHotelsRoomAmenitiesFilterScreen;
import com.revolut.feature.travel.miles.impl.ui.flow.main.TravelMilesMainFlow;
import com.revolut.feature.travel.miles.impl.ui.flow.main.TravelMilesMainFlowContract$Step;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.a;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import dfj.o0;
import dfj.p0;
import dfj.q0;
import dfj.r0;
import dfj.s0;
import dfj.t0;
import dfj.u0;
import dfj.v0;
import dfj.w0;
import dfj.x0;
import ecm.k0;
import i2l.e0;
import ix6.l0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jck.v;
import jgd.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import l6c.b;
import nii.n1;
import tof.a3;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f172098w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f172098w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((s) this.f172098w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q((TerminatedCardChargebackScreen) this.f172098w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q((j83.m) this.f172098w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q((j87.l) this.f172098w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
            case 4:
                q qVar5 = new q((DebtDetailsController) this.f172098w, continuation, 4);
                qVar5.v = obj2;
                return qVar5;
            case 5:
                q qVar6 = new q((j96.l) this.f172098w, continuation, 5);
                qVar6.v = obj2;
                return qVar6;
            case 6:
                q qVar7 = new q((ja.b) this.f172098w, continuation, 6);
                qVar7.v = obj2;
                return qVar7;
            case 7:
                q qVar8 = new q((jc6.s) this.f172098w, continuation, 7);
                qVar8.v = obj2;
                return qVar8;
            case 8:
                q qVar9 = new q((com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a) this.f172098w, continuation, 8);
                qVar9.v = obj2;
                return qVar9;
            case 9:
                q qVar10 = new q((PlanGiftingReceiverPickerScreen) this.f172098w, continuation, 9);
                qVar10.v = obj2;
                return qVar10;
            case 10:
                q qVar11 = new q((HtmlViewerScreen) this.f172098w, continuation, 10);
                qVar11.v = obj2;
                return qVar11;
            case 11:
                q qVar12 = new q((jdg.e) this.f172098w, continuation, 11);
                qVar12.v = obj2;
                return qVar12;
            case 12:
                q qVar13 = new q((CategoryDetailsScreen) this.f172098w, continuation, 12);
                qVar13.v = obj2;
                return qVar13;
            case 13:
                return new q((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) this.v, (CatalogueCategory) this.f172098w, continuation, 13);
            case 14:
                q qVar14 = new q((CryptoCurrencyPairPickerScreen) this.f172098w, continuation, 14);
                qVar14.v = obj2;
                return qVar14;
            case 15:
                q qVar15 = new q((je5.q) this.f172098w, continuation, 15);
                qVar15.v = obj2;
                return qVar15;
            case 16:
                q qVar16 = new q((ReservationDatePickerScreen) this.f172098w, continuation, 16);
                qVar16.v = obj2;
                return qVar16;
            case 17:
                q qVar17 = new q((jec.q) this.f172098w, continuation, 17);
                qVar17.v = obj2;
                return qVar17;
            case 18:
                q qVar18 = new q((TravelHotelsRoomAmenitiesFilterScreen) this.f172098w, continuation, 18);
                qVar18.v = obj2;
                return qVar18;
            case 19:
                q qVar19 = new q((jeg.j) this.f172098w, continuation, 19);
                qVar19.v = obj2;
                return qVar19;
            case 20:
                return new q((eim.c) this.v, (Throwable) this.f172098w, continuation, 20);
            case 21:
                q qVar20 = new q((SharedConverterScreen) this.f172098w, continuation, 21);
                qVar20.v = obj2;
                return qVar20;
            case 22:
                q qVar21 = new q((TravelMilesMainFlow) this.f172098w, continuation, 22);
                qVar21.v = obj2;
                return qVar21;
            case 23:
                q qVar22 = new q((com.revolut.feature.travel.miles.impl.ui.flow.main.a) this.f172098w, continuation, 23);
                qVar22.v = obj2;
                return qVar22;
            case 24:
                q qVar23 = new q((com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b) this.f172098w, continuation, 24);
                qVar23.v = obj2;
                return qVar23;
            case 25:
                q qVar24 = new q((FormAmountScreen) this.f172098w, continuation, 25);
                qVar24.v = obj2;
                return qVar24;
            case 26:
                q qVar25 = new q((jh9.p) this.f172098w, continuation, 26);
                qVar25.v = obj2;
                return qVar25;
            case 27:
                q qVar26 = new q((WatchlistSortingController) this.f172098w, continuation, 27);
                qVar26.v = obj2;
                return qVar26;
            case 28:
                return new q((NavBarWithToolbar) this.v, (AddressSearchScreen) this.f172098w, continuation, 28);
            default:
                q qVar27 = new q((jig.e) this.f172098w, continuation, 29);
                qVar27.v = obj2;
                return qVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((iyl.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((q) create((ce9.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((q) create((Date) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((q) create((l6c.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((q) create((x0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((q) create((yof.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((q) create((jh9.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((q) create((ogd.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((q) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v4, types: [ogd.l] */
    /* JADX WARN: Type inference failed for: r8v5, types: [ogd.l] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation;
        Object next;
        PaymentData paymentData;
        ogd.k kVar;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i2 = 13;
        int i3 = 2;
        int i5 = 28;
        int i6 = 6;
        ogd.l lVar = 0;
        ogd.l lVar2 = null;
        Object obj3 = this.f172098w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) obj3;
                sVar.H2(sVar.f172101q, new j45.m(data, 12));
                return Unit.f186387a;
            case 1:
                a3 transaction = (a3) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j83.m mVarH3 = ((TerminatedCardChargebackScreen) obj3).T2();
                Intrinsics.h(transaction);
                mVarH3.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                mVarH3.v2(new j83.j(transaction));
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j83.m) obj3).x2(new j45.m(data2, i2));
                return Unit.f186387a;
            case 3:
                j87.a aVar4 = ((j87.l) obj3).d;
                iyl.h hVar = (iyl.h) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!(hVar instanceof iyl.e)) {
                    if (hVar instanceof iyl.f) {
                        iyl.f fVar = (iyl.f) hVar;
                        aVar4.Z2(fVar.f169798a, fVar.f169799b);
                    } else {
                        if (!(hVar instanceof iyl.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar4.c3(((iyl.g) hVar).f169800a);
                    }
                }
                return Unit.f186387a;
            case 4:
                String listId = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j94.g gVarE3 = ((DebtDetailsController) obj3).R2();
                Intrinsics.h(listId);
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) gVarE3;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = aVar7.o;
                Iterator it8 = debtDetailsControllerContract$InputData.f67503c.e.iterator();
                while (true) {
                    continuation = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((my3.i) next).f210318a, listId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                my3.i iVar = (my3.i) next;
                if (iVar != null) {
                    if (j94.j.f172285a[iVar.f210320c.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = debtDetailsControllerContract$InputData.f67502b;
                    String str2 = iVar.d;
                    if (str != null) {
                        aVar7.n2(new l0(aVar7, str2, str, continuation, 10), new whi.b(i6));
                    }
                }
                return Unit.f186387a;
            case 5:
                String str3 = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j96.l lVar3 = (j96.l) obj3;
                lVar3.H2(lVar3.f172305q, new ik3.a(str3, i5));
                return Unit.f186387a;
            case 6:
                String str4 = (String) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ia.f fVar2 = (ia.f) j6.a.k(ia.f.class, ((ja.b) obj3).f172401c, j6.a.q("NAVIGATION_HUB_STORAGE_KEY", str4));
                if (fVar2 != null) {
                    return k0.b(fVar2);
                }
                return null;
            case 7:
                Data data3 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((jc6.s) obj3).x2(new j45.m(data3, 19));
                return Unit.f186387a;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a aVar12 = (com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a) obj3;
                aVar12.H2(aVar12.f100133s, new j45.m(data4, 20));
                return Unit.f186387a;
            case 9:
                String searchQuery = (String) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE3 = ((PlanGiftingReceiverPickerScreen) obj3).d();
                Intrinsics.h(searchQuery);
                com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar14 = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) vVarE3;
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                aVar14.u.d(new Pair(Boolean.TRUE, d0.F0(searchQuery).toString()));
                return Unit.f186387a;
            case 10:
                String url2 = (String) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jd7.h hVar2 = (jd7.h) ((HtmlViewerScreen) obj3).R.getValue();
                Intrinsics.h(url2);
                jd7.l lVar4 = (jd7.l) hVar2;
                lVar4.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                lVar4.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, Uri.parse(url2), 0, null, 494));
                return Unit.f186387a;
            case 11:
                Data data5 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jdg.e eVar = (jdg.e) obj3;
                eVar.H2(eVar.f173069q, new j45.m(data5, 23));
                return Unit.f186387a;
            case 12:
                String itemId = (String) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                je1.h hVarE3 = ((CategoryDetailsScreen) obj3).d();
                Intrinsics.h(itemId);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a aVar18 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) hVarE3;
                aVar18.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DELETE_MENU_ITEM_ID")) {
                    oki.h.v2(aVar18.f60790r, CategoryDetailsScreenContract$ModalStep.DeleteConfirmation.f60787a, bottom_dialog);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a aVar20 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a) this.v;
                CatalogueCategory catalogueCategory = (CatalogueCategory) obj3;
                Intrinsics.h(catalogueCategory);
                aVar20.C2(new je1.g(catalogueCategory));
                return Unit.f186387a;
            case 14:
                Pair pair = (Pair) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                je5.f fVarE3 = ((CryptoCurrencyPairPickerScreen) obj3).R2();
                Intrinsics.h(pair);
                ((je5.q) fVarE3).I2(new je5.j(pair));
                return Unit.f186387a;
            case 15:
                ce9.p pVar = (ce9.p) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                je5.q qVar = (je5.q) obj3;
                qVar.H2(qVar.f173228q, new aff.m(pVar, 1));
                return Unit.f186387a;
            case 16:
                Date date = (Date) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jeb.f fVar3 = (jeb.f) ((ReservationDatePickerScreen) obj3).P.getValue();
                Intrinsics.h(date);
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                fVar3.C2(new jeb.b(ebm.a.N(date)));
                return Unit.f186387a;
            case 17:
                l6c.b bVar = (l6c.b) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jec.q qVar2 = (jec.q) obj3;
                y yVar = qVar2.f173270q;
                if (bVar instanceof l6c.h) {
                    l6c.h hVar3 = (l6c.h) bVar;
                    qVar2.H2(yVar, new j87.m(hVar3, 29));
                    qVar2.n2(new jec.p(qVar2, hVar3, lVar, 0), new whi.b(i6));
                } else if ((bVar instanceof l6c.j) || (bVar instanceof l6c.g)) {
                    qVar2.H2(yVar, new je5.n(i3));
                } else if ((bVar instanceof b.C1094b) || (bVar instanceof b.a) || (bVar instanceof l6c.k) || (bVar instanceof b.c) || (bVar instanceof l6c.i)) {
                    qVar2.C2(new jec.e(bVar));
                } else if (bVar instanceof l6c.e) {
                    u6c.k kVar2 = ((l6c.e) bVar).f192391a;
                    qVar2.H2(yVar, new j87.m(kVar2, i5));
                    qVar2.n2(new jec.o(qVar2, kVar2, null), new whi.b(i6));
                } else {
                    if (!(bVar instanceof l6c.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u6c.k kVar3 = ((l6c.f) bVar).f192392a;
                    qVar2.H2(yVar, new j87.m(kVar3, i5));
                    qVar2.n2(new jec.o(qVar2, kVar3, null), new whi.b(i6));
                }
                return Unit.f186387a;
            case 18:
                String menuItemId = (String) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jeg.e eVarE3 = ((TravelHotelsRoomAmenitiesFilterScreen) obj3).R2();
                Intrinsics.h(menuItemId);
                jeg.j jVar = (jeg.j) eVarE3;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (Intrinsics.f(menuItemId, "RESET_FILTERS_ITEM_ID")) {
                    jVar.I2(new je5.n(4));
                }
                return Unit.f186387a;
            case 19:
                List list = (List) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jeg.j jVar2 = (jeg.j) obj3;
                jVar2.H2(jVar2.f173397p, new e0(list, 17));
                return Unit.f186387a;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eim.c cVar = (eim.c) this.v;
                m.Companion companion = yhm.m.INSTANCE;
                cVar.resumeWith(new jf2.g((Throwable) obj3));
                return Unit.f186387a;
            case 21:
                List<koi.j> items = (List) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jgd.n nVarI3 = ((SharedConverterScreen) obj3).T2();
                Intrinsics.h(items);
                x xVar = (x) nVarI3;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList arrayList = new ArrayList();
                for (koi.j jVar3 : items) {
                    wh whVar = jVar3 instanceof wh ? (wh) jVar3 : null;
                    qv0.i iVar2 = whVar != null ? whVar.f54925b : null;
                    qv0.p pVar2 = iVar2 instanceof qv0.p ? (qv0.p) iVar2 : null;
                    Object f53476n = pVar2 != null ? pVar2.getF52328h() : null;
                    SharedConverterItem sharedConverterItem = f53476n instanceof SharedConverterItem ? (SharedConverterItem) f53476n : null;
                    jgd.q qVar3 = sharedConverterItem != null ? new jgd.q(sharedConverterItem.f86892a, sharedConverterItem.f86893b) : null;
                    if (qVar3 != null) {
                        arrayList.add(qVar3);
                    }
                }
                xVar.f173990s.k(arrayList);
                return Unit.f186387a;
            case 22:
                String itemId2 = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jgg.c cVar2 = (jgg.c) ((TravelMilesMainFlow) obj3).O.getValue();
                Intrinsics.h(itemId2);
                com.revolut.feature.travel.miles.impl.ui.flow.main.a aVar30 = (com.revolut.feature.travel.miles.impl.ui.flow.main.a) cVar2;
                aVar30.getClass();
                Intrinsics.checkNotNullParameter(itemId2, "itemId");
                if (itemId2.equals("NAV_BAR_ACTION_ID_REV_POINTS")) {
                    oki.h.w2(aVar30.f94225q, TravelMilesMainFlowContract$Step.RevPointsBottomSheet.f94223a, bottom_dialog);
                }
                return Unit.f186387a;
            case 23:
                Data data6 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.flow.main.a aVar32 = (com.revolut.feature.travel.miles.impl.ui.flow.main.a) obj3;
                aVar32.H2(aVar32.f94224p, new j45.m(data6, 25));
                return Unit.f186387a;
            case 24:
                x0 x0Var = (x0) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.b) obj3;
                yki.i iVar3 = bVar2.f100797s;
                if ((iVar3.d() instanceof EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.PortabilityInstruction) && !(x0Var instanceof q0) && !(x0Var instanceof r0) && !(x0Var instanceof s0) && !(x0Var instanceof t0) && !(x0Var instanceof u0) && !(x0Var instanceof o0) && !(x0Var instanceof v0)) {
                    if (Intrinsics.f(x0Var, p0.f114063a)) {
                        bVar2.C2(new a.C0614a(true));
                    } else {
                        if (!Intrinsics.f(x0Var, w0.f114140a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(bVar2, iVar3, EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.NumberTransferConfirmation.f100789a, true, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 25:
                yof.b payload = (yof.b) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jh9.k kVarE3 = ((FormAmountScreen) obj3).d();
                Intrinsics.h(payload);
                jh9.p pVar3 = (jh9.p) kVarE3;
                pVar3.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                y yVar2 = pVar3.v;
                ApmQuote apmQuote = ((jh9.f) ((j2) yVar2.f22677a).getValue()).f174162c.f174163a;
                if (apmQuote != null && (paymentData = ((jh9.f) ((j2) yVar2.f22677a).getValue()).f174161b) != null) {
                    pVar3.C1(((q12.l) pVar3.f174177r).d(paymentData.getF72729b(), paymentData.f78793a, new ApmQuoteDirection.Outgoing(oh9.b.a(pVar3.u.f78784a)), apmQuote));
                }
                return Unit.f186387a;
            case 26:
                jh9.g gVar = (jh9.g) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jh9.p pVar4 = (jh9.p) obj3;
                pVar4.H2(pVar4.v, new jeg.g(gVar, i2));
                return Unit.f186387a;
            case 27:
                ogd.m sortingType = (ogd.m) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jhd.j jVar4 = (jhd.j) ((WatchlistSortingController) obj3).O.getValue();
                jVar4.getClass();
                Intrinsics.checkNotNullParameter(sortingType, "sortingType");
                y yVar3 = jVar4.o;
                if (((jhd.f) ((j2) yVar3.f22677a).getValue()).f174207a.f225123a != sortingType) {
                    switch (jhd.i.f174213a[sortingType.ordinal()]) {
                        case 1:
                            kVar = new ogd.k(sortingType, lVar2);
                            break;
                        case 2:
                            lVar2 = ogd.l.ASCENDING;
                            kVar = new ogd.k(sortingType, lVar2);
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            lVar2 = ogd.l.DESCENDING;
                            kVar = new ogd.k(sortingType, lVar2);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    ogd.k kVar4 = ((jhd.f) ((j2) yVar3.f22677a).getValue()).f174207a;
                    ogd.l lVar5 = kVar4.f225124b;
                    int i21 = lVar5 == null ? -1 : jhd.i.f174214b[lVar5.ordinal()];
                    if (i21 != -1) {
                        if (i21 == 1) {
                            lVar = ogd.l.DESCENDING;
                        } else {
                            if (i21 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lVar = ogd.l.ASCENDING;
                        }
                    }
                    ogd.m type = kVar4.f225123a;
                    Intrinsics.checkNotNullParameter(type, "type");
                    kVar = new ogd.k(type, lVar);
                }
                jVar4.H2(yVar3, new w(kVar, 1));
                return Unit.f186387a;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.v;
                Intrinsics.h(navBarWithToolbar);
                Intrinsics.checkNotNullParameter(navBarWithToolbar, "<this>");
                e0m.e.d(navBarWithToolbar);
                ((AddressSearchScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jig.e eVar2 = (jig.e) obj3;
                eVar2.H2(eVar2.f174488q, new j45.m(data7, 27));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f172098w = obj2;
    }
}
