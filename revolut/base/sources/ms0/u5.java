package ms0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u5 implements w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f208460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f208461b;

    public /* synthetic */ u5() {
        this(1.0f, ProgressStepVerticalV2Delegate.i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj2;
        return Intrinsics.f(this.f208460a, u5Var.f208460a) && Float.compare(this.f208461b, u5Var.f208461b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f208461b) + (Integer.hashCode(this.f208460a.f51464b) * 31);
    }

    public u5(float f, Color.Solid defaultStyleColor) {
        Intrinsics.checkNotNullParameter(defaultStyleColor, "defaultStyleColor");
        this.f208460a = defaultStyleColor;
        this.f208461b = f;
    }
}
