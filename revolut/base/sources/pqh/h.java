package pqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.g f238783a;

    public h(zel.g metric) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        this.f238783a = metric;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f238783a == ((h) obj2).f238783a;
    }

    public final int hashCode() {
        return this.f238783a.hashCode();
    }
}
