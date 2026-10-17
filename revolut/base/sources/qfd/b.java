package qfd;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245290b;

    public b(String widgetId, List list) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.f245289a = widgetId;
        this.f245290b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f245289a, bVar.f245289a) && Intrinsics.f(this.f245290b, bVar.f245290b);
    }

    public final int hashCode() {
        int iHashCode = this.f245289a.hashCode() * 31;
        List list = this.f245290b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
