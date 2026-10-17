package cuc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f108978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f108979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f108980y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, String str, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = zVar;
        this.f108978w = str;
        this.f108979x = j2;
        this.f108980y = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, this.f108978w, this.f108979x, this.f108980y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r10.d(r1, false, r9) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            cuc.z r2 = r9.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r10)
            goto L49
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            yhm.o.b(r10)
            goto L3b
        L1e:
            yhm.o.b(r10)
            com.revolut.feature.security_hub.impl.network.SecurityHubService r10 = r2.f108984c
            auc.m r1 = new auc.m
            long r5 = r9.f108979x
            boolean r7 = r9.f108980y
            java.lang.String r8 = r9.f108978w
            r1.<init>(r8, r5, r7)
            efm.b r10 = r10.changeOutboundTransactionLimit(r1)
            r9.u = r4
            java.lang.Object r10 = nim.a.a(r10, r9)
            if (r10 != r0) goto L3b
            goto L48
        L3b:
            x4l.c r10 = r2.e
            kotlin.Unit r1 = kotlin.Unit.f186387a
            r9.u = r3
            r2 = 0
            java.lang.Object r10 = r10.d(r1, r2, r9)
            if (r10 != r0) goto L49
        L48:
            return r0
        L49:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cuc.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
