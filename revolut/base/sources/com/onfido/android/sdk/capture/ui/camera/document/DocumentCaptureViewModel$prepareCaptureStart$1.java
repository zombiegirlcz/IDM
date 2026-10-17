package com.onfido.android.sdk.capture.ui.camera.document;

import akg.m;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import vkm.t;
import vkm.y;
import wkm.s;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$prepareCaptureStart$1", f = "DocumentCaptureViewModel.kt", l = {423}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureViewModel$prepareCaptureStart$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstStart;
    int label;
    final /* synthetic */ DocumentCaptureViewModel this$0;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$prepareCaptureStart$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        final /* synthetic */ DocumentCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DocumentCaptureViewModel documentCaptureViewModel) {
            super(0);
            this.this$0 = documentCaptureViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3725invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3725invoke() {
            this.this$0.startManualFallbackTimer();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$prepareCaptureStart$1$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$prepareCaptureStart$1$2", f = "DocumentCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function3 {
        int label;
        final /* synthetic */ DocumentCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DocumentCaptureViewModel documentCaptureViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.this$0 = documentCaptureViewModel;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            this.this$0.getImageProcessingFinished().k(Boolean.TRUE);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(@NotNull FlowCollector flowCollector, Throwable th10, Continuation<? super Unit> continuation) {
            return new AnonymousClass2(this.this$0, continuation).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$prepareCaptureStart$1$3, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$prepareCaptureStart$1$3", f = "DocumentCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer$DocumentCaptureResult;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            Timber.INSTANCE.e((Throwable) this.L$0, "Error on glare detector", new Object[0]);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull Throwable th10, Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = th10;
            return anonymousClass3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentCaptureViewModel$prepareCaptureStart$1(DocumentCaptureViewModel documentCaptureViewModel, boolean z, Continuation<? super DocumentCaptureViewModel$prepareCaptureStart$1> continuation) {
        super(2, continuation);
        this.this$0 = documentCaptureViewModel;
        this.$isFirstStart = z;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new DocumentCaptureViewModel$prepareCaptureStart$1(this.this$0, this.$isFirstStart, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            y yVar = new y(new t(this.this$0.documentDelayTransformer.getImageProcessingTransformedFlow$onfido_capture_sdk_core_release(this.$isFirstStart, this.this$0.edgeDetectionFallbackTimerReached != null, this.this$0.getDocumentType$onfido_capture_sdk_core_release(), this.this$0.getCountryCode(), this.this$0.getDocumentSide(), new AnonymousClass1(this.this$0), this.$isFirstStart, this.this$0.shouldEnableAccessibilityCapture$onfido_capture_sdk_core_release()), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(null));
            DocumentCaptureResultConsumer documentCaptureResultConsumer$onfido_capture_sdk_core_release = this.this$0.getDocumentCaptureResultConsumer$onfido_capture_sdk_core_release();
            this.label = 1;
            Object objCollect = yVar.collect(new m(s.f298328a, documentCaptureResultConsumer$onfido_capture_sdk_core_release, 5), this);
            if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                objCollect = Unit.f186387a;
            }
            if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                objCollect = Unit.f186387a;
            }
            if (objCollect == aVar) {
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
        return ((DocumentCaptureViewModel$prepareCaptureStart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
