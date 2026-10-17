package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes15.dex */
public abstract class EdgeEffectCompat {

    public static class Api21Impl {
        public static void onPull(EdgeEffect edgeEffect, float f, float f4) {
            edgeEffect.onPull(f, f4);
        }
    }

    public static class Api31Impl {
        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float getDistance(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }

        public static float onPullDistance(EdgeEffect edgeEffect, float f, float f4) {
            try {
                return edgeEffect.onPullDistance(f, f4);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f4);
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    public static EdgeEffect create(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.create(context, attributeSet) : new EdgeEffect(context);
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.getDistance(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public static void onPull(EdgeEffect edgeEffect, float f, float f4) {
        Api21Impl.onPull(edgeEffect, f, f4);
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.onPullDistance(edgeEffect, f, f4);
        }
        onPull(edgeEffect, f, f4);
        return f;
    }
}
