package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
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
@d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$onNextFrame$2", f = "DocumentCaptureViewModel.kt", l = {1065}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureViewModel$onNextFrame$2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DocumentDetectionFrame $newFrameData;
    int label;
    final /* synthetic */ DocumentCaptureViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCaptureViewModel$onNextFrame$2(DocumentCaptureViewModel documentCaptureViewModel, DocumentDetectionFrame documentDetectionFrame, Continuation<? super DocumentCaptureViewModel$onNextFrame$2> continuation) {
        super(2, continuation);
        this.this$0 = documentCaptureViewModel;
        this.$newFrameData = documentDetectionFrame;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentCaptureViewModel$onNextFrame$2(this.this$0, this.$newFrameData, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            DocumentCaptureViewModel documentCaptureViewModel = this.this$0;
            DocumentDetectionFrame documentDetectionFrame = this.$newFrameData;
            this.label = 1;
            if (documentCaptureViewModel.processFrameForMRZ(documentDetectionFrame, this) == aVar) {
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
        return ((DocumentCaptureViewModel$onNextFrame$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
