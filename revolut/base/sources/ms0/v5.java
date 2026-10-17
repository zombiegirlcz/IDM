package ms0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v5 implements w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f208470a;

    public v5(Color.Solid color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f208470a = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v5) && this.f208470a.equals(((v5) obj2).f208470a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f208470a.f51464b);
    }
}
