package ste;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f265577a;

    public w(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f265577a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f265577a, ((w) obj2).f265577a);
    }

    public final int hashCode() {
        return this.f265577a.hashCode();
    }
}
