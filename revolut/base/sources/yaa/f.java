package yaa;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312000a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f312000a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f312000a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f312000a, ((f) obj2).f312000a);
    }

    public final int hashCode() {
        return this.f312000a.hashCode();
    }

    public f() {
        this(f0.f322471a);
    }
}
