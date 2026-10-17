package c2k;

import d9.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20821b;

    public b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f20821b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f20821b, ((b) obj2).f20821b);
    }

    public final int hashCode() {
        return this.f20821b.hashCode();
    }
}
