package s01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258796a;

    public k(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f258796a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f258796a, ((k) obj2).f258796a);
    }

    public final int hashCode() {
        return this.f258796a.hashCode();
    }
}
