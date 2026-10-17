package sb4;

import com.revolut.chat.domain.model.rate.RateChatExperienceData;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.feature.terms.api.model.Terms;
import ft3.h1;
import gu7.x;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import slj.k;
import sm6.p;
import smd.u;
import sxd.z;
import tb4.m;
import tjh.h0;
import tmb.l;
import tof.a3;
import yhm.o;
import zh9.y;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f261510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f261511x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar, Continuation continuation) {
        super(1, continuation);
        this.u = 1;
        this.f261510w = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ac, code lost:
    
        if (vkm.q.x(r1, r20) == r3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.f261511x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f261510w
            com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b r2 = (com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.v
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L2c
            if (r4 == r9) goto L26
            if (r4 != r8) goto L1e
            yhm.o.b(r21)
            goto Laf
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            yhm.o.b(r21)
            r4 = r21
            goto L57
        L2c:
            yhm.o.b(r21)
            nii.y0 r4 = new nii.y0
            nii.c0 r10 = new nii.c0
            r18 = 0
            r19 = 2047(0x7ff, float:2.868E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.<init>(r7, r10, r6, r5)
            kotlinx.coroutines.flow.Flow r4 = r2.X1(r4)
            r10 = 7
            yji.l.b1(r2, r4, r7, r7, r10)
            r0.v = r9
            java.lang.Object r4 = com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b.I2(r2, r1, r0)
            if (r4 != r3) goto L57
            goto Lae
        L57:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto Laf
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r1 = d0m.b.a(r1)
            java.lang.String r9 = "Cannot process QR-code deeplink. Invalid deep link: "
            java.lang.String r1 = j6.a.q(r9, r1)
            r4.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            rd0.d.a(r9, r7, r7, r4, r1)
            nii.y0 r1 = new nii.y0
            nii.l0 r9 = new nii.l0
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_dialog_validation_error_title
            r11 = 14
            r10.<init>(r4, r7, r7, r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_dialog_validation_error_description
            r4.<init>(r12, r7, r7, r11)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.junior_settings.impl.R$string.youth_qr_scanner_dialog_validation_error_button_got_it
            r13.<init>(r12, r7, r7, r11)
            r17 = 0
            r18 = 948(0x3b4, float:1.328E-42)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 1
            r11 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.<init>(r7, r9, r6, r5)
            kotlinx.coroutines.flow.Flow r1 = r2.X1(r1)
            r0.v = r8
            java.lang.Object r1 = vkm.q.x(r1, r0)
            if (r1 != r3) goto Laf
        Lae:
            return r3
        Laf:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.i.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a aVar2 = (com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a) this.f261510w;
            lb5.b bVar = aVar2.f69062p;
            String str = aVar2.o.f69039a;
            com.revolut.feature.credit_card.autopay.api.models_v3.c cVar = (com.revolut.feature.credit_card.autopay.api.models_v3.c) this.f261511x;
            this.v = 1;
            if (((yb5.e) bVar).i(str, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f261510w, (m) this.f261511x, continuation, 0);
            case 1:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f261510w, continuation);
            case 2:
                return new i((sf9.g) this.f261510w, (Biller) this.f261511x, continuation, 2);
            case 3:
                return new i((sf9.g) this.f261510w, (String) this.f261511x, continuation, 3);
            case 4:
                return new i((kgm.i) this.f261510w, (String) this.f261511x, continuation, 4);
            case 5:
                return new i((sgd.f) this.f261511x, continuation, 5);
            case 6:
                return new i((k) this.f261510w, (String) this.f261511x, continuation, 6);
            case 7:
                return new i((p) this.f261510w, (String) this.f261511x, continuation, 7);
            case 8:
                return new i((u) this.f261510w, (LinkedHashSet) this.f261511x, continuation, 8);
            case 9:
                return new i((com.revolut.feature.transfer_reasons.impl.flow.refund.b) this.f261510w, (a3) this.f261511x, continuation, 9);
            case 10:
                return new i((sw3.c) this.f261510w, (h1) this.f261511x, continuation, 10);
            case 11:
                return new i((z) this.f261510w, (AutoTopUpState) this.f261511x, continuation, 11);
            case 12:
                return new i((t38.p) this.f261510w, (String) this.f261511x, continuation, 12);
            case 13:
                return new i((com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) this.f261510w, (h1j.d) this.f261511x, continuation, 13);
            case 14:
                return new i((t50.u) this.f261510w, (RateChatExperienceData) this.f261511x, continuation, 14);
            case 15:
                return new i((com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.a) this.f261510w, (String) this.f261511x, continuation, 15);
            case 16:
                return new i((com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b) this.f261510w, (LoanRepaymentAccountData) this.f261511x, continuation, 16);
            case 17:
                return new i((com.revolut.feature.onboarding.impl.exchange_global_access.flow.a) this.f261510w, (Terms) this.f261511x, continuation, 17);
            case 18:
                return new i((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) this.f261511x, continuation, 18);
            case 19:
                return new i((tg2.o) this.f261510w, (ApmPaymentAuthorisationPendingAction) this.f261511x, continuation, 19);
            case 20:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.product_articles.a) this.f261511x, continuation, 20);
            case 21:
                return new i((com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a) this.f261510w, (pi3.h) this.f261511x, continuation, 21);
            case 22:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.a) this.f261511x, continuation, 22);
            case 23:
                return new i((ty0.a) this.f261510w, (h0) this.f261511x, continuation, 23);
            case 24:
                return new i((tk9.j) this.f261510w, (y) this.f261511x, continuation, 24);
            case 25:
                return new i((tlg.h) this.f261511x, continuation, 25);
            case 26:
                return new i((l) this.f261510w, (tmb.h) this.f261511x, continuation, 26);
            case 27:
                return new i((com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.b) this.f261510w, (String) this.f261511x, continuation, 27);
            case 28:
                return new i((com.revolut.feature.credit.card.impl.ui.autopay.flow.settings.a) this.f261510w, (com.revolut.feature.credit_card.autopay.api.models_v3.c) this.f261511x, continuation, 28);
            default:
                return new i((tv7.j) this.f261510w, (x) this.f261511x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0514, code lost:
    
        if (c84.t.N2(r0, (it3.d) r1, r4, 2) != r6) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:544:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:582:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f261510w = obj2;
        this.f261511x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f261511x = hVar;
    }
}
