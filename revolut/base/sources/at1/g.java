package at1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f8985w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f8985w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f8985w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r5) >= com.google.android.gms.location.DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            yhm.o.b(r12)
            goto L99
        Le:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L16:
            yhm.o.b(r12)
            at1.j r12 = r11.v
            cji.d r1 = r12.f8992p
            l80.h r3 = r12.o
            cji.d r4 = r12.f8992p
            java.lang.Object r1 = r1.a()
            at1.f r1 = (at1.f) r1
            b02.d r1 = r1.f8983b
            boolean r5 = r11.f8985w
            if (r5 != 0) goto L4e
            if (r1 == 0) goto L4e
            java.lang.Object r5 = r4.a()
            at1.f r5 = (at1.f) r5
            long r5 = r5.f8984c
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L3e
            goto L4d
        L3e:
            r3.getClass()
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r5
            r5 = 20000(0x4e20, double:9.8813E-320)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L4d
            goto L4e
        L4d:
            return r1
        L4e:
            java.lang.Object r1 = r4.a()
            r5 = r1
            at1.f r5 = (at1.f) r5
            java.lang.String r1 = "$this$updateState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            r3.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r10 = 3
            r6 = 0
            r7 = 0
            at1.f r1 = at1.f.a(r5, r6, r7, r8, r10)
            r4.d(r1)
            ps1.b r1 = r12.f8990m
            b02.a r3 = new b02.a
            java.lang.Object r4 = r4.a()
            at1.f r4 = (at1.f) r4
            java.lang.String r4 = r4.f8982a
            com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData r12 = r12.f8989l
            com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus$NotRegistered r12 = r12.f61580a
            java.lang.String r12 = r12.getF()
            r3.<init>(r4, r12)
            r11.u = r2
            hs1.c r12 = r1.f239387a
            hg0.n r1 = new hg0.n
            r2 = 0
            r4 = 20
            r1.<init>(r12, r3, r2, r4)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r1, r11)
            if (r12 != r0) goto L99
            return r0
        L99:
            b02.d r12 = (b02.d) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: at1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
