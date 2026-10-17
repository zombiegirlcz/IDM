package sgg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f262652a;

    public c(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f262652a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f262652a, ((c) obj2).f262652a);
    }

    public final int hashCode() {
        return this.f262652a.hashCode();
    }
}
