package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f166512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf f166513b;

    public tf(float f, sf pointColor) {
        Intrinsics.checkNotNullParameter(pointColor, "pointColor");
        this.f166512a = f;
        this.f166513b = pointColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj2;
        return Float.compare(this.f166512a, tfVar.f166512a) == 0 && this.f166513b == tfVar.f166513b;
    }

    public final int hashCode() {
        return this.f166513b.hashCode() + (Float.hashCode(this.f166512a) * 31);
    }
}
