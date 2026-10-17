package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g50 implements i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c50 f164348a;

    public g50(c50 position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f164348a = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g50) && this.f164348a == ((g50) obj2).f164348a;
    }

    @Override // ip0.i50
    public final c50 getPosition() {
        return this.f164348a;
    }

    public final int hashCode() {
        return this.f164348a.hashCode();
    }
}
