package com.onfido.android.sdk.capture.internal.usecase.validation;

import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationUseCase$invoke$2$hasGlareDeferred$1", f = "DocumentValidationUseCase.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentValidationUseCase$invoke$2$hasGlareDeferred$1 extends i implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ DocumentDetectionFrame $frame;
    int label;
    final /* synthetic */ DocumentValidationUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentValidationUseCase$invoke$2$hasGlareDeferred$1(DocumentValidationUseCase documentValidationUseCase, DocumentDetectionFrame documentDetectionFrame, Continuation<? super DocumentValidationUseCase$invoke$2$hasGlareDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = documentValidationUseCase;
        this.$frame = documentDetectionFrame;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentValidationUseCase$invoke$2$hasGlareDeferred$1(this.this$0, this.$frame, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        return Boolean.valueOf(this.this$0.getNativeDetector().isGlareDetected(this.$frame));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((DocumentValidationUseCase$invoke$2$hasGlareDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
