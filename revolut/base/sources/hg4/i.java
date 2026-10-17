package hg4;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f152092b;

    public /* synthetic */ i(FlowCollector flowCollector, int i) {
        this.f152091a = i;
        this.f152092b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof huh.d
            if (r0 == 0) goto L13
            r0 = r6
            huh.d r0 = (huh.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            huh.d r0 = new huh.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            kotlin.Unit r5 = (kotlin.Unit) r5
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f152092b
            com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState$Completed r6 = com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState.Completed.f96511a
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hg4.i.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[Catch: all -> 0x004e, LOOP:2: B:47:0x00b7->B:49:0x00bd, LOOP_END, TryCatch #0 {all -> 0x004e, blocks: (B:18:0x003e, B:20:0x0046, B:23:0x0052, B:25:0x005c, B:34:0x007a, B:36:0x007e, B:45:0x00a3, B:39:0x0085, B:40:0x0089, B:42:0x008f, B:44:0x009b, B:28:0x0063, B:29:0x0067, B:31:0x006d, B:46:0x00a6, B:47:0x00b7, B:49:0x00bd, B:50:0x00c9, B:51:0x00cf, B:53:0x00d5, B:55:0x00df, B:64:0x00f6, B:56:0x00e5, B:58:0x00e9, B:61:0x00ee, B:62:0x00f3, B:65:0x00f8), top: B:622:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:18:0x003e, B:20:0x0046, B:23:0x0052, B:25:0x005c, B:34:0x007a, B:36:0x007e, B:45:0x00a3, B:39:0x0085, B:40:0x0089, B:42:0x008f, B:44:0x009b, B:28:0x0063, B:29:0x0067, B:31:0x006d, B:46:0x00a6, B:47:0x00b7, B:49:0x00bd, B:50:0x00c9, B:51:0x00cf, B:53:0x00d5, B:55:0x00df, B:64:0x00f6, B:56:0x00e5, B:58:0x00e9, B:61:0x00ee, B:62:0x00f3, B:65:0x00f8), top: B:622:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 2558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hg4.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
