package j9k;

import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.models.quotes.TransferQuoteRequest;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSender;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1j.b f172359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rga.c f172360b;

    public c0(t1j.b transferQuoteInteractor, rga.c priceQuoteTraceIdHolder) {
        Intrinsics.checkNotNullParameter(transferQuoteInteractor, "transferQuoteInteractor");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.f172359a = transferQuoteInteractor;
        this.f172360b = priceQuoteTraceIdHolder;
    }

    public final Flow a(PeerToPeerTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        hrf.f fVar = transferData.f102248h;
        if (transferData.f102244a == 0 || fVar == hrf.f.INCOMING) {
            return new go.g(null, 2);
        }
        dj0.d dVar = transferData.f102256s;
        xi0.b bVar = transferData.f102246c;
        FundingSource fundingSource = transferData.e;
        String strT = czi.c.t(fundingSource);
        CountryProfile f92264h = fundingSource.getF92264h();
        TransferQuoteSender transferQuoteSender = new TransferQuoteSender(strT, f92264h != null ? f92264h.f92231a : null, bVar);
        TransferQuoteUserIdentifier transferQuoteUserIdentifier = transferData.f102253p;
        String strB = this.f172360b.b("payments_peer_to_peer_price_quote");
        return new g48.r(mo3.a.g(this.f172359a.l(new TransferQuoteRequest(dVar, transferQuoteSender, transferQuoteUserIdentifier, strB == null ? null : strB, 16)), null, null, 3), 15);
    }
}
