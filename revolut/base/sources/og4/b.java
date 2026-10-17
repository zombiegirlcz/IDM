package og4;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zfk.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f225025w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.b bVar, d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f225025w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f225025w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (c84.t.N2(r2, (it3.d) r8, r7, 2) == r0) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            og4.d r2 = r7.f225025w
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r8)
            goto L5f
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            yhm.o.b(r8)
            goto L54
        L1e:
            yhm.o.b(r8)
            zfk.c$b r8 = r7.v
            boolean r1 = r8 instanceof zfk.g
            if (r1 != 0) goto L32
            boolean r8 = r8 instanceof zfk.i
            if (r8 == 0) goto L2c
            goto L32
        L2c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L32:
            yx3.a r8 = r2.f225028q
            com.revolut.feature.credit.application.plugins.impl.ui.plan_subscribe.PlanSubscribeFlowContract$InputData r1 = r2.f225027p
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r1 = r1.f68215b
            java.lang.String r1 = r1.f66892b
            r7.u = r4
            c44.a r8 = r8.f317543a
            r8.getClass()
            btk.j r4 = new btk.j
            r5 = 16
            r6 = 0
            r4.<init>(r8, r1, r6, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r4, r7)
            if (r8 != r0) goto L54
            goto L5e
        L54:
            it3.d r8 = (it3.d) r8
            r7.u = r3
            java.lang.Object r8 = c84.t.N2(r2, r8, r7, r3)
            if (r8 != r0) goto L5f
        L5e:
            return r0
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: og4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
