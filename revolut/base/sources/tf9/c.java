package tf9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ Biller v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f270269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f270270x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Biller biller, f fVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.v = biller;
        this.f270269w = fVar;
        this.f270270x = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f270269w, this.f270270x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Style, com.revolut.kompot.common.ModalDestination$Style, java.util.List, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            java.util.ArrayList r6 = r0.f270270x
            tf9.f r4 = r0.f270269w
            r9 = 1
            r7 = 0
            if (r2 == 0) goto L20
            if (r2 != r9) goto L18
            yhm.o.b(r24)
            r3 = r24
            r14 = r4
            r2 = r7
            goto L39
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            yhm.o.b(r24)
            com.revolut.feature.apm.bills.billers.api.model.Biller r5 = r0.v
            if (r5 == 0) goto L3d
            s15.j r3 = new s15.j
            r8 = 11
            r3.<init>(r4, r5, r6, r7, r8)
            r14 = r4
            r2 = r7
            r0.u = r9
            java.lang.Object r3 = r14.Y2(r0, r3)
            if (r3 != r1) goto L39
            return r1
        L39:
            r7 = r3
            com.revolut.feature.apm.bills.core.api.model.search.nz.BillSearchNzResult r7 = (com.revolut.feature.apm.bills.core.api.model.search.nz.BillSearchNzResult) r7
            goto L3f
        L3d:
            r14 = r4
            r2 = r7
        L3f:
            com.revolut.feature.pay_bills_taxes.impl.ui_payment.PaymentFlow r1 = new com.revolut.feature.pay_bills_taxes.impl.ui_payment.PaymentFlow
            xo1.g r4 = xo1.g.NZ_BILLS
            com.revolut.feature.apm.bills.core.api.model.BillTransferType r5 = com.revolut.feature.apm.bills.core.api.model.BillTransferType.BILL_PAYMENT
            if (r7 == 0) goto L4f
            dj0.d r3 = r7.f61443b
            if (r3 != 0) goto L4c
            goto L4f
        L4c:
            r16 = r3
            goto L5e
        L4f:
            dj0.d r3 = new dj0.d
            xi0.a r8 = xi0.b.Companion
            r8.getClass()
            xi0.b r8 = xi0.b.f306285y
            r10 = 0
            r3.<init>(r10, r8)
            goto L4c
        L5e:
            r3 = 0
            if (r7 == 0) goto L70
            boolean r8 = r7.e
            if (r8 != 0) goto L6c
            dj0.d r8 = r7.f61443b
            if (r8 != 0) goto L6a
            goto L6c
        L6a:
            r8 = r3
            goto L6d
        L6c:
            r8 = r9
        L6d:
            r19 = r8
            goto L72
        L70:
            r19 = r9
        L72:
            if (r7 == 0) goto L79
            com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider r8 = r7.d
            r21 = r8
            goto L7b
        L79:
            r21 = r2
        L7b:
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData r15 = new com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$BillData
            r20 = 0
            r22 = 0
            r17 = 0
            r18 = 0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_descriptor_payment_amount_title
            r11 = 14
            r8.<init>(r10, r2, r2, r11)
            r10 = r9
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.pay_bills_taxes.api.R$string.pay_bills_taxes_descriptor_payment_review_title
            r9.<init>(r12, r2, r2, r11)
            if (r7 == 0) goto L9e
            boolean r11 = r7.f
            goto L9f
        L9e:
            r11 = r3
        L9f:
            if (r11 == 0) goto Laf
            gte.a r11 = r14.o
            com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles$NzBillsSchedule r12 = com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles.NzBillsSchedule.f78662c
            jte.d r11 = (jte.d) r11
            boolean r11 = r11.c(r12)
            if (r11 == 0) goto Laf
            r11 = r10
            goto Lb0
        Laf:
            r11 = r3
        Lb0:
            if (r7 == 0) goto Lb4
            boolean r3 = r7.f61445g
        Lb4:
            r12 = r3
            com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData r3 = new com.revolut.feature.pay_bills_taxes.api.navigation.BillPaymentNavigation$InputData
            r10 = 0
            r13 = 576(0x240, float:8.07E-43)
            r7 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.<init>(r3)
            r3 = 3
            yji.n.P2(r14, r1, r2, r2, r3)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tf9.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
