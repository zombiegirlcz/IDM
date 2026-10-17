package ga9;

import ew9.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ c.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142112w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.onboarding.impl.onboarding.v vVar, c.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f142112w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.f142112w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r2, null, r5, 3) == r0) goto L22;
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
            com.revolut.feature.onboarding.impl.onboarding.v r2 = r5.f142112w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L52
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L47
        L1e:
            yhm.o.b(r6)
            ew9.c$a$a r6 = ew9.c.a.C0759a.f130114a
            ew9.c$a r1 = r5.v
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 != 0) goto L3a
            ew9.c$a$b r6 = ew9.c.a.b.f130115a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r6 == 0) goto L34
            goto L3a
        L34:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L3a:
            fwj.p r6 = r2.A
            r5.u = r4
            o0j.c$l r1 = o0j.c.l.f221226a
            java.lang.Object r6 = r6.h(r1, r5)
            if (r6 != r0) goto L47
            goto L51
        L47:
            r5.u = r3
            r6 = 0
            r1 = 3
            java.lang.Object r6 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r2, r6, r5, r1)
            if (r6 != r0) goto L52
        L51:
            return r0
        L52:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
