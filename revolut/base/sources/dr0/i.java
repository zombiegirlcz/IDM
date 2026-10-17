package dr0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color f117052a;

    public i(Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f117052a = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f117052a, ((i) obj2).f117052a);
    }

    public final int hashCode() {
        return this.f117052a.hashCode();
    }
}
