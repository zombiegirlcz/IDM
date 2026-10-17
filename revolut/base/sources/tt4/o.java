package tt4;

import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarLargeCentred.Model f274224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274225b;

    public o(NavBarLargeCentred.Model toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f274224a = toolbarModel;
        this.f274225b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f274225b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f274224a, oVar.f274224a) && Intrinsics.f(this.f274225b, oVar.f274225b);
    }

    public final int hashCode() {
        return this.f274225b.hashCode() + (this.f274224a.hashCode() * 31);
    }
}
