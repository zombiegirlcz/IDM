package akl;

import com.revolut.sso.impl.domain.models.ClaimToManage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ClaimToManage.WebAuthn f6074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f6075x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ClaimToManage.WebAuthn webAuthn, String str, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
        this.f6074w = webAuthn;
        this.f6075x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, this.f6074w, this.f6075x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (r5.f(r6, r9, r8) == r0) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            java.lang.String r2 = r8.f6075x
            com.revolut.sso.impl.domain.models.ClaimToManage$WebAuthn r3 = r8.f6074w
            r4 = 2
            r5 = 1
            akl.r r6 = r8.v
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            yhm.o.b(r9)
            goto L83
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L36
        L22:
            yhm.o.b(r9)
            com.revolut.sso.impl.network.services.ClaimsService r9 = r6.f6080a
            mkl.b r1 = akl.r.a(r6)
            java.lang.String r7 = r3.f106141a
            r8.u = r5
            java.lang.Object r9 = r9.removeWebAuthnClaim(r1, r7, r2, r8)
            if (r9 != r0) goto L36
            goto L82
        L36:
            retrofit2.Response r9 = (retrofit2.Response) r9
            boolean r1 = r9.isSuccessful()
            if (r1 == 0) goto L86
            ne0.j r9 = r6.f6081b
            gkl.n r1 = gkl.n.WEBAUTHN
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "KEY_CLAIMS_FOR."
            r5.<init>(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.Object r9 = r9.get(r5)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L5b
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L5b:
            x4l.c r5 = r6.e
            akl.m r6 = new akl.m
            r6.<init>(r2, r1)
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.ArrayList r9 = zhm.d0.f1(r9)
            afa.q r1 = new afa.q
            r2 = 18
            r1.<init>(r3, r2)
            akl.p r2 = new akl.p
            r3 = 0
            r2.<init>(r1, r3)
            r9.removeIf(r2)
            kotlin.Unit r1 = kotlin.Unit.f186387a
            r8.u = r4
            java.lang.Object r9 = r5.f(r6, r9, r8)
            if (r9 != r0) goto L83
        L82:
            return r0
        L83:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L86:
            retrofit2.HttpException r0 = new retrofit2.HttpException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
