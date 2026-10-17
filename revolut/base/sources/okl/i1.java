package okl;

import com.revolut.sso.impl.domain.models.Challenge;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class i1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ Challenge v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226194w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Challenge challenge, com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = challenge;
        this.f226194w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i1(this.v, this.f226194w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (skm.h2.c(r8, r1, r10) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (com.revolut.sso.impl.ui.auth.n.M2(r4, r11, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        return r0;
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
            com.revolut.sso.impl.domain.models.Challenge r2 = r10.v
            r3 = 1
            com.revolut.sso.impl.ui.auth.n r4 = r10.f226194w
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1f
            if (r1 != r5) goto L17
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L15
            goto L45
        L15:
            r11 = move-exception
            goto L61
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L23
            goto L45
        L23:
            r11 = move-exception
            goto L49
        L25:
            yhm.o.b(r11)
            com.revolut.sso.impl.domain.models.ChallengeDetails r11 = r2.f106101g
            boolean r1 = r11 instanceof com.revolut.sso.impl.domain.models.ChallengeDetails.SilentAuth
            r7 = 0
            if (r1 == 0) goto L32
            com.revolut.sso.impl.domain.models.ChallengeDetails$SilentAuth r11 = (com.revolut.sso.impl.domain.models.ChallengeDetails.SilentAuth) r11
            goto L33
        L32:
            r11 = r7
        L33:
            if (r11 == 0) goto L65
            long r8 = r11.f106116b     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L23
            okl.h1 r1 = new okl.h1     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L23
            r1.<init>(r4, r11, r7)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L23
            r10.u = r3     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L23
            java.lang.Object r11 = skm.h2.c(r8, r1, r10)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L23
            if (r11 != r0) goto L45
            goto L5d
        L45:
            r4.d0(r6, r6)
            goto L5e
        L49:
            boolean r1 = r11 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L53
            boolean r1 = r11 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L52
            goto L53
        L52:
            throw r11     // Catch: java.lang.Throwable -> L15
        L53:
            jkl.i r11 = r2.f106098a     // Catch: java.lang.Throwable -> L15
            r10.u = r5     // Catch: java.lang.Throwable -> L15
            java.lang.Object r11 = com.revolut.sso.impl.ui.auth.n.M2(r4, r11, r10)     // Catch: java.lang.Throwable -> L15
            if (r11 != r0) goto L45
        L5d:
            return r0
        L5e:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L61:
            r4.d0(r6, r6)
            throw r11
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "SilentAuth details can't be null for silentauth method"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okl.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
