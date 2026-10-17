package androidx.camera.camera2.impl;

import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1", f = "CapturePipeline.kt", l = {312, 885, 892}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
public final class CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSignal;
    Object L$0;
    int label;
    final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1(List list, Continuation continuation, CapturePipelineImpl capturePipelineImpl, int i) {
        super(2, continuation);
        this.$captureSignal = list;
        this.this$0 = capturePipelineImpl;
        this.$captureMode$inlined = i;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1(this.$captureSignal, continuation, this.this$0, this.$captureMode$inlined);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:32:0x007d, B:34:0x0088, B:37:0x0095, B:41:0x009b), top: B:55:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af A[Catch: all -> 0x001a, TryCatch #2 {all -> 0x001a, blocks: (B:8:0x0015, B:45:0x00a7, B:47:0x00af, B:48:0x00b6), top: B:59:0x0015 }] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = "CXCP"
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r8.L$0
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L1a
            goto La7
        L1a:
            r9 = move-exception
            goto Lbf
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            yhm.o.b(r9)
            goto L7b
        L29:
            yhm.o.b(r9)
            goto L4c
        L2d:
            yhm.o.b(r9)
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r9 == 0) goto L3f
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal"
        L3f:
            java.util.List r9 = r8.$captureSignal
            java.util.Collection r9 = (java.util.Collection) r9
            r8.label = r4
            java.lang.Object r9 = skm.e0.z(r9, r8)
            if (r9 != r0) goto L4c
            goto La5
        L4c:
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r9 == 0) goto L5b
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#List<PipelineTask>.invoke: Waiting for POST_CAPTURE signal done"
        L5b:
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r9 == 0) goto L68
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for unlocking 3A"
        L68:
            androidx.camera.camera2.impl.CapturePipelineImpl r9 = r8.this$0
            androidx.camera.camera2.config.UseCaseGraphContext r9 = androidx.camera.camera2.impl.CapturePipelineImpl.access$getUseCaseGraphContext$p(r9)
            androidx.camera.camera2.pipe.CameraGraph r9 = r9.getGraph()
            r8.label = r3
            java.lang.Object r9 = r9.acquireSession(r8)
            if (r9 != r0) goto L7b
            goto La5
        L7b:
            java.lang.AutoCloseable r9 = (java.lang.AutoCloseable) r9
            r1 = r9
            androidx.camera.camera2.pipe.CameraGraph$Session r1 = (androidx.camera.camera2.pipe.CameraGraph.Session) r1     // Catch: java.lang.Throwable -> L90
            androidx.camera.camera2.impl.Camera2Logger r3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> L90
            boolean r3 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L95
            java.lang.String r3 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A"
            goto L95
        L90:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto Lbf
        L95:
            int r3 = r8.$captureMode$inlined     // Catch: java.lang.Throwable -> L90
            if (r3 != 0) goto L9a
            goto L9b
        L9a:
            r4 = 0
        L9b:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L90
            r8.label = r2     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r1.unlock3APostCapture(r4, r8)     // Catch: java.lang.Throwable -> L90
            if (r1 != r0) goto La6
        La5:
            return r0
        La6:
            r0 = r9
        La7:
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> L1a
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> L1a
            if (r9 == 0) goto Lb6
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "CapturePipeline#aePreCaptureApplyCapture: Unlocking 3A done"
        Lb6:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L1a
            r9 = 0
            mra.d.l(r0, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lbf:
            throw r9     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r1 = move-exception
            mra.d.l(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
