package l10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n10.b f191392a;

    public q(n10.b newCardDesignType) {
        Intrinsics.checkNotNullParameter(newCardDesignType, "newCardDesignType");
        this.f191392a = newCardDesignType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f191392a == ((q) obj2).f191392a;
    }

    public final int hashCode() {
        return this.f191392a.hashCode();
    }
}
