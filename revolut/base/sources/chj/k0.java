package chj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 extends gim.i implements oim.n {
    public int u;
    public /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ kotlin.time.b f24266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ kotlin.time.b f24267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f24268y;
    public final /* synthetic */ u0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m mVar, u0 u0Var, Continuation continuation) {
        super(4, continuation);
        this.f24268y = mVar;
        this.z = u0Var;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        k0 k0Var = new k0(this.f24268y, this.z, (Continuation) obj5);
        k0Var.v = (String) obj2;
        k0Var.f24266w = (kotlin.time.b) obj3;
        k0Var.f24267x = (kotlin.time.b) obj4;
        return k0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r10 == r3) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Exception {
        /*
            r9 = this;
            java.lang.String r0 = r9.v
            kotlin.time.b r1 = r9.f24266w
            kotlin.time.b r2 = r9.f24267x
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r9.u
            chj.u0 r5 = r9.z
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L29
            if (r4 == r7) goto L21
            if (r4 != r6) goto L19
            yhm.o.b(r10)
            goto L61
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            goto L3d
        L25:
            r10 = move-exception
            goto L64
        L27:
            r10 = move-exception
            goto L6c
        L29:
            yhm.o.b(r10)
            chj.m r10 = r9.f24268y     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r9.v = r8     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r9.f24266w = r8     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r9.f24267x = r8     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r9.u = r7     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r10 = r10.invoke(r0, r1, r2, r9)     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            if (r10 != r3) goto L3d
            goto L60
        L3d:
            r9.v = r8
            r9.f24266w = r8
            r9.f24267x = r8
            r9.u = r6
            r5.getClass()
            skm.p0 r10 = skm.p0.f264001a
            tkm.e r10 = zkm.o.f323119a
            tkm.e r10 = r10.e
            c65.i r0 = new c65.i
            r1 = 18
            r0.<init>(r5, r8, r1)
            java.lang.Object r10 = skm.e0.J(r10, r0, r9)
            if (r10 != r3) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L5e:
            if (r10 != r3) goto L61
        L60:
            return r3
        L61:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L64:
            vkm.z1 r0 = r5.f24313r
            chj.x r1 = chj.x.f24316a
            r0.k(r1)
            throw r10
        L6c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: chj.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
