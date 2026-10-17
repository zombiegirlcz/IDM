package dsh;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetContext f117335b;

    public o(WidgetContext widgetContext, String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        this.f117334a = widgetId;
        this.f117335b = widgetContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f117334a, oVar.f117334a) && Intrinsics.f(this.f117335b, oVar.f117335b);
    }

    public final int hashCode() {
        return this.f117335b.hashCode() + (this.f117334a.hashCode() * 31);
    }
}
