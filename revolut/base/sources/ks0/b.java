package ks0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.b f189062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f189063b;

    public b(koi.b bVar, boolean z) {
        this.f189062a = bVar;
        this.f189063b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f189062a, bVar.f189062a) && this.f189063b == bVar.f189063b;
    }

    public final int hashCode() {
        koi.b bVar = this.f189062a;
        return Boolean.hashCode(this.f189063b) + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }
}
