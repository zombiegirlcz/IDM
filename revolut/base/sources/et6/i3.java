package et6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i3 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j3 f129250w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j3 j3Var, Continuation continuation) {
        super(2, continuation);
        this.f129250w = j3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i3 i3Var = new i3(this.f129250w, continuation);
        i3Var.v = obj2;
        return i3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i3) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (vkm.q.u(r0, r13, r12) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r0.emit(r6, r12) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        return r1;
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
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L19:
            yhm.o.b(r13)
            goto L64
        L1d:
            yhm.o.b(r13)
            et6.j3 r13 = r12.f129250w
            gte.a r2 = r13.f129255a
            com.revolut.feature.freelancer.api.FreelancerApi$Toggles$ProTradingNameChange r5 = com.revolut.feature.freelancer.api.FreelancerApi$Toggles.ProTradingNameChange.f73170c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r5)
            r5 = 0
            if (r2 == 0) goto L4e
            au6.m2 r13 = r13.f129256b
            r13.getClass()
            java.lang.String r2 = "loadingStrategy"
            w4l.h r3 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            x4l.c r13 = r13.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r13 = r13.b(r2, r3)
            r12.v = r5
            r12.u = r4
            java.lang.Object r13 = vkm.q.u(r0, r13, r12)
            if (r13 != r1) goto L64
            goto L63
        L4e:
            com.revolut.data.model.Data r6 = new com.revolut.data.model.Data
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r12.v = r5
            r12.u = r3
            java.lang.Object r13 = r0.emit(r6, r12)
            if (r13 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.i3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
