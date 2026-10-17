package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util;

import androidx.window.core.layout.WindowSizeClass;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.WindowHelperKt;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/util/OvalRect;", "", "()V", "NEAR_SQUARE_ASPECT_RATIO", "", "OVAL_CENTER_TO_SCREEN_CENTER_RATIO", "OVAL_HEIGHT_TO_WIDTH_ON_RECTANGULAR_SCREEN_RATIO", "OVAL_HEIGHT_TO_WIDTH_ON_SQUARE_SCREEN_RATIO", "OVAL_WIDTH_TO_RECTANGULAR_SCREEN_WIDTH_RATIO", "OVAL_WIDTH_TO_SQUARE_SCREEN_WIDTH_RATIO", "SQUARE_ASPECT_RATIO", "get", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "width", "height", "windowSizeClass", "Landroidx/window/core/layout/WindowSizeClass;", "", "isNearSquareAspectRatio", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OvalRect {

    @NotNull
    public static final OvalRect INSTANCE = new OvalRect();
    private static final float NEAR_SQUARE_ASPECT_RATIO = 1.3333334f;
    private static final float OVAL_CENTER_TO_SCREEN_CENTER_RATIO = 0.41666666f;
    private static final float OVAL_HEIGHT_TO_WIDTH_ON_RECTANGULAR_SCREEN_RATIO = 1.5f;
    private static final float OVAL_HEIGHT_TO_WIDTH_ON_SQUARE_SCREEN_RATIO = 1.35f;
    private static final float OVAL_WIDTH_TO_RECTANGULAR_SCREEN_WIDTH_RATIO = 0.6666667f;
    private static final float OVAL_WIDTH_TO_SQUARE_SCREEN_WIDTH_RATIO = 0.5f;
    private static final float SQUARE_ASPECT_RATIO = 1.0f;

    private OvalRect() {
    }

    private final boolean isNearSquareAspectRatio(float width, float height) {
        float f = height / width;
        return 1.0f <= f && f <= NEAR_SQUARE_ASPECT_RATIO;
    }

    @NotNull
    public final OnfidoRectF get(float width, float height, @NotNull WindowSizeClass windowSizeClass) {
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        float f = 2;
        float f4 = width / f;
        float f5 = OVAL_CENTER_TO_SCREEN_CENTER_RATIO * height;
        float f6 = ((isNearSquareAspectRatio(width, height) || WindowHelperKt.isTabletDisplay(windowSizeClass)) ? 0.5f : OVAL_WIDTH_TO_RECTANGULAR_SCREEN_WIDTH_RATIO) * width;
        float f32 = (isNearSquareAspectRatio(width, height) ? OVAL_HEIGHT_TO_WIDTH_ON_SQUARE_SCREEN_RATIO : 1.5f) * f6;
        float f35 = f6 / f;
        float f36 = f32 / f;
        return new OnfidoRectF(f4 - f35, f5 - f36, f4 + f35, f5 + f36);
    }

    @NotNull
    public final OnfidoRectF get(int width, int height, @NotNull WindowSizeClass windowSizeClass) {
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        return get(width, height, windowSizeClass);
    }
}
