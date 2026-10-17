package com.onfido.android.sdk.capture.internal.camera.usecase;

import com.onfido.android.sdk.capture.internal.camera.usecase.GetOptimalFourByThreePictureResolutionUseCase;
import com.onfido.android.sdk.capture.internal.util.Dimension;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/internal/util/Dimension;", "invoke", "(Lcom/onfido/android/sdk/capture/internal/util/Dimension;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$4 extends u implements Function1<Dimension, Boolean> {
    public static final GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$4 INSTANCE = new GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$4();

    public GetOptimalFourByThreePictureResolutionUseCase$Companion$TARGET_RESOLUTION_CONSTRAINT_LIST$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Dimension it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        GetOptimalFourByThreePictureResolutionUseCase.Companion companion = GetOptimalFourByThreePictureResolutionUseCase.INSTANCE;
        return Boolean.valueOf(companion.isFourByThree(it8) && companion.getMegapixel(it8) < 13.1d && it8.getWidth() >= 960);
    }
}
