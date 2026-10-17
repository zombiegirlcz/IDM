package rr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f256714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f256715b;

    public j(k collected, q nextPayout) {
        Intrinsics.checkNotNullParameter(collected, "collected");
        Intrinsics.checkNotNullParameter(nextPayout, "nextPayout");
        this.f256714a = collected;
        this.f256715b = nextPayout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f256714a, jVar.f256714a) && Intrinsics.f(this.f256715b, jVar.f256715b);
    }

    public final int hashCode() {
        return this.f256715b.hashCode() + (this.f256714a.hashCode() * 31);
    }
}
