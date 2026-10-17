package ia7;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f159971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f159972b;

    public o(a geoJsonPathParser) {
        Intrinsics.checkNotNullParameter(geoJsonPathParser, "geoJsonPathParser");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f159971a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.f159972b = paint2;
    }
}
