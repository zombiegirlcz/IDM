package lbc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193646a;

    public t(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f193646a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f193646a, ((t) obj2).f193646a);
    }

    public final int hashCode() {
        return this.f193646a.hashCode();
    }
}
