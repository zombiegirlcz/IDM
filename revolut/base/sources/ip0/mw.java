package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw f165421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f165422b;

    public mw(double d) {
        lw color = lw.ACCENT;
        Intrinsics.checkNotNullParameter(color, "color");
        this.f165421a = color;
        this.f165422b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj2;
        return this.f165421a == mwVar.f165421a && Double.compare(this.f165422b, mwVar.f165422b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f165422b) + (this.f165421a.hashCode() * 31);
    }
}
