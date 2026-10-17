package fb6;

import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import com.revolut.feature.donations.api.model.quote.DonationQuoteResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DonationQuoteRequest f133457b;

    public /* synthetic */ o(DonationQuoteRequest donationQuoteRequest, int i) {
        this.f133456a = i;
        this.f133457b = donationQuoteRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DonationQuoteResponse quoteResponse = (DonationQuoteResponse) obj2;
        switch (this.f133456a) {
            case 0:
                Intrinsics.checkNotNullParameter(quoteResponse, "quoteResponse");
                return new qa6.f(this.f133457b, quoteResponse);
            default:
                Intrinsics.checkNotNullParameter(quoteResponse, "quoteResponse");
                return new zb6.j(this.f133457b, quoteResponse);
        }
    }
}
