package pz2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240879a;

    public l(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f240879a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f240879a, ((l) obj2).f240879a);
    }

    public final int hashCode() {
        return this.f240879a.hashCode();
    }
}
