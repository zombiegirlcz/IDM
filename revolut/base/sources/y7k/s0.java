package y7k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class s0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0.d f311575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FundingSource f311576c;
    public final /* synthetic */ AccountId d;

    public /* synthetic */ s0(dj0.d dVar, FundingSource fundingSource, AccountId accountId, int i) {
        this.f311574a = i;
        this.f311575b = dVar;
        this.f311576c = fundingSource;
        this.d = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f311574a) {
            case 0:
                dj0.d dVar = this.f311575b;
                return PaymentLinksTransferData.a((PaymentLinksTransferData) obj2, dVar.f115082a, dVar.f115083b, this.f311576c, this.d, null, null, null, 484);
            default:
                dj0.d dVar2 = this.f311575b;
                long j2 = dVar2.f115082a;
                xi0.b bVar = dVar2.f115083b;
                FundingSource fundingSource = this.f311576c;
                return PeerToPeerTransferData.a((PeerToPeerTransferData) obj2, j2, bVar, fundingSource.f92241b, fundingSource, this.d, null, null, null, null, null, null, 262088);
        }
    }
}
