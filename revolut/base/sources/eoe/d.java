package eoe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f127903a;

    public d(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f127903a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f127903a, ((d) obj2).f127903a);
    }

    public final int hashCode() {
        return this.f127903a.hashCode();
    }
}
