package cab;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f22586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22587c;

    public h(List menuItems, aw0.g footerModel, List items) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f22585a = menuItems;
        this.f22586b = footerModel;
        this.f22587c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f22587c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f22585a, hVar.f22585a) && this.f22586b.equals(hVar.f22586b) && Intrinsics.f(this.f22587c, hVar.f22587c);
    }

    public final int hashCode() {
        return this.f22587c.hashCode() + ((this.f22586b.hashCode() + (this.f22585a.hashCode() * 31)) * 31);
    }
}
