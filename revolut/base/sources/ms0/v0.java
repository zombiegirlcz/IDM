package ms0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f208462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f208463b;

    public v0(Color.Solid color, u0 style) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f208462a = color;
        this.f208463b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return this.f208462a.equals(v0Var.f208462a) && this.f208463b == v0Var.f208463b;
    }

    public final int hashCode() {
        return this.f208463b.hashCode() + (Integer.hashCode(this.f208462a.f51464b) * 31);
    }
}
