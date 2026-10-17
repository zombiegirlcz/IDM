package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes16.dex */
abstract class ObjectAnimatorUtils {

    public static class Api21Impl {
        public static <T, V> ObjectAnimator ofObject(T t2, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
        }
    }

    public static <T> ObjectAnimator ofPointF(T t2, Property<T, PointF> property, Path path) {
        return Api21Impl.ofObject(t2, property, path);
    }
}
