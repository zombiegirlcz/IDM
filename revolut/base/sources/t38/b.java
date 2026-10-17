package t38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f267672b;

    public b(String selectActionId, Object obj2) {
        Intrinsics.checkNotNullParameter(selectActionId, "selectActionId");
        this.f267671a = selectActionId;
        this.f267672b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f267671a, bVar.f267671a) && Intrinsics.f(this.f267672b, bVar.f267672b);
    }

    public final int hashCode() {
        int iHashCode = this.f267671a.hashCode() * 31;
        Object obj2 = this.f267672b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
