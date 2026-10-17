package f28;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f131469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f131470c;
    public final /* synthetic */ String d;

    public /* synthetic */ k(FlowCollector flowCollector, t tVar, String str, int i) {
        this.f131468a = i;
        this.f131469b = flowCollector;
        this.f131470c = tVar;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f131468a
            switch(r0) {
                case 0: goto L4f;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof f28.n
            if (r0 == 0) goto L18
            r0 = r6
            f28.n r0 = (f28.n) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            f28.n r0 = new f28.n
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            f28.g r5 = (f28.g) r5
            f28.t r6 = r4.f131470c
            java.lang.String r2 = r4.d
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r5 = f28.t.i(r6, r5, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f131469b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4e:
            return r1
        L4f:
            boolean r0 = r6 instanceof f28.j
            if (r0 == 0) goto L62
            r0 = r6
            f28.j r0 = (f28.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L62
            int r1 = r1 - r2
            r0.v = r1
            goto L67
        L62:
            f28.j r0 = new f28.j
            r0.<init>(r4, r6)
        L67:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7e
            if (r2 != r3) goto L76
            yhm.o.b(r6)
            goto L96
        L76:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7e:
            yhm.o.b(r6)
            f28.g r5 = (f28.g) r5
            f28.t r6 = r4.f131470c
            java.lang.String r2 = r4.d
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r5 = f28.t.i(r6, r5, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f131469b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L96
            goto L98
        L96:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f28.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
