package chc;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f24169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f24170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24171c;
    public final k d;

    public m(double d, jo3.a pointsEarnValue, int i, k paymentCriteria) {
        Intrinsics.checkNotNullParameter(pointsEarnValue, "pointsEarnValue");
        Intrinsics.checkNotNullParameter(paymentCriteria, "paymentCriteria");
        this.f24169a = d;
        this.f24170b = pointsEarnValue;
        this.f24171c = i;
        this.d = paymentCriteria;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Double.compare(this.f24169a, mVar.f24169a) == 0 && Intrinsics.f(this.f24170b, mVar.f24170b) && this.f24171c == mVar.f24171c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f24171c, v7.j(this.f24170b, Double.hashCode(this.f24169a) * 31, 31), 31);
    }

    public /* synthetic */ m(int i, double d, jo3.a aVar, int i2, k kVar) {
        if (15 != (i & 15)) {
            j1.f(g.f24159a.getDescriptor(), i, 15);
            throw null;
        }
        this.f24169a = d;
        this.f24170b = aVar;
        this.f24171c = i2;
        this.d = kVar;
    }
}
