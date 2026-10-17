package ejb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f126850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f126851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f126852c;

    public h(f allTime, f customPeriod, boolean z) {
        Intrinsics.checkNotNullParameter(allTime, "allTime");
        Intrinsics.checkNotNullParameter(customPeriod, "customPeriod");
        this.f126850a = allTime;
        this.f126851b = customPeriod;
        this.f126852c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f126850a, hVar.f126850a) && Intrinsics.f(this.f126851b, hVar.f126851b) && this.f126852c == hVar.f126852c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f126852c) + ((this.f126851b.hashCode() + (this.f126850a.hashCode() * 31)) * 31);
    }
}
