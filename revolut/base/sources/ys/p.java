package ys;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316359a;

    public p(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f316359a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f316359a, ((p) obj2).f316359a);
    }

    public final int hashCode() {
        return this.f316359a.hashCode();
    }
}
