package wca;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public long u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f296372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f296373x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j2, Continuation continuation) {
        super(2, continuation);
        this.f296373x = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.f296373x, continuation);
        iVar.f296372w = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (skm.k0.c(r7, r9) != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f296372w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L24
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            long r5 = r9.u
            yhm.o.b(r10)
            goto L5c
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            long r5 = r9.u
            yhm.o.b(r10)
            goto L48
        L24:
            yhm.o.b(r10)
            long r5 = r9.f296373x
        L29:
            kotlin.time.b$a r10 = kotlin.time.b.INSTANCE
            r10.getClass()
            r7 = 0
            int r10 = kotlin.time.b.c(r5, r7)
            if (r10 <= 0) goto L6c
            kotlin.time.b r10 = new kotlin.time.b
            r10.<init>(r5)
            r9.f296372w = r0
            r9.u = r5
            r9.v = r4
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto L48
            goto L5b
        L48:
            wca.d r10 = wca.h.Companion
            r10.getClass()
            long r7 = wca.d.f296365c
            r9.f296372w = r0
            r9.u = r5
            r9.v = r3
            java.lang.Object r10 = skm.k0.c(r7, r9)
            if (r10 != r1) goto L5c
        L5b:
            return r1
        L5c:
            wca.d r10 = wca.h.Companion
            r10.getClass()
            long r7 = wca.d.f296365c
            long r7 = kotlin.time.b.p(r7)
            long r5 = kotlin.time.b.l(r5, r7)
            goto L29
        L6c:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: wca.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
