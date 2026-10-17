package xsh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dsh.e f308496b;

    public e(String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f308495a = widgetType;
        this.f308496b = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f308495a, eVar.f308495a) && Intrinsics.f(this.f308496b, eVar.f308496b);
    }

    public final int hashCode() {
        return this.f308496b.f117319a.hashCode() + (this.f308495a.hashCode() * 31);
    }
}
