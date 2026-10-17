package com.fourthline.vision.internal;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fa f36248a = new fa(0, 0, 0, 0);

    public static final boolean isValid(@NotNull fa faVar) {
        Intrinsics.checkNotNullParameter(faVar, "<this>");
        return faVar.width() > 0 && faVar.height() > 0;
    }

    @NotNull
    public static final fa nullableToRectangle(Rect rect) {
        fa rectangle;
        return (rect == null || (rectangle = toRectangle(rect)) == null) ? f36248a : rectangle;
    }

    @NotNull
    public static final fa toBox(@NotNull List<fa> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return f36248a;
        }
        Iterator<T> it8 = list.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        int left = ((fa) it8.next()).getLeft();
        while (it8.hasNext()) {
            int left2 = ((fa) it8.next()).getLeft();
            if (left > left2) {
                left = left2;
            }
        }
        Iterator<T> it9 = list.iterator();
        if (!it9.hasNext()) {
            throw new NoSuchElementException();
        }
        int top = ((fa) it9.next()).getTop();
        while (it9.hasNext()) {
            int top2 = ((fa) it9.next()).getTop();
            if (top > top2) {
                top = top2;
            }
        }
        Iterator<T> it10 = list.iterator();
        if (!it10.hasNext()) {
            throw new NoSuchElementException();
        }
        int right = ((fa) it10.next()).getRight();
        while (it10.hasNext()) {
            int right2 = ((fa) it10.next()).getRight();
            if (right < right2) {
                right = right2;
            }
        }
        Iterator<T> it11 = list.iterator();
        if (!it11.hasNext()) {
            throw new NoSuchElementException();
        }
        int bottom = ((fa) it11.next()).getBottom();
        while (it11.hasNext()) {
            int bottom2 = ((fa) it11.next()).getBottom();
            if (bottom < bottom2) {
                bottom = bottom2;
            }
        }
        return new fa(left, top, right, bottom);
    }

    @NotNull
    public static final androidx.compose.ui.geometry.Rect toComposeRect(@NotNull fa faVar) {
        Intrinsics.checkNotNullParameter(faVar, "<this>");
        float left = faVar.getLeft();
        return RectKt.m1854Recttz77jQw(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(faVar.getTop())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(left) << 32)), Size.m1862constructorimpl((((long) Float.floatToRawIntBits(faVar.width())) << 32) | (((long) Float.floatToRawIntBits(faVar.height())) & BodyPartID.bodyIdMax)));
    }

    @NotNull
    public static final Rect toIntRect(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @NotNull
    public static final Rect toRect(@NotNull fa faVar) {
        Intrinsics.checkNotNullParameter(faVar, "<this>");
        return new Rect(faVar.getLeft(), faVar.getTop(), faVar.getRight(), faVar.getBottom());
    }

    @NotNull
    public static final RectF toRectF(@NotNull fa faVar) {
        Intrinsics.checkNotNullParameter(faVar, "<this>");
        return toRectF(toRect(faVar));
    }

    @NotNull
    public static final fa toRectangle(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new fa(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final RectF toRectF(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new RectF(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final fa toRectangle(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        return toRectangle(toIntRect(rectF));
    }
}
