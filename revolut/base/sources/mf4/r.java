package mf4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function1 {
    public sx3.a u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f204881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f204882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ mv3.i f204883y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, mv3.i iVar, Continuation continuation) {
        super(1, continuation);
        this.f204882x = a0Var;
        this.f204883y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f204882x, this.f204883y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (r2 == r1) goto L16;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204881w
            r3 = 2
            r4 = 1
            mf4.a0 r5 = r0.f204882x
            r6 = 0
            if (r2 == 0) goto L2a
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L17
            yhm.o.b(r18)
            r2 = r18
            goto L71
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.String r2 = r0.v
            sx3.a r4 = r0.u
            yhm.o.b(r18)
            r7 = r4
            r4 = r18
            goto L47
        L2a:
            yhm.o.b(r18)
            sx3.a r2 = r5.f204833a
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r7 = r5.f204835c
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r7 = r7.f68090b
            java.lang.String r7 = r7.f66892b
            r0.u = r2
            r0.v = r7
            r0.f204881w = r4
            java.lang.Enum r4 = r5.p(r0)
            if (r4 != r1) goto L42
            goto L70
        L42:
            r16 = r7
            r7 = r2
            r2 = r16
        L47:
            cv3.h r4 = (cv3.h) r4
            cv3.c0$a r8 = cv3.c0.Companion
            r8.getClass()
            java.lang.String r8 = "refinancingOfferInput"
            mv3.i r9 = r0.f204883y
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r8)
            cv3.c0 r10 = new cv3.c0
            java.util.List r11 = r9.f209128a
            java.lang.Long r12 = r9.f209129b
            java.lang.Long r13 = r9.f209130c
            fu3.a r14 = r9.d
            r15 = 32
            r10.<init>(r11, r12, r13, r14, r15)
            r0.u = r6
            r0.v = r6
            r0.f204881w = r3
            java.lang.Object r2 = r7.a(r2, r4, r10, r0)
            if (r2 != r1) goto L71
        L70:
            return r1
        L71:
            cv3.b0 r2 = (cv3.b0) r2
            cv3.d0 r1 = r2.f109237a
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto Lb0
            mv3.a r4 = r2.f
            if (r4 == 0) goto Laa
            r5.f204837h = r2
            mh4.h r2 = new mh4.h
            mv3.k r7 = new mv3.k
            java.util.List r8 = r1.e
            java.lang.Long r5 = r1.f109249a
            if (r5 == 0) goto La4
            long r9 = r5.longValue()
            java.lang.Long r5 = r1.f109250b
            if (r5 == 0) goto L9e
            long r11 = r5.longValue()
            fu3.a r13 = r1.d
            r7.<init>(r8, r9, r11, r13)
            r2.<init>(r6, r6, r4, r7)
            return r2
        L9e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        La4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        Laa:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        Lb0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
