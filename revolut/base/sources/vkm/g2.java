package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ int f290028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h2 f290029x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Continuation continuation) {
        super(3, continuation);
        this.f290029x = h2Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj3).intValue();
        g2 g2Var = new g2(this.f290029x, (Continuation) obj4);
        g2Var.v = (FlowCollector) obj2;
        g2Var.f290028w = iIntValue;
        return g2Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r12.emit(r0, r11) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r0.emit(r12, r11) != r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[PHI: r0
      0x0078: PHI (r0v6 kotlinx.coroutines.flow.FlowCollector) = 
      (r0v4 kotlinx.coroutines.flow.FlowCollector)
      (r0v5 kotlinx.coroutines.flow.FlowCollector)
      (r0v9 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:26:0x005e, B:31:0x0075, B:12:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            vkm.h2 r0 = r11.f290029x
            long r1 = r0.f290038b
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r11.u
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L38
            if (r4 == r9) goto L34
            if (r4 == r8) goto L2e
            if (r4 == r7) goto L28
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1a
            goto L34
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            kotlinx.coroutines.flow.FlowCollector r0 = r11.v
            yhm.o.b(r12)
            goto L78
        L28:
            kotlinx.coroutines.flow.FlowCollector r0 = r11.v
            yhm.o.b(r12)
            goto L6d
        L2e:
            kotlinx.coroutines.flow.FlowCollector r0 = r11.v
            yhm.o.b(r12)
            goto L5a
        L34:
            yhm.o.b(r12)
            goto L86
        L38:
            yhm.o.b(r12)
            kotlinx.coroutines.flow.FlowCollector r12 = r11.v
            int r4 = r11.f290028w
            if (r4 <= 0) goto L4c
            vkm.b2 r0 = vkm.b2.START
            r11.u = r9
            java.lang.Object r12 = r12.emit(r0, r11)
            if (r12 != r3) goto L86
            goto L85
        L4c:
            long r9 = r0.f290037a
            r11.v = r12
            r11.u = r8
            java.lang.Object r0 = skm.k0.b(r9, r11)
            if (r0 != r3) goto L59
            goto L85
        L59:
            r0 = r12
        L5a:
            r8 = 0
            int r12 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r12 <= 0) goto L78
            vkm.b2 r12 = vkm.b2.STOP
            r11.v = r0
            r11.u = r7
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r3) goto L6d
            goto L85
        L6d:
            r11.v = r0
            r11.u = r6
            java.lang.Object r12 = skm.k0.b(r1, r11)
            if (r12 != r3) goto L78
            goto L85
        L78:
            vkm.b2 r12 = vkm.b2.STOP_AND_RESET_REPLAY_CACHE
            r1 = 0
            r11.v = r1
            r11.u = r5
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r3) goto L86
        L85:
            return r3
        L86:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.g2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
