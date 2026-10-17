package doc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdh.c f116504a;

    public i(pdh.c defaultTimeSpan) {
        Intrinsics.checkNotNullParameter(defaultTimeSpan, "defaultTimeSpan");
        this.f116504a = defaultTimeSpan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f116504a == ((i) obj2).f116504a;
    }

    public final int hashCode() {
        return this.f116504a.hashCode() * 31;
    }
}
