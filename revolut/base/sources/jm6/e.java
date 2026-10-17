package jm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f176478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e7l.f f176479b;

    public e(boolean z, e7l.f fVar) {
        this.f176478a = z;
        this.f176479b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f176478a == eVar.f176478a && Intrinsics.f(this.f176479b, eVar.f176479b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f176478a) * 31;
        e7l.f fVar = this.f176479b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
