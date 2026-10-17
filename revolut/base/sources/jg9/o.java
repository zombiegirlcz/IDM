package jg9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg9.b f173955a;

    public o(sg9.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f173955a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f173955a, ((o) obj2).f173955a);
    }

    public final int hashCode() {
        return this.f173955a.hashCode();
    }
}
