package hfa;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f151783a;

    public b(u navigationDestination) {
        Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
        this.f151783a = navigationDestination;
    }

    @Override // hfa.c
    public final u a() {
        return this.f151783a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f151783a, ((b) obj2).f151783a);
    }

    public final int hashCode() {
        return this.f151783a.hashCode();
    }
}
