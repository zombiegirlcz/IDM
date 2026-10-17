package f2a;

import aw0.i3;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f131489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f131490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f131491c;

    public a(NavBarWithContainerBackground background, i3 i3Var, int i) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f131489a = background;
        this.f131490b = i3Var;
        this.f131491c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f131489a, aVar.f131489a) && Intrinsics.f(this.f131490b, aVar.f131490b) && this.f131491c == aVar.f131491c;
    }

    public final int hashCode() {
        int iHashCode = this.f131489a.hashCode() * 31;
        i3 i3Var = this.f131490b;
        return Integer.hashCode(this.f131491c) + ((iHashCode + (i3Var == null ? 0 : i3Var.f10352a.hashCode())) * 31);
    }
}
