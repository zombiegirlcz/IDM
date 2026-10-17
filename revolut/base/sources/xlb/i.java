package xlb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306985a;

    public i(boolean z) {
        this.f306985a = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof i) {
            return new h(((i) oldState).f306985a != this.f306985a);
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f306985a == ((i) obj2).f306985a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f306985a);
    }
}
