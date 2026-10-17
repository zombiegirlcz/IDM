package xmd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eyl.a f307192a;

    public q(eyl.a description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f307192a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f307192a, ((q) obj2).f307192a);
    }

    public final int hashCode() {
        return this.f307192a.hashCode();
    }
}
