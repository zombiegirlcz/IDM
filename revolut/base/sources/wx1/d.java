package wx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f300732a;

    public d(Boolean bool) {
        this.f300732a = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f300732a, ((d) obj2).f300732a);
    }

    public final int hashCode() {
        Boolean bool = this.f300732a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
