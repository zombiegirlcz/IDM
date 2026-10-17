package ph4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d f236207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f236207w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f236207w, continuation, 0);
            default:
                return new f(this.f236207w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.u
            switch(r0) {
                case 0: goto L4b;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.v
            com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d r2 = r12.f236207w
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r13)
            goto L3d
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            yhm.o.b(r13)
            sp3.a r13 = r2.u
            bs3.i r1 = new bs3.i
            java.lang.String r4 = "application_status"
            java.lang.String r5 = "DENIED"
            java.util.Map r4 = a0.d.x(r4, r5)
            bs3.g r5 = bs3.g.INCOGNIA
            java.lang.String r6 = "application-finished"
            r1.<init>(r6, r4, r5)
            r12.v = r3
            qq3.g r13 = (qq3.g) r13
            java.lang.Object r13 = r13.a(r1, r12)
            if (r13 != r0) goto L3d
            goto L4a
        L3d:
            mri.w r13 = r2.v
            com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$InputData r0 = r2.f68313p
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r0 = r0.f68304c
            java.lang.String r0 = r0.f66892b
            mri.w.r0(r13, r0)
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L4a:
            return r0
        L4b:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.v
            r2 = 3
            r3 = 2
            r4 = 1
            com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d r5 = r12.f236207w
            if (r1 == 0) goto L70
            if (r1 == r4) goto L6c
            if (r1 == r3) goto L68
            if (r1 != r2) goto L60
            yhm.o.b(r13)
            goto Lb2
        L60:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L68:
            yhm.o.b(r13)
            goto L9d
        L6c:
            yhm.o.b(r13)
            goto L89
        L70:
            yhm.o.b(r13)
            r12.v = r4
            xq3.j r13 = r5.f68314q
            com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$InputData r1 = r5.f68313p
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r1 = r1.f68304c
            java.lang.String r1 = r1.f66892b
            java.lang.Object r13 = r13.a(r1, r12)
            if (r13 != r0) goto L84
            goto L86
        L84:
            kotlin.Unit r13 = kotlin.Unit.f186387a
        L86:
            if (r13 != r0) goto L89
            goto Lb1
        L89:
            mri.w r13 = r5.v
            pw5.a.x(r13)
            hw3.c r13 = r5.f68315r
            ufm.n r13 = r13.a()
            r12.v = r3
            java.lang.Object r13 = nim.a.b(r13, r12)
            if (r13 != r0) goto L9d
            goto Lb1
        L9d:
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            wli.x r6 = r5.f68317t
            kotlin.jvm.internal.Intrinsics.h(r7)
            r12.v = r2
            r8 = 0
            r9 = 0
            r11 = 6
            r10 = r12
            java.lang.Object r13 = lg0.b.x1(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto Lb2
        Lb1:
            r13 = r0
        Lb2:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ph4.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
