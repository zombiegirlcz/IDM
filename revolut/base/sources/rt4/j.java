package rt4;

import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarLargeCentred.Model f257176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257177b;

    public j(NavBarLargeCentred.Model toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f257176a = toolbarModel;
        this.f257177b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f257177b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f257176a, jVar.f257176a) && Intrinsics.f(this.f257177b, jVar.f257177b);
    }

    public final int hashCode() {
        return this.f257177b.hashCode() + (this.f257176a.hashCode() * 31);
    }
}
