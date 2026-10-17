package n5i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d4i.h f212587b;

    public /* synthetic */ b(d4i.h hVar, int i) {
        this.f212586a = i;
        this.f212587b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OrderQuote fees = (OrderQuote) obj2;
        switch (this.f212586a) {
            case 0:
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                break;
            default:
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                break;
        }
        return new l5i.k(fees.f104755g.f104731a, this.f212587b.f111335c);
    }
}
