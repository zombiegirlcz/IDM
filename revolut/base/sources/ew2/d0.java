package ew2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f130013a;

    public d0(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130013a = items;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f130013a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f130013a, ((d0) obj2).f130013a);
    }

    public final int hashCode() {
        return this.f130013a.hashCode();
    }
}
