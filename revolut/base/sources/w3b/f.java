package w3b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f294261a;

    public f(bfl.g tradeSide) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        this.f294261a = tradeSide;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f294261a == ((f) obj2).f294261a;
    }

    public final int hashCode() {
        return this.f294261a.hashCode();
    }
}
