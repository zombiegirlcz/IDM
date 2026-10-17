package pyb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.q f240746a;

    public o(k71.q extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f240746a = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f240746a, ((o) obj2).f240746a);
    }

    public final int hashCode() {
        return this.f240746a.hashCode();
    }
}
