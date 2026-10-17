package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5 f208292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f208293b;

    public i5(h5 colorState, float f) {
        Intrinsics.checkNotNullParameter(colorState, "colorState");
        this.f208292a = colorState;
        this.f208293b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj2;
        return Intrinsics.f(this.f208292a, i5Var.f208292a) && Float.compare(this.f208293b, i5Var.f208293b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f208293b) + (this.f208292a.hashCode() * 31);
    }
}
