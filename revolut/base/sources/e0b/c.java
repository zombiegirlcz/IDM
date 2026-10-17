package e0b;

import android.view.View;
import aw0.n6;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.hub.LoanPaymentSettingsHubController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputController;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlow;
import com.revolut.feature.restricted_access.impl.ui.generic.RestrictedGenericScreen;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreen;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreen;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountController;
import com.revolut.retail.feature.balance.picker.impl.new_picker.currency.CurrencyChooserScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.details_suggestions.DetailsSuggestionScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.enrollment.TravelStatusEnrollmentScreen;
import e1c.q;
import e2j.o;
import e3i.s;
import e8h.y;
import e9d.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import o7h.x;
import rp0.a0;
import yji.r;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f121547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121547w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((RestrictedGenericScreen) this.f121547w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((e0e.h) this.f121547w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c((e1a.f) this.f121547w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c((q) this.f121547w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c((SemiIndependentOnboardingDetailsScreen) this.f121547w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c((com.revolut.feature.semi_independent_onboarding.impl.ui.details.b) this.f121547w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c((CurrencyChooserScreen) this.f121547w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c((o) this.f121547w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c((TravelStatusEnrollmentScreen) this.f121547w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c((TPSLAmountController) this.f121547w, continuation, 9);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c((s) this.f121547w, continuation, 10);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c((e4h.b) this.f121547w, continuation, 11);
                cVar12.v = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c((e4h.c) this.f121547w, continuation, 12);
                cVar13.v = obj2;
                return cVar13;
            case 13:
                c cVar14 = new c((DetailsSuggestionScreen) this.f121547w, continuation, 13);
                cVar14.v = obj2;
                return cVar14;
            case 14:
                c cVar15 = new c((e52.b) this.f121547w, continuation, 14);
                cVar15.v = obj2;
                return cVar15;
            case 15:
                return new c((NavBarWithToolbar) this.v, (CreditAmountInputScreen) this.f121547w, continuation, 15);
            case 16:
                return new c((View) this.v, (CreditAmountInputScreen) this.f121547w, continuation, 16);
            case 17:
                c cVar16 = new c((e5e.f) this.f121547w, continuation, 17);
                cVar16.v = obj2;
                return cVar16;
            case 18:
                c cVar17 = new c((LoanPaymentSettingsHubController) this.f121547w, continuation, 18);
                cVar17.v = obj2;
                return cVar17;
            case 19:
                c cVar18 = new c((e75.o) this.f121547w, continuation, 19);
                cVar18.v = obj2;
                return cVar18;
            case 20:
                c cVar19 = new c((e76.d) this.f121547w, continuation, 20);
                cVar19.v = obj2;
                return cVar19;
            case 21:
                c cVar20 = new c((AmountInputController) this.f121547w, continuation, 21);
                cVar20.v = obj2;
                return cVar20;
            case 22:
                c cVar21 = new c((com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a) this.f121547w, continuation, 22);
                cVar21.v = obj2;
                return cVar21;
            case 23:
                c cVar22 = new c((IndexDetailsFlow) this.f121547w, continuation, 23);
                cVar22.v = obj2;
                return cVar22;
            case 24:
                c cVar23 = new c((BillSelectorScreen) this.f121547w, continuation, 24);
                cVar23.v = obj2;
                return cVar23;
            case 25:
                c cVar24 = new c((com.revolut.feature.wealth.impl.data.repositories.a) this.f121547w, continuation, 25);
                cVar24.v = obj2;
                return cVar24;
            case 26:
                c cVar25 = new c((y) this.f121547w, continuation, 26);
                cVar25.v = obj2;
                return cVar25;
            case 27:
                c cVar26 = new c((e94.h) this.f121547w, continuation, 27);
                cVar26.v = obj2;
                return cVar26;
            case 28:
                c cVar27 = new c((TransactionsTroubleshooterTopLevelScreen) this.f121547w, continuation, 28);
                cVar27.v = obj2;
                return cVar27;
            default:
                return new c(this.v, (z) this.f121547w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((xxd.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((a3h.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((k3h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((e76.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((x) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05a7  */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 2108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0b.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f121547w = rVar;
    }
}
