package vsh;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseDraggableWidgetDelegate.Model f291797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f291798c;
    public final String d;

    public h(String sourceId, BaseDraggableWidgetDelegate.Model model, List list, String str) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.f291796a = sourceId;
        this.f291797b = model;
        this.f291798c = list;
        this.d = str;
    }

    public static h a(h hVar, BaseDraggableWidgetDelegate.Model model, List list, String str, int i) {
        String sourceId = hVar.f291796a;
        if ((i & 4) != 0) {
            list = hVar.f291798c;
        }
        if ((i & 8) != 0) {
            str = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        return new h(sourceId, model, list, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f291796a, hVar.f291796a) && Intrinsics.f(this.f291797b, hVar.f291797b) && Intrinsics.f(this.f291798c, hVar.f291798c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f291796a.hashCode() * 31;
        BaseDraggableWidgetDelegate.Model model = this.f291797b;
        int iHashCode2 = (iHashCode + (model == null ? 0 : model.hashCode())) * 31;
        List list = this.f291798c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
