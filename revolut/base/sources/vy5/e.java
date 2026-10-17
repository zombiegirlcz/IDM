package vy5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f293148b;

    public e(String selectActionId, Object obj2) {
        Intrinsics.checkNotNullParameter(selectActionId, "selectActionId");
        this.f293147a = selectActionId;
        this.f293148b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f293147a, eVar.f293147a) && Intrinsics.f(this.f293148b, eVar.f293148b);
    }

    public final int hashCode() {
        int iHashCode = this.f293147a.hashCode() * 31;
        Object obj2 = this.f293148b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
