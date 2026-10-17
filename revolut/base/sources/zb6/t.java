package zb6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function3 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f320822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f320823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a f320824y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar, Continuation continuation) {
        super(3, continuation);
        this.f320824y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        t tVar = new t(this.f320824y, (Continuation) obj4);
        tVar.f320822w = (FlowCollector) obj2;
        tVar.f320823x = (Data) obj3;
        return tVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            kotlinx.coroutines.flow.FlowCollector r1 = r0.f320822w
            com.revolut.data.model.Data r2 = r0.f320823x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.v
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L1f
            if (r4 != r6) goto L17
            int r1 = r0.u
            yhm.o.b(r26)
            goto La2
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            yhm.o.b(r26)
            boolean r4 = r2.getLoading()
            r7 = 0
            if (r4 != 0) goto L41
            java.lang.Throwable r4 = r2.getError()
            if (r4 != 0) goto L41
            java.lang.Object r4 = r2.getContent()
            od0.i r4 = (od0.i) r4
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r4.f224257a
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod$Pocket r4 = (com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod.Pocket) r4
            goto L3d
        L3c:
            r4 = r7
        L3d:
            if (r4 != 0) goto L41
            r4 = r6
            goto L42
        L41:
            r4 = r5
        L42:
            if (r4 == 0) goto L92
            com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a r8 = r0.f320824y
            sc6.d r9 = r8.f72089q
            r9.getClass()
            nii.y0 r9 = new nii.y0
            nii.z r10 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.feature.donations.impl.R$string.donations_payment_methods_error_title
            r13 = 14
            r11.<init>(r12, r7, r7, r13)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.donations.impl.R$string.donations_payment_methods_error_description
            r12.<init>(r14, r7, r7, r13)
            com.revolut.core.ui_kit.models.TextLocalisedClause r14 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r15 = com.revolut.feature.donations.impl.R$string.donations_common_action_got_it
            r14.<init>(r15, r7, r7, r13)
            r23 = 0
            r24 = 32756(0x7ff4, float:4.5901E-41)
            r13 = r14
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r11 = 5
            r9.<init>(r7, r10, r5, r11)
            kotlinx.coroutines.flow.Flow r9 = r8.X1(r9)
            zb6.q r12 = new zb6.q
            r10 = 0
            r12.<init>(r10, r8, r7)
            r13 = 3
            r10 = 0
            r11 = 0
            yji.l.a1(r8, r9, r10, r11, r12, r13)
        L92:
            r0.f320822w = r7
            r0.f320823x = r7
            r0.u = r4
            r0.v = r6
            java.lang.Object r1 = r1.emit(r2, r0)
            if (r1 != r3) goto La1
            return r3
        La1:
            r1 = r4
        La2:
            if (r1 != 0) goto La5
            r5 = r6
        La5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zb6.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
