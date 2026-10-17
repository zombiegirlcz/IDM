package vha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f289446b;

    public v(String selectActionId, Object obj2) {
        Intrinsics.checkNotNullParameter(selectActionId, "selectActionId");
        this.f289445a = selectActionId;
        this.f289446b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f289445a, vVar.f289445a) && Intrinsics.f(this.f289446b, vVar.f289446b);
    }

    public final int hashCode() {
        int iHashCode = this.f289445a.hashCode() * 31;
        Object obj2 = this.f289446b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
