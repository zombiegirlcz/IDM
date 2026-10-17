package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationTargets;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationUseCase;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@gim.d(c = "com.onfido.android.sdk.capture.ui.camera.CapturePresenter$onNextFrame$1$1", f = "CapturePresenter.kt", l = {1167}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CapturePresenter$onNextFrame$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DocumentDetectionFrame $frame;
    final /* synthetic */ DocumentValidationTargets $targetValidation;
    int label;
    final /* synthetic */ CapturePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePresenter$onNextFrame$1$1(CapturePresenter capturePresenter, DocumentDetectionFrame documentDetectionFrame, DocumentValidationTargets documentValidationTargets, Continuation<? super CapturePresenter$onNextFrame$1$1> continuation) {
        super(2, continuation);
        this.this$0 = capturePresenter;
        this.$frame = documentDetectionFrame;
        this.$targetValidation = documentValidationTargets;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new CapturePresenter$onNextFrame$1$1(this.this$0, this.$frame, this.$targetValidation, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            DocumentValidationUseCase documentValidationUseCase = this.this$0.documentValidationUseCase;
            DocumentDetectionFrame documentDetectionFrame = this.$frame;
            DocumentValidationTargets documentValidationTargets = this.$targetValidation;
            this.label = 1;
            if (documentValidationUseCase.invoke(documentDetectionFrame, documentValidationTargets, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CapturePresenter$onNextFrame$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
