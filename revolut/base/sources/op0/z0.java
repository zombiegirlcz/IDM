package op0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f227495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f227496b;

    public z0(Clause text, y0 linesCount) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(linesCount, "linesCount");
        this.f227495a = text;
        this.f227496b = linesCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f227495a, z0Var.f227495a) && this.f227496b == z0Var.f227496b;
    }

    public final int hashCode() {
        return this.f227496b.hashCode() + (this.f227495a.hashCode() * 31);
    }
}
