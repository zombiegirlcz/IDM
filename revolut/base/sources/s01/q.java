package s01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258805a;

    public q(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f258805a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f258805a, ((q) obj2).f258805a);
    }

    public final int hashCode() {
        return this.f258805a.hashCode();
    }
}
