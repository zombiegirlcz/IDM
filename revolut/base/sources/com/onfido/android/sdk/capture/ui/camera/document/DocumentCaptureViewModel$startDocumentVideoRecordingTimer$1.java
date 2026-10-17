package com.onfido.android.sdk.capture.ui.camera.document;

import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1", f = "DocumentCaptureViewModel.kt", l = {1107, 1112, 1114, 1116}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Boolean> $hasValidRecording;
    final /* synthetic */ long $recordingTimeoutMs;
    final /* synthetic */ long $torchTurnOnTimeMs;
    final /* synthetic */ long $videoLengthMs;
    int label;
    final /* synthetic */ DocumentCaptureViewModel this$0;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Boolean> {
        final /* synthetic */ Function0<Boolean> $hasValidRecording;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Boolean> function0) {
            super(0);
            this.$hasValidRecording = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return (Boolean) this.$hasValidRecording.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1(long j2, long j3, long j5, DocumentCaptureViewModel documentCaptureViewModel, Function0<Boolean> function0, Continuation<? super DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1> continuation) {
        super(2, continuation);
        this.$recordingTimeoutMs = j2;
        this.$torchTurnOnTimeMs = j3;
        this.$videoLengthMs = j5;
        this.this$0 = documentCaptureViewModel;
        this.$hasValidRecording = function0;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1(this.$recordingTimeoutMs, this.$torchTurnOnTimeMs, this.$videoLengthMs, this.this$0, this.$hasValidRecording, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (skm.k0.b(r3, r9) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            goto L8c
        L20:
            r10 = move-exception
            goto L94
        L23:
            r10 = move-exception
            goto L7d
        L25:
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            goto L59
        L29:
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            goto L42
        L2d:
            yhm.o.b(r10)
            long r6 = r9.$recordingTimeoutMs     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1$1 r10 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1$1     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            kotlin.jvm.functions.Function0<java.lang.Boolean> r1 = r9.$hasValidRecording     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            r9.label = r5     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            java.lang.Object r10 = com.onfido.android.sdk.capture.utils.FlowExtKt.delayUntil(r6, r10, r9)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            if (r10 != r0) goto L42
            goto L7c
        L42:
            long r5 = r9.$torchTurnOnTimeMs     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            r7 = 1
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L72
            long r7 = r9.$videoLengthMs     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L72
            r9.label = r4     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            java.lang.Object r10 = skm.k0.b(r5, r9)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            if (r10 != r0) goto L59
            goto L7c
        L59:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r10 = r9.this$0     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            kotlinx.coroutines.flow.MutableStateFlow r10 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.access$get_shouldEnableTorch$p(r10)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            r10.setValue(r1)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            long r1 = r9.$videoLengthMs     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            long r4 = r9.$torchTurnOnTimeMs     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            long r1 = r1 - r4
            r9.label = r3     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            java.lang.Object r10 = skm.k0.b(r1, r9)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            if (r10 != r0) goto L8c
            goto L7c
        L72:
            long r3 = r9.$videoLengthMs     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            r9.label = r2     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            java.lang.Object r10 = skm.k0.b(r3, r9)     // Catch: java.lang.Throwable -> L20 kotlinx.coroutines.TimeoutCancellationException -> L23
            if (r10 != r0) goto L8c
        L7c:
            return r0
        L7d:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r0 = r9.this$0     // Catch: java.lang.Throwable -> L20
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.access$onErrorVideoTaking(r0)     // Catch: java.lang.Throwable -> L20
            com.onfido.android.sdk.capture.internal.util.logging.Timber$Forest r0 = com.onfido.android.sdk.capture.internal.util.logging.Timber.INSTANCE     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "startDocumentVideoRecordingTimer failed"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20
            r0.e(r10, r1, r2)     // Catch: java.lang.Throwable -> L20
        L8c:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r10 = r9.this$0
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.access$stopDocumentRecording(r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L94:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r0 = r9.this$0
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.access$stopDocumentRecording(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
