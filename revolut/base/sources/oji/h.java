package oji;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f225795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f225796x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f225797y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TimeUnit timeUnit, long j2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225796x = timeUnit;
        this.f225797y = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f225796x, this.f225797y, continuation, 0);
                hVar.f225795w = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f225796x, this.f225797y, continuation, 1);
                hVar2.f225795w = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0093 -> B:29:0x006c). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            switch(r0) {
                case 0: goto L4c;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f225795w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L25
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            yhm.o.b(r8)
            goto L49
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            yhm.o.b(r8)
            goto L3b
        L25:
            yhm.o.b(r8)
            java.util.concurrent.TimeUnit r8 = r7.f225796x
            long r5 = r7.f225797y
            long r5 = r8.toMillis(r5)
            r7.f225795w = r0
            r7.v = r4
            java.lang.Object r8 = skm.k0.b(r5, r7)
            if (r8 != r1) goto L3b
            goto L4b
        L3b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r2 = 0
            r7.f225795w = r2
            r7.v = r3
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L49
            goto L4b
        L49:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4b:
            return r1
        L4c:
            java.lang.Object r0 = r7.f225795w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L69
            if (r2 == r4) goto L65
            if (r2 != r3) goto L5d
            goto L69
        L5d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L65:
            yhm.o.b(r8)
            goto L83
        L69:
            yhm.o.b(r8)
        L6c:
            kotlin.coroutines.CoroutineContext r8 = r7.getContext()
            boolean r8 = skm.e0.x(r8)
            if (r8 == 0) goto L96
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r7.f225795w = r0
            r7.v = r4
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L83
            goto L98
        L83:
            java.util.concurrent.TimeUnit r8 = r7.f225796x
            long r5 = r7.f225797y
            long r5 = r8.toMillis(r5)
            r7.f225795w = r0
            r7.v = r3
            java.lang.Object r8 = skm.k0.b(r5, r7)
            if (r8 != r1) goto L6c
            goto L98
        L96:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oji.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
