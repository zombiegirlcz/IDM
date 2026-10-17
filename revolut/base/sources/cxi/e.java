package cxi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f109990b;

    public e(dj0.d dVar, dj0.d finalEntryPrice) {
        Intrinsics.checkNotNullParameter(finalEntryPrice, "finalEntryPrice");
        this.f109989a = dVar;
        this.f109990b = finalEntryPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f109989a, eVar.f109989a) && Intrinsics.f(this.f109990b, eVar.f109990b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f109989a;
        return this.f109990b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
