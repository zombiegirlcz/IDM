package avc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10001a;

    public n(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10001a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f10001a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f10001a, ((n) obj2).f10001a);
    }

    public final int hashCode() {
        return this.f10001a.hashCode();
    }

    public n() {
        this(f0.f322471a);
    }
}
