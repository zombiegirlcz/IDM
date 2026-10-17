package hp0;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f154366a;

    public b(Drawable drawable, boolean z) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f154366a = drawable;
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.e() || z || a(drawable)) {
            return;
        }
        throw new IllegalArgumentException(a0.d.r(o0.f186429a.b(drawable.getClass()).m(), " does not support ripple. Wrap a UIKitRippleDrawable or a drawable that contains one.").toString());
    }

    public static boolean a(Drawable drawable) {
        if (!(drawable instanceof RippleDrawable) && !(drawable instanceof a)) {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    Drawable drawable2 = layerDrawable.getDrawable(i);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                    if (!a(drawable2)) {
                    }
                }
                return false;
            }
            if ((drawable instanceof StateListDrawable) && Build.VERSION.SDK_INT >= 29) {
                StateListDrawable stateListDrawable = (StateListDrawable) drawable;
                int stateCount = stateListDrawable.getStateCount();
                for (int i2 = 0; i2 < stateCount; i2++) {
                    Drawable stateDrawable = stateListDrawable.getStateDrawable(i2);
                    if (stateDrawable == null || !a(stateDrawable)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // hp0.a
    public final Drawable b() {
        return this.f154366a;
    }
}
