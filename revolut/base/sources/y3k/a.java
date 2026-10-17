package y3k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.models.quotes.TransferQuoteUserIdentifier;
import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import gim.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {
    public xi0.b A;
    public FundingSource B;
    public AccountId C;
    public String D;
    public rtf.c E;
    public m1l.a F;
    public TransferScheduleData G;
    public TransferQuoteUserIdentifier H;
    public PeerToPeerRecipient I;
    public TransferFlowType.Default J;
    public long K;
    public /* synthetic */ Object L;
    public final /* synthetic */ b M;
    public int N;
    public zm3.a u;
    public RemittanceTransferData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RecipientTrustState f310750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f310751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PeerToPeerRecipient f310752y;
    public xi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.M = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.L = obj2;
        this.N |= Integer.MIN_VALUE;
        return this.M.a(null, null, this);
    }
}
