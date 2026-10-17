package h0b;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1b.h f148345a;

    public g(c1b.h interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f148345a = interval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f148345a == ((g) obj2).f148345a;
    }

    public final int hashCode() {
        return this.f148345a.hashCode();
    }
}
