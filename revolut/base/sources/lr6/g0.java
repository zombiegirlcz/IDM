package lr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f199403a;

    public g0() {
        this(null, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f199403a, ((g0) obj2).f199403a);
    }

    public final int hashCode() {
        z zVar = this.f199403a;
        if (zVar == null) {
            return 0;
        }
        return zVar.hashCode();
    }

    public g0(z zVar, int i) {
        this.f199403a = (i & 16) != 0 ? null : zVar;
    }
}
