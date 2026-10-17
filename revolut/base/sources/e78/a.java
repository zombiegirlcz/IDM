package e78;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f123100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f123101b;

    public a(d balance, SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f123100a = balance;
        this.f123101b = savingsProductData;
    }

    @Override // e78.c
    public final d a() {
        return this.f123100a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f123100a, aVar.f123100a) && Intrinsics.f(this.f123101b, aVar.f123101b);
    }

    public final int hashCode() {
        int iHashCode = this.f123100a.hashCode() * 31;
        SavingsProductData savingsProductData = this.f123101b;
        return iHashCode + (savingsProductData == null ? 0 : savingsProductData.hashCode());
    }
}
