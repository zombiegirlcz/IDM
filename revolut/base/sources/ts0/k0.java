package ts0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f273880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color.Solid f273881b;

    public k0(float f, Color.Solid color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f273880a = f;
        this.f273881b = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Float.compare(this.f273880a, k0Var.f273880a) == 0 && this.f273881b.equals(k0Var.f273881b);
    }

    public final int hashCode() {
        return j6.a.b(this.f273881b.f51464b, Float.hashCode(this.f273880a) * 31, 961);
    }
}
