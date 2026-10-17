package vrb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.n f291550a;

    public e(kel.n holding) {
        Intrinsics.checkNotNullParameter(holding, "holding");
        this.f291550a = holding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f291550a, ((e) obj2).f291550a);
    }

    public final int hashCode() {
        return this.f291550a.hashCode();
    }
}
