package agl;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Amount f4845b;

    public /* synthetic */ b(Amount amount, int i) {
        this.f4844a = i;
        this.f4845b = amount;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4844a) {
            case 0:
                Amount it8 = (Amount) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Amount amount = this.f4845b;
                throw new IllegalStateException(("Undefined asset type for symbol=" + amount.f104718b.f104720b + ", amount=" + amount.f104717a).toString());
            default:
                Amount it9 = (Amount) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Amount amount2 = this.f4845b;
                throw new IllegalStateException(("Undefined asset type for symbol=" + amount2.f104718b.f104720b + ", amount=" + amount2.f104717a).toString());
        }
    }
}
