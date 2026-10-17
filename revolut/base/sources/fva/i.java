package fva;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f138400a;

    public i(h hVar) {
        this.f138400a = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f138400a, ((i) obj2).f138400a);
    }

    public final int hashCode() {
        h hVar = this.f138400a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
