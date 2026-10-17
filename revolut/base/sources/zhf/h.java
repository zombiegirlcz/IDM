package zhf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322417a;

    public h(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.f322417a = widgetId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f322417a, ((h) obj2).f322417a);
    }

    public final int hashCode() {
        return this.f322417a.hashCode();
    }
}
