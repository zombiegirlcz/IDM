package okl;

import com.revolut.sso.impl.domain.models.ChallengeDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChallengeDetails.SilentAuth f226188w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.revolut.sso.impl.ui.auth.n nVar, ChallengeDetails.SilentAuth silentAuth, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f226188w = silentAuth;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h1(this.v, this.f226188w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (com.revolut.sso.impl.ui.auth.n.Q2(r2, null, r4, null, r8, 5) == r0) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            com.revolut.sso.impl.ui.auth.n r2 = r8.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r9)
            goto L53
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            yhm.o.b(r9)
            goto L3d
        L1e:
            yhm.o.b(r9)
            a61.a r9 = r2.V
            com.revolut.sso.impl.domain.models.ChallengeDetails$SilentAuth r1 = r8.f226188w
            java.lang.String r1 = r1.f106115a
            r8.u = r4
            r9.getClass()
            akl.t1 r4 = new akl.t1
            r5 = 0
            r4.<init>(r9, r1, r5)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r4, r8)
            if (r9 != r0) goto L3d
            goto L52
        L3d:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L56
            com.revolut.sso.api.models.SilentAuthEvidence r4 = new com.revolut.sso.api.models.SilentAuthEvidence
            r4.<init>(r9)
            r8.u = r3
            r3 = 0
            r5 = 0
            r7 = 5
            r6 = r8
            java.lang.Object r9 = com.revolut.sso.impl.ui.auth.n.Q2(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L53
        L52:
            return r0
        L53:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L56:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cellular network is not available"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okl.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
