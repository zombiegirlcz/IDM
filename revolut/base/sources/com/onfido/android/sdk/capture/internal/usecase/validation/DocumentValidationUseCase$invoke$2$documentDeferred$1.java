package com.onfido.android.sdk.capture.internal.usecase.validation;

import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.utils.mlmodel.OnfidoDocumentDetector;
import com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlDocument;
import fim.a;
import gim.d;
import gim.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationUseCase$invoke$2$documentDeferred$1", f = "DocumentValidationUseCase.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlDocument;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentValidationUseCase$invoke$2$documentDeferred$1 extends i implements Function2<CoroutineScope, Continuation<? super List<? extends OnfidoMlDocument>>, Object> {
    final /* synthetic */ DocumentDetectionFrame $frame;
    int label;
    final /* synthetic */ DocumentValidationUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentValidationUseCase$invoke$2$documentDeferred$1(DocumentValidationUseCase documentValidationUseCase, DocumentDetectionFrame documentDetectionFrame, Continuation<? super DocumentValidationUseCase$invoke$2$documentDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = documentValidationUseCase;
        this.$frame = documentDetectionFrame;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentValidationUseCase$invoke$2$documentDeferred$1(this.this$0, this.$frame, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        OnfidoDocumentDetector onfidoDocumentDetector = this.this$0.onfidoDocumentDetector;
        if (onfidoDocumentDetector != null) {
            return onfidoDocumentDetector.detect(this.$frame.getBitmap());
        }
        Intrinsics.r("onfidoDocumentDetector");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super List<OnfidoMlDocument>> continuation) {
        return ((DocumentValidationUseCase$invoke$2$documentDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
