package xl2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f306916a;

    public h(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f306916a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f306916a, ((h) obj2).f306916a);
    }

    public final int hashCode() {
        return this.f306916a.hashCode();
    }
}
