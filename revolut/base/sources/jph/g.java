package jph;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f177282a;

    public g(zel.f instrumentGroup) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        this.f177282a = instrumentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f177282a == ((g) obj2).f177282a;
    }

    public final int hashCode() {
        return this.f177282a.hashCode();
    }
}
