package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f411a;

    public l(m type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f411a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f411a == ((l) obj2).f411a;
    }

    public final int hashCode() {
        return this.f411a.hashCode();
    }
}
