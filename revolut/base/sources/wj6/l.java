package wj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f297970b;

    public l(dj0.d dVar, String fieldId) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        this.f297969a = fieldId;
        this.f297970b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f297969a, lVar.f297969a) && Intrinsics.f(this.f297970b, lVar.f297970b);
    }

    public final int hashCode() {
        int iHashCode = this.f297969a.hashCode() * 31;
        dj0.d dVar = this.f297970b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
