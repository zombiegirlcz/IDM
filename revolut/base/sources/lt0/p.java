package lt0;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f199754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f199755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f199756c;

    public p(RectF drawingRect, float f, float f4) {
        Intrinsics.checkNotNullParameter(drawingRect, "drawingRect");
        this.f199754a = drawingRect;
        this.f199755b = f;
        this.f199756c = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f199754a, pVar.f199754a) && Float.compare(this.f199755b, pVar.f199755b) == 0 && Float.compare(this.f199756c, pVar.f199756c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f199756c) + m72.b.b(this.f199755b, this.f199754a.hashCode() * 31, 31);
    }
}
