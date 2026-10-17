package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzg.a f318515a;

    public i1(mzg.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f318515a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i1) && this.f318515a == ((i1) obj2).f318515a;
    }

    public final int hashCode() {
        return this.f318515a.hashCode();
    }
}
