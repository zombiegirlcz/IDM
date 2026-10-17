package aqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8291a;

    public l(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f8291a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f8291a, ((l) obj2).f8291a);
    }

    public final int hashCode() {
        return this.f8291a.hashCode();
    }
}
