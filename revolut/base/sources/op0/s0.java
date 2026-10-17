package op0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 extends com.revolut.core.ui_kit.delegates.widgets.m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227409b;

    public s0(String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(null, "model");
        this.f227409b = widgetListId;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f227409b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f227409b, ((s0) obj2).f227409b);
    }

    public final int hashCode() {
        this.f227409b.hashCode();
        throw null;
    }
}
