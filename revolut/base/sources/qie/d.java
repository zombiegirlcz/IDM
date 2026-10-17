package qie;

import ft3.q0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ q0 A;
    public hlm.a u;
    public q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f246697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f246698x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f246699y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.z = fVar;
        this.A = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r3.e(r7, r5, r10) == r0) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.f246699y
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            qie.f r0 = r10.f246697w
            com.revolut.feature.tab.accounts.models.ProductAccountId r0 = (com.revolut.feature.tab.accounts.models.ProductAccountId) r0
            ft3.q0 r0 = r10.v
            java.lang.String r0 = (java.lang.String) r0
            hlm.a r0 = r10.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L1c
            goto Lb1
        L1c:
            r11 = move-exception
            goto Lb9
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            int r1 = r10.f246698x
            qie.f r3 = r10.f246697w
            ft3.q0 r5 = r10.v
            hlm.a r6 = r10.u
            yhm.o.b(r11)
            r9 = r6
            r6 = r1
            r1 = r9
            goto L52
        L36:
            yhm.o.b(r11)
            qie.f r11 = r10.z
            hlm.c r1 = r11.f246701b
            r10.u = r1
            ft3.q0 r5 = r10.A
            r10.v = r5
            r10.f246697w = r11
            r6 = 0
            r10.f246698x = r6
            r10.f246699y = r3
            java.lang.Object r3 = r1.lock(r4, r10)
            if (r3 != r0) goto L51
            goto Laf
        L51:
            r3 = r11
        L52:
            rfe.n r11 = com.revolut.feature.tab.accounts.api.mode.TabAccountsMode.Credit.e     // Catch: java.lang.Throwable -> L88
            java.lang.String r11 = r11.f253772c     // Catch: java.lang.Throwable -> L88
            com.revolut.feature.tab.accounts.models.ProductAccountId r5 = com.revolut.feature.credit.models.a.c(r5)     // Catch: java.lang.Throwable -> L88
            com.revolut.feature.tab.accounts.models.ProductId r7 = com.revolut.feature.tab.accounts.models.ProductId.CREDIT     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = r7.getId()     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = r5.f89729a     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>()     // Catch: java.lang.Throwable -> L88
            r8.append(r7)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = "_:_"
            r8.append(r7)     // Catch: java.lang.Throwable -> L88
            r8.append(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L88
            mk0.a r7 = r3.f246700a     // Catch: java.lang.Throwable -> L88
            tk0.e r8 = new tk0.e     // Catch: java.lang.Throwable -> L88
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = r7.a(r8)     // Catch: java.lang.Throwable -> L88
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L88
            if (r7 != 0) goto L8b
            zhm.f0 r7 = zhm.f0.f322471a     // Catch: java.lang.Throwable -> L88
            goto L8b
        L88:
            r11 = move-exception
            r0 = r1
            goto Lb9
        L8b:
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L88
            java.util.ArrayList r5 = zhm.d0.A0(r8, r5)     // Catch: java.lang.Throwable -> L88
            boolean r7 = r5.equals(r7)     // Catch: java.lang.Throwable -> L88
            if (r7 != 0) goto Lb0
            mk0.a r3 = r3.f246700a     // Catch: java.lang.Throwable -> L88
            tk0.e r7 = new tk0.e     // Catch: java.lang.Throwable -> L88
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L88
            r10.u = r1     // Catch: java.lang.Throwable -> L88
            r10.v = r4     // Catch: java.lang.Throwable -> L88
            r10.f246697w = r4     // Catch: java.lang.Throwable -> L88
            r10.f246698x = r6     // Catch: java.lang.Throwable -> L88
            r10.f246699y = r2     // Catch: java.lang.Throwable -> L88
            java.lang.Object r11 = r3.e(r7, r5, r10)     // Catch: java.lang.Throwable -> L88
            if (r11 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            r0 = r1
        Lb1:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L1c
            r0.unlock(r4)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        Lb9:
            r0.unlock(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qie.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
