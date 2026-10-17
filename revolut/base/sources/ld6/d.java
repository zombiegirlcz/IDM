package ld6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f194036a;

    public d(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f194036a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f194036a, ((d) obj2).f194036a);
    }

    public final int hashCode() {
        return this.f194036a.hashCode();
    }
}
