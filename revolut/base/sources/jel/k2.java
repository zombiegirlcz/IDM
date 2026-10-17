package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yel.b f173492a;

    public k2(yel.b bVar) {
        this.f173492a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k2) && Intrinsics.f(this.f173492a, ((k2) obj2).f173492a);
    }

    public final int hashCode() {
        yel.b bVar = this.f173492a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
