package g7b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f141155a;

    public p(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f141155a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f141155a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f141155a, ((p) obj2).f141155a);
    }

    public final int hashCode() {
        return this.f141155a.hashCode();
    }
}
