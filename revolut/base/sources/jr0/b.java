package jr0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f177886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177888c;
    public ValueAnimator d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f177889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f177890h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Interpolator f177891j;
    public final Interpolator k;

    public b(Context context, int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f177886a = context;
        this.f177887b = i;
        this.f177888c = z;
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.45f, BitmapDescriptorFactory.HUE_RED, 0.25f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        this.f177891j = interpolatorCreate;
        Interpolator interpolatorCreate2 = PathInterpolatorCompat.create(0.65f, BitmapDescriptorFactory.HUE_RED, 0.65f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate2, "create(...)");
        this.k = interpolatorCreate2;
    }

    public abstract void a(Canvas canvas);

    public abstract void b(PathMeasure pathMeasure, float f, Rect rect, float f4);
}
