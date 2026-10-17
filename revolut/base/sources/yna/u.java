package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.j f315375a;

    public u(koi.j item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f315375a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f315375a, ((u) obj2).f315375a);
    }

    public final int hashCode() {
        return this.f315375a.hashCode();
    }
}
