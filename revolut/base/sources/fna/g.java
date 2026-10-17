package fna;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f136574w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f136574w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f136574w, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r1.emit(r5, r11) == r2) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.v
            r1 = r0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r0 = r11.u
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 == r4) goto L1d
            if (r0 != r3) goto L15
            yhm.o.b(r12)
            goto L77
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            goto L46
        L21:
            r0 = move-exception
            r12 = r0
            goto L4b
        L24:
            r0 = move-exception
            r12 = r0
            goto L7a
        L27:
            yhm.o.b(r12)
            fna.h r12 = r11.f136574w
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            pre.c r12 = r12.o     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            com.revolut.feature.terms.api.model.TermsScope$a r0 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            r0.getClass()     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            com.revolut.feature.terms.api.model.TermsScope r0 = com.revolut.feature.terms.api.model.TermsScope.K     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            efm.d0 r12 = pre.c.g(r12, r0)     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            r11.v = r1     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            r11.u = r4     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            java.lang.Object r12 = nim.a.b(r12, r11)     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            if (r12 != r2) goto L46
            goto L76
        L46:
            od0.i r12 = (od0.i) r12     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L24
            goto L51
        L4b:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        L51:
            java.lang.Throwable r0 = yhm.m.a(r12)
            if (r0 == 0) goto L5a
            hx7.e.n(r0)
        L5a:
            boolean r0 = r12 instanceof yhm.n
            r4 = 0
            if (r0 == 0) goto L60
            r12 = r4
        L60:
            r6 = r12
            od0.i r6 = (od0.i) r6
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.v = r4
            r11.u = r3
            java.lang.Object r12 = r1.emit(r5, r11)
            if (r12 != r2) goto L77
        L76:
            return r2
        L77:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L7a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fna.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
