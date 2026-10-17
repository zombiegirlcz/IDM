package hw0;

import aw0.cb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f156010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f156011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156012c;
    public final boolean d;
    public final cb e;

    public l(float f, float f4, boolean z, boolean z3, cb colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f156010a = f;
        this.f156011b = f4;
        this.f156012c = z;
        this.d = z3;
        this.e = colorScheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Float.compare(this.f156010a, lVar.f156010a) == 0 && Float.compare(this.f156011b, lVar.f156011b) == 0 && this.f156012c == lVar.f156012c && this.d == lVar.d && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(m72.b.b(this.f156011b, Float.hashCode(this.f156010a) * 31, 31), 31, this.f156012c), 31, this.d);
    }
}
