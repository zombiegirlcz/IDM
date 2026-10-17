package op0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 extends com.revolut.core.ui_kit.delegates.widgets.m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ty0.a f227387c;

    public q0(String widgetListId, ty0.a model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f227386b = widgetListId;
        this.f227387c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f227386b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f227386b, q0Var.f227386b) && Intrinsics.f(this.f227387c, q0Var.f227387c);
    }

    public final int hashCode() {
        return this.f227387c.hashCode() + (this.f227386b.hashCode() * 31);
    }
}
