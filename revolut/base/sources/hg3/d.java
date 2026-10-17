package hg3;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152080a;

    public d() {
        this(0);
    }

    @Override // cli.p
    public final List c() {
        return this.f152080a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f152080a, ((d) obj2).f152080a);
    }

    public final int hashCode() {
        return this.f152080a.hashCode();
    }

    public d(int i) {
        f0 items = f0.f322471a;
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152080a = items;
    }
}
