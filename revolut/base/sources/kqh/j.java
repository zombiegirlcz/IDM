package kqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f188414a;

    public j(zel.f instrumentGroup) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        this.f188414a = instrumentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f188414a == ((j) obj2).f188414a;
    }

    public final int hashCode() {
        return this.f188414a.hashCode();
    }
}
