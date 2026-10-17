package aqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8295a;

    public o(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f8295a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f8295a, ((o) obj2).f8295a);
    }

    public final int hashCode() {
        return this.f8295a.hashCode();
    }
}
