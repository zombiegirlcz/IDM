package yv0;

import com.revolut.core.ui.models.Color;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color.Solid f317070a;

    public h(Color.Solid color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f317070a = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f317070a.equals(((h) obj2).f317070a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f317070a.f51464b);
    }
}
