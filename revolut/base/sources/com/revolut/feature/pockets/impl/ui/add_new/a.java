package com.revolut.feature.pockets.impl.ui.add_new;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import s7a.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f80891w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, c0 c0Var, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f80891w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f80891w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (com.revolut.feature.pockets.impl.ui.add_new.c.I2(r2, r6, r5) == r0) goto L20;
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
            com.revolut.feature.pockets.impl.ui.add_new.c r2 = r5.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L5a
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L2c
        L1e:
            yhm.o.b(r6)
            s99.i r6 = r2.f80898s
            r5.u = r4
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L2c
            goto L59
        L2c:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r6 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r6
            boolean r1 = r6 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch
            s7a.c0 r4 = r5.f80891w
            if (r1 == 0) goto L49
            yki.i r0 = r2.f80902y
            com.revolut.feature.pockets.impl.ui.add_new.AddNewPocketFlowContract$Step$McyFlowStep r1 = new com.revolut.feature.pockets.impl.ui.add_new.AddNewPocketFlowContract$Step$McyFlowStep
            yea.b r4 = (yea.b) r4
            xi0.b r2 = r4.f312832a
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r6 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch) r6
            bla.c r6 = r6.f78169a
            r1.<init>(r2, r6)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r6 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.w2(r0, r1, r6)
            goto L5a
        L49:
            boolean r6 = r6 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch
            if (r6 == 0) goto L5d
            yea.b r4 = (yea.b) r4
            xi0.b r6 = r4.f312832a
            r5.u = r3
            java.lang.Object r6 = com.revolut.feature.pockets.impl.ui.add_new.c.I2(r2, r6, r5)
            if (r6 != r0) goto L5a
        L59:
            return r0
        L5a:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L5d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.ui.add_new.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
