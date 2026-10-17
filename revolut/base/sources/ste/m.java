package ste;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f265567a;

    public m(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f265567a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f265567a, ((m) obj2).f265567a);
    }

    public final int hashCode() {
        return this.f265567a.hashCode();
    }
}
