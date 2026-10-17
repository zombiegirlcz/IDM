package bmk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import nii.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function0 f16865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f16866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function1 f16867y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, Function0 function0, j0 j0Var, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f16865w = function0;
        this.f16866x = j0Var;
        this.f16867y = function1;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f16865w, this.f16866x, this.f16867y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r2 = 2
            r3 = 1
            bmk.q r4 = r5.v
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L12
            goto L47
        L12:
            r6 = move-exception
            goto L67
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L12
            goto L38
        L20:
            yhm.o.b(r6)
            pfk.x r6 = r4.f16884m     // Catch: java.lang.Throwable -> L12
            com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanCancelService r6 = r6.f235707a     // Catch: java.lang.Throwable -> L12
            efm.b r6 = r6.acceptCancellationPreventingOffer()     // Catch: java.lang.Throwable -> L12
            pfm.r r6 = te0.w.g0(r6)     // Catch: java.lang.Throwable -> L12
            r5.u = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r6 = nim.a.a(r6, r5)     // Catch: java.lang.Throwable -> L12
            if (r6 != r0) goto L38
            goto L46
        L38:
            ffk.t r6 = r4.o     // Catch: java.lang.Throwable -> L12
            rfm.f0 r6 = r6.y()     // Catch: java.lang.Throwable -> L12
            r5.u = r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r6 = nim.a.b(r6, r5)     // Catch: java.lang.Throwable -> L12
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r6 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r6     // Catch: java.lang.Throwable -> L12
            nii.y0 r6 = new nii.y0
            r0 = 0
            r1 = 4
            java.lang.String r2 = "ID_CLAIM_OFFER_SUCCESS_DIALOG"
            nii.j0 r3 = r5.f16866x
            r6.<init>(r2, r3, r0, r1)
            kotlinx.coroutines.flow.Flow r6 = r4.L2(r6)
            bmk.p r0 = new bmk.p
            kotlin.jvm.functions.Function1 r1 = r5.f16867y
            r2 = 0
            r0.<init>(r1, r2)
            r1 = 3
            yji.n.j2(r4, r6, r2, r0, r1)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L67:
            kotlin.jvm.functions.Function0 r0 = r5.f16865w
            r0.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bmk.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
