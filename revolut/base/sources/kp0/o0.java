package kp0;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f188049a;

    public o0(NavBarWithContainerBackground background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f188049a = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f188049a, ((o0) obj2).f188049a);
    }

    public final int hashCode() {
        return this.f188049a.hashCode();
    }
}
