package gr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f145795a;

    public t(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f145795a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f145795a, ((t) obj2).f145795a);
    }

    public final int hashCode() {
        return this.f145795a.hashCode();
    }
}
