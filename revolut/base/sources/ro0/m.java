package ro0;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f255754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f255755b;

    public m(Rect rect, float f) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f255754a = rect;
        this.f255755b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f255754a, mVar.f255754a) && Float.compare(this.f255755b, mVar.f255755b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f255755b) + (this.f255754a.hashCode() * 31);
    }
}
