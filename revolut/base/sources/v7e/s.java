package v7e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function2 {
    public xi0.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f286613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u f286614x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Continuation continuation) {
        super(2, continuation);
        this.f286614x = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.f286614x, continuation);
        sVar.f286613w = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((r7e.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (v7e.u.y2(r6, r10, r0, r9) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r10 == r1) goto L25;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f286613w
            r7e.b r0 = (r7e.b) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.v
            r3 = 3
            r4 = 2
            r5 = 1
            v7e.u r6 = r9.f286614x
            r7 = 0
            if (r2 == 0) goto L2e
            if (r2 == r5) goto L28
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            xi0.b r0 = r9.u
            yhm.o.b(r10)
            goto L83
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            yhm.o.b(r10)
            goto L8f
        L28:
            xi0.b r0 = r9.u
            yhm.o.b(r10)
            goto L4e
        L2e:
            yhm.o.b(r10)
            xi0.a r10 = xi0.b.Companion
            java.lang.String r0 = r0.f252199a
            r10.getClass()
            xi0.b r10 = xi0.a.a(r0)
            s99.i r0 = r6.f286621x
            r9.f286613w = r7
            r9.u = r10
            r9.v = r5
            java.lang.Object r0 = r0.a(r9)
            if (r0 != r1) goto L4b
            goto L82
        L4b:
            r8 = r0
            r0 = r10
            r10 = r8
        L4e:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output r10 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output) r10
            boolean r2 = r10 instanceof com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch
            if (r2 == 0) goto L65
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r10 = (com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldLaunch) r10
            bla.c r10 = r10.f78169a
            r9.f286613w = r7
            r9.u = r7
            r9.v = r4
            java.lang.Object r10 = v7e.u.y2(r6, r10, r0, r9)
            if (r10 != r1) goto L8f
            goto L82
        L65:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldNotLaunch r2 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch.f78170a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r2)
            if (r10 == 0) goto L92
            g6e.b r10 = r6.f286616q
            com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreenContract$InputData r2 = r6.f286615p
            com.revolut.feature.subaccount.api.models.SubaccountType r2 = r2.f89047a
            r9.f286613w = r7
            r9.u = r0
            r9.v = r3
            s6e.d r10 = (s6e.d) r10
            r3 = 0
            java.lang.Object r10 = r10.b(r2, r0, r3, r9)
            if (r10 != r1) goto L83
        L82:
            return r1
        L83:
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r10 = (com.revolut.feature.backgroundpicker.api.model.ChosenBackground) r10
            v7e.p r1 = v7e.u.Companion
            v7e.o r1 = new v7e.o
            r1.<init>(r6, r10, r0)
            r6.x2(r1)
        L8f:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L92:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v7e.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
