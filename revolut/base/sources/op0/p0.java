package op0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 extends com.revolut.core.ui_kit.delegates.widgets.m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227374b;

    public p0(String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(null, "model");
        this.f227374b = widgetListId;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f227374b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && Intrinsics.f(this.f227374b, ((p0) obj2).f227374b);
    }

    public final int hashCode() {
        this.f227374b.hashCode();
        throw null;
    }
}
