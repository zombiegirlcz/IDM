package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f273113a;

    public v0(dj0.d dVar) {
        this.f273113a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v0) && Intrinsics.f(this.f273113a, ((v0) obj2).f273113a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f273113a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
