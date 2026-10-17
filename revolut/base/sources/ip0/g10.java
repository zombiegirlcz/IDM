package ip0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f164325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color.Solid f164326b;

    public g10(float f, Color.Solid color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f164325a = f;
        this.f164326b = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g10)) {
            return false;
        }
        g10 g10Var = (g10) obj2;
        return Float.compare(this.f164325a, g10Var.f164325a) == 0 && this.f164326b.equals(g10Var.f164326b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f164326b.f51464b) + (Float.hashCode(this.f164325a) * 31);
    }
}
