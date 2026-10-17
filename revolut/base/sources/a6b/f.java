package a6b;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1593x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f1592w = str;
        this.f1593x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f1592w, this.f1593x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r0 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            a6b.g r2 = r1.v
            c6b.j r0 = r2.f1595b
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r1.u
            r5 = 0
            r6 = 3
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L30
            if (r4 == r7) goto L2a
            if (r4 == r8) goto L24
            if (r4 != r6) goto L1c
            yhm.o.b(r17)
            r0 = r17
            goto L6d
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L24:
            yhm.o.b(r17)
            r0 = r17
            goto L58
        L2a:
            yhm.o.b(r17)     // Catch: java.lang.Exception -> L2e
            goto L41
        L2e:
            r0 = move-exception
            goto L44
        L30:
            yhm.o.b(r17)
            java.lang.String r4 = r1.f1592w
            r0.b(r4)
            r1.u = r7     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = r0.a(r1)     // Catch: java.lang.Exception -> L2e
            if (r0 != r3) goto L41
            goto L6c
        L41:
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L2e
            goto L4d
        L44:
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            rd0.d.a(r7, r5, r5, r0, r4)
        L4d:
            c6b.m r0 = r2.d
            r1.u = r8
            java.lang.Object r0 = r0.a(r1)
            if (r0 != r3) goto L58
            goto L6c
        L58:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb2
            q5b.c r0 = r2.f1596c
            r1.u = r6
            c6b.p r0 = (c6b.p) r0
            java.lang.Object r0 = r0.b(r1)
            if (r0 != r3) goto L6d
        L6c:
            return r3
        L6d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$PlanHub r3 = com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig.PlanHub.f82502g
            r0.<init>(r3)
            goto L94
        L7d:
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r9 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default r11 = new com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default
            java.lang.String r3 = r1.f1593x
            r11.<init>(r3, r8)
            r14 = 0
            r15 = 61
            r10 = 0
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.<init>(r9)
        L94:
            sri.m r2 = r2.f1594a
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r3 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r4 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r6 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r7 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r9 = ibb.c.f160140a
            java.lang.String r9 = r9.f83420a
            r7.<init>(r9, r5)
            r6.<init>(r7, r5, r0, r8)
            r3.<init>(r4, r6)
            com.revolut.retail.core.navigation.FeatureCommand r0 = gc0.c.f(r3)
            r2.c(r0)
        Lb2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6b.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
