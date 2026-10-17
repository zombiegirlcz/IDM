package oji;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public long u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f225792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f225793x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f225794y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j2, TimeUnit timeUnit, long j3, Continuation continuation) {
        super(2, continuation);
        this.f225793x = j2;
        this.f225794y = timeUnit;
        this.z = j3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f225793x, this.f225794y, this.z, continuation);
        gVar.f225792w = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (skm.k0.b(r11, r13) != r1) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005d -> B:21:0x0060). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f225792w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.v
            long r3 = r13.z
            r5 = 2
            r6 = 0
            r8 = 1
            if (r2 == 0) goto L28
            if (r2 == r8) goto L22
            if (r2 != r5) goto L1a
            long r9 = r13.u
            yhm.o.b(r14)
            goto L60
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            long r9 = r13.u
            yhm.o.b(r14)
            goto L4d
        L28:
            yhm.o.b(r14)
            long r9 = r13.f225793x
        L2d:
            kotlin.coroutines.CoroutineContext r14 = r13.getContext()
            boolean r14 = skm.e0.x(r14)
            if (r14 == 0) goto L6f
            int r14 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r14 < 0) goto L6f
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r9)
            r13.f225792w = r0
            r13.u = r9
            r13.v = r8
            java.lang.Object r14 = r0.emit(r14, r13)
            if (r14 != r1) goto L4d
            goto L5f
        L4d:
            java.util.concurrent.TimeUnit r14 = r13.f225794y
            long r11 = r14.toMillis(r3)
            r13.f225792w = r0
            r13.u = r9
            r13.v = r5
            java.lang.Object r14 = skm.k0.b(r11, r13)
            if (r14 != r1) goto L60
        L5f:
            return r1
        L60:
            long r9 = r9 - r3
            int r14 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r14 >= 0) goto L2d
            kotlin.coroutines.CoroutineContext r14 = r13.getContext()
            r2 = 0
            skm.e0.j(r14, r2)
            r9 = r6
            goto L2d
        L6f:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: oji.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
