package cxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109942a;

    public f(dj0.d dVar) {
        this.f109942a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f109942a, ((f) obj2).f109942a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f109942a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
