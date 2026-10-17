package ish;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ dsh.e B;
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f168258w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f168259x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ WidgetContext f168260y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, WidgetContext widgetContext, String str, String str2, dsh.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f168259x = hVar;
        this.f168260y = widgetContext;
        this.z = str;
        this.A = str2;
        this.B = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f168259x, this.f168260y, this.z, this.A, this.B, continuation);
        fVar.f168258w = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r0.emit(r14, r13) == r1) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f168258w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            yhm.o.b(r14)
            r12 = r13
            goto L55
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            kotlinx.coroutines.flow.FlowCollector r0 = r13.u
            yhm.o.b(r14)
            r12 = r13
            goto L48
        L25:
            yhm.o.b(r14)
            com.revolut.feature.widgets.api.dependencies.WidgetContext r14 = r13.f168260y
            java.lang.String r2 = r13.z
            ish.h r6 = r13.f168259x
            csh.e r7 = r6.e(r14, r2)
            r13.f168258w = r5
            r13.u = r0
            r13.v = r4
            com.revolut.feature.widgets.api.dependencies.WidgetContext r8 = r13.f168260y
            java.lang.String r9 = r13.A
            java.lang.String r10 = r13.z
            dsh.e r11 = r13.B
            r12 = r13
            java.lang.Object r14 = r7.f(r8, r9, r10, r11, r12)
            if (r14 != r1) goto L48
            goto L54
        L48:
            r12.f168258w = r5
            r12.u = r5
            r12.v = r3
            java.lang.Object r14 = r0.emit(r14, r13)
            if (r14 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ish.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
