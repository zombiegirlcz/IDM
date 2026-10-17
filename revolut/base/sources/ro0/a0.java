package ro0;

import android.graphics.RectF;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f255732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f255733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f255734c;

    public a0(Size sourceSizePx, RectF boundsPx, float f) {
        Intrinsics.checkNotNullParameter(sourceSizePx, "sourceSizePx");
        Intrinsics.checkNotNullParameter(boundsPx, "boundsPx");
        this.f255732a = sourceSizePx;
        this.f255733b = boundsPx;
        this.f255734c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f255732a, a0Var.f255732a) && Intrinsics.f(this.f255733b, a0Var.f255733b) && Float.compare(this.f255734c, a0Var.f255734c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f255734c) + ((this.f255733b.hashCode() + (this.f255732a.hashCode() * 31)) * 31);
    }
}
