package jv;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.code.ui.ApmCodeController;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.payment_info.PixAuthorisationPaymentInfoScreen;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.ramp_fees.RampFeesExplainerScreen;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.edit_dates.TravelItineraryEditDatesScreen;
import ip0.vd;
import java.io.File;
import java.util.List;
import k6a.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nii.y0;

/* JADX INFO: loaded from: classes16.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f178713w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f178713w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o((r) this.f178713w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o((SecurityHubScreen) this.f178713w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                return new o((com.revolut.feature.security_hub.impl.ui.security_hub.c) this.v, (y0) this.f178713w, continuation, 2);
            case 3:
                o oVar3 = new o((TravelItineraryEditDatesScreen) this.f178713w, continuation, 3);
                oVar3.v = obj2;
                return oVar3;
            case 4:
                o oVar4 = new o((TransactionsLimitsChangeScreen) this.f178713w, continuation, 4);
                oVar4.v = obj2;
                return oVar4;
            case 5:
                o oVar5 = new o((jwf.n) this.f178713w, continuation, 5);
                oVar5.v = obj2;
                return oVar5;
            case 6:
                o oVar6 = new o((ApmCodeController) this.f178713w, continuation, 6);
                oVar6.v = obj2;
                return oVar6;
            case 7:
                o oVar7 = new o((jy6.m) this.f178713w, continuation, 7);
                oVar7.v = obj2;
                return oVar7;
            case 8:
                o oVar8 = new o((jyg.n) this.f178713w, continuation, 8);
                oVar8.v = obj2;
                return oVar8;
            case 9:
                o oVar9 = new o((jz6.o) this.f178713w, continuation, 9);
                oVar9.v = obj2;
                return oVar9;
            case 10:
                o oVar10 = new o((k0d.f) this.f178713w, continuation, 10);
                oVar10.v = obj2;
                return oVar10;
            case 11:
                return new o((k1f.k) this.v, (u2f.j) this.f178713w, continuation, 11);
            case 12:
                o oVar11 = new o((com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a) this.f178713w, continuation, 12);
                oVar11.v = obj2;
                return oVar11;
            case 13:
                o oVar12 = new o(continuation, (CreditCard) this.f178713w);
                oVar12.v = obj2;
                return oVar12;
            case 14:
                o oVar13 = new o((k2a.d) this.f178713w, continuation, 14);
                oVar13.v = obj2;
                return oVar13;
            case 15:
                o oVar14 = new o((InstrumentSelectionController) this.f178713w, continuation, 15);
                oVar14.v = obj2;
                return oVar14;
            case 16:
                o oVar15 = new o((com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) this.f178713w, continuation, 16);
                oVar15.v = obj2;
                return oVar15;
            case 17:
                o oVar16 = new o((TravelExperiencesSearchScreen) this.f178713w, continuation, 17);
                oVar16.v = obj2;
                return oVar16;
            case 18:
                o oVar17 = new o((k3g.o) this.f178713w, continuation, 18);
                oVar17.v = obj2;
                return oVar17;
            case 19:
                return new o((List) this.v, (File) this.f178713w, continuation, 19);
            case 20:
                o oVar18 = new o((s) this.f178713w, continuation, 20);
                oVar18.v = obj2;
                return oVar18;
            case 21:
                o oVar19 = new o((k6g.j) this.f178713w, continuation, 21);
                oVar19.v = obj2;
                return oVar19;
            case 22:
                o oVar20 = new o((RevolutFeedScreen) this.f178713w, continuation, 22);
                oVar20.v = obj2;
                return oVar20;
            case 23:
                o oVar21 = new o((RampFeesExplainerScreen) this.f178713w, continuation, 23);
                oVar21.v = obj2;
                return oVar21;
            case 24:
                o oVar22 = new o((FaqListScreen) this.f178713w, continuation, 24);
                oVar22.v = obj2;
                return oVar22;
            case 25:
                o oVar23 = new o((com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) this.f178713w, continuation, 25);
                oVar23.v = obj2;
                return oVar23;
            case 26:
                o oVar24 = new o((PixAuthorisationPaymentInfoScreen) this.f178713w, continuation, 26);
                oVar24.v = obj2;
                return oVar24;
            case 27:
                o oVar25 = new o((k9c.j) this.f178713w, continuation, 27);
                oVar25.v = obj2;
                return oVar25;
            case 28:
                return new o((k9e.i) this.v, (qua.p) this.f178713w, continuation, 28);
            default:
                o oVar26 = new o((AreaScreen) this.f178713w, continuation, 29);
                oVar26.v = obj2;
                return oVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((xv.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((o) create((OnboardingInputDataValidator$ValidationState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((o) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01df  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r2v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 1938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178713w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, CreditCard creditCard) {
        super(2, continuation);
        this.u = 13;
        this.f178713w = creditCard;
    }
}
