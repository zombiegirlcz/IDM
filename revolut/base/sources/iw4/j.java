package iw4;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f168945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f168946c;

    public /* synthetic */ j(FlowCollector flowCollector, int i, int i2) {
        this.f168944a = i2;
        this.f168945b = flowCollector;
        this.f168946c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            int r0 = r7.f168944a
            switch(r0) {
                case 0: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r9 instanceof kq.f
            if (r0 == 0) goto L18
            r0 = r9
            kq.f r0 = (kq.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            kq.f r0 = new kq.f
            r0.<init>(r7, r9)
        L1d:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)
            goto L66
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            kq.i[] r8 = (kq.i[]) r8
            if (r8 == 0) goto L57
            int r9 = r8.length
            r2 = 0
        L3d:
            if (r2 >= r9) goto L4d
            r4 = r8[r2]
            int r5 = r4.getId()
            int r6 = r7.f168946c
            if (r5 != r6) goto L4a
            goto L4e
        L4a:
            int r2 = r2 + 1
            goto L3d
        L4d:
            r4 = 0
        L4e:
            if (r4 == 0) goto L57
            java.util.Map r8 = r4.getUserSettings()
            if (r8 == 0) goto L57
            goto L5b
        L57:
            java.util.Map r8 = zhm.r0.g()
        L5b:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f168945b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L66
            goto L68
        L66:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L68:
            return r1
        L69:
            boolean r0 = r9 instanceof iw4.i
            if (r0 == 0) goto L7c
            r0 = r9
            iw4.i r0 = (iw4.i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L7c
            int r1 = r1 - r2
            r0.v = r1
            goto L81
        L7c:
            iw4.i r0 = new iw4.i
            r0.<init>(r7, r9)
        L81:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L98
            if (r2 != r3) goto L90
            yhm.o.b(r9)
            goto Laf
        L90:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L98:
            yhm.o.b(r9)
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r8 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r8
            java.lang.Integer r8 = new java.lang.Integer
            int r9 = r7.f168946c
            r8.<init>(r9)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f168945b
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto Laf
            goto Lb1
        Laf:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: iw4.j.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
