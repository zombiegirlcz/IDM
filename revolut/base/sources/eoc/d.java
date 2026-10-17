package eoc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f127898a;

    public d(c action) {
        hoc.e chartSettings = hoc.e.f154273a;
        Intrinsics.checkNotNullParameter(chartSettings, "chartSettings");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f127898a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        Object obj3 = hoc.e.f154273a;
        return obj3.equals(obj3) && this.f127898a.equals(dVar.f127898a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127898a.f127897a) + (hoc.e.f154273a.hashCode() * 31);
    }
}
