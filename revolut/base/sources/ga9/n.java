package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f142097w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.onboarding.impl.onboarding.v vVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = vVar;
        this.f142097w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f142097w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r0, null, r10, 3) != r2) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.revolut.feature.onboarding.impl.onboarding.v r0 = r10.v
            fwj.p r1 = r0.A
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.u
            r4 = 0
            r5 = 2
            r6 = 3
            r7 = 1
            if (r3 == 0) goto L28
            if (r3 == r7) goto L24
            if (r3 == r5) goto L20
            if (r3 != r6) goto L18
            yhm.o.b(r11)
            goto L77
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            yhm.o.b(r11)
            goto L6e
        L24:
            yhm.o.b(r11)
            goto L63
        L28:
            yhm.o.b(r11)
            toa.a r11 = r1.z
            efm.r r11 = r11.b()
            efm.r r11 = m70.a.g(r11, r4, r4, r6)
            efm.d0 r11 = r11.firstOrError()
            a6j.a r3 = new a6j.a
            r8 = 23
            boolean r9 = r10.f142097w
            r3.<init>(r1, r9, r8)
            fwj.h r8 = new fwj.h
            r9 = 0
            r8.<init>(r3, r9)
            r11.getClass()
            pfm.a r3 = new pfm.a
            r9 = 4
            r3.<init>(r11, r8, r9)
            java.lang.String r11 = "flatMapCompletable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
            pfm.a r11 = ue0.e.v(r3)
            r10.u = r7
            java.lang.Object r11 = nim.a.a(r11, r10)
            if (r11 != r2) goto L63
            goto L76
        L63:
            r10.u = r5
            o0j.c$c r11 = o0j.c.C1228c.f221218a
            java.lang.Object r11 = r1.h(r11, r10)
            if (r11 != r2) goto L6e
            goto L76
        L6e:
            r10.u = r6
            java.lang.Object r11 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r0, r4, r10, r6)
            if (r11 != r2) goto L77
        L76:
            return r2
        L77:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
