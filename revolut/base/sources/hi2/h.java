package hi2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh2.a f152457a;

    public h(jh2.a details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f152457a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f152457a, ((h) obj2).f152457a);
    }

    public final int hashCode() {
        return this.f152457a.f174109a.hashCode();
    }
}
