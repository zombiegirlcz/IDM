package eac;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f124175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f124176b;

    public q(p navBar, aim.e items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124175a = navBar;
        this.f124176b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f124176b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f124175a, qVar.f124175a) && Intrinsics.f(this.f124176b, qVar.f124176b);
    }

    public final int hashCode() {
        return this.f124176b.hashCode() + (this.f124175a.hashCode() * 31);
    }
}
