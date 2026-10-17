package xo0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f307543b;

    public d(String id10, e source) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f307542a = id10;
        this.f307543b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f307542a, dVar.f307542a) && this.f307543b == dVar.f307543b;
    }

    public final int hashCode() {
        return this.f307543b.hashCode() + (this.f307542a.hashCode() * 31);
    }
}
