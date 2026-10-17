package tk3;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f271867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f271868c;

    public /* synthetic */ h(FlowCollector flowCollector, c cVar, int i) {
        this.f271866a = i;
        this.f271867b = flowCollector;
        this.f271868c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            int r0 = r10.f271866a
            r1 = 0
            java.lang.String r2 = "message"
            tk3.c r3 = r10.f271868c
            kotlinx.coroutines.flow.FlowCollector r4 = r10.f271867b
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            switch(r0) {
                case 0: goto L5f;
                default: goto L11;
            }
        L11:
            boolean r0 = r12 instanceof tk3.j
            if (r0 == 0) goto L22
            r0 = r12
            tk3.j r0 = (tk3.j) r0
            int r8 = r0.v
            r9 = r8 & r6
            if (r9 == 0) goto L22
            int r8 = r8 - r6
            r0.v = r8
            goto L27
        L22:
            tk3.j r0 = new tk3.j
            r0.<init>(r10, r12)
        L27:
            java.lang.Object r12 = r0.u
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r8 = r0.v
            if (r8 == 0) goto L3b
            if (r8 != r7) goto L35
            yhm.o.b(r12)
            goto L5c
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r5)
            throw r11
        L3b:
            yhm.o.b(r12)
            java.lang.String r11 = (java.lang.String) r11
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            kotlin.text.Regex r12 = r3.f271860a
            kotlin.text.Regex$a r2 = kotlin.text.Regex.INSTANCE
            kotlin.text.o r11 = r12.b(r11)
            if (r11 == 0) goto L51
            java.lang.String r1 = r11.getValue()
        L51:
            if (r1 == 0) goto L5c
            r0.v = r7
            java.lang.Object r11 = r4.emit(r1, r0)
            if (r11 != r6) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L5e:
            return r6
        L5f:
            boolean r0 = r12 instanceof tk3.g
            if (r0 == 0) goto L70
            r0 = r12
            tk3.g r0 = (tk3.g) r0
            int r8 = r0.v
            r9 = r8 & r6
            if (r9 == 0) goto L70
            int r8 = r8 - r6
            r0.v = r8
            goto L75
        L70:
            tk3.g r0 = new tk3.g
            r0.<init>(r10, r12)
        L75:
            java.lang.Object r12 = r0.u
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r8 = r0.v
            if (r8 == 0) goto L89
            if (r8 != r7) goto L83
            yhm.o.b(r12)
            goto Lb0
        L83:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r5)
            throw r11
        L89:
            yhm.o.b(r12)
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r5 = "code"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            kotlin.text.Regex r2 = r3.f271860a
            kotlin.text.Regex$a r3 = kotlin.text.Regex.INSTANCE
            kotlin.text.o r12 = r2.b(r12)
            if (r12 == 0) goto La5
            java.lang.String r1 = r12.getValue()
        La5:
            if (r1 == 0) goto Lb0
            r0.v = r7
            java.lang.Object r11 = r4.emit(r11, r0)
            if (r11 != r6) goto Lb0
            goto Lb2
        Lb0:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        Lb2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tk3.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
