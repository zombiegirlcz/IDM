package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f265968a;

    public q1(o status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f265968a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q1) && this.f265968a == ((q1) obj2).f265968a;
    }

    public final int hashCode() {
        return this.f265968a.hashCode();
    }
}
