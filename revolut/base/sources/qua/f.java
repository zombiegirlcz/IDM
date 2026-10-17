package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249291b;

    public f() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f249290a, fVar.f249290a) && Intrinsics.f(this.f249291b, fVar.f249291b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f249290a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f249291b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public f(dj0.d dVar, dj0.d dVar2) {
        this.f249290a = dVar;
        this.f249291b = dVar2;
    }
}
