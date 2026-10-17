package my0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ky0.d f210275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f210277c;

    public a(ky0.d widgetId, String actionId, Object obj2) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f210275a = widgetId;
        this.f210276b = actionId;
        this.f210277c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f210275a, aVar.f210275a) && Intrinsics.f(this.f210276b, aVar.f210276b) && Intrinsics.f(this.f210277c, aVar.f210277c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f210275a.f190615a.hashCode() * 31, 31, this.f210276b);
        Object obj2 = this.f210277c;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
