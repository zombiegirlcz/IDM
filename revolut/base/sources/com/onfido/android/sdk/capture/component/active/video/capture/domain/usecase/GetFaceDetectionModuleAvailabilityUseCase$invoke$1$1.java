package com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase;

import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.GetFaceDetectionModuleAvailabilityUseCase;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import io.reactivex.rxjava3.core.SingleEmitter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/common/moduleinstall/ModuleAvailabilityResponse;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class GetFaceDetectionModuleAvailabilityUseCase$invoke$1$1 extends u implements Function1<ModuleAvailabilityResponse, Unit> {
    final /* synthetic */ SingleEmitter $emitter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFaceDetectionModuleAvailabilityUseCase$invoke$1$1(SingleEmitter singleEmitter) {
        super(1);
        this.$emitter = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((ModuleAvailabilityResponse) obj2);
        return Unit.f186387a;
    }

    public final void invoke(ModuleAvailabilityResponse moduleAvailabilityResponse) {
        boolean zAreModulesAvailable = moduleAvailabilityResponse.areModulesAvailable();
        Timber.INSTANCE.tag("MLKitFaceDetection").d(com.google.android.gms.internal.mlkit_vision_face.a.r("Face Detection Module is available on the device: ", zAreModulesAvailable), new Object[0]);
        Object obj2 = zAreModulesAvailable ? GetFaceDetectionModuleAvailabilityUseCase.Result.Available.INSTANCE : GetFaceDetectionModuleAvailabilityUseCase.Result.Missing.INSTANCE;
        if (this.$emitter.isDisposed()) {
            return;
        }
        this.$emitter.onSuccess(obj2);
    }
}
