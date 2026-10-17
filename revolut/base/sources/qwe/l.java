package qwe;

import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ste.o f249899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f249900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CheckoutScreenContract$CheckoutContent$Order f249901y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, ste.o oVar, dj0.d dVar, CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f249899w = oVar;
        this.f249900x = dVar;
        this.f249901y = checkoutScreenContract$CheckoutContent$Order;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f249899w, this.f249900x, this.f249901y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(r1, null, false, r7, 3) == r0) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            yhm.o.b(r8)
            goto L90
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            yhm.o.b(r8)
            goto L80
        L1d:
            yhm.o.b(r8)
            com.revolut.feature.topup_screen.impl.flows.checkout.flow.e r1 = r7.v
            com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData r8 = r1.o
            com.revolut.feature.checkout.models.CheckoutConfig r4 = r8.f90669b
            boolean r4 = r4 instanceof com.revolut.feature.checkout.models.ThreeDsCheckout
            r5 = 0
            dj0.d r6 = r7.f249900x
            if (r4 == 0) goto L5c
            ste.o r8 = r7.f249899w
            ste.n r8 = (ste.n) r8
            com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee r8 = r8.f265568a
            boolean r0 = r8 instanceof com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee.FeeRequired
            if (r0 == 0) goto L56
            zte.b r0 = r1.D
            com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee$FeeRequired r8 = (com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee.FeeRequired) r8
            dj0.d r8 = r8.f90520b
            c1f.a r0 = (c1f.a) r0
            nii.y0 r8 = r0.c(r6, r8)
            kotlinx.coroutines.flow.Flow r2 = r1.X1(r8)
            r4 = r5
            qwe.k r5 = new qwe.k
            r8 = 0
            r5.<init>(r1, r4, r8)
            r6 = 3
            r3 = 0
            r4 = 0
            skm.a2 r8 = yji.l.a1(r1, r2, r3, r4, r5, r6)
            return r8
        L56:
            r1.O2()
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L5c:
            r4 = r5
            com.revolut.feature.topup_screen.common.TopUpTarget r8 = r8.f90670c
            boolean r8 = r8 instanceof com.revolut.feature.topup_screen.common.TopUpTarget.Pro
            if (r8 == 0) goto L83
            xi0.b r8 = r6.f115083b
            r7.u = r3
            r2 = r1
            oqk.h r1 = new oqk.h
            r6 = 16
            r5 = r4
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order r4 = r7.f249901y
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r2
            java.lang.Object r8 = r8.p2(r7, r1)
            if (r8 != r0) goto L7b
            goto L7d
        L7b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L7d:
            if (r8 != r0) goto L80
            goto L8f
        L80:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L83:
            r8 = r1
            r5 = r4
            r7.u = r2
            r1 = 0
            r2 = 3
            java.lang.Object r8 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(r8, r5, r1, r7, r2)
            if (r8 != r0) goto L90
        L8f:
            return r0
        L90:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qwe.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
