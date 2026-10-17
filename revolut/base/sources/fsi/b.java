package fsi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137703a;

    public b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f137703a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f137703a, ((b) obj2).f137703a);
    }

    public final int hashCode() {
        return this.f137703a.hashCode();
    }
}
