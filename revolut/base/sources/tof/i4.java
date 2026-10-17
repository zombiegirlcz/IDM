package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f272800a;

    public i4(dj0.d dVar) {
        this.f272800a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i4) && Intrinsics.f(this.f272800a, ((i4) obj2).f272800a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f272800a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
