package old;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f226377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f226378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw0.d f226379c;

    public f(float f, float f4, lw0.d style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f226377a = f;
        this.f226378b = f4;
        this.f226379c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Float.compare(this.f226377a, fVar.f226377a) == 0 && Float.compare(this.f226378b, fVar.f226378b) == 0 && this.f226379c == fVar.f226379c;
    }

    public final int hashCode() {
        return this.f226379c.hashCode() + m72.b.b(this.f226378b, Float.hashCode(this.f226377a) * 31, 31);
    }
}
