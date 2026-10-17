package ish;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f168296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ WidgetContext f168297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dsh.p f168298y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, WidgetContext widgetContext, dsh.p pVar, Continuation continuation) {
        super(2, continuation);
        this.f168296w = zVar;
        this.f168297x = widgetContext;
        this.f168298y = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.f168296w, this.f168297x, this.f168298y, continuation);
        yVar.v = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r4.emit(r11, r17) == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (vkm.q.u(r4, r2, r17) == r5) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            dsh.p r1 = r0.f168298y
            java.lang.String r2 = r1.f117337b
            ish.z r3 = r0.f168296w
            ish.h r3 = r3.f168299a
            java.lang.Object r4 = r0.v
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r0.u
            com.revolut.feature.widgets.api.dependencies.WidgetContext r7 = r0.f168297x
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L36
            if (r6 == r10) goto L30
            if (r6 == r9) goto L2c
            if (r6 != r8) goto L24
            yhm.o.b(r18)
            goto Laf
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            yhm.o.b(r18)
            goto L63
        L30:
            yhm.o.b(r18)
            r6 = r18
            goto L44
        L36:
            yhm.o.b(r18)
            r0.v = r4
            r0.u = r10
            java.lang.Object r6 = r3.h(r7, r2, r0)
            if (r6 != r5) goto L44
            goto Lae
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r10 = 0
            if (r6 != 0) goto L66
            com.revolut.data.model.Data r11 = new com.revolut.data.model.Data
            r15 = 6
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r0.v = r10
            r0.u = r9
            java.lang.Object r1 = r4.emit(r11, r0)
            if (r1 != r5) goto L63
            goto Lae
        L63:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L66:
            java.lang.String r6 = r1.f117336a
            dsh.t r9 = r1.d
            dsh.e r1 = r1.f117338c
            java.lang.String r11 = "widgetContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r11)
            java.lang.String r11 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r11)
            java.lang.String r11 = "widgetType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r11)
            java.lang.String r11 = "widgetState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            java.lang.String r11 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r11)
            csh.e r11 = r3.e(r7, r2)
            kotlinx.coroutines.flow.Flow r1 = r11.g(r7, r6, r2, r1)
            ish.g r2 = new ish.g
            r2.<init>(r3, r6, r9, r10)
            vkm.q0 r3 = new vkm.q0
            r6 = 1
            r3.<init>(r1, r2, r6)
            ikf.g r1 = new ikf.g
            r2 = 17
            r1.<init>(r3, r10, r2)
            vkm.v1 r2 = new vkm.v1
            r2.<init>(r1)
            r0.v = r10
            r0.u = r8
            java.lang.Object r1 = vkm.q.u(r4, r2, r0)
            if (r1 != r5) goto Laf
        Lae:
            return r5
        Laf:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
