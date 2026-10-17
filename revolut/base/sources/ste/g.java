package ste;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f265562a;

    public g(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f265562a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f265562a, ((g) obj2).f265562a);
    }

    public final int hashCode() {
        return this.f265562a.hashCode();
    }
}
