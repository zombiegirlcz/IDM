package com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase;

import a31.o;
import cmc.d;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.mlkit.vision.face.FaceDetector;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase;", "", "moduleInstallClient", "Lcom/google/android/gms/common/moduleinstall/ModuleInstallClient;", "mlKitFaceDetector", "Lcom/google/mlkit/vision/face/FaceDetector;", "(Lcom/google/android/gms/common/moduleinstall/ModuleInstallClient;Lcom/google/mlkit/vision/face/FaceDetector;)V", "invoke", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result;", "Companion", "Result", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class GetFaceDetectionModuleAvailabilityUseCase {

    @NotNull
    private final FaceDetector mlKitFaceDetector;

    @NotNull
    private final ModuleInstallClient moduleInstallClient;

    @NotNull
    public static final String ERROR_MESSAGE_ML_KIT = "Face Detection module is not available on the device";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result;", "", "()V", "Available", "Missing", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result$Available;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result$Missing;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Result {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result$Available;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Available extends Result {

            @NotNull
            public static final Available INSTANCE = new Available();

            private Available() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result$Missing;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase$Result;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Missing extends Result {

            @NotNull
            public static final Missing INSTANCE = new Missing();

            private Missing() {
                super(null);
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GetFaceDetectionModuleAvailabilityUseCase(@NotNull ModuleInstallClient moduleInstallClient, @NotNull FaceDetector mlKitFaceDetector) {
        Intrinsics.checkNotNullParameter(moduleInstallClient, "moduleInstallClient");
        Intrinsics.checkNotNullParameter(mlKitFaceDetector, "mlKitFaceDetector");
        this.moduleInstallClient = moduleInstallClient;
        this.mlKitFaceDetector = mlKitFaceDetector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(GetFaceDetectionModuleAvailabilityUseCase this$0, SingleEmitter emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.moduleInstallClient.areModulesAvailable(this$0.mlKitFaceDetector).addOnSuccessListener(new o(4, new GetFaceDetectionModuleAvailabilityUseCase$invoke$1$1(emitter))).addOnFailureListener(new a(emitter, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$0(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(SingleEmitter emitter, Exception it8) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(it8, "it");
        Timber.INSTANCE.tag("MLKitFaceDetection").e(com.google.android.gms.internal.mlkit_vision_face.a.n("Face Detection Module is not available on the device. ", it8), new Object[0]);
        if (emitter.isDisposed()) {
            return;
        }
        emitter.onSuccess(Result.Missing.INSTANCE);
    }

    @NotNull
    public Single<Result> invoke() {
        b bVar = new b(new d(this, 14), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }
}
