package dsh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f117324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f117325c;

    public i(String widgetType, e config, t state) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f117323a = widgetType;
        this.f117324b = config;
        this.f117325c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f117323a, iVar.f117323a) && Intrinsics.f(this.f117324b, iVar.f117324b) && this.f117325c == iVar.f117325c;
    }

    public final int hashCode() {
        return this.f117325c.hashCode() + r6.b.e(this.f117324b.f117319a, this.f117323a.hashCode() * 31, 31);
    }

    public /* synthetic */ i(String str, e eVar) {
        this(str, eVar, t.SEEN);
    }
}
