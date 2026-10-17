package lsj;

import he3.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.d f199685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f199686b;

    public b(uzi.d period, p periodPrefs) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(periodPrefs, "periodPrefs");
        this.f199685a = period;
        this.f199686b = periodPrefs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f199685a, bVar.f199685a) && Intrinsics.f(this.f199686b, bVar.f199686b);
    }

    public final int hashCode() {
        return this.f199686b.hashCode() + (this.f199685a.hashCode() * 31);
    }
}
