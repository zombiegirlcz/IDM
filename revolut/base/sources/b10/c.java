package b10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11701a;

    public c(a rotation) {
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        this.f11701a = rotation;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f11701a, ((c) obj2).f11701a);
    }

    @Override // b10.d
    public final a f() {
        return this.f11701a;
    }

    public final int hashCode() {
        return this.f11701a.hashCode();
    }
}
