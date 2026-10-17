package gsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3h.a f146361a;

    public k(g3h.a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f146361a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f146361a == ((k) obj2).f146361a;
    }

    public final int hashCode() {
        return this.f146361a.hashCode();
    }
}
