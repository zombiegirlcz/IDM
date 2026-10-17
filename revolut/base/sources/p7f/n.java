package p7f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f233766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f233767b;

    public n(m navBar, List items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f233766a = navBar;
        this.f233767b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f233767b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f233766a, nVar.f233766a) && Intrinsics.f(this.f233767b, nVar.f233767b);
    }

    public final int hashCode() {
        return this.f233767b.hashCode() + (this.f233766a.hashCode() * 31);
    }
}
