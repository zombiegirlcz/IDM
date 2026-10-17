package op0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o1 extends com.revolut.core.ui_kit.delegates.widgets.r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227366c;
    public final String d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(Object obj2, String widgetListId, String itemListId) {
        super(obj2);
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(itemListId, "itemListId");
        this.f227366c = widgetListId;
        this.d = itemListId;
        this.e = obj2;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f227366c;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.r0
    public final Object b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f227366c, o1Var.f227366c) && Intrinsics.f(this.d, o1Var.d) && Intrinsics.f(this.e, o1Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f227366c.hashCode() * 31, 31, this.d);
        Object obj2 = this.e;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
