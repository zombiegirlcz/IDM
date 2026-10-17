package jq0;

import android.view.animation.Interpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Interpolator f177392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Interpolator f177393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Interpolator f177394c;
    public static final Interpolator d;
    public static final Interpolator e;
    public static final Interpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Interpolator f177395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f177396h;

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        f177392a = interpolatorCreate;
        Interpolator interpolatorCreate2 = PathInterpolatorCompat.create(0.33f, 1.0f, 0.68f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate2, "create(...)");
        f177393b = interpolatorCreate2;
        Interpolator interpolatorCreate3 = PathInterpolatorCompat.create(0.65f, BitmapDescriptorFactory.HUE_RED, 0.35f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate3, "create(...)");
        f177394c = interpolatorCreate3;
        Interpolator interpolatorCreate4 = PathInterpolatorCompat.create(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate4, "create(...)");
        d = interpolatorCreate4;
        Interpolator interpolatorCreate5 = PathInterpolatorCompat.create(0.35f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate5, "create(...)");
        e = interpolatorCreate5;
        Interpolator interpolatorCreate6 = PathInterpolatorCompat.create(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.3f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate6, "create(...)");
        f = interpolatorCreate6;
        Interpolator interpolatorCreate7 = PathInterpolatorCompat.create(0.26f, 0.72f, 0.48f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate7, "create(...)");
        f177395g = interpolatorCreate7;
        Interpolator interpolatorCreate8 = PathInterpolatorCompat.create(0.6f, BitmapDescriptorFactory.HUE_RED, 0.4f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate8, "create(...)");
        f177396h = interpolatorCreate8;
    }

    private r() {
    }
}
