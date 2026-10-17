package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f113939a;

    public d2(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f113939a = exception;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d2) && Intrinsics.f(this.f113939a, ((d2) obj2).f113939a);
    }

    public final int hashCode() {
        return this.f113939a.hashCode();
    }
}
