package ip0;

import android.graphics.drawable.GradientDrawable;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wm implements ym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitGradient f167050a;

    public wm(UiKitGradient gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f167050a = gradient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wm) && Intrinsics.f(this.f167050a, ((wm) obj2).f167050a);
    }

    public final int hashCode() {
        return this.f167050a.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wm(int i, int i2, GradientDrawable.Orientation orientation) {
        this(new UiKitGradient(new int[]{i, i2}, null, orientation, 2));
        Intrinsics.checkNotNullParameter(orientation, "orientation");
    }
}
