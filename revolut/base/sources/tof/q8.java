package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.l f273012a;

    public q8(io3.l pocketType) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f273012a = pocketType;
    }

    public final io3.l a() {
        return this.f273012a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q8) && this.f273012a == ((q8) obj2).f273012a;
    }

    public final int hashCode() {
        return this.f273012a.hashCode();
    }
}
