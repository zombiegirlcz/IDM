package w00;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f293600a;

    public c(g position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f293600a = position;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f293600a, ((c) obj2).f293600a);
    }

    @Override // w00.d
    public final g getPosition() {
        return this.f293600a;
    }

    public final int hashCode() {
        return this.f293600a.hashCode();
    }
}
