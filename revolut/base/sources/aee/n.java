package aee;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3567b;

    public n(aim.e items, j navbarContent) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navbarContent, "navbarContent");
        this.f3566a = items;
        this.f3567b = navbarContent;
    }

    @Override // cli.p
    public final List c() {
        return this.f3566a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f3566a, nVar.f3566a) && Intrinsics.f(this.f3567b, nVar.f3567b);
    }

    public final int hashCode() {
        return this.f3567b.hashCode() + (this.f3566a.hashCode() * 31);
    }
}
