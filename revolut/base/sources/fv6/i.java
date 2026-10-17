package fv6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138363a;

    public i(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f138363a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f138363a, ((i) obj2).f138363a);
    }

    public final int hashCode() {
        return this.f138363a.hashCode();
    }
}
