package qc3;

import alc.n;
import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.EditTaxRateScreen;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.ui.select_store.CashTopUpSelectStoreScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.BigTileOfferContentScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodScreen;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultController;
import com.revolut.feature.junior_rewards.impl.ui.details_dialog.JuniorRewardDetailsDialogScreen;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.list.RevolutPayPromotedMerchantsController;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.picker.TravelHotelsFilterOptionsPickerScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.x10;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import qca.q;
import qgg.o;
import qoc.r;
import yy3.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f244540w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f244540w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((CashTopUpSelectStoreScreen) this.f244540w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((k) this.f244540w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c((qc6.j) this.f244540w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c((q) this.f244540w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c((RevolutPayPromotedMerchantsController) this.f244540w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c((EditTaxRateScreen) this.f244540w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c((qe4.l) this.f244540w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c((qe5.l) this.f244540w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c((com.revolut.feature.retail.restaurants.impl.ui.reservationdetails.a) this.f244540w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c((TravelHotelsFilterOptionsPickerScreen) this.f244540w, continuation, 9);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c((qeg.j) this.f244540w, continuation, 10);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c((qej.e) this.f244540w, continuation, 11);
                cVar12.v = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c((BigTileOfferContentScreen) this.f244540w, continuation, 12);
                cVar13.v = obj2;
                return cVar13;
            case 13:
                c cVar14 = new c((qg1.k) this.f244540w, continuation, 13);
                cVar14.v = obj2;
                return cVar14;
            case 14:
                c cVar15 = new c((LotteryResultController) this.f244540w, continuation, 14);
                cVar15.v = obj2;
                return cVar15;
            case 15:
                c cVar16 = new c((o) this.f244540w, continuation, 15);
                cVar16.v = obj2;
                return cVar16;
            case 16:
                c cVar17 = new c((qj8.j) this.f244540w, continuation, 16);
                cVar17.v = obj2;
                return cVar17;
            case 17:
                c cVar18 = new c((qj8.l) this.f244540w, continuation, 17);
                cVar18.v = obj2;
                return cVar18;
            case 18:
                c cVar19 = new c((qjk.e) this.f244540w, continuation, 18);
                cVar19.v = obj2;
                return cVar19;
            case 19:
                return new c((k7i.i) this.v, (FeatureCommand) this.f244540w, continuation, 19);
            case 20:
                c cVar20 = new c((SelectAutopayMethodScreen) this.f244540w, continuation, 20);
                cVar20.v = obj2;
                return cVar20;
            case 21:
                c cVar21 = new c((ql9.d) this.f244540w, continuation, 21);
                cVar21.v = obj2;
                return cVar21;
            case 22:
                c cVar22 = new c((com.revolut.sso.impl.ui.combined_authentication.unified.a) this.f244540w, continuation, 22);
                cVar22.v = obj2;
                return cVar22;
            case 23:
                c cVar23 = new c((JuniorRewardDetailsDialogScreen) this.f244540w, continuation, 23);
                cVar23.v = obj2;
                return cVar23;
            case 24:
                c cVar24 = new c((qm8.d) this.f244540w, continuation, 24);
                cVar24.v = obj2;
                return cVar24;
            case 25:
                c cVar25 = new c((qmc.h) this.f244540w, continuation, 25);
                cVar25.v = obj2;
                return cVar25;
            case 26:
                return new c((qmd.j) this.v, (qmd.a) this.f244540w, continuation, 26);
            case 27:
                c cVar26 = new c((qmg.l) this.f244540w, continuation, 27);
                cVar26.v = obj2;
                return cVar26;
            case 28:
                c cVar27 = new c((aah.g) this.f244540w, continuation, 28);
                cVar27.v = obj2;
                return cVar27;
            default:
                c cVar28 = new c((r) this.f244540w, continuation, 29);
                cVar28.v = obj2;
                return cVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((CashTopUpLocationInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((pej.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((qj8.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((eql.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((qmh.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x049a  */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v12 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qc3.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244540w = obj2;
    }
}
