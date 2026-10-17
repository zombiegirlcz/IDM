package qz9;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public List u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f250426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k7i.i f250427x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k7i.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f250427x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f250427x, continuation);
        jVar.f250426w = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (skm.k0.c(r6, r8) != r1) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f250426w
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.v
            k7i.i r3 = r8.f250427x
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L32
            if (r2 == r6) goto L2e
            if (r2 == r5) goto L26
            if (r2 != r4) goto L1e
            java.util.List r2 = r8.u
            java.util.List r2 = (java.util.List) r2
            yhm.o.b(r9)
        L1c:
            r9 = r2
            goto L46
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            java.util.List r2 = r8.u
            java.util.List r2 = (java.util.List) r2
            yhm.o.b(r9)
            goto L7a
        L2e:
            yhm.o.b(r9)
            goto L44
        L32:
            yhm.o.b(r9)
            java.lang.Object r9 = r3.f182069b
            kbb.c r9 = (kbb.c) r9
            r8.f250426w = r0
            r8.v = r6
            java.lang.Object r9 = r9.y(r8)
            if (r9 != r1) goto L44
            goto L93
        L44:
            java.util.List r9 = (java.util.List) r9
        L46:
            boolean r2 = skm.e0.y(r0)
            if (r2 == 0) goto L94
            java.lang.Object r2 = r3.f182070c
            com.revolut.domain.interactors.transactions.a r2 = (com.revolut.domain.interactors.transactions.a) r2
            r6 = r9
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            tof.q6[] r7 = new tof.q6[r7]
            java.lang.Object[] r6 = r6.toArray(r7)
            tof.q6[] r6 = (tof.q6[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            tof.q6[] r6 = (tof.q6[]) r6
            mjf.b0 r2 = (mjf.b0) r2
            pfm.r r2 = r2.g(r6)
            r8.f250426w = r0
            r6 = r9
            java.util.List r6 = (java.util.List) r6
            r8.u = r6
            r8.v = r5
            java.lang.Object r2 = nim.a.a(r2, r8)
            if (r2 != r1) goto L79
            goto L93
        L79:
            r2 = r9
        L7a:
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            r9 = 3000(0xbb8, float:4.204E-42)
            pkm.e r6 = pkm.e.MILLISECONDS
            long r6 = kotlin.time.c.g(r9, r6)
            r8.f250426w = r0
            r9 = r2
            java.util.List r9 = (java.util.List) r9
            r8.u = r9
            r8.v = r4
            java.lang.Object r9 = skm.k0.c(r6, r8)
            if (r9 != r1) goto L1c
        L93:
            return r1
        L94:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qz9.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
