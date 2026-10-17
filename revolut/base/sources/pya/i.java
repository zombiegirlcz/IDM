package pya;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f240721a;

    public i() {
        this(0);
    }

    @Override // cli.p
    public final List c() {
        return this.f240721a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f240721a, ((i) obj2).f240721a);
    }

    public final int hashCode() {
        return this.f240721a.hashCode();
    }

    public i(int i) {
        f0 items = f0.f322471a;
        Intrinsics.checkNotNullParameter(items, "items");
        this.f240721a = items;
    }
}
