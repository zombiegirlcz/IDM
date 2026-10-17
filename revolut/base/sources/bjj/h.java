package bjj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f15684x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f15683w = str;
        this.f15684x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f15683w, this.f15684x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (bjj.j.c3(r7, r10, r6, r5, r9) != r0) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.u
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = r9.f15684x
            java.lang.String r6 = r9.f15683w
            bjj.j r7 = r9.v
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            yhm.o.b(r10)
            goto L62
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            goto L48
        L25:
            r10 = move-exception
            goto L4b
        L27:
            r10 = move-exception
            goto L65
        L29:
            yhm.o.b(r10)
            goto L3b
        L2d:
            yhm.o.b(r10)
            r9.u = r4
            dej.w1$c r10 = dej.w1.c.f113679a
            java.lang.Object r10 = bjj.j.c3(r7, r10, r6, r5, r9)
            if (r10 != r0) goto L3b
            goto L61
        L3b:
            dfj.t3 r10 = r7.f15688l     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            r9.u = r3     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            dfj.k4 r10 = (dfj.k4) r10     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r10 = r10.c(r6, r5, r9)     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            if (r10 != r0) goto L48
            goto L61
        L48:
            dej.w1 r10 = (dej.w1) r10     // Catch: java.lang.Exception -> L25 java.util.concurrent.CancellationException -> L27
            goto L59
        L4b:
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            r4 = 0
            java.lang.String r8 = "EsimSubscriptionActivationControllerModelExtensionImpl"
            rd0.d.a(r3, r8, r4, r10, r1)
            dej.w1$a r10 = dej.w1.a.f113677a
        L59:
            r9.u = r2
            java.lang.Object r10 = bjj.j.c3(r7, r10, r6, r5, r9)
            if (r10 != r0) goto L62
        L61:
            return r0
        L62:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L65:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bjj.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
