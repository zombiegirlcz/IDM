package s38;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sfe.i f259448w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, sfe.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f259448w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f259448w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (nim.a.a(r13, r12) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.u
            s38.h r2 = r12.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r13)
            goto L3d
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            yhm.o.b(r13)
            goto L2c
        L1e:
            yhm.o.b(r13)
            g48.r0 r13 = r2.f259461s
            r12.u = r4
            java.lang.Object r13 = t38.s.c(r13, r12)
            if (r13 != r0) goto L2c
            goto L3c
        L2c:
            com.revolut.core.model.account.AccountId$Joint r13 = (com.revolut.core.model.account.AccountId.Joint) r13
            wsg.n r1 = r2.u
            pfm.a r13 = r1.k0(r13)
            r12.u = r3
            java.lang.Object r13 = nim.a.a(r13, r12)
            if (r13 != r0) goto L3d
        L3c:
            return r0
        L3d:
            sfe.i r13 = r12.f259448w
            android.content.Intent r13 = r13.f262414c
            r0 = 0
            if (r13 == 0) goto L83
            java.lang.String r1 = "argPocketId"
            java.lang.String r13 = r13.getStringExtra(r1)
            if (r13 == 0) goto L83
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r3 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r4 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r5 = s49.a.AS_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r6 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r7 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r8 = ibb.c.f160140a
            java.lang.String r8 = r8.f83420a
            r7.<init>(r8, r0)
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r8 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r9 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r10 = com.revolut.feature.tab.accounts.models.ProductId.JOINT
            com.revolut.feature.tab.accounts.models.ProductAccountId r11 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            r11.<init>(r13, r0)
            r9.<init>(r11, r10)
            r8.<init>(r9, r0)
            r13 = 4
            r6.<init>(r7, r8, r0, r13)
            r4.<init>(r5, r6)
            r3.<init>(r4)
            r1.<init>(r3)
            r2.A2(r1)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s38.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
