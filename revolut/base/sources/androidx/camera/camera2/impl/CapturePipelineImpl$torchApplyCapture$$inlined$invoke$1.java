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
@d(c = "androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1", f = "CapturePipeline.kt", l = {312, 898, 900, 907}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
public final class CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ List $captureSignal;
    final /* synthetic */ boolean $lock3ARequired$inlined;
    final /* synthetic */ boolean $torchOnRequired$inlined;
    final /* synthetic */ boolean $triggerAePreCapture$inlined;
    Object L$0;
    int label;
    final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(List list, Continuation continuation, boolean z, CapturePipelineImpl capturePipelineImpl, boolean z3, boolean z4, int i) {
        super(2, continuation);
        this.$captureSignal = list;
        this.$torchOnRequired$inlined = z;
        this.this$0 = capturePipelineImpl;
        this.$triggerAePreCapture$inlined = z3;
        this.$lock3ARequired$inlined = z4;
        this.$captureMode$inlined = i;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(this.$captureSignal, continuation, this.$torchOnRequired$inlined, this.this$0, this.$triggerAePreCapture$inlined, this.$lock3ARequired$inlined, this.$captureMode$inlined);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
    
        if (r14.unlockAf(r3, r13) == r0) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
