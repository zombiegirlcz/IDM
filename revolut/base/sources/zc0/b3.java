package zc0;

import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencySelectionOption f321014b;

    public b3(String itemId, CurrencySelectionOption option) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(option, "option");
        this.f321013a = itemId;
        this.f321014b = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f321013a, b3Var.f321013a) && Intrinsics.f(this.f321014b, b3Var.f321014b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321013a;
    }

    public final int hashCode() {
        return this.f321014b.hashCode() + (this.f321013a.hashCode() * 31);
    }
}
