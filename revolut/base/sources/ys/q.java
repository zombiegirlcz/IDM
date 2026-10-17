package ys;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316360a;

    public q(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f316360a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f316360a, ((q) obj2).f316360a);
    }

    public final int hashCode() {
        return this.f316360a.hashCode();
    }
}
