package gaa;

import aw0.f4;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.impl.flow.screen.add.AddAddressScreen;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListController;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.HowItWorksScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.select_solicitor.SelectSolicitorController;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.preview.EarnAssetsPreviewScreenController;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.feature.pix.impl.flow.refund.screen.amount.PixRefundAmountScreen;
import com.revolut.feature.revolutpay.shared.ui.add_payment_method.AddPaymentMethodScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit.IsaTransferReviewSubmitScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.TravelHotelsRoomDetailsScreen;
import dfj.x0;
import gc1.q;
import gck.w;
import gh3.l;
import ghl.m;
import ip0.ku;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import nii.n1;
import rp0.p;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f142120w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f142120w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((j) this.f142120w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g((gab.c) this.f142120w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g((IsaTransferReviewSubmitScreen) this.f142120w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            case 3:
                g gVar4 = new g((aah.g) this.f142120w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
            case 4:
                g gVar5 = new g((q) this.f142120w, continuation, 4);
                gVar5.v = obj2;
                return gVar5;
            case 5:
                g gVar6 = new g((HowItWorksScreen) this.f142120w, continuation, 5);
                gVar6.v = obj2;
                return gVar6;
            case 6:
                g gVar7 = new g((PixRefundAmountScreen) this.f142120w, continuation, 6);
                gVar7.v = obj2;
                return gVar7;
            case 7:
                g gVar8 = new g((gch.j) this.f142120w, continuation, 7);
                gVar8.v = obj2;
                return gVar8;
            case 8:
                g gVar9 = new g((w) this.f142120w, continuation, 8);
                gVar9.v = obj2;
                return gVar9;
            case 9:
                g gVar10 = new g((IDealAccountsListController) this.f142120w, continuation, 9);
                gVar10.v = obj2;
                return gVar10;
            case 10:
                g gVar11 = new g((AddPaymentMethodScreen) this.f142120w, continuation, 10);
                gVar11.v = obj2;
                return gVar11;
            case 11:
                g gVar12 = new g((gdk.g) this.f142120w, continuation, 11);
                gVar12.v = obj2;
                return gVar12;
            case 12:
                g gVar13 = new g((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b) this.f142120w, continuation, 12);
                gVar13.v = obj2;
                return gVar13;
            case 13:
                g gVar14 = new g((ge5.g) this.f142120w, continuation, 13);
                gVar14.v = obj2;
                return gVar14;
            case 14:
                g gVar15 = new g((com.revolut.feature.in_app_calls.flow.c) this.f142120w, continuation, 14);
                gVar15.v = obj2;
                return gVar15;
            case 15:
                g gVar16 = new g((TravelHotelsRoomDetailsScreen) this.f142120w, continuation, 15);
                gVar16.v = obj2;
                return gVar16;
            case 16:
                g gVar17 = new g((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.a) this.f142120w, continuation, 16);
                gVar17.v = obj2;
                return gVar17;
            case 17:
                g gVar18 = new g((EarnAssetsPreviewScreenController) this.f142120w, continuation, 17);
                gVar18.v = obj2;
                return gVar18;
            case 18:
                g gVar19 = new g((gf5.h) this.f142120w, continuation, 18);
                gVar19.v = obj2;
                return gVar19;
            case 19:
                g gVar20 = new g((eim.c) this.f142120w, continuation, 19);
                gVar20.v = obj2;
                return gVar20;
            case 20:
                g gVar21 = new g((com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.b) this.f142120w, continuation, 20);
                gVar21.v = obj2;
                return gVar21;
            case 21:
                g gVar22 = new g((ChecklistStepDetailsScreen) this.f142120w, continuation, 21);
                gVar22.v = obj2;
                return gVar22;
            case 22:
                g gVar23 = new g((l) this.f142120w, continuation, 22);
                gVar23.v = obj2;
                return gVar23;
            case 23:
                g gVar24 = new g((ghl.b) this.f142120w, continuation, 23);
                gVar24.v = obj2;
                return gVar24;
            case 24:
                g gVar25 = new g((ghl.g) this.f142120w, continuation, 24);
                gVar25.v = obj2;
                return gVar25;
            case 25:
                g gVar26 = new g((ghl.j) this.f142120w, continuation, 25);
                gVar26.v = obj2;
                return gVar26;
            case 26:
                g gVar27 = new g((m) this.f142120w, continuation, 26);
                gVar27.v = obj2;
                return gVar27;
            case 27:
                g gVar28 = new g((AddAddressScreen) this.f142120w, continuation, 27);
                gVar28.v = obj2;
                return gVar28;
            case 28:
                g gVar29 = new g((SelectSolicitorController) this.f142120w, continuation, 28);
                gVar29.v = obj2;
                return gVar29;
            default:
                g gVar30 = new g((gie.i) this.f142120w, continuation, 29);
                gVar30.v = obj2;
                return gVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((gab.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((g) create((gch.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((g) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((g) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((g) create((ge1.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((g) create((InAppCallStateWithData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((g) create((ku) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((g) create((x0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((g) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((shl.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((txl.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gaa.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
