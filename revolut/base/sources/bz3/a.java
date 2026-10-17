package bz3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19909a;

    public a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f19909a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f19909a, ((a) obj2).f19909a);
    }

    public final int hashCode() {
        return this.f19909a.hashCode();
    }
}
