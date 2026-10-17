package com.onfido.android.sdk.capture.utils;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"rotate", "Landroid/graphics/Rect;", "rotation", "", "frameWidth", "frameHeight", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GraphicsExtensionsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rotation.values().length];
            try {
                iArr[Rotation.ANGLE_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rotation.ANGLE_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rotation.ANGLE_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Rect rotate(@NotNull Rect rect, int i, int i2, int i3) {
        Rotation rotation;
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Rotation[] rotationArrValues = Rotation.values();
        int length = rotationArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                rotation = null;
                break;
            }
            rotation = rotationArrValues[i5];
            if (rotation.getIdentifier() == i) {
                break;
            }
            i5++;
        }
        int i6 = rotation == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rotation.ordinal()];
        if (i6 == 1) {
            int iHeight = (i2 - rect.top) - rect.height();
            int i21 = rect.left;
            rect.set(iHeight, i21, i2 - rect.top, rect.width() + i21);
            return rect;
        }
        if (i6 == 2) {
            rect.set(rect.left, (i3 - rect.top) - rect.height(), rect.right, i3 - rect.top);
            return rect;
        }
        if (i6 != 3) {
            return rect;
        }
        int i22 = rect.top;
        rect.set(i22, rect.left, rect.height() + i22, rect.width() + rect.left);
        return rect;
    }
}
