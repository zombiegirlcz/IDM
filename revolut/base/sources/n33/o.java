package n33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n93.h f211771a;

    public o(n93.h result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f211771a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f211771a, ((o) obj2).f211771a);
    }

    public final int hashCode() {
        return this.f211771a.hashCode();
    }
}
