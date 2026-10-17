package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ub extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273109a;

    public ub(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f273109a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ub) && Intrinsics.f(this.f273109a, ((ub) obj2).f273109a);
    }

    public final String getId() {
        return this.f273109a;
    }

    public final int hashCode() {
        return this.f273109a.hashCode();
    }
}
