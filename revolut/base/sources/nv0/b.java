package nv0;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.drawables.StaticBorderGradientDrawable;
import dr0.r;

/* JADX INFO: loaded from: classes19.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f219343a = {BitmapDescriptorFactory.HUE_RED, 0.3f, 0.5f, 0.7f, 1.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f219344b = {b(0.16f), b(0.08f), b(0.04f), b(0.08f), b(0.16f)};

    public static final StaticBorderGradientDrawable a(float f, float f4) {
        return new StaticBorderGradientDrawable(new r(f, f4), f219344b, f219343a, GradientDrawable.Orientation.TL_BR);
    }

    public static final int b(float f) {
        return Color.argb(kotlin.ranges.f.g((int) ((f * 255) + 0.5f), 0, 255), 255, 255, 255);
    }
}
