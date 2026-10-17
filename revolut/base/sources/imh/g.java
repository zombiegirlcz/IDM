package imh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f162474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f162475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f162476c;

    public g(j widgetId, m source, n visibility) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f162474a = widgetId;
        this.f162475b = source;
        this.f162476c = visibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f162474a, gVar.f162474a) && Intrinsics.f(this.f162475b, gVar.f162475b) && Intrinsics.f(this.f162476c, gVar.f162476c);
    }

    public final int hashCode() {
        return this.f162476c.hashCode() + ((this.f162475b.hashCode() + (this.f162474a.hashCode() * 31)) * 31);
    }
}
