package vp8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.d f291139a;

    public d(dp8.d frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f291139a = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f291139a == ((d) obj2).f291139a;
    }

    public final int hashCode() {
        return this.f291139a.hashCode();
    }
}
