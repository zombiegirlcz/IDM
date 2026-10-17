package mtc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f208813w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f208813w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f208813w, continuation, 0);
            case 1:
                return new k(this.f208813w, continuation, 1);
            default:
                return new k(this.f208813w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            switch(r0) {
                case 0: goto L91;
                case 1: goto L58;
                default: goto L5;
            }
        L5:
            mtc.m r0 = r8.f208813w
            h30.q r1 = r0.f208815p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L2c
            if (r3 == r6) goto L28
            if (r3 == r5) goto L24
            if (r3 != r4) goto L1c
            yhm.o.b(r9)
            goto L57
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            yhm.o.b(r9)
            goto L4e
        L28:
            yhm.o.b(r9)
            goto L3f
        L2c:
            yhm.o.b(r9)
            mtc.k r9 = new mtc.k
            r3 = 0
            r7 = 1
            r9.<init>(r0, r3, r7)
            r8.v = r6
            java.lang.Object r9 = ue8.c.f0(r0, r9, r8)
            if (r9 != r2) goto L3f
            goto L56
        L3f:
            com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsControllerContract$InputData r9 = r0.o
            java.lang.String r9 = r9.f85357a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.v = r5
            java.lang.Object r9 = r1.r0(r9, r0, r8)
            if (r9 != r2) goto L4e
            goto L56
        L4e:
            r8.v = r4
            java.lang.Object r9 = r1.P0(r8)
            if (r9 != r2) goto L57
        L56:
            r9 = r2
        L57:
            return r9
        L58:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 1
            if (r1 == 0) goto L6d
            if (r1 != r2) goto L65
            yhm.o.b(r9)
            goto L8e
        L65:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L6d:
            yhm.o.b(r9)
            mtc.m r9 = r8.f208813w
            h30.q r1 = r9.f208815p
            com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsControllerContract$InputData r9 = r9.o
            java.lang.String r9 = r9.f85357a
            r8.v = r2
            java.lang.Object r1 = r1.f148941b
            kdh.b r1 = (kdh.b) r1
            pfm.t r9 = r1.O(r9)
            java.lang.Object r9 = nim.a.a(r9, r8)
            if (r9 != r0) goto L89
            goto L8b
        L89:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L8b:
            if (r9 != r0) goto L8e
            goto L90
        L8e:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L90:
            return r0
        L91:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            r2 = 1
            if (r1 == 0) goto La6
            if (r1 != r2) goto L9e
            yhm.o.b(r9)
            goto Lbb
        L9e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        La6:
            yhm.o.b(r9)
            mtc.m r9 = r8.f208813w
            h30.q r1 = r9.f208815p
            com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsControllerContract$InputData r9 = r9.o
            java.lang.String r9 = r9.f85357a
            r8.v = r2
            r2 = 0
            java.lang.Object r9 = r1.r0(r9, r2, r8)
            if (r9 != r0) goto Lbb
            goto Lbd
        Lbb:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mtc.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
