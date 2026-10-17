package y7a;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f311433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f311434c;

    public /* synthetic */ b0(FlowCollector flowCollector, f0 f0Var, int i) {
        this.f311432a = i;
        this.f311433b = flowCollector;
        this.f311434c = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f311432a
            switch(r0) {
                case 0: goto L55;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof y7a.d0
            if (r0 == 0) goto L18
            r0 = r6
            y7a.d0 r0 = (y7a.d0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            y7a.d0 r0 = new y7a.d0
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            java.util.Set r5 = (java.util.Set) r5
            y7a.f0 r6 = r4.f311434c
            a8a.d r2 = r6.y2()
            com.revolut.feature.picker.legacy.PickerScreenContract$InputData r6 = r6.f311442q
            java.util.Set r6 = r6.f80369r
            com.revolut.core.ui_kit.models.Clause r5 = r2.c(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f311433b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L52
            goto L54
        L52:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L54:
            return r1
        L55:
            boolean r0 = r6 instanceof y7a.a0
            if (r0 == 0) goto L68
            r0 = r6
            y7a.a0 r0 = (y7a.a0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L68
            int r1 = r1 - r2
            r0.v = r1
            goto L6d
        L68:
            y7a.a0 r0 = new y7a.a0
            r0.<init>(r4, r6)
        L6d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L84
            if (r2 != r3) goto L7c
            yhm.o.b(r6)
            goto Lb6
        L7c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L84:
            yhm.o.b(r6)
            java.util.Set r5 = (java.util.Set) r5
            y7a.f0 r6 = r4.f311434c
            a8a.d r2 = r6.y2()
            com.revolut.feature.picker.legacy.PickerScreenContract$InputData r6 = r6.f311442q
            java.util.Set r6 = r6.f80369r
            r2.getClass()
            java.lang.String r2 = "preSelectedModelIds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r6 = "ids"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f311433b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto Lb6
            goto Lb8
        Lb6:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y7a.b0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
