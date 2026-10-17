package g4k;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f140591w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, String str, Continuation continuation) {
        super(1, continuation);
        this.v = a0Var;
        this.f140591w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new y(this.v, this.f140591w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((y) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (nim.a.a(r2, r20) == r1) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            java.lang.String r3 = r0.f140591w
            r4 = 2
            g4k.a0 r5 = r0.v
            r6 = 1
            if (r2 == 0) goto L25
            if (r2 == r6) goto L1f
            if (r2 != r4) goto L17
            yhm.o.b(r21)
            goto L98
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            yhm.o.b(r21)
            r2 = r21
            goto L37
        L25:
            yhm.o.b(r21)
            xg6.l r2 = r5.f140536q
            ufm.n r2 = r2.d(r3)
            r0.u = r6
            java.lang.Object r2 = nim.a.b(r2, r0)
            if (r2 != r1) goto L37
            goto L97
        L37:
            com.revolut.feature.external_accounts.api.model.RevokeUrlDataModel r2 = (com.revolut.feature.external_accounts.api.model.RevokeUrlDataModel) r2
            java.lang.String r7 = r2.f72233b
            qe6.d r2 = r2.f72232a
            qe6.d r8 = qe6.d.REDIRECT_NEEDED
            if (r2 != r8) goto L89
            if (r7 == 0) goto L89
            boolean r2 = kotlin.text.d0.W(r7)
            r2 = r2 ^ r6
            if (r2 != r6) goto L89
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$JustShow r3 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$JustShow
            s49.a r4 = s49.a.SINGLE_TOP
            r3.<init>(r4)
            r2.<init>(r3)
            com.revolut.retail.core.navigation.ActivityNavigateCommand r8 = new com.revolut.retail.core.navigation.ActivityNavigateCommand
            com.revolut.retail.core.navigation.ImplicitActivityDestination r9 = new com.revolut.retail.core.navigation.ImplicitActivityDestination
            f80.a r3 = r5.f140538s
            f80.b r3 = (f80.b) r3
            android.net.Uri r14 = r3.f(r7)
            r15 = 14
            java.lang.String r10 = "android.intent.action.VIEW"
            r11 = 0
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r18 = 0
            r19 = 1022(0x3fe, float:1.432E-42)
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.revolut.retail.core.navigation.CompositeCommand r2 = com.revolut.retail.core.navigation.a.c(r2, r8)
            r1.<init>(r2)
            aii.n r1 = r5.A2(r1)
            return r1
        L89:
            xg6.l r2 = r5.f140536q
            pfm.a r2 = r2.a(r3)
            r0.u = r4
            java.lang.Object r2 = nim.a.a(r2, r0)
            if (r2 != r1) goto L98
        L97:
            return r1
        L98:
            r5.getClass()
            g4k.x r1 = new g4k.x
            r2 = 0
            r1.<init>(r5, r2)
            yi5.b r2 = new yi5.b
            r3 = 27
            r2.<init>(r3)
            r5.T2(r1, r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g4k.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
