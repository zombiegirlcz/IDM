package gii;

import android.view.View;
import aw0.n6;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.bottom_sheet.BottomSheetScreen;
import com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.account_details.AccountDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser.ReasonForTransferChooserScreen;
import com.revolut.feature.transfer_reasons.impl.ui.legal_confirmation.LegalConfirmationScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.common.ScreenerIconOption;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.SaveScreenerCollectionScreen;
import com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plan.intro.FamilyPlanIntroScreen;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_pin.EnterCardPINScreen;
import gim.i;
import gjh.d;
import gk7.m;
import gk9.o;
import glk.l;
import gm5.e;
import gna.h;
import gnl.s;
import gq4.r;
import gqd.v;
import gtd.p;
import gtk.f;
import ip0.kx;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f144219w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f144219w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b((MonthPickerBottomSheetController) this.f144219w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b((d) this.f144219w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b((m) this.f144219w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            case 3:
                return new b((gk8.d) this.v, (JuniorProgressionPromptStage) this.f144219w, continuation, 3);
            case 4:
                b bVar4 = new b((o) this.f144219w, continuation, 4);
                bVar4.v = obj2;
                return bVar4;
            case 5:
                b bVar5 = new b((FamilyPlanIntroScreen) this.f144219w, continuation, 5);
                bVar5.v = obj2;
                return bVar5;
            case 6:
                b bVar6 = new b((EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen) this.f144219w, continuation, 6);
                bVar6.v = obj2;
                return bVar6;
            case 7:
                b bVar7 = new b((l) this.f144219w, continuation, 7);
                bVar7.v = obj2;
                return bVar7;
            case 8:
                b bVar8 = new b((EnterCardPINScreen) this.f144219w, continuation, 8);
                bVar8.v = obj2;
                return bVar8;
            case 9:
                b bVar9 = new b((e) this.f144219w, continuation, 9);
                bVar9.v = obj2;
                return bVar9;
            case 10:
                return new b((com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d) this.v, (String) this.f144219w, continuation, 10);
            case 11:
                b bVar10 = new b((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.a) this.f144219w, continuation, 11);
                bVar10.v = obj2;
                return bVar10;
            case 12:
                b bVar11 = new b((h) this.f144219w, continuation, 12);
                bVar11.v = obj2;
                return bVar11;
            case 13:
                b bVar12 = new b((s) this.f144219w, continuation, 13);
                bVar12.v = obj2;
                return bVar12;
            case 14:
                b bVar13 = new b((MtaReviewScreen) this.f144219w, continuation, 14);
                bVar13.v = obj2;
                return bVar13;
            case 15:
                b bVar14 = new b((gpb.o) this.f144219w, continuation, 15);
                bVar14.v = obj2;
                return bVar14;
            case 16:
                b bVar15 = new b((com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.b) this.f144219w, continuation, 16);
                bVar15.v = obj2;
                return bVar15;
            case 17:
                b bVar16 = new b((r) this.f144219w, continuation, 17);
                bVar16.v = obj2;
                return bVar16;
            case 18:
                b bVar17 = new b((v) this.f144219w, continuation, 18);
                bVar17.v = obj2;
                return bVar17;
            case 19:
                b bVar18 = new b((ReasonForTransferChooserScreen) this.f144219w, continuation, 19);
                bVar18.v = obj2;
                return bVar18;
            case 20:
                b bVar19 = new b((SaveScreenerCollectionScreen) this.f144219w, continuation, 20);
                bVar19.v = obj2;
                return bVar19;
            case 21:
                b bVar20 = new b((AccountDetailsController) this.f144219w, continuation, 21);
                bVar20.v = obj2;
                return bVar20;
            case 22:
                return new b((AddEditAssetController) this.v, (View) this.f144219w, continuation, 22);
            case 23:
                return new b((gs.r) this.v, (String) this.f144219w, continuation, 23);
            case 24:
                b bVar21 = new b((BottomSheetScreen) this.f144219w, continuation, 24);
                bVar21.v = obj2;
                return bVar21;
            case 25:
                b bVar22 = new b((p) this.f144219w, continuation, 25);
                bVar22.v = obj2;
                return bVar22;
            case 26:
                b bVar23 = new b((LegalConfirmationScreen) this.f144219w, continuation, 26);
                bVar23.v = obj2;
                return bVar23;
            case 27:
                b bVar24 = new b((f) this.f144219w, continuation, 27);
                bVar24.v = obj2;
                return bVar24;
            case 28:
                b bVar25 = new b((EligibilityCriteriaController) this.f144219w, continuation, 28);
                bVar25.v = obj2;
                return bVar25;
            default:
                b bVar26 = new b((guj.d) this.f144219w, continuation, 29);
                bVar26.v = obj2;
                return bVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((kx) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((gjh.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((EsimPhoneNumberPortingOwnerAccountType) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((hha.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((ec5.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((eql.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((krf.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((ScreenerIconOption) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((ftk.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0167  */
    /* JADX WARN: Type inference failed for: r12v102, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v96, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gii.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f144219w = obj2;
    }
}
