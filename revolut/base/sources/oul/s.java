package oul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oel.l f229921a;

    public s(oel.l instrumentSummary) {
        Intrinsics.checkNotNullParameter(instrumentSummary, "instrumentSummary");
        this.f229921a = instrumentSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f229921a, ((s) obj2).f229921a);
    }

    public final int hashCode() {
        return this.f229921a.hashCode();
    }
}
