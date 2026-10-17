package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.validation.PostCaptureDocumentValidationsManager;
import com.onfido.api.client.data.DocSide;
import gim.d;
import gim.i;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$applyPostCaptureValidations$1", f = "DocumentCaptureViewModel.kt", l = {752}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureViewModel$applyPostCaptureValidations$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DocumentDetectionFrame $frame;
    int label;
    final /* synthetic */ DocumentCaptureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCaptureViewModel$applyPostCaptureValidations$1(DocumentCaptureViewModel documentCaptureViewModel, DocumentDetectionFrame documentDetectionFrame, Continuation<? super DocumentCaptureViewModel$applyPostCaptureValidations$1> continuation) {
        super(2, continuation);
        this.this$0 = documentCaptureViewModel;
        this.$frame = documentDetectionFrame;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentCaptureViewModel$applyPostCaptureValidations$1(this.this$0, this.$frame, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            PostCaptureDocumentValidationsManager postCaptureDocumentValidationsManager = this.this$0.postCaptureDocumentValidationsManager;
            DocumentDetectionFrame documentDetectionFrame = this.$frame;
            DocumentType documentType$onfido_capture_sdk_core_release = this.this$0.getDocumentType$onfido_capture_sdk_core_release();
            CountryCode countryCode = this.this$0.getCountryCode();
            DocSide documentSide = this.this$0.getDocumentSide();
            if (documentSide == null) {
                documentSide = DocSide.FRONT;
            }
            Single<DocumentProcessingResults> singleValidate$onfido_capture_sdk_core_release = postCaptureDocumentValidationsManager.validate$onfido_capture_sdk_core_release(documentDetectionFrame, documentType$onfido_capture_sdk_core_release, countryCode, documentSide);
            this.label = 1;
            obj2 = tz4.d.g(singleValidate$onfido_capture_sdk_core_release, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        DocumentProcessingResults documentProcessingResults = (DocumentProcessingResults) obj2;
        this.this$0.onPostCaptureValidationsFinished(documentProcessingResults, this.$frame);
        this.this$0.documentProcessingFailureAnalyzer.analyzeDocumentProcessingResults(documentProcessingResults);
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DocumentCaptureViewModel$applyPostCaptureValidations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
