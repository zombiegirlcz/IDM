package ms0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f208497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f208498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f208499c;
    public final int d;

    public y3(Image image, Clause clause, int i, int i2) {
        this.f208497a = image;
        this.f208498b = clause;
        this.f208499c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f208497a, y3Var.f208497a) && Intrinsics.f(this.f208498b, y3Var.f208498b) && this.f208499c == y3Var.f208499c && this.d == y3Var.d;
    }

    public final int hashCode() {
        Image image = this.f208497a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Clause clause = this.f208498b;
        return Integer.hashCode(this.d) + j6.a.b(this.f208499c, (iHashCode + (clause != null ? clause.hashCode() : 0)) * 31, 31);
    }
}
