package h3j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f149146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f149147x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f149146w = f0Var;
        this.f149147x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.f149146w, this.f149147x, continuation);
        e0Var.v = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (vkm.q.u(r0, r13, r12) == r1) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.v
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r12.u
            r3 = 2
            r4 = 1
            h3j.f0 r5 = r12.f149146w
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            yhm.o.b(r13)
            goto L85
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            yhm.o.b(r13)
            goto L36
        L22:
            yhm.o.b(r13)
            o71.a r13 = r5.f149151a
            r12.v = r0
            r12.u = r4
            r21.h r13 = (r21.h) r13
            java.lang.String r2 = r12.f149147x
            java.lang.Object r13 = r13.f(r2, r12)
            if (r13 != r1) goto L36
            goto L84
        L36:
            f5j.a r13 = (f5j.a) r13
            tof.i7$c r2 = tof.i7.Companion
            z2j.f r6 = r5.f149154g
            tof.i7 r13 = r6.a(r13)
            tof.u9 r6 = new tof.u9
            r7 = 0
            r6.<init>(r7)
            tof.v6 r8 = tof.v6.PENDING
            tof.v6 r9 = tof.v6.REVERTED
            tof.v6 r10 = tof.v6.COMPLETED
            tof.v6 r11 = tof.v6.DECLINED
            tof.v6[] r8 = new tof.v6[]{r8, r9, r10, r11}
            r2.getClass()
            tof.qb r2 = tof.i7.c.c(r8)
            r8 = 3
            tof.i7[] r8 = new tof.i7[r8]
            r8[r7] = r13
            r8[r4] = r6
            r8[r3] = r2
            tof.q7 r13 = tof.i7.c.a(r8)
            whf.b r6 = r5.d
            efm.r r7 = te0.w.h(r13)
            r10 = 0
            r11 = 14
            r8 = 0
            r9 = 0
            efm.r r13 = whf.b.a(r6, r7, r8, r9, r10, r11)
            vkm.d r13 = rd0.e.b(r13)
            r2 = 0
            r12.v = r2
            r12.u = r3
            java.lang.Object r13 = vkm.q.u(r0, r13, r12)
            if (r13 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h3j.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
