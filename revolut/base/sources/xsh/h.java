package xsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseDraggableWidgetDelegate.Model f308501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f308502c;
    public final Clause d;
    public final Clause e;
    public final dsh.e f;

    public h(String widgetType, BaseDraggableWidgetDelegate.Model widgetModel, Clause title, Clause description, Clause clause, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetModel, "widgetModel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f308500a = widgetType;
        this.f308501b = widgetModel;
        this.f308502c = title;
        this.d = description;
        this.e = clause;
        this.f = eVar;
    }

    public static h a(h hVar, BaseDraggableWidgetDelegate.Model model, Clause clause, dsh.e eVar, int i) {
        String widgetType = hVar.f308500a;
        if ((i & 2) != 0) {
            model = hVar.f308501b;
        }
        BaseDraggableWidgetDelegate.Model widgetModel = model;
        Clause title = hVar.f308502c;
        Clause description = hVar.d;
        if ((i & 16) != 0) {
            clause = hVar.e;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetModel, "widgetModel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new h(widgetType, widgetModel, title, description, clause, eVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f308500a, hVar.f308500a) && Intrinsics.f(this.f308501b, hVar.f308501b) && Intrinsics.f(this.f308502c, hVar.f308502c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a((this.f308501b.hashCode() + (this.f308500a.hashCode() * 31)) * 31, 31, this.f308502c), 31, this.d);
        Clause clause = this.e;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        dsh.e eVar = this.f;
        return iHashCode + (eVar != null ? eVar.f117319a.hashCode() : 0);
    }
}
