package wz;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f301312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f301313b;

    public a(Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setStrokeWidth(4.0f);
        Unit unit = Unit.f186387a;
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f301312a = rect;
        this.f301313b = paint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f301312a, aVar.f301312a) && Intrinsics.f(this.f301313b, aVar.f301313b);
    }

    public final int hashCode() {
        return this.f301313b.hashCode() + (this.f301312a.hashCode() * 31);
    }
}
