package hra;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f154800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f154801b;

    public b(d lower, d dVar) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        this.f154800a = lower;
        this.f154801b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154800a, bVar.f154800a) && Intrinsics.f(this.f154801b, bVar.f154801b);
    }

    public final int hashCode() {
        int iHashCode = this.f154800a.hashCode() * 31;
        d dVar = this.f154801b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
