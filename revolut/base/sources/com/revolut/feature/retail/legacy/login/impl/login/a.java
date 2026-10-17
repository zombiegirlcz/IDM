package com.revolut.feature.retail.legacy.login.impl.login;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wm3.j;
import wma.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ j A;
    public long u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f82696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f82697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f82698y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j2, e eVar, j jVar, Continuation continuation) {
        super(2, continuation);
        this.f82698y = j2;
        this.z = eVar;
        this.A = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f82698y, this.z, this.A, continuation);
        aVar.f82697x = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        if (skm.k0.b(r8, r20) == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r20.A.invoke(r20) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0077 -> B:18:0x0088). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0085 -> B:18:0x0088). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.f82697x
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r0.f82696w
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 1
            r7 = 2
            if (r3 == 0) goto L29
            if (r3 == r6) goto L21
            if (r3 != r7) goto L19
            yhm.o.b(r21)
            goto L9e
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            long r8 = r0.v
            long r10 = r0.u
            yhm.o.b(r21)
            goto L88
        L29:
            yhm.o.b(r21)
            long r8 = r0.f82698y
            r10 = r8
            r8 = r4
        L30:
            r12 = 0
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 < 0) goto L8c
            skm.e0.q(r1)
            long r13 = r10 / r4
            com.revolut.feature.retail.legacy.login.impl.login.LoginFragment$a r15 = com.revolut.feature.retail.legacy.login.impl.login.LoginFragment.INSTANCE
            int r4 = com.revolut.feature.retail.legacy.login.impl.R$string.signup_wrong_passcode_blocker_title
            r16 = 60
            r18 = r13
            long r12 = r18 / r16
            long r16 = r18 % r16
            java.lang.String r5 = java.lang.String.valueOf(r16)
            r14 = 48
            java.lang.String r5 = kotlin.text.d0.b0(r5, r7, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            java.lang.String r12 = ":"
            r14.append(r12)
            r14.append(r5)
            java.lang.String r5 = r14.toString()
            r15.getClass()
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            java.util.List r5 = zhm.u.c(r5)
            r13 = 0
            r12.<init>(r4, r5, r13)
            wma.e r4 = r0.z
            r4.invoke(r12)
            if (r3 <= 0) goto L88
            r0.f82697x = r1
            r0.u = r10
            r0.v = r8
            r0.f82696w = r6
            java.lang.Object r3 = skm.k0.b(r8, r0)
            if (r3 != r2) goto L88
            goto L9d
        L88:
            long r10 = r10 - r8
            r4 = 1000(0x3e8, double:4.94E-321)
            goto L30
        L8c:
            r13 = 0
            r0.f82697x = r13
            r0.u = r10
            r0.v = r8
            r0.f82696w = r7
            wm3.j r1 = r0.A
            java.lang.Object r1 = r1.invoke(r0)
            if (r1 != r2) goto L9e
        L9d:
            return r2
        L9e:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.legacy.login.impl.login.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
