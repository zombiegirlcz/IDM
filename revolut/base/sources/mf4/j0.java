package mf4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g f204864w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ oc4.f f204865x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, oc4.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204864w = gVar;
        this.f204865x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j0(this.f204864w, this.f204865x, continuation, 0);
            default:
                return new j0(this.f204864w, this.f204865x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.u
            switch(r0) {
                case 0: goto L34;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r8)
            goto L31
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            yhm.o.b(r8)
            mf4.j0 r8 = new mf4.j0
            r1 = 0
            r3 = 0
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g r4 = r7.f204864w
            oc4.f r5 = r7.f204865x
            r8.<init>(r4, r5, r1, r3)
            r7.v = r2
            java.lang.Object r8 = r4.p2(r7, r8)
            if (r8 != r0) goto L31
            goto L33
        L31:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L33:
            return r0
        L34:
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g r0 = r7.f204864w
            mf4.e r1 = r0.f68151q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L5b
            if (r3 == r6) goto L57
            if (r3 == r5) goto L53
            if (r3 != r4) goto L4b
            yhm.o.b(r8)
            goto L86
        L4b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L53:
            yhm.o.b(r8)
            goto L7b
        L57:
            yhm.o.b(r8)
            goto L70
        L5b:
            yhm.o.b(r8)
            oc4.f r8 = r7.f204865x
            oc4.e r8 = (oc4.e) r8
            java.lang.String r8 = r8.f224095a
            r7.v = r6
            r3 = r1
            mf4.a0 r3 = (mf4.a0) r3
            java.lang.Object r8 = r3.v(r8, r7)
            if (r8 != r2) goto L70
            goto L88
        L70:
            r7.v = r5
            mf4.a0 r1 = (mf4.a0) r1
            java.lang.Object r8 = r1.s(r7)
            if (r8 != r2) goto L7b
            goto L88
        L7b:
            it3.d r8 = (it3.d) r8
            r7.v = r4
            java.lang.Object r8 = c84.t.N2(r0, r8, r7, r5)
            if (r8 != r2) goto L86
            goto L88
        L86:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
