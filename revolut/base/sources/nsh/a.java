package nsh;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WidgetContext f218863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dsh.e f218865c;

    public a(WidgetContext widgetContext, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        this.f218863a = widgetContext;
        this.f218864b = widgetType;
        this.f218865c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f218863a, aVar.f218863a) && Intrinsics.f(this.f218864b, aVar.f218864b) && Intrinsics.f(this.f218865c, aVar.f218865c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f218863a.hashCode() * 31, 31, this.f218864b);
        dsh.e eVar = this.f218865c;
        return iC + (eVar == null ? 0 : eVar.f117319a.hashCode());
    }
}
