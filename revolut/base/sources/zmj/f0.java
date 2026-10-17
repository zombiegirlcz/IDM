package zmj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cam.f f323552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f323553c;
    public final List d;

    public f0(List items, cam.f actionButton, s sVar, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f323551a = items;
        this.f323552b = actionButton;
        this.f323553c = sVar;
        this.d = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f323551a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f323551a, f0Var.f323551a) && Intrinsics.f(this.f323552b, f0Var.f323552b) && Intrinsics.f(this.f323553c, f0Var.f323553c) && Intrinsics.f(this.d, f0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f323552b.hashCode() + (this.f323551a.hashCode() * 31)) * 31;
        s sVar = this.f323553c;
        return this.d.hashCode() + ((iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31);
    }
}
