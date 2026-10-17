package is2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b u;
    public a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f168096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168097x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b f168098y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f168098y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.f168098y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.f168097x
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b r0 = r12.u
            yhm.o.b(r13)
            goto L80
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            int r1 = r12.f168096w
            tof.a3 r3 = r12.v
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b r5 = r12.u
            yhm.o.b(r13)
            goto L5b
        L26:
            yhm.o.b(r13)
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b r5 = r12.f168098y
            jki.i r13 = r5.t2()
            is2.f r13 = (is2.f) r13
            tof.a3 r13 = r13.d
            if (r13 == 0) goto L98
            skm.a2 r1 = r5.z
            if (r1 == 0) goto L3c
            r1.f(r4)
        L3c:
            ip4.m r1 = new ip4.m
            r6 = 22
            r1.<init>(r6)
            r5.x2(r1)
            java.lang.String r1 = r13.f272581b
            r12.u = r5
            r12.v = r13
            r6 = 0
            r12.f168096w = r6
            r12.f168097x = r3
            java.io.Serializable r1 = com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b.y2(r5, r1, r12)
            if (r1 != r0) goto L58
            goto L7e
        L58:
            r3 = r13
            r13 = r1
            r1 = r6
        L5b:
            qua.p r13 = (qua.p) r13
            java.lang.String r3 = k71.k.N(r3)
            al6.d r8 = new al6.d
            r6 = 2
            r8.<init>(r3, r6)
            is2.o r9 = new is2.o
            r9.<init>(r5, r13, r4)
            r12.u = r5
            r12.v = r4
            r12.f168096w = r1
            r12.f168097x = r2
            r6 = 0
            r7 = 0
            r11 = 3
            r10 = r12
            java.lang.Object r13 = n14.k.V(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L7f
        L7e:
            return r0
        L7f:
            r0 = r5
        L80:
            nii.h r13 = (nii.h) r13
            boolean r13 = r13 instanceof nii.g
            if (r13 == 0) goto L8b
            is2.g$a r13 = is2.g.a.f168084a
            r0.v2(r13)
        L8b:
            ip4.m r13 = new ip4.m
            r1 = 23
            r13.<init>(r1)
            r0.x2(r13)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L98:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: is2.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
