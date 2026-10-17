package com.fourthline.vision.internal;

import android.util.Size;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f36418a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final Size adjustSize(float f, float f4) {
        if (j8.class.isAnonymousClass()) {
            String name = j8.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        if (j8.class.isAnonymousClass()) {
            String name2 = j8.class.getName();
            if (name2.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        }
        float f5 = 16;
        float f6 = f - (f % f5);
        float f32 = f4 - (f4 % f5);
        if (j8.class.isAnonymousClass()) {
            String name3 = j8.class.getName();
            if (name3.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        }
        if (j8.class.isAnonymousClass()) {
            String name4 = j8.class.getName();
            if (name4.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        }
        return new Size((int) f6, (int) f32);
    }

    private final float calculateScaleRatio(Size size, Size size2) {
        float fMin = Math.min(size2.getWidth(), 1080.0f);
        float fMin2 = Math.min(size2.getHeight(), 1920.0f);
        if (j8.class.isAnonymousClass()) {
            String name = j8.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        if (j8.class.isAnonymousClass()) {
            String name2 = j8.class.getName();
            if (name2.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        }
        float width = ((float) size.getWidth()) > fMin ? fMin / size.getWidth() : ((float) size.getHeight()) > fMin2 ? fMin2 / size.getHeight() : 1.0f;
        if (j8.class.isAnonymousClass()) {
            String name3 = j8.class.getName();
            if (name3.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        }
        return width;
    }

    @NotNull
    public final Size calculateSize(@NotNull Size previewSize, @NotNull Size maxSupportedSize) {
        Intrinsics.checkNotNullParameter(previewSize, "previewSize");
        Intrinsics.checkNotNullParameter(maxSupportedSize, "maxSupportedSize");
        float fCalculateScaleRatio = calculateScaleRatio(previewSize, maxSupportedSize);
        Size sizeAdjustSize = adjustSize(previewSize.getWidth() * fCalculateScaleRatio, previewSize.getHeight() * fCalculateScaleRatio);
        if (j8.class.isAnonymousClass()) {
            String name = j8.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Objects.toString(sizeAdjustSize);
        return sizeAdjustSize;
    }
}
