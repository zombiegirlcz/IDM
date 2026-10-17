package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class PathInterpolatorCompat {

    public static class Api21Impl {
        public static Interpolator createPathInterpolator(Path path) {
            return new PathInterpolator(path);
        }

        public static Interpolator createPathInterpolator(float f, float f4, float f5, float f6) {
            return new PathInterpolator(f, f4, f5, f6);
        }
    }

    public static Interpolator create(Path path) {
        return Api21Impl.createPathInterpolator(path);
    }

    public static Interpolator create(float f, float f4, float f5, float f6) {
        return Api21Impl.createPathInterpolator(f, f4, f5, f6);
    }
}
