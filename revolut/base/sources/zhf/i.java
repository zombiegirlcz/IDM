package zhf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322418a;

    public i(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.f322418a = widgetId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f322418a, ((i) obj2).f322418a);
    }

    public final int hashCode() {
        return this.f322418a.hashCode();
    }
}
