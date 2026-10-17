package po9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f237935b;

    public t(String widgetId, h content) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f237934a = widgetId;
        this.f237935b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f237934a, tVar.f237934a) && Intrinsics.f(this.f237935b, tVar.f237935b);
    }

    public final int hashCode() {
        return this.f237935b.hashCode() + (this.f237934a.hashCode() * 31);
    }
}
