package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment;

import ej6.u;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ d u;
    public final /* synthetic */ yki.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ OpenBankingAuthPaymentFlowContract$Step f72516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f72517x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, yki.b bVar, OpenBankingAuthPaymentFlowContract$Step openBankingAuthPaymentFlowContract$Step, u uVar, Continuation continuation) {
        super(2, continuation);
        this.u = dVar;
        this.v = bVar;
        this.f72516w = openBankingAuthPaymentFlowContract$Step;
        this.f72517x = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, this.f72516w, this.f72517x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r15)
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step$BalancePicker r15 = new com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step$BalancePicker
            com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData r0 = new com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d r1 = r14.u
            pi6.k r2 = r1.o
            boolean r2 = r2.f236447g
            java.lang.String r3 = "elements"
            if (r2 == 0) goto L29
            k1j.a r2 = k1j.a.POCKETS
            k1j.a r4 = k1j.a.JOINT_ACCOUNT
            k1j.a r5 = k1j.a.VAULTS
            k1j.a r6 = k1j.a.JOINT_VAULTS
            k1j.a r7 = k1j.a.CREDIT_CARDS
            k1j.a[] r2 = new k1j.a[]{r2, r4, r5, r6, r7}
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.util.Set r2 = kotlin.collections.d.y0(r2)
            goto L3a
        L29:
            k1j.a r2 = k1j.a.POCKETS
            k1j.a r4 = k1j.a.JOINT_ACCOUNT
            k1j.a r5 = k1j.a.VAULTS
            k1j.a[] r2 = new k1j.a[]{r2, r4, r5}
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.util.Set r2 = kotlin.collections.d.y0(r2)
        L3a:
            k1j.d r3 = k1j.d.RETAIL
            pi6.k r1 = r1.o
            boolean r1 = r1.f236447g
            java.lang.String r11 = "<this>"
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step r12 = r14.f72516w
            ej6.u r4 = r14.f72517x
            if (r1 == 0) goto L64
            r1 = r12
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step$PaymentScreen r1 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step.PaymentScreen) r1
            com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData r1 = r1.f72512a
            com.revolut.domain.models.openbanking.OpenBankingPayment r1 = r1.f72530b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r11)
            com.revolut.domain.models.openbanking.PaymentConsentType r1 = r1.f60385a
            com.revolut.domain.models.openbanking.PaymentConsentType r5 = com.revolut.domain.models.openbanking.PaymentConsentType.DOMESTIC_PAYMENT
            if (r1 == r5) goto L64
            com.revolut.domain.models.openbanking.PaymentConsentType r5 = com.revolut.domain.models.openbanking.PaymentConsentType.DOMESTIC_RECURRING_ORDER
            if (r1 == r5) goto L64
            com.revolut.domain.models.openbanking.PaymentConsentType r5 = com.revolut.domain.models.openbanking.PaymentConsentType.DOMESTIC_SCHEDULED_PAYMENT
            if (r1 != r5) goto L61
            goto L64
        L61:
            r1 = 0
        L62:
            r6 = r1
            goto L72
        L64:
            r1 = r4
            ej6.t r1 = (ej6.t) r1
            dj0.d r1 = r1.f126756c
            xi0.b r1 = r1.f115083b
            java.lang.String r1 = r1.f306286a
            java.util.Set r1 = zhm.y0.b(r1)
            goto L62
        L72:
            r13 = r4
            ej6.t r13 = (ej6.t) r13
            java.lang.String r8 = r13.f126754a
            r9 = 0
            r10 = 344(0x158, float:4.82E-43)
            r1 = r2
            r2 = r3
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = r13.f126755b
            dj0.d r2 = r13.f126756c
            com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step$PaymentScreen r12 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step.PaymentScreen) r12
            com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData r3 = r12.f72512a
            com.revolut.domain.models.openbanking.OpenBankingPayment r3 = r3.f72530b
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r11)
            com.revolut.domain.models.openbanking.PaymentConsentType r3 = r3.f60385a
            com.revolut.domain.models.openbanking.PaymentConsentType r4 = com.revolut.domain.models.openbanking.PaymentConsentType.DOMESTIC_PAYMENT
            if (r3 == r4) goto La1
            com.revolut.domain.models.openbanking.PaymentConsentType r4 = com.revolut.domain.models.openbanking.PaymentConsentType.DOMESTIC_RECURRING_ORDER
            if (r3 == r4) goto La1
            com.revolut.domain.models.openbanking.PaymentConsentType r4 = com.revolut.domain.models.openbanking.PaymentConsentType.DOMESTIC_SCHEDULED_PAYMENT
            if (r3 != r4) goto L9f
            goto La1
        L9f:
            r3 = 0
            goto La2
        La1:
            r3 = 1
        La2:
            r15.<init>(r0, r1, r2, r3)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r0 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            yki.b r1 = r14.v
            oki.h.w2(r1, r15, r0)
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
