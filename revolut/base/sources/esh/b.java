package esh;

import aii.e;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f128948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WidgetContext f128949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f128950c;

    public b(Class dependenciesClazz, WidgetContext widgetContext, a onSelectBehavior) {
        Intrinsics.checkNotNullParameter(dependenciesClazz, "dependenciesClazz");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(onSelectBehavior, "onSelectBehavior");
        this.f128948a = dependenciesClazz;
        this.f128949b = widgetContext;
        this.f128950c = onSelectBehavior;
    }

    public final Class b() {
        return this.f128948a;
    }

    public final a c() {
        return this.f128950c;
    }

    public final WidgetContext d() {
        return this.f128949b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f128948a, bVar.f128948a) && Intrinsics.f(this.f128949b, bVar.f128949b) && this.f128950c == bVar.f128950c;
    }

    public final int hashCode() {
        return this.f128950c.hashCode() + ((this.f128949b.hashCode() + (this.f128948a.hashCode() * 31)) * 31);
    }
}
