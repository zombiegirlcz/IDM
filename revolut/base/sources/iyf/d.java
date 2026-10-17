package iyf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f169700b;

    public d(String id10, h hVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f169699a = id10;
        this.f169700b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f169699a, dVar.f169699a) && Intrinsics.f(this.f169700b, dVar.f169700b);
    }

    public final int hashCode() {
        int iHashCode = this.f169699a.hashCode() * 31;
        h hVar = this.f169700b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
