package el3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f127240a;

    public h(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f127240a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f127240a, ((h) obj2).f127240a);
    }

    public final int hashCode() {
        return this.f127240a.hashCode();
    }
}
