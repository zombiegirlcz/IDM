package bs9;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f18127a;

    public r(NavBarWithContainerBackground background) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f18127a = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f18127a, ((r) obj2).f18127a);
    }

    public final int hashCode() {
        return this.f18127a.hashCode();
    }
}
