package tk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv0.b f271835a;

    public b(zv0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f271835a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f271835a == ((b) obj2).f271835a;
    }

    public final int hashCode() {
        return this.f271835a.hashCode();
    }
}
