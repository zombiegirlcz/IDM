package a3e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1108a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f1108a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f1108a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f1108a, ((g) obj2).f1108a);
    }

    public final int hashCode() {
        return this.f1108a.hashCode();
    }

    public g() {
        this(f0.f322471a);
    }
}
