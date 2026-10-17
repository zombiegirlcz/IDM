package oy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f230886b;

    public f(dj0.d dVar, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f230885a = id10;
        this.f230886b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f230885a, fVar.f230885a) && Intrinsics.f(this.f230886b, fVar.f230886b);
    }

    public final int hashCode() {
        int iHashCode = this.f230885a.hashCode() * 31;
        dj0.d dVar = this.f230886b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
