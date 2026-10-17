package nsh;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dsh.p f218866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f218867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WidgetContext f218868c;

    public b(dsh.p widgetInfo, dsh.b bVar, WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        this.f218866a = widgetInfo;
        this.f218867b = bVar;
        this.f218868c = widgetContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218866a, bVar.f218866a) && Intrinsics.f(this.f218867b, bVar.f218867b) && Intrinsics.f(this.f218868c, bVar.f218868c);
    }

    public final int hashCode() {
        int iHashCode = this.f218866a.hashCode() * 31;
        Object obj2 = this.f218867b;
        return this.f218868c.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
