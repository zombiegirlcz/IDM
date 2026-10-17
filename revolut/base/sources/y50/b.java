package y50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f310975b;

    public b(String widgetId, Object obj2) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.f310974a = widgetId;
        this.f310975b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f310974a, bVar.f310974a) && Intrinsics.f(this.f310975b, bVar.f310975b);
    }

    public final int hashCode() {
        int iHashCode = this.f310974a.hashCode() * 31;
        Object obj2 = this.f310975b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
