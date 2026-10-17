package na8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f213837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f213838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f213839c;

    public o(List items, m navBar, g actionButton) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.f213837a = items;
        this.f213838b = navBar;
        this.f213839c = actionButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f213837a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f213837a, oVar.f213837a) && Intrinsics.f(this.f213838b, oVar.f213838b) && Intrinsics.f(this.f213839c, oVar.f213839c);
    }

    public final int hashCode() {
        return this.f213839c.hashCode() + ((this.f213838b.hashCode() + (this.f213837a.hashCode() * 31)) * 31);
    }
}
