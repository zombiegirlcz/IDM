package fif;

import kotlin.jvm.internal.Intrinsics;
import tof.h6;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6 f135402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f135404c;

    public h(h6 id10, String legId, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(legId, "legId");
        this.f135402a = id10;
        this.f135403b = legId;
        this.f135404c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f135402a, hVar.f135402a) && Intrinsics.f(this.f135403b, hVar.f135403b) && this.f135404c == hVar.f135404c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f135404c) + p.a.c(this.f135402a.hashCode() * 31, 31, this.f135403b);
    }
}
