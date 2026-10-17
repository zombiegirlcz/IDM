package kc0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static float a(Rect bitmapRect, Rect appWindowRect) {
        Intrinsics.checkNotNullParameter(bitmapRect, "bitmapRect");
        Intrinsics.checkNotNullParameter(appWindowRect, "appWindowRect");
        return Math.max(appWindowRect.width() / bitmapRect.width(), appWindowRect.height() / bitmapRect.height());
    }

    public static Rect b(Rect bitmapRect, Rect screenRect, Rect coverRectOnScreen, boolean z) {
        Intrinsics.checkNotNullParameter(bitmapRect, "bitmapRect");
        Intrinsics.checkNotNullParameter(screenRect, "screenRect");
        Intrinsics.checkNotNullParameter(coverRectOnScreen, "coverRectOnScreen");
        RectF rectF = new RectF(new Rect(coverRectOnScreen));
        Matrix matrix = new Matrix();
        matrix.preTranslate(bitmapRect.exactCenterX() - screenRect.exactCenterX(), bitmapRect.exactCenterY() - screenRect.exactCenterY());
        float fA = 1.0f / a(bitmapRect, screenRect);
        matrix.postScale(z ? -fA : fA, fA, bitmapRect.exactCenterX(), bitmapRect.exactCenterY());
        matrix.mapRect(rectF);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }
}
