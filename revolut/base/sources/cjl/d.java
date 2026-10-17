package cjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24709a;

    public d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f24709a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f24709a, ((d) obj2).f24709a);
    }

    public final int hashCode() {
        return this.f24709a.hashCode();
    }
}
