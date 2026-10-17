package kse;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final av1.c f189442b;

    public b(String id10, av1.c type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f189441a = id10;
        this.f189442b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f189441a, bVar.f189441a) && Intrinsics.f(this.f189442b, bVar.f189442b);
    }

    public final int hashCode() {
        return this.f189442b.hashCode() + (this.f189441a.hashCode() * 31);
    }
}
