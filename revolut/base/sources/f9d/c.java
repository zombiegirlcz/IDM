package f9d;

import a83.c0;
import a83.p0;
import aw0.n6;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputScreen;
import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerController;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsScreen;
import com.revolut.feature.entity.provider.impl.ui.bottomsheet.LearnMoreBottomSheetScreen;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionControllerContract$ModalStep;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreen;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.planprogress.PlanProgressController;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreen;
import com.revolut.feature.shared.invoices.impl.ui.language_selector.InvoiceLanguageSelectorScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.checkin_instructions.TravelHotelsCheckInInstructionsScreen;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingsSelectorOutputData;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.cash_selector.CashHoldingsSelectorScreen;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreen;
import com.revolut.feature_workflow_reminder_impl.ui.timer.WorkflowTimerController;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import fb7.a0;
import fb7.e0;
import fb7.i0;
import fci.y0;
import ff4.b0;
import io.fotoapparat.exception.camera.CameraException;
import ip0.ii;
import ip0.r40;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mx0.c6;
import nii.n1;
import vkm.j2;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f132920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fg3.i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 13;
        this.v = iVar;
        this.f132920w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((UpcomingTransactionTroubleshooterScreen) this.f132920w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((com.revolut.feature.junior.isa.impl.ui.child_details.a) this.f132920w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c((InvoiceLanguageSelectorScreen) this.f132920w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c((DonateWithPointsScreen) this.f132920w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c((i0) this.f132920w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c((TravelHotelsCheckInInstructionsScreen) this.f132920w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c((fbg.l) this.f132920w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c((PurposeOfAccountScreen) this.f132920w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c((y0) this.f132920w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c((fd6.a) this.f132920w, continuation, 9);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c((ff1.j) this.f132920w, continuation, 10);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c((b0) this.f132920w, continuation, 11);
                cVar12.v = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c((ff8.i) this.f132920w, continuation, 12);
                cVar13.v = obj2;
                return cVar13;
            case 13:
                return new c((fg3.i) this.v, (String) this.f132920w, continuation);
            case 14:
                c cVar14 = new c((se6.g) this.f132920w, continuation, 14);
                cVar14.v = obj2;
                return cVar14;
            case 15:
                c cVar15 = new c((RefinancingAccountDetailsInputScreen) this.f132920w, continuation, 15);
                cVar15.v = obj2;
                return cVar15;
            case 16:
                c cVar16 = new c((com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) this.f132920w, continuation, 16);
                cVar16.v = obj2;
                return cVar16;
            case 17:
                c cVar17 = new c((WorkflowTimerController) this.f132920w, continuation, 17);
                cVar17.v = obj2;
                return cVar17;
            case 18:
                c cVar18 = new c((InstrumentsTrendCollectionController) this.f132920w, continuation, 18);
                cVar18.v = obj2;
                return cVar18;
            case 19:
                c cVar19 = new c((JuniorDetailsConfirmationScreen) this.f132920w, continuation, 19);
                cVar19.v = obj2;
                return cVar19;
            case 20:
                c cVar20 = new c((com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) this.f132920w, continuation, 20);
                cVar20.v = obj2;
                return cVar20;
            case 21:
                c cVar21 = new c((CryptoQrScannerController) this.f132920w, continuation, 21);
                cVar21.v = obj2;
                return cVar21;
            case 22:
                c cVar22 = new c((com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) this.f132920w, continuation, 22);
                cVar22.v = obj2;
                return cVar22;
            case 23:
                c cVar23 = new c((PlanProgressController) this.f132920w, continuation, 23);
                cVar23.v = obj2;
                return cVar23;
            case 24:
                c cVar24 = new c((fk9.f) this.f132920w, continuation, 24);
                cVar24.v = obj2;
                return cVar24;
            case 25:
                c cVar25 = new c((fkj.f) this.f132920w, continuation, 25);
                cVar25.v = obj2;
                return cVar25;
            case 26:
                c cVar26 = new c((fl8.d) this.f132920w, continuation, 26);
                cVar26.v = obj2;
                return cVar26;
            case 27:
                c cVar27 = new c((CashHoldingsSelectorScreen) this.f132920w, continuation, 27);
                cVar27.v = obj2;
                return cVar27;
            case 28:
                c cVar28 = new c((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) this.f132920w, continuation, 28);
                cVar28.v = obj2;
                return cVar28;
            default:
                c cVar29 = new c((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a) this.f132920w, continuation, 29);
                cVar29.v = obj2;
                return cVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((fb7.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((ii) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((se6.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((dx4.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((CameraException) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((xq2.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((r40) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((kel.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v99, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 4;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i3 = 1;
        int i5 = 2;
        Continuation continuation = null;
        Object obj3 = this.f132920w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) ((UpcomingTransactionTroubleshooterScreen) obj3).i0.getValue();
                Intrinsics.h(itemId);
                com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b bVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) mVar;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DONE_BUTTON_ITEM_ID")) {
                    bVar.v2(h.f132926a);
                }
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.child_details.a aVar3 = (com.revolut.feature.junior.isa.impl.ui.child_details.a) obj3;
                aVar3.H2(aVar3.u, new p0((Data) pair.f186385a, (Data) pair.f186386b, 17));
                return Unit.f186387a;
            case 2:
                String query = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fad.g gVar = (fad.g) ((InvoiceLanguageSelectorScreen) obj3).P.getValue();
                Intrinsics.h(query);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                gVar.H2(gVar.o, new f9g.l(query, i5));
                return Unit.f186387a;
            case 3:
                n6 n6Var = (n6) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fb6.i iVar = (fb6.i) ((DonateWithPointsScreen) obj3).T.getValue();
                Object obj4 = n6Var.k;
                if (obj4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fb6.c parcel = (fb6.c) obj4;
                com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar6 = (com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a) iVar;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.equals(fb6.a.f133443a)) {
                    aVar6.l2(new af3.f((Object) aVar6, false, continuation, 14), new yi5.b(26));
                } else {
                    if (!parcel.equals(fb6.b.f133444a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar6.C2(fb6.f.f133449a);
                }
                return Unit.f186387a;
            case 4:
                fb7.n nVar = (fb7.n) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0Var = (i0) obj3;
                y yVar = i0Var.v;
                a0 a0Var = ((fb7.j) ((j2) yVar.f22677a).getValue()).f;
                if (a0Var != null) {
                    i0Var.H2(yVar, new f0d.l(nVar, a0Var, 19));
                } else {
                    i0Var.H2(yVar, new e0(nVar, i3));
                }
                return Unit.f186387a;
            case 5:
                ty0.a clauseClickData = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fbg.h hVarE3 = ((TravelHotelsCheckInInstructionsScreen) obj3).d();
                Intrinsics.h(clauseClickData);
                fbg.l lVar = (fbg.l) hVarE3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(clauseClickData, "clauseClickData");
                lVar.C1(new ExternalDestination.Browser(clauseClickData.f275445a, null));
                return Unit.f186387a;
            case 6:
                Data data = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fbg.l lVar2 = (fbg.l) obj3;
                lVar2.H2(lVar2.f133558t, new f9a.i(data, i2));
                return Unit.f186387a;
            case 7:
                ii iiVar = (ii) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c6 c6Var = iiVar.f164695b;
                Object k = c6Var.getF55176j();
                cci.g purpose = k instanceof cci.g ? (cci.g) k : null;
                if (purpose != null) {
                    fci.o oVar = (fci.o) ((PurposeOfAccountScreen) obj3).R2();
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(purpose, "purpose");
                    y yVar2 = oVar.f133800t;
                    j2 j2Var = (j2) yVar2.f22677a;
                    j2 j2Var2 = (j2) yVar2.f22677a;
                    if (!i2b.a.k(((fci.g) j2Var.getValue()).f133774a)) {
                        oVar.H2(yVar2, new c0(21, ((fci.g) j2Var2.getValue()).f133775b.contains(purpose) ? d0.A0(((fci.g) j2Var2.getValue()).f133775b, purpose) : d0.F0(purpose, ((fci.g) j2Var2.getValue()).f133775b)));
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(c6Var.getF55176j(), "Unexpected item's payload "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 8:
                Data data2 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y0 y0Var = (y0) obj3;
                y0Var.H2(y0Var.f133828q, new f9a.i(data2, 5));
                return Unit.f186387a;
            case 9:
                ty0.a aVar12 = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xc6.a aVar14 = ((fd6.a) obj3).f133921c;
                String id10 = aVar12.f275445a;
                fd6.b bVar2 = (fd6.b) aVar14;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "LEGAL_ENTITY_DISCLAIMER_CLICK_ID")) {
                    yji.n.P2(bVar2, new LearnMoreBottomSheetScreen(bVar2.f133922l), bottom_dialog, null, 2);
                }
                return Unit.f186387a;
            case 10:
                List list = (List) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ff1.j) obj3).x2(new do2.o(list, 23));
                return Unit.f186387a;
            case 11:
                Data data3 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var = (b0) obj3;
                int i6 = 9;
                b0Var.H2(b0Var.f134712t, new f9a.i(data3, i6));
                b0Var.U1(new fe9.f(i6));
                return Unit.f186387a;
            case 12:
                String str = (String) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((ff8.i) obj3).f134779c;
                ff8.i.Companion.getClass();
                ef8.a aVar18 = (ef8.a) cVar.T2(ff8.h.a(str), ff8.i.f134776h);
                if (aVar18 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar18, "<this>");
                List supportedFiatCurrencies = aVar18.getSupportedFiatCurrencies();
                ArrayList arrayList = new ArrayList(w.t(supportedFiatCurrencies, 10));
                Iterator it8 = supportedFiatCurrencies.iterator();
                while (it8.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it8.next(), arrayList);
                }
                return new qf8.a(arrayList);
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fg3.i iVar2 = (fg3.i) this.v;
                String str2 = (String) obj3;
                Intrinsics.h(str2);
                iVar2.C2(new fg3.c(str2));
                return Unit.f186387a;
            case 14:
                se6.e eVar = (se6.e) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i21 = fg6.c.f134903a[((se6.g) obj3).ordinal()];
                if (i21 == 1) {
                    List list2 = eVar.f262131a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (((se6.d) obj5).f) {
                            arrayList2.add(obj5);
                        }
                    }
                    List list3 = eVar.f262132b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (((se6.d) obj6).f) {
                            arrayList3.add(obj6);
                        }
                    }
                    return new se6.e(arrayList2, arrayList3);
                }
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List list4 = eVar.f262131a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : list4) {
                    if (((se6.d) obj7).f262128g) {
                        arrayList4.add(obj7);
                    }
                }
                List list5 = eVar.f262132b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj8 : list5) {
                    if (((se6.d) obj8).f262128g) {
                        arrayList5.add(obj8);
                    }
                }
                return new se6.e(arrayList4, arrayList5);
            case 15:
                dx4.l lVar3 = (dx4.l) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(((RefinancingAccountDetailsInputScreen) obj3).d(), lVar3);
                return Unit.f186387a;
            case 16:
                ax4.b bVar3 = (ax4.b) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c cVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.c) obj3;
                cVar2.H2(cVar2.f68282s, new ah4.f(bVar3, i2));
                return Unit.f186387a;
            case 17:
                Pair pair2 = (Pair) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                LocalTime time = (LocalTime) pair2.f186386b;
                fhi.m mVar2 = (fhi.m) ((WorkflowTimerController) obj3).L.getValue();
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(time, "time");
                mVar2.H2(mVar2.f135251r, new evj.g(time, i3));
                return Unit.f186387a;
            case 18:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fi7.h hVarE32 = ((InstrumentsTrendCollectionController) obj3).d();
                Intrinsics.h(clickData);
                com.revolut.kompot.navigable.vc.modal.a aVar25 = ((com.revolut.feature.instruments.trend.collections.impl.ui.collection.a) hVarE32).A;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj9 = clickData.d;
                if (obj9 instanceof fi7.m) {
                    InstrumentsTrendCollectionId instrumentsTrendCollectionId = ((fi7.m) obj9).f135333a;
                    if (instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a)) {
                        oki.h.v2(aVar25, InstrumentsTrendCollectionControllerContract$ModalStep.HighRiskWarningStep.f74908a, bottom_dialog);
                    } else if (instrumentsTrendCollectionId.equals(InstrumentsTrendCollectionId.RecommendedBuy.f74905a)) {
                        oki.h.v2(aVar25, InstrumentsTrendCollectionControllerContract$ModalStep.RecommendedBuysLearnMore.f74909a, ModalDestination.Style.POPUP.f98311a);
                    }
                }
                return Unit.f186387a;
            case 19:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fi8.h hVarE33 = ((JuniorDetailsConfirmationScreen) obj3).d();
                Intrinsics.h(clickData2);
                fi8.k kVar = (fi8.k) hVarE33;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj10 = clickData2.d;
                String str3 = obj10 instanceof String ? (String) obj10 : null;
                if (str3 == null) {
                    throw new IllegalArgumentException(j6.a.s("Cannot handle click on terms id=", clickData2.f275445a, ", text=", clickData2.f275446b, ". Parcel is not a valid link."));
                }
                kVar.C1(new ExternalDestination.Browser(str3, null));
                return Unit.f186387a;
            case 20:
                List list6 = (List) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (list6.isEmpty()) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) obj3;
                return vkm.q.Q(fVar.D, new eh9.j(continuation, fVar, list6, 7));
            case 21:
                CameraException e = (CameraException) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fj5.c cVar3 = (fj5.c) ((CryptoQrScannerController) obj3).P.getValue();
                Intrinsics.h(e);
                com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a aVar29 = (com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) cVar3;
                aVar29.getClass();
                Intrinsics.checkNotNullParameter(e, "e");
                Throwable cause = e.getCause();
                if (cause == null) {
                    cause = new IllegalStateException("Unknown camera exception");
                }
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, cause, h0Var2);
                aVar29.J2();
                return Unit.f186387a;
            case 22:
                xq2.a aVar30 = (xq2.a) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a aVar32 = (com.revolut.feature.crypto.qr.parser.impl.ui.scanner.a) obj3;
                Intrinsics.h(aVar30);
                y yVar3 = aVar32.u;
                try {
                    aVar32.H2(yVar3, new fj5.e(i3));
                    CryptoQrCodeParseResult cryptoQrCodeParseResultA = aVar32.o.a(aVar30);
                    if (cryptoQrCodeParseResultA instanceof CryptoQrCodeParseResult.Success) {
                        aVar32.H2(yVar3, new fj5.e(i5));
                        aVar32.C2(new zi5.e(((CryptoQrCodeParseResult.Success) cryptoQrCodeParseResultA).f70897a, ((CryptoQrCodeParseResult.Success) cryptoQrCodeParseResultA).f70898b));
                    }
                    break;
                } catch (Throwable th10) {
                    aVar32.H2(yVar3, new ab4.q(th10, 12));
                    aVar32.n2(new ewa.d(aVar32, continuation, 22), new whi.b(6));
                }
                return Unit.f186387a;
            case 23:
                r40 model = (r40) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fk9.d dVar = (fk9.d) ((PlanProgressController) obj3).P.getValue();
                Intrinsics.h(model);
                fk9.f fVar2 = (fk9.f) dVar;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj11 = model.f166116s;
                if (obj11 instanceof bi9.b) {
                    bi9.b bVar4 = (bi9.b) obj11;
                    String strH = s.h(bVar4);
                    Intrinsics.checkNotNullParameter(bVar4, "<this>");
                    fVar2.C1(new PayLaterKompotFeatureConfig.RepaymentDetailsNavigationDestination(strH, bVar4.f15447a.f322366b.f322316a));
                }
                return Unit.f186387a;
            case 24:
                Data data4 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fk9.f fVar3 = (fk9.f) obj3;
                fVar3.H2(fVar3.f135737q, new fk4.o(data4, i3));
                return Unit.f186387a;
            case 25:
                Data data5 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fkj.f fVar4 = (fkj.f) obj3;
                fVar4.H2(fVar4.f135853s, new fk4.o(data5, i5));
                return Unit.f186387a;
            case 26:
                String str4 = (String) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(RemoteLoginInvitation.class, ((fl8.d) obj3).f135907c, fl8.d.a(str4));
            case 27:
                kel.b cashHolding = (kel.b) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                flh.b bVar5 = (flh.b) ((CashHoldingsSelectorScreen) obj3).T.getValue();
                Intrinsics.h(cashHolding);
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                bVar5.C2(new CashHoldingsSelectorOutputData(cashHolding));
                return Unit.f186387a;
            case 28:
                Data data6 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar6 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) obj3;
                bVar6.H2(bVar6.L, new fk4.o(data6, 3));
                return Unit.f186387a;
            default:
                vf0.k kVar2 = (vf0.k) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data7 = (Data) kVar2.f288454a;
                Data data8 = (Data) kVar2.f288455b;
                Data data9 = (Data) kVar2.f288456c;
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a aVar40 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a) obj3;
                aVar40.H2(aVar40.z, new fmk.j(data7, data8, (Data) kVar2.e, (Data) kVar2.d, data9, 0));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f132920w = obj2;
    }
}
