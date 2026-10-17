package kl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f185286a;

    public d(c result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f185286a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f185286a == ((d) obj2).f185286a;
    }

    public final int hashCode() {
        return this.f185286a.hashCode();
    }
}
