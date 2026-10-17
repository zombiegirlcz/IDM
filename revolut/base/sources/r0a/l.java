package r0a;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f250740a;

    public l(NavBarWithContainerBackground background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f250740a = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f250740a, ((l) obj2).f250740a);
    }

    public final int hashCode() {
        return this.f250740a.hashCode();
    }
}
