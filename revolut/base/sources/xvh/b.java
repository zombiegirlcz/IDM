package xvh;

import kotlin.jvm.internal.Intrinsics;
import yvh.d;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f309274b;

    public b(String ownerId) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f309273a = ownerId;
        this.f309274b = d.YOUTH;
    }

    @Override // xvh.a
    public final d a() {
        return this.f309274b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f309273a, ((b) obj2).f309273a);
    }

    public final int hashCode() {
        return this.f309273a.hashCode();
    }
}
