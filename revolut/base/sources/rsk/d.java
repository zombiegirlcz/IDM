package rsk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257102a;

    public d(String instrumentRef) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        this.f257102a = instrumentRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f257102a, ((d) obj2).f257102a);
    }

    public final int hashCode() {
        return this.f257102a.hashCode();
    }
}
