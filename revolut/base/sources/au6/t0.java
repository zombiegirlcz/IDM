package au6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9622a;

    public t0(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f9622a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && Intrinsics.f(this.f9622a, ((t0) obj2).f9622a);
    }

    public final int hashCode() {
        return this.f9622a.hashCode();
    }
}
