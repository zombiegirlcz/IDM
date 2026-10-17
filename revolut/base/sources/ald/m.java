package ald;

import au6.r3;
import bn4.b0;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import com.revolut.feature.onboarding.impl.onboarding.v;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import cuc.z;
import g48.r0;
import h93.f0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import kkf.i1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f6235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6237y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, Serializable serializable, Object obj2, Continuation continuation, boolean z) {
        super(2, continuation);
        this.u = i;
        this.f6235w = z;
        this.f6236x = obj2;
        this.f6237y = serializable;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m((r) this.f6236x, (SlotContext) this.f6237y, this.f6235w, continuation, 0);
            case 1:
                return new m((r3) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 1);
            case 2:
                return new m((b47.h) this.f6236x, (FreelancerTaxProfile) this.f6237y, this.f6235w, continuation, 2);
            case 3:
                return new m((com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.f6236x, (BigDecimal) this.f6237y, this.f6235w, continuation, 3);
            case 4:
                return new m((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) this.f6236x, (pfj.i) this.f6237y, this.f6235w, continuation, 4);
            case 5:
                return new m((b0) this.f6236x, (CreditCardDeeplink) this.f6237y, this.f6235w, continuation, 5);
            case 6:
                return new m((List) this.f6236x, (bq8.e) this.f6237y, this.f6235w, continuation, 6);
            case 7:
                return new m((bw6.l) this.f6236x, this.f6235w, (FreelancerInvoice) this.f6237y, continuation, 7);
            case 8:
                return new m((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 8);
            case 9:
                return new m((z) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 9);
            case 10:
                return new m(10, (qua.p) this.f6237y, (com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f6236x, continuation, this.f6235w);
            case 11:
                return new m((CheckoutParams) this.f6236x, (ei3.m) this.f6237y, this.f6235w, continuation, 11);
            case 12:
                return new m((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e) this.f6236x, (PersonalDetailsForm) this.f6237y, this.f6235w, continuation, 12);
            case 13:
                return new m((elf.e) this.f6236x, (a3) this.f6237y, this.f6235w, continuation, 13);
            case 14:
                return new m((em3.e) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 14);
            case 15:
                return new m(15, (String) this.f6237y, (enb.g) this.f6236x, continuation, this.f6235w);
            case 16:
                return new m((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 16);
            case 17:
                m mVar = new m((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) this.f6237y, this.f6235w, continuation, 17);
                mVar.f6236x = obj2;
                return mVar;
            case 18:
                m mVar2 = new m((r0) this.f6237y, this.f6235w, continuation, 18);
                mVar2.f6236x = obj2;
                return mVar2;
            case 19:
                return new m((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 19);
            case 20:
                return new m((v) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 20);
            case 21:
                return new m((jf0.c) this.f6236x, (gnd.e) this.f6237y, this.f6235w, continuation, 21);
            case 22:
                m mVar3 = new m((gui.j) this.f6237y, this.f6235w, continuation, 22);
                mVar3.f6236x = obj2;
                return mVar3;
            case 23:
                return new m((com.revolut.feature.security_hub.impl.ui.flow.m) this.f6236x, this.f6235w, (f0) this.f6237y, continuation, 23);
            case 24:
                return new m((edk.e) this.f6236x, (jf0.c) this.f6237y, this.f6235w, continuation, 24);
            case 25:
                return new m((jh6.g) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 25);
            case 26:
                return new m((kf9.c) this.f6236x, (jf0.c) this.f6237y, this.f6235w, continuation, 26);
            case 27:
                return new m((i1) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 27);
            case 28:
                return new m((kkl.b) this.f6236x, this.f6235w, (String) this.f6237y, continuation, 28);
            default:
                return new m((com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c) this.f6236x, (String) this.f6237y, this.f6235w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0673  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v10 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ald.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6236x = obj2;
        this.f6237y = obj3;
        this.f6235w = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, boolean z, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6236x = obj2;
        this.f6235w = z;
        this.f6237y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6237y = obj2;
        this.f6235w = z;
    }
}
