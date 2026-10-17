package s01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258799a;

    public m(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f258799a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f258799a, ((m) obj2).f258799a);
    }

    public final int hashCode() {
        return this.f258799a.hashCode();
    }
}
