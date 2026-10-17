package aci;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Flow f3148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f3149y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Flow flow, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f3148x = flow;
        this.f3149y = (i) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f3148x, (Function2) this.f3149y, continuation);
                eVar.f3147w = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f3148x, (Function3) this.f3149y, continuation);
                eVar2.f3147w = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Type inference failed for: r3v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.u
            switch(r0) {
                case 0: goto L4c;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.v
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r5.f3147w
            vkm.o0 r0 = (vkm.o0) r0
            yhm.o.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L16
            goto L48
        L16:
            r6 = move-exception
            goto L3d
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f3147w
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            kotlinx.coroutines.flow.Flow r1 = r5.f3148x
            vkm.o0 r3 = new vkm.o0
            gim.i r4 = r5.f3149y
            r3.<init>(r4, r6)
            r5.f3147w = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3b
            r5.v = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3b
            java.lang.Object r6 = r1.collect(r3, r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3b
            if (r6 != r0) goto L48
            goto L4a
        L3b:
            r6 = move-exception
            r0 = r3
        L3d:
            java.lang.Object r1 = r6.f187936a
            if (r1 != r0) goto L4b
            kotlin.coroutines.CoroutineContext r6 = r5.getContext()
            skm.e0.p(r6)
        L48:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L4a:
            return r0
        L4b:
            throw r6
        L4c:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.v
            r2 = 1
            if (r1 == 0) goto L65
            if (r1 != r2) goto L5d
            java.lang.Object r0 = r5.f3147w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            yhm.o.b(r6)
            goto L82
        L5d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L65:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f3147w
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            aci.d r1 = new aci.d
            gim.i r3 = r5.f3149y
            r4 = 0
            r1.<init>(r6, r3, r4)
            r6 = 0
            r5.f3147w = r6
            r5.v = r2
            kotlinx.coroutines.flow.Flow r6 = r5.f3148x
            java.lang.Object r6 = r6.collect(r1, r5)
            if (r6 != r0) goto L82
            goto L84
        L82:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aci.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Flow flow, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.f3148x = flow;
        this.f3149y = (i) function3;
    }
}
