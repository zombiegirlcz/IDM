package tb;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f269380b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f269379a = i;
        this.f269380b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f269379a
            switch(r0) {
                case 0: goto L72;
                case 1: goto L50;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof tb.f
            if (r0 == 0) goto L18
            r0 = r6
            tb.f r0 = (tb.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            tb.f r0 = new tb.f
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f269380b
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            r2 = r5
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L4d
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4f:
            return r1
        L50:
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r5 = r4.f269380b
            tb.a0 r5 = (tb.a0) r5
            androidx.compose.foundation.lazy.LazyListItemInfo r6 = r5.a()
            if (r6 == 0) goto L6f
            int r6 = r6.getIndex()
            int r0 = r5.b()
            if (r6 == r0) goto L6f
            androidx.compose.runtime.MutableState r5 = r5.f269375b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.setValue(r6)
        L6f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L72:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            java.lang.Object r5 = r4.f269380b
            tb.a0 r5 = (tb.a0) r5
            r6 = 0
            androidx.compose.runtime.MutableState r5 = r5.f
            r5.setValue(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
