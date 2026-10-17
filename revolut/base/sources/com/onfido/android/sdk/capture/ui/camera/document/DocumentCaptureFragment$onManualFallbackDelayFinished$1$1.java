package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onManualFallbackDelayFinished$1$1", f = "DocumentCaptureFragment.kt", l = {631}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureFragment$onManualFallbackDelayFinished$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OnfidoCaptureValidationBubble $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCaptureFragment$onManualFallbackDelayFinished$1$1(OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, Continuation<? super DocumentCaptureFragment$onManualFallbackDelayFinished$1$1> continuation) {
        super(2, continuation);
        this.$this_with = onfidoCaptureValidationBubble;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentCaptureFragment$onManualFallbackDelayFinished$1$1(this.$this_with, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            long j2 = this.$this_with.readingTimeMilliseconds$onfido_capture_sdk_core_release();
            this.label = 1;
            if (k0.b(j2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        this.$this_with.setState$onfido_capture_sdk_core_release(OnfidoCaptureValidationBubble.State.SOFT_LOCK);
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DocumentCaptureFragment$onManualFallbackDelayFinished$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
