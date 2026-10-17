package dr0;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import aw0.t1;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f117063h = {BitmapDescriptorFactory.HUE_RED, 0.25f, 0.5f, 0.75f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f117064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1 f117065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f117066c;
    public final RectF d;
    public boolean e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f117067g;

    public u(Context context, w drawShape) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawShape, "drawShape");
        this.f117064a = drawShape;
        v1.Companion.getClass();
        this.f117065b = t1.a(context);
        float fL = kli.a.l(context, 1.0f);
        this.f117066c = fL;
        this.d = new RectF();
        this.e = true;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Paint.Style style = Paint.Style.STROKE;
        paintC.setStyle(style);
        paintC.setStrokeWidth(fL);
        this.f = paintC;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setStrokeWidth(fL);
        paint.setColor(io0.a.d(0.04f, -16777216));
        this.f117067g = paint;
    }
}
