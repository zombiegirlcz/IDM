package sz9;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f266781a;

    public a(NavBarWithContainerBackground newBackground) {
        Intrinsics.checkNotNullParameter(newBackground, "newBackground");
        this.f266781a = newBackground;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f266781a, ((a) obj2).f266781a);
    }

    public final int hashCode() {
        return this.f266781a.hashCode();
    }
}
