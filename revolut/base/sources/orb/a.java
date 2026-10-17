package orb;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228081a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Amount f228082b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f228081a) {
            case 0:
                OrderQuote it8 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new qrb.a(l4i.a.b(this.f228082b), e1.m(it8));
            default:
                Amount convertedLimit = (Amount) obj2;
                Intrinsics.checkNotNullParameter(convertedLimit, "convertedLimit");
                Amount amount = this.f228082b;
                return a.a.e(convertedLimit, amount) < 0 ? convertedLimit : amount;
        }
    }

    public /* synthetic */ a(c cVar, Amount amount) {
        this.f228082b = amount;
    }
}
