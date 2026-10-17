package w38;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f294246w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, Continuation continuation) {
        super(2, continuation);
        this.f294246w = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        z0 z0Var = new z0(this.f294246w, continuation);
        z0Var.v = obj2;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r2.emit(r9, r8) == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r9 == r3) goto L27;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            w38.a1 r0 = r8.f294246w
            g48.r0 r1 = r0.f294154a
            java.lang.Object r2 = r8.v
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r8.u
            r5 = 2
            r6 = 1
            r7 = 3
            if (r4 == 0) goto L2b
            if (r4 == r6) goto L27
            if (r4 == r5) goto L23
            if (r4 != r7) goto L1b
            yhm.o.b(r9)
            goto L71
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            yhm.o.b(r9)
            goto L4f
        L27:
            yhm.o.b(r9)
            goto L39
        L2b:
            yhm.o.b(r9)
            r8.v = r2
            r8.u = r6
            java.lang.Boolean r9 = r1.n()
            if (r9 != r3) goto L39
            goto L70
        L39:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r4 = 0
            if (r9 != 0) goto L52
            zhm.f0 r9 = zhm.f0.f322471a
            r8.v = r4
            r8.u = r5
            java.lang.Object r9 = r2.emit(r9, r8)
            if (r9 != r3) goto L4f
            goto L70
        L4f:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L52:
            wkm.l r9 = k38.c.a(r1, r4, r4, r7)
            w38.x0 r1 = new w38.x0
            r1.<init>(r2)
            r8.v = r4
            r8.u = r7
            vkm.s0 r2 = new vkm.s0
            r4 = 2
            r2.<init>(r1, r0, r4)
            java.lang.Object r9 = r9.collect(r2, r8)
            if (r9 != r3) goto L6c
            goto L6e
        L6c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L6e:
            if (r9 != r3) goto L71
        L70:
            return r3
        L71:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w38.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
