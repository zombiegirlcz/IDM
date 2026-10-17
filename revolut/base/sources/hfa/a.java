package hfa;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f151782a;

    public a(u navigationDestination) {
        Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
        this.f151782a = navigationDestination;
    }

    @Override // hfa.c
    public final u a() {
        return this.f151782a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f151782a, ((a) obj2).f151782a);
    }

    public final int hashCode() {
        return this.f151782a.hashCode();
    }
}
