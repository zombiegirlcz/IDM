package ywf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317418a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f317418a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f317418a, ((b) obj2).f317418a);
    }

    public final int hashCode() {
        return this.f317418a.hashCode();
    }
}
