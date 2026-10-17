package yxl;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Interpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Interpolator f317728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f317729h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f317730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f317731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f317732c;
    public final float d;
    public final LinearInterpolator e = new LinearInterpolator();

    static {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.45f, BitmapDescriptorFactory.HUE_RED, 0.25f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(...)");
        f = interpolatorCreate;
        Interpolator interpolatorCreate2 = PathInterpolatorCompat.create(0.65f, BitmapDescriptorFactory.HUE_RED, 0.65f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate2, "create(...)");
        f317728g = interpolatorCreate2;
        Interpolator interpolatorCreate3 = PathInterpolatorCompat.create(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate3, "create(...)");
        f317729h = interpolatorCreate3;
    }

    public c(float f4, float f5, float f6, float f32) {
        this.f317730a = f4;
        this.f317731b = f5;
        this.f317732c = f6;
        this.d = f32;
    }

    public final float a(float f4) {
        if (f4 > 0.8f) {
            return 1.0f;
        }
        return f.getInterpolation(i1.a(BitmapDescriptorFactory.HUE_RED, 0.8f, f4));
    }
}
