package op0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n1 extends com.revolut.core.ui_kit.delegates.widgets.r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227357c;
    public final String d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(Object obj2, String widgetListId, String itemListId) {
        super(obj2);
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(itemListId, "itemListId");
        this.f227357c = widgetListId;
        this.d = itemListId;
        this.e = obj2;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f227357c;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.r0
    public final Object b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f227357c, n1Var.f227357c) && Intrinsics.f(this.d, n1Var.d) && Intrinsics.f(this.e, n1Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f227357c.hashCode() * 31, 31, this.d);
        Object obj2 = this.e;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
