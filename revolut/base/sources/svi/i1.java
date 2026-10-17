package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f265923a;

    public i1(o status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f265923a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i1) && this.f265923a == ((i1) obj2).f265923a;
    }

    public final int hashCode() {
        return this.f265923a.hashCode();
    }
}
