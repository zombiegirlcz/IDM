package py2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240652a;

    public h(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f240652a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f240652a, ((h) obj2).f240652a);
    }

    public final int hashCode() {
        return this.f240652a.hashCode();
    }
}
