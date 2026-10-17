package cg1;

import kotlin.jvm.internal.Intrinsics;
import qf1.f;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf1.d f23862b;

    public d(f id10, qf1.d item) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f23861a = id10;
        this.f23862b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f23861a == dVar.f23861a && Intrinsics.f(this.f23862b, dVar.f23862b);
    }

    public final int hashCode() {
        return this.f23862b.hashCode() + (this.f23861a.hashCode() * 31);
    }
}
