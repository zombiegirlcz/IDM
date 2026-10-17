package ghb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f143899a;

    public h(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f143899a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f143899a, ((h) obj2).f143899a);
    }

    public final int hashCode() {
        return this.f143899a.hashCode();
    }
}
