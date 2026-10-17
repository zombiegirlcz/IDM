package ct0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f108596c;

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f108594a = kli.a.s(R$attr.uikit_colorStatusSuccess, context);
        this.f108595b = kli.a.s(R$attr.uikit_colorStatusWarning, context);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(kli.a.l(context, 1.0f));
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setPathEffect(new DashPathEffect(new float[]{kli.a.l(context, 2.0f), kli.a.l(context, 2.0f)}, BitmapDescriptorFactory.HUE_RED));
        this.f108596c = paint;
    }

    public final void a(Canvas canvas, Path path, g style, float f) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(style, "style");
        int i2 = i.f108593a[style.ordinal()];
        if (i2 == 1) {
            i = this.f108594a;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = this.f108595b;
        }
        Paint paint = this.f108596c;
        paint.setColor(i);
        paint.setAlpha((int) (255 * f));
        canvas.drawPath(path, paint);
    }
}
