package pf8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f235509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f235510b;

    public d(dj0.d used, dj0.d limit) {
        Intrinsics.checkNotNullParameter(used, "used");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f235509a = used;
        this.f235510b = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f235509a, dVar.f235509a) && Intrinsics.f(this.f235510b, dVar.f235510b);
    }

    public final int hashCode() {
        return this.f235510b.hashCode() + (this.f235509a.hashCode() * 31);
    }
}
