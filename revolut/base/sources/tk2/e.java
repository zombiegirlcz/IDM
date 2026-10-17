package tk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv0.b f271838a;

    public e(zv0.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f271838a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f271838a == ((e) obj2).f271838a;
    }

    public final int hashCode() {
        return this.f271838a.hashCode();
    }
}
