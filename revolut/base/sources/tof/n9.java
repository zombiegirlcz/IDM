package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272953a;

    public n9(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f272953a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n9) && Intrinsics.f(this.f272953a, ((n9) obj2).f272953a);
    }

    public final String getId() {
        return this.f272953a;
    }

    public final int hashCode() {
        return this.f272953a.hashCode();
    }
}
