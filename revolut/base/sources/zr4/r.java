package zr4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr4.c f324576a;

    public r(yr4.c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f324576a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f324576a, ((r) obj2).f324576a);
    }

    public final int hashCode() {
        return this.f324576a.hashCode();
    }
}
