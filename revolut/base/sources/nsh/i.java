package nsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f218877w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f218877w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.f218877w, continuation);
        iVar.v = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r12 == r1) goto L31;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.Object r0 = r11.v
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$a r0 = (com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r11.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L10
            if (r2 != r3) goto L17
        L10:
            yhm.o.b(r12)     // Catch: java.lang.Exception -> L14
            goto L7c
        L14:
            r0 = move-exception
            r12 = r0
            goto L75
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            yhm.o.b(r12)
            boolean r12 = r0 instanceof com.revolut.core.ui_kit.delegates.widgets.j     // Catch: java.lang.Exception -> L14
            nsh.o r6 = r11.f218877w
            r2 = 0
            if (r12 == 0) goto L5b
            com.revolut.feature.widgets.api.dependencies.WidgetContext r7 = nsh.o.e3(r6, r0)     // Catch: java.lang.Exception -> L14
            if (r7 != 0) goto L32
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L14
            return r12
        L32:
            r12 = r0
            com.revolut.core.ui_kit.delegates.widgets.j r12 = (com.revolut.core.ui_kit.delegates.widgets.j) r12     // Catch: java.lang.Exception -> L14
            java.lang.String r8 = r12.f55385b     // Catch: java.lang.Exception -> L14
            com.revolut.core.ui_kit.delegates.widgets.j r0 = (com.revolut.core.ui_kit.delegates.widgets.j) r0     // Catch: java.lang.Exception -> L14
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r12 = r0.f55386c     // Catch: java.lang.Exception -> L14
            op0.q r9 = r12.getF()     // Catch: java.lang.Exception -> L14
            r11.v = r2     // Catch: java.lang.Exception -> L14
            r11.u = r4     // Catch: java.lang.Exception -> L14
            skm.p0 r12 = skm.p0.f264001a     // Catch: java.lang.Exception -> L14
            tkm.e r12 = zkm.o.f323119a     // Catch: java.lang.Exception -> L14
            tkm.e r12 = r12.e     // Catch: java.lang.Exception -> L14
            nsh.l r5 = new nsh.l     // Catch: java.lang.Exception -> L14
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L14
            java.lang.Object r12 = skm.e0.J(r12, r5, r11)     // Catch: java.lang.Exception -> L14
            if (r12 != r1) goto L56
            goto L58
        L56:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L14
        L58:
            if (r12 != r1) goto L7c
            goto L74
        L5b:
            kotlin.jvm.internal.Intrinsics.h(r0)     // Catch: java.lang.Exception -> L14
            r11.v = r2     // Catch: java.lang.Exception -> L14
            r11.u = r3     // Catch: java.lang.Exception -> L14
            kotlinx.coroutines.d r12 = skm.p0.f264003c     // Catch: java.lang.Exception -> L14
            nsh.g r3 = new nsh.g     // Catch: java.lang.Exception -> L14
            r3.<init>(r6, r0, r2)     // Catch: java.lang.Exception -> L14
            java.lang.Object r12 = skm.e0.J(r12, r3, r11)     // Catch: java.lang.Exception -> L14
            if (r12 != r1) goto L70
            goto L72
        L70:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L14
        L72:
            if (r12 != r1) goto L7c
        L74:
            return r1
        L75:
            boolean r0 = r12 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L7f
            hx7.e.n(r12)
        L7c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L7f:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: nsh.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
