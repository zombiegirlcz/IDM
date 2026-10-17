package w9b;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f295712w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f295712w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f295712w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r1.f((java.lang.String) r11, r4, r10) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.u
            r2 = 2
            com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a r3 = r10.v
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r11)
            goto L41
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            yhm.o.b(r11)
            com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId r11 = (com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId) r11
            java.lang.String r11 = r11.f74764a
            goto L32
        L22:
            yhm.o.b(r11)
            t9b.e r11 = r3.f82643p
            r10.u = r4
            java.lang.String r1 = r10.f295712w
            java.lang.Object r11 = r11.a(r1, r10)
            if (r11 != r0) goto L32
            goto L40
        L32:
            java.lang.String r11 = (java.lang.String) r11
            nd.m r1 = r3.f82644q
            i9b.a r4 = i9b.a.NewProfileOnboarding
            r10.u = r2
            java.lang.Object r11 = r1.f(r11, r4, r10)
            if (r11 != r0) goto L41
        L40:
            return r0
        L41:
            com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig$Main r4 = new com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig$Main
            com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig$UseCase$SignIn r8 = new com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig$UseCase$SignIn
            r11 = 0
            r8.<init>(r11)
            r9 = 7
            r5 = 0
            r6 = 0
            r7 = 1
            r4.<init>(r5, r6, r7, r8, r9)
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.c(r4)
            aii.n r11 = r3.C1(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w9b.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
