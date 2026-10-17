package qv;

import gim.i;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends i implements Function2 {
    public long u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f249508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f249509x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j2, Continuation continuation) {
        super(2, continuation);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f249509x = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b bVar = new b(this.f249509x, continuation);
        bVar.f249508w = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (skm.k0.b(r9, r11) != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:19:0x0056). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f249508w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.v
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L26
            if (r2 == r6) goto L20
            if (r2 != r5) goto L18
            long r7 = r11.u
            yhm.o.b(r12)
            goto L56
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            long r7 = r11.u
            yhm.o.b(r12)
            goto L43
        L26:
            yhm.o.b(r12)
            long r7 = r11.f249509x
        L2b:
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 < 0) goto L58
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r7)
            r11.f249508w = r0
            r11.u = r7
            r11.v = r6
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L43
            goto L55
        L43:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r12.toMillis(r3)
            r11.f249508w = r0
            r11.u = r7
            r11.v = r5
            java.lang.Object r12 = skm.k0.b(r9, r11)
            if (r12 != r1) goto L56
        L55:
            return r1
        L56:
            long r7 = r7 - r3
            goto L2b
        L58:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qv.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
