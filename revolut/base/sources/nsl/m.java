package nsl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f218925a;

    public m(bfl.g tradeSide) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        this.f218925a = tradeSide;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f218925a == ((m) obj2).f218925a;
    }

    public final int hashCode() {
        return this.f218925a.hashCode();
    }
}
