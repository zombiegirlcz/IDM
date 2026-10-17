package com.fourthline.vision.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final df f37098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f37099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f37100c;

    public x9(@NotNull df visionInfoProvider) {
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        this.f37098a = visionInfoProvider;
        this.f37099b = Rect.INSTANCE.getZero();
        this.f37100c = Matrix.m2050constructorimpl$default(null, 1, null);
    }

    private final void calculatePreviewHolderRect(Rect rect) {
        long jM1845getZeroF1C5BW0 = Offset.INSTANCE.m1845getZeroF1C5BW0();
        float height = this.f37098a.getPreviewSize().getHeight();
        Rect rectM1854Recttz77jQw = RectKt.m1854Recttz77jQw(jM1845getZeroF1C5BW0, Size.m1862constructorimpl((((long) Float.floatToRawIntBits(this.f37098a.getPreviewSize().getWidth())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(height) << 32)));
        float fMax = Math.max(1.0f / ((rectM1854Recttz77jQw.getRight() - rectM1854Recttz77jQw.getLeft()) / (rect.getRight() - rect.getLeft())), 1.0f / ((rectM1854Recttz77jQw.getBottom() - rectM1854Recttz77jQw.getTop()) / (rect.getBottom() - rect.getTop())));
        float[] fArrM2050constructorimpl$default = Matrix.m2050constructorimpl$default(null, 1, null);
        Matrix.m2063scaleimpl$default(fArrM2050constructorimpl$default, fMax, fMax, BitmapDescriptorFactory.HUE_RED, 4, null);
        this.f37099b = Matrix.m2056mapimpl(fArrM2050constructorimpl$default, rectM1854Recttz77jQw);
        if (x9.class.isAnonymousClass()) {
            String name = x9.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        rect.toString();
        if (x9.class.isAnonymousClass()) {
            String name2 = x9.class.getName();
            if (name2.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        }
        rectM1854Recttz77jQw.toString();
        if (x9.class.isAnonymousClass()) {
            String name3 = x9.class.getName();
            if (name3.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        }
        Objects.toString(this.f37099b);
        if (x9.class.isAnonymousClass()) {
            String name4 = x9.class.getName();
            if (name4.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        }
        if (x9.class.isAnonymousClass()) {
            String name5 = x9.class.getName();
            if (name5.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name5.substring(name5.length() - 23, name5.length()), "substring(...)");
            }
        }
        if (x9.class.isAnonymousClass()) {
            String name6 = x9.class.getName();
            if (name6.length() <= 23) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(name6.substring(name6.length() - 23, name6.length()), "substring(...)");
        }
    }

    private final void calculateRecognitionToScreenCoordsMatrix(Rect rect) {
        Rect rectM1854Recttz77jQw = RectKt.m1854Recttz77jQw(Offset.INSTANCE.m1845getZeroF1C5BW0(), Size.m1862constructorimpl((((long) Float.floatToRawIntBits(this.f37098a.getImageReaderSize().getWidth())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(this.f37098a.getImageReaderSize().getHeight())) << 32)));
        float bottom = (rect.getRight() - rect.getLeft()) / (rect.getBottom() - rect.getTop()) < (rectM1854Recttz77jQw.getRight() - rectM1854Recttz77jQw.getLeft()) / (rectM1854Recttz77jQw.getBottom() - rectM1854Recttz77jQw.getTop()) ? (rect.getBottom() - rect.getTop()) / (rectM1854Recttz77jQw.getBottom() - rectM1854Recttz77jQw.getTop()) : (rect.getRight() - rect.getLeft()) / (rectM1854Recttz77jQw.getRight() - rectM1854Recttz77jQw.getLeft());
        float right = ((rect.getRight() - rect.getLeft()) - ((rectM1854Recttz77jQw.getRight() - rectM1854Recttz77jQw.getLeft()) * bottom)) * 0.5f;
        float bottom2 = ((rect.getBottom() - rect.getTop()) - ((rectM1854Recttz77jQw.getBottom() - rectM1854Recttz77jQw.getTop()) * bottom)) * 0.5f;
        float[] fArr = this.f37100c;
        Matrix.m2067translateimpl$default(fArr, right, bottom2, BitmapDescriptorFactory.HUE_RED, 4, null);
        Matrix.m2063scaleimpl$default(fArr, bottom, bottom, BitmapDescriptorFactory.HUE_RED, 4, null);
        if (x9.class.isAnonymousClass()) {
            String name = x9.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        if (x9.class.isAnonymousClass()) {
            String name2 = x9.class.getName();
            if (name2.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        }
        if (x9.class.isAnonymousClass()) {
            String name3 = x9.class.getName();
            if (name3.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        }
        Matrix.m2065toStringimpl(this.f37100c);
        if (x9.class.isAnonymousClass()) {
            String name4 = x9.class.getName();
            if (name4.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        }
        if (x9.class.isAnonymousClass()) {
            String name5 = x9.class.getName();
            if (name5.length() <= 23) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(name5.substring(name5.length() - 23, name5.length()), "substring(...)");
        }
    }

    @NotNull
    public final Rect getPreviewHolderRect() {
        return this.f37099b;
    }

    @NotNull
    /* JADX INFO: renamed from: getRecognitionToScreenCoordsMatrix-sQKQjiQ, reason: not valid java name */
    public final float[] m3661getRecognitionToScreenCoordsMatrixsQKQjiQ() {
        return this.f37100c;
    }

    public final void setPreviewHolderRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.f37099b = rect;
    }

    public final void setupTransformations(@NotNull Rect screenRect) {
        Intrinsics.checkNotNullParameter(screenRect, "screenRect");
        calculatePreviewHolderRect(screenRect);
        calculateRecognitionToScreenCoordsMatrix(screenRect);
    }
}
