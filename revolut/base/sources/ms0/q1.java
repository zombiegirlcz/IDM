package ms0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f208380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f208381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f208382c;
    public final int d;
    public final r1 e;

    public q1(int i, int i2, Integer num) {
        r1 labelLocation = r1.MIDDLE;
        Intrinsics.checkNotNullParameter(labelLocation, "labelLocation");
        this.f208380a = 1.0f;
        this.f208381b = i;
        this.f208382c = num;
        this.d = i2;
        this.e = labelLocation;
    }

    @Override // ms0.t1
    public final Clause a() {
        return null;
    }

    @Override // ms0.t1
    public final r1 b() {
        return this.e;
    }

    @Override // ms0.t1
    public final float c() {
        return this.f208380a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Float.compare(this.f208380a, q1Var.f208380a) == 0 && this.f208381b == q1Var.f208381b && Intrinsics.f(this.f208382c, q1Var.f208382c) && this.d == q1Var.d && this.e == q1Var.e;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f208381b, Float.hashCode(this.f208380a) * 31, 31);
        Integer num = this.f208382c;
        return this.e.hashCode() + j6.a.b(this.d, (iB + (num == null ? 0 : num.hashCode())) * 31, 961);
    }
}
