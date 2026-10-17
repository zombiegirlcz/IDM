package gnh;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f144999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f145000c;
    public final boolean d;

    public g(String widgetId, Clause title, e type, boolean z) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f144998a = widgetId;
        this.f144999b = title;
        this.f145000c = type;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f144998a, gVar.f144998a) && this.f144999b.equals(gVar.f144999b) && this.f145000c.equals(gVar.f145000c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f145000c.hashCode() + p.a.b(this.f144998a.hashCode() * 31, 31, this.f144999b)) * 31);
    }
}
