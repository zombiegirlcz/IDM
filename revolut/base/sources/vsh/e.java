package vsh;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f291793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f291794c;

    public e(String sourceId, List availableWidgetTypes, String defaultWidgetType) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(availableWidgetTypes, "availableWidgetTypes");
        Intrinsics.checkNotNullParameter(defaultWidgetType, "defaultWidgetType");
        this.f291792a = sourceId;
        this.f291793b = availableWidgetTypes;
        this.f291794c = defaultWidgetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f291792a, eVar.f291792a) && Intrinsics.f(this.f291793b, eVar.f291793b) && Intrinsics.f(this.f291794c, eVar.f291794c);
    }

    public final int hashCode() {
        return this.f291794c.hashCode() + p.a.d(this.f291792a.hashCode() * 31, 31, this.f291793b);
    }
}
