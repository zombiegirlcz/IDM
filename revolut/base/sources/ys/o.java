package ys;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316358a;

    public o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f316358a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f316358a, ((o) obj2).f316358a);
    }

    public final int hashCode() {
        return this.f316358a.hashCode();
    }
}
