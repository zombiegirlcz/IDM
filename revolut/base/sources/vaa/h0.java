package vaa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.u f287197a;

    public h0(aii.u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f287197a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f287197a, ((h0) obj2).f287197a);
    }

    public final int hashCode() {
        return this.f287197a.hashCode();
    }
}
