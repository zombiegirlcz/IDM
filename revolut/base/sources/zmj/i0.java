package zmj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r0.G1(r13, r12) == r2) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a r0 = r12.v
            unj.j r1 = r0.f101434y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r12.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L15
            yhm.o.b(r13)
            goto L9b
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            yhm.o.b(r13)
            goto L4e
        L21:
            yhm.o.b(r13)
            bej.m r13 = r0.f101433x
            cli.y r3 = r0.J
            java.lang.Object r3 = r3.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r3 = r3.getValue()
            zmj.n r3 = (zmj.n) r3
            java.lang.String r8 = r3.i
            com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$InputData r3 = r0.o
            java.lang.String r9 = r3.f101418a
            r12.u = r5
            r7 = r13
            dfj.q3 r7 = (dfj.q3) r7
            r7.getClass()
            dfj.n3 r6 = new dfj.n3
            r11 = 1
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r13 = r7.a(r6, r12)
            if (r13 != r2) goto L4e
            goto L9a
        L4e:
            bej.k r13 = (bej.k) r13
            boolean r3 = r13 instanceof bej.j
            if (r3 == 0) goto L72
            bej.j r13 = (bej.j) r13
            boolean r13 = r13.f14855a
            if (r13 == 0) goto L66
            r1.getClass()
            nii.y0 r13 = unj.j.c()
            kotlinx.coroutines.flow.Flow r13 = r0.X1(r13)
            return r13
        L66:
            r1.getClass()
            nii.y0 r13 = unj.j.a()
            kotlinx.coroutines.flow.Flow r13 = r0.X1(r13)
            return r13
        L72:
            bej.k$a r3 = bej.k.a.f14856a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r13, r3)
            if (r3 == 0) goto L86
            r1.getClass()
            nii.y0 r13 = unj.j.b()
            kotlinx.coroutines.flow.Flow r13 = r0.X1(r13)
            return r13
        L86:
            boolean r1 = r13 instanceof bej.l
            if (r1 == 0) goto L9e
            bej.l r13 = (bej.l) r13
            java.lang.String r13 = r13.f14857a
            f9i.c r13 = foh.i.a(r13)
            r12.u = r4
            java.lang.Object r13 = r0.G1(r13, r12)
            if (r13 != r2) goto L9b
        L9a:
            return r2
        L9b:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L9e:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zmj.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
