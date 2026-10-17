package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f142111w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.onboarding.impl.onboarding.v vVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = vVar;
        this.f142111w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.v, this.f142111w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r0, null, r7, 3) != r2) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.onboarding.impl.onboarding.v r0 = r7.v
            fwj.p r1 = r0.A
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L27
            if (r3 == r6) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            yhm.o.b(r8)
            goto L4e
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            goto L44
        L23:
            yhm.o.b(r8)
            goto L39
        L27:
            yhm.o.b(r8)
            boolean r8 = r7.f142111w
            pfm.r r8 = r1.i(r8)
            r7.u = r6
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto L39
            goto L4d
        L39:
            r7.u = r5
            o0j.c$j r8 = o0j.c.j.f221225a
            java.lang.Object r8 = r1.h(r8, r7)
            if (r8 != r2) goto L44
            goto L4d
        L44:
            r7.u = r4
            r8 = 0
            java.lang.Object r8 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r0, r8, r7, r4)
            if (r8 != r2) goto L4e
        L4d:
            return r2
        L4e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
