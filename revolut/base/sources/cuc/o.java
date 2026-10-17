package cuc;

import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f108963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f108964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f108965y;
    public final /* synthetic */ SecurityDelayType z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, String str, String str2, SecurityDelayType securityDelayType, Continuation continuation) {
        super(2, continuation);
        this.f108963w = rVar;
        this.f108964x = str;
        this.f108965y = str2;
        this.z = securityDelayType;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.f108963w, this.f108964x, this.f108965y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r2.f(r4, r9, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r1.f(r3, r9, r8) == r0) goto L24;
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
            int r1 = r8.v
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = r8.f108964x
            cuc.r r6 = r8.f108963w
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            goto L1c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            cuc.i r0 = r8.u
            com.revolut.feature.security_hub.api.models.SecurityDelayInfo r0 = (com.revolut.feature.security_hub.api.models.SecurityDelayInfo) r0
            yhm.o.b(r9)
            goto L7a
        L24:
            cuc.i r1 = r8.u
            yhm.o.b(r9)
            goto L3e
        L2a:
            yhm.o.b(r9)
            cuc.i r1 = r6.d
            com.revolut.feature.security_hub.impl.network.SecurityDelayService r9 = r6.f108970c
            r8.u = r1
            r8.v = r4
            java.lang.String r4 = r8.f108965y
            java.lang.Object r9 = r9.startSecurityDelay(r5, r4, r8)
            if (r9 != r0) goto L3e
            goto L79
        L3e:
            auc.s r9 = (auc.s) r9
            r1.getClass()
            com.revolut.feature.security_hub.api.models.SecurityDelayInfo r9 = cuc.i.a(r9)
            com.revolut.feature.security_hub.api.navigation.SecurityDelayType r1 = r8.z
            boolean r4 = r1 instanceof com.revolut.feature.security_hub.api.navigation.SecurityDelayType.Transaction
            r7 = 0
            if (r4 == 0) goto L64
            x4l.c r2 = r6.e
            cuc.m r4 = new cuc.m
            com.revolut.feature.security_hub.api.navigation.SecurityDelayType$Transaction r1 = (com.revolut.feature.security_hub.api.navigation.SecurityDelayType.Transaction) r1
            java.lang.String r1 = r1.f85458a
            r4.<init>(r5, r1)
            r8.u = r7
            r8.v = r3
            java.lang.Object r9 = r2.f(r4, r9, r8)
            if (r9 != r0) goto L7a
            goto L79
        L64:
            boolean r1 = r1 instanceof com.revolut.feature.security_hub.api.navigation.SecurityDelayType.WealthProtection
            if (r1 == 0) goto L7d
            x4l.c r1 = r6.f
            cuc.n r3 = new cuc.n
            r3.<init>(r5)
            r8.u = r7
            r8.v = r2
            java.lang.Object r9 = r1.f(r3, r9, r8)
            if (r9 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L7d:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cuc.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
