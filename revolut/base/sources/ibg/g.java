package ibg;

import aii.q;
import aw0.n6;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.boleto.impl.screen.amount.BoletoAmountScreen;
import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.CryptoBalanceBreakdownScreen;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.extension_auth.impl.ui_kompot.ExtensionAuthViewController;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerController;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationController;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserContract$InputData;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.EsimMobilePlanCancellationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_reason.PlanDowngradeReasonScreen;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
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
import gim.i;
import i2l.e0;
import i6f.h0;
import ie6.r;
import iek.n;
import iga.j;
import ihd.v;
import ilk.f;
import in1.s;
import ina.x;
import ip0.vd;
import ip0.wk;
import ip4.l;
import ipb.k;
import ise.i0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import retrofit2.HttpException;
import vkm.j2;
import yhm.o;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f160169w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160169w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((h) this.f160169w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g((ExtensionAuthViewController) this.f160169w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g((n) this.f160169w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g((UnlockBenefitsScreen) this.f160169w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            case 4:
                g gVar5 = new g((j) this.f160169w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
            case 5:
                g gVar6 = new g((igf.g) this.f160169w, continuation, 5);
                gVar6.v = obj2;
                return gVar6;
            case 6:
                g gVar7 = new g((com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b) this.f160169w, continuation, 6);
                gVar7.v = obj2;
                return gVar7;
            case 7:
                g gVar8 = new g((com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) this.f160169w, continuation, 7);
                gVar8.v = obj2;
                return gVar8;
            case 8:
                g gVar9 = new g((CryptoBalanceBreakdownScreen) this.f160169w, continuation, 8);
                gVar9.v = obj2;
                return gVar9;
            case 9:
                g gVar10 = new g((v) this.f160169w, continuation, 9);
                gVar10.v = obj2;
                return gVar10;
            case 10:
                g gVar11 = new g((com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a) this.f160169w, continuation, 10);
                gVar11.v = obj2;
                return gVar11;
            case 11:
                g gVar12 = new g((com.revolut.feature.shops.impl.ui.items_details.b) this.f160169w, continuation, 11);
                gVar12.v = obj2;
                return gVar12;
            case 12:
                g gVar13 = new g((EsimMobilePlanCancellationScreen) this.f160169w, continuation, 12);
                gVar13.v = obj2;
                return gVar13;
            case 13:
                g gVar14 = new g((ikk.i) this.f160169w, continuation, 13);
                gVar14.v = obj2;
                return gVar14;
            case 14:
                g gVar15 = new g((ilb.d) this.f160169w, continuation, 14);
                gVar15.v = obj2;
                return gVar15;
            case 15:
                g gVar16 = new g((EsimPickerScreen) this.f160169w, continuation, 15);
                gVar16.v = obj2;
                return gVar16;
            case 16:
                g gVar17 = new g((PlanDowngradeReasonScreen) this.f160169w, continuation, 16);
                gVar17.v = obj2;
                return gVar17;
            case 17:
                g gVar18 = new g((ilk.j) this.f160169w, continuation, 17);
                gVar18.v = obj2;
                return gVar18;
            case 18:
                g gVar19 = new g((BoletoAmountScreen) this.f160169w, continuation, 18);
                gVar19.v = obj2;
                return gVar19;
            case 19:
                g gVar20 = new g((s) this.f160169w, continuation, 19);
                gVar20.v = obj2;
                return gVar20;
            case 20:
                g gVar21 = new g((x) this.f160169w, continuation, 20);
                gVar21.v = obj2;
                return gVar21;
            case 21:
                g gVar22 = new g((aah.g) this.f160169w, continuation, 21);
                gVar22.v = obj2;
                return gVar22;
            case 22:
                g gVar23 = new g((TripsDatePickerController) this.f160169w, continuation, 22);
                gVar23.v = obj2;
                return gVar23;
            case 23:
                g gVar24 = new g((l) this.f160169w, continuation, 23);
                gVar24.v = obj2;
                return gVar24;
            case 24:
                g gVar25 = new g((ip7.j) this.f160169w, continuation, 24);
                gVar25.v = obj2;
                return gVar25;
            case 25:
                g gVar26 = new g((k) this.f160169w, continuation, 25);
                gVar26.v = obj2;
                return gVar26;
            case 26:
                g gVar27 = new g((iqf.l) this.f160169w, continuation, 26);
                gVar27.v = obj2;
                return gVar27;
            case 27:
                g gVar28 = new g((ThreeDsVerificationController) this.f160169w, continuation, 27);
                gVar28.v = obj2;
                return gVar28;
            case 28:
                g gVar29 = new g((isl.j) this.f160169w, continuation, 28);
                gVar29.v = obj2;
                return gVar29;
            default:
                g gVar30 = new g((iuc.f) this.f160169w, continuation, 29);
                gVar30.v = obj2;
                return gVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((ie6.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g) create((x0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((g) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((g) create((TransferScheduleData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((g) create((inh.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((g) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((g) create((isl.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((kuc.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v84, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        int i = this.u;
        int i2 = 25;
        int i3 = 29;
        int i5 = 8;
        int i6 = 21;
        int i21 = 9;
        Continuation continuation = null;
        int i22 = 0;
        int i32 = 1;
        Object obj3 = this.f160169w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) obj3;
                hVar.H2(hVar.f160172r, new h0(data, 17));
                return Unit.f186387a;
            case 1:
                ie6.g uiEvent = (ie6.g) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) ((ie6.b) ((ExtensionAuthViewController) obj3).P.getValue());
                y yVar = rVar.f160648q;
                Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
                if (Intrinsics.f(uiEvent, ie6.d.f160633a)) {
                    rVar.C2(q.f5292a);
                } else if (Intrinsics.f(uiEvent, ie6.c.f160632a)) {
                    ExtensionAuthRequestData extensionAuthRequestData = ((ie6.a) ((j2) yVar.f22677a).getValue()).f160629a;
                    if (extensionAuthRequestData != null) {
                        rVar.H2(yVar, new id8.a(i5));
                        rVar.n2(new ie6.n(rVar, extensionAuthRequestData, continuation, i22), new ie6.j(rVar, i32));
                    }
                } else {
                    int i33 = 2;
                    if (Intrinsics.f(uiEvent, ie6.f.f160635a)) {
                        ExtensionAuthRequestData extensionAuthRequestData2 = ((ie6.a) ((j2) yVar.f22677a).getValue()).f160629a;
                        if (extensionAuthRequestData2 != null) {
                            rVar.H2(yVar, new id8.a(6));
                            rVar.n2(new ie6.n(rVar, extensionAuthRequestData2, continuation, i33), new ie6.j(rVar, i22));
                        }
                    } else {
                        if (!Intrinsics.f(uiEvent, ie6.e.f160634a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rVar.H2(rVar.f160648q, new id8.a(i21));
                        rVar.l2(new ie6.n(rVar, null), new ie6.j(rVar, i33));
                    }
                }
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) obj3;
                nVar.H2(nVar.f160765r, new h0(data2, 21));
                return Unit.f186387a;
            case 3:
                n6 model = (n6) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                UnlockBenefitsScreen unlockBenefitsScreen = (UnlockBenefitsScreen) obj3;
                Intrinsics.h(model);
                KProperty[] kPropertyArr = UnlockBenefitsScreen.S;
                unlockBenefitsScreen.getClass();
                String str = model.f;
                Object obj4 = model.k;
                if (Intrinsics.f(str, "unlock_benefits_footer_primary")) {
                    j jVar = (j) unlockBenefitsScreen.R2();
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(model, "model");
                    jVar.J2(obj4);
                } else if (Intrinsics.f(str, "unlock_benefits_footer_secondary")) {
                    j jVar2 = (j) unlockBenefitsScreen.R2();
                    jVar2.getClass();
                    Intrinsics.checkNotNullParameter(model, "model");
                    jVar2.J2(obj4);
                }
                return Unit.f186387a;
            case 4:
                j jVar3 = (j) obj3;
                y yVar2 = jVar3.f161113t;
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Throwable error = data3.getError();
                if (error != null && (error instanceof HttpException) && ((HttpException) error).code() == 404) {
                    jVar3.B2();
                } else if (error != null) {
                    jVar3.H2(yVar2, new ab4.q(error, 19));
                } else {
                    jVar3.H2(yVar2, new h0(data3, 22));
                }
                return Unit.f186387a;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                igf.g gVar = (igf.g) obj3;
                gVar.H2(gVar.f161193s, new h0(data4, 23));
                return Unit.f186387a;
            case 6:
                x0 x0Var = (x0) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b bVar = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b) obj3;
                yki.i iVar = bVar.f100784s;
                if ((iVar.d() instanceof EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.PortabilityInstruction) && !(x0Var instanceof q0) && !(x0Var instanceof r0) && !(x0Var instanceof s0) && !(x0Var instanceof t0) && !(x0Var instanceof u0) && !(x0Var instanceof o0) && !(x0Var instanceof v0)) {
                    if (Intrinsics.f(x0Var, p0.f114063a)) {
                        bVar.C2(new a.C0613a(true));
                    } else {
                        if (!Intrinsics.f(x0Var, w0.f114140a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(bVar, iVar, EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.NumberTransferConfirmation.f100775a, true, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 7:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a aVar9 = (com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) obj3;
                aVar9.H2(aVar9.f70881r, new h0(data5, 24));
                return Unit.f186387a;
            case 8:
                n6 n6Var = (n6) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ih5.b bVar2 = (ih5.b) ((CryptoBalanceBreakdownScreen) obj3).U.getValue();
                String str2 = n6Var.f;
                com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a aVar11 = (com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) bVar2;
                aVar11.getClass();
                if (Intrinsics.f(str2, "LOCKED_BALANCE_BREAKDOWN_DISMISS")) {
                    aVar11.C2(fh5.c.f135149a);
                }
                return Unit.f186387a;
            case 9:
                Data data6 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                v vVar = (v) obj3;
                vVar.x2(new i25.e(data6, vVar, i2));
                return Unit.f186387a;
            case 10:
                Data data7 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a aVar14 = (com.revolut.feature.external_accounts.impl.ui.brazil.consent_details.a) obj3;
                aVar14.H2(aVar14.f72551q, new h0(data7, 25));
                return Unit.f186387a;
            case 11:
                Data data8 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.shops.impl.ui.items_details.b bVar3 = (com.revolut.feature.shops.impl.ui.items_details.b) obj3;
                bVar3.H2(bVar3.getState(), new h0(data8, 26));
                return Unit.f186387a;
            case 12:
                ty0.a aVar16 = (ty0.a) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ijj.g gVarE3 = ((EsimMobilePlanCancellationScreen) obj3).d();
                Object obj5 = aVar16.d;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b bVar4 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) gVarE3;
                bVar4.getClass();
                if (obj5 instanceof EsimDescriptorValue.Link) {
                    bVar4.l2(new i44.a(bVar4, obj5, continuation, i3), new yi5.b(26));
                }
                return Unit.f186387a;
            case 13:
                Data data9 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ikk.i iVar2 = (ikk.i) obj3;
                iVar2.H2(iVar2.f161998p, new h0(data9, 28));
                return Unit.f186387a;
            case 14:
                Data data10 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ilb.d dVar = (ilb.d) obj3;
                dVar.H2(dVar.f162219q, new h0(data10, 29));
                return Unit.f186387a;
            case 15:
                String searchQuery = (String) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ilj.g gVar2 = (ilj.g) ((EsimPickerScreen) obj3).Q.getValue();
                Intrinsics.h(searchQuery);
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                gVar2.H2(gVar2.o, new ik3.a(searchQuery, i32));
                return Unit.f186387a;
            case 16:
                String menuItemListId = (String) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ilk.g gVar3 = (ilk.g) ((PlanDowngradeReasonScreen) obj3).Z.getValue();
                Intrinsics.h(menuItemListId);
                ilk.j jVar4 = (ilk.j) gVar3;
                jVar4.getClass();
                Intrinsics.checkNotNullParameter(menuItemListId, "menuItemListId");
                if (menuItemListId.equals("ID_MENU_ITEM_SKIP")) {
                    jVar4.v2(f.a.f162255a);
                } else {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PlanDowngradeReason", p.a.p("click on menu item with id ", menuItemListId, " not handled"), null, h0Var);
                }
                return Unit.f186387a;
            case 17:
                Data data11 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ilk.j) obj3).x2(new ilk.i(data11, 0));
                return Unit.f186387a;
            case 18:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                in1.j jVarE3 = ((BoletoAmountScreen) obj3).R2();
                String amount = charSequence.toString();
                s sVar = (s) jVarE3;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                sVar.H2(sVar.f162614t, new ijg.c(sVar, amount, 14));
                return Unit.f186387a;
            case 19:
                TransferScheduleData transferScheduleData = (TransferScheduleData) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar2 = (s) obj3;
                sVar2.H2(sVar2.f162614t, new in1.q(transferScheduleData, 0));
                return Unit.f186387a;
            case 20:
                x xVar = (x) obj3;
                List list = (List) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (list.size() <= 1) {
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((io3.g) it8.next()).f163163a);
                    }
                    x.i3(xVar, arrayList2);
                } else {
                    xVar.d3(list, new i4g.g(1, (x) obj3, x.class, "navigateToStatementGenerationForFreelancers", "navigateToStatementGenerationForFreelancers(Ljava/util/Collection;)V", 0, 13));
                }
                return Unit.f186387a;
            case 21:
                inh.e parcel = (inh.e) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                inh.h hVar2 = (inh.h) ((aah.g) obj3).e;
                Intrinsics.h(parcel);
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof inh.c) {
                    hVar2.T2(new ikf.g(hVar2, parcel, continuation, i5), new yi5.b(27));
                } else {
                    if (!parcel.equals(inh.d.f162943a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar2.A2(zh9.u0.c(new CorporateEventsFeatureConfig.CorporateEventsConfig(null, y0.b(iel.e.COMPANY_MEETING), false)));
                }
                return Unit.f186387a;
            case 22:
                vd vdVar = (vd) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iod.g gVar4 = (iod.g) ((TripsDatePickerController) obj3).O.getValue();
                LocalDate date = vdVar.f166807b;
                gVar4.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                gVar4.H2(gVar4.f163228p, new ijg.c(gVar4, date, i6));
                return Unit.f186387a;
            case 23:
                Data data12 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) obj3;
                lVar.H2(lVar.f167661q, new ilk.i(data12, 19));
                return Unit.f186387a;
            case 24:
                Data data13 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ip7.j jVar5 = (ip7.j) obj3;
                jVar5.x2(new wk(data13, jVar5, 16));
                return Unit.f186387a;
            case 25:
                Data data14 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) obj3;
                kVar.H2(kVar.u, new ilk.i(data14, 20));
                return Unit.f186387a;
            case 26:
                iqf.l lVar2 = (iqf.l) obj3;
                ReasonForTransferChooserContract$InputData reasonForTransferChooserContract$InputData = lVar2.o;
                String str3 = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (str3.length() == 0) {
                    arrayList = reasonForTransferChooserContract$InputData.f92194a;
                } else {
                    ArrayList arrayList3 = reasonForTransferChooserContract$InputData.f92194a;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : arrayList3) {
                        if (d0.J(((krf.e) obj6).f188862b, str3, true)) {
                            arrayList4.add(obj6);
                        }
                    }
                    arrayList = arrayList4;
                }
                lVar2.H2(lVar2.f167835p, new e0(arrayList, i21));
                return Unit.f186387a;
            case 27:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i0 i0VarE3 = ((ThreeDsVerificationController) obj3).e3();
                Intrinsics.h(clickData);
                com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar2 = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) i0VarE3;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((g6i.i) dVar2.B).d3(clickData);
                return Unit.f186387a;
            case 28:
                isl.f fVar = (isl.f) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((isl.j) obj3).d.b3(fVar);
                return Unit.f186387a;
            default:
                kuc.d dVar3 = (kuc.d) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iuc.f fVar2 = (iuc.f) obj3;
                fVar2.H2(fVar2.f168549p, new evc.l(dVar3, 1));
                return Unit.f186387a;
        }
    }
}
