package cvc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109328a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109328a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f109328a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f109328a, ((d) obj2).f109328a);
    }

    public final int hashCode() {
        return this.f109328a.hashCode();
    }

    public d() {
        this(f0.f322471a);
    }
}
