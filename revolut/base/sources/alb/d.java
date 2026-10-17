package alb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f6173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SavingsProduct.InterestRate f6174c;
    public final dj0.d d;

    public d(int i, List balanceRange, SavingsProduct.InterestRate interestRate, dj0.d estimatedReturn) {
        Intrinsics.checkNotNullParameter(balanceRange, "balanceRange");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(estimatedReturn, "estimatedReturn");
        this.f6172a = i;
        this.f6173b = balanceRange;
        this.f6174c = interestRate;
        this.d = estimatedReturn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f6172a == dVar.f6172a && Intrinsics.f(this.f6173b, dVar.f6173b) && Intrinsics.f(this.f6174c, dVar.f6174c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f6174c.hashCode() + p.a.d(Integer.hashCode(this.f6172a) * 31, 31, this.f6173b)) * 31);
    }
}
