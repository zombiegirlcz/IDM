package mll;

import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ Claim v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.flow.c f207078w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Claim claim, com.revolut.sso.impl.ui.combined_authentication.flow.c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = claim;
        this.f207078w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.v, this.f207078w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r7 == r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            com.revolut.sso.impl.ui.combined_authentication.flow.c r0 = r6.f207078w
            bjl.p0 r0 = r0.f106429t
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            yhm.o.b(r7)
            goto L4f
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            yhm.o.b(r7)
            goto L39
        L20:
            yhm.o.b(r7)
            com.revolut.sso.impl.domain.models.Claim r7 = r6.v
            boolean r2 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Email
            r5 = 0
            if (r2 == 0) goto L3c
            com.revolut.sso.impl.domain.models.Claim$Email r7 = (com.revolut.sso.impl.domain.models.Claim.Email) r7
            java.lang.String r7 = r7.f106127a
            r6.u = r4
            rqk.k r0 = (rqk.k) r0
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = r0.c(r5, r7)
            if (r7 != r1) goto L39
            goto L4e
        L39:
            aii.u r7 = (aii.u) r7
            return r7
        L3c:
            boolean r2 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Phone
            if (r2 == 0) goto L52
            com.revolut.sso.impl.domain.models.Claim$Phone r7 = (com.revolut.sso.impl.domain.models.Claim.Phone) r7
            java.lang.String r7 = r7.f106131a
            r6.u = r3
            rqk.k r0 = (rqk.k) r0
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = r0.c(r7, r5)
            if (r7 != r1) goto L4f
        L4e:
            return r1
        L4f:
            aii.u r7 = (aii.u) r7
            return r7
        L52:
            boolean r0 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.BioPublicKey
            if (r0 != 0) goto L75
            boolean r0 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Google
            if (r0 != 0) goto L75
            boolean r0 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.IdentityId
            if (r0 != 0) goto L75
            boolean r0 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Password
            if (r0 != 0) goto L75
            boolean r0 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.Pin
            if (r0 != 0) goto L75
            boolean r0 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.PublicKey
            if (r0 != 0) goto L75
            boolean r0 = r7 instanceof com.revolut.sso.impl.domain.models.Claim.WebAuthn
            if (r0 == 0) goto L6f
            goto L75
        L6f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r1 = "Claim of "
            java.lang.String r2 = " type is not supported"
            java.lang.String r7 = a10.b.s(r1, r7, r2)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mll.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
