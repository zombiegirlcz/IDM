package pmi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e, kmi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f237587a;

    public b(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f237587a = e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f237587a, ((b) obj2).f237587a);
    }

    public final int hashCode() {
        return this.f237587a.hashCode();
    }
}
