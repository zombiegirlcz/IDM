package buf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18840a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FundingSource f18841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AccountId f18842c;

    public /* synthetic */ u0(FundingSource fundingSource, AccountId accountId) {
        this.f18841b = fundingSource;
        this.f18842c = accountId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        io3.d dVar;
        switch (this.f18840a) {
            case 0:
                return ManualTransferData.a((ManualTransferData) obj2, this.f18841b, this.f18842c, null, null, 28);
            default:
                BankTransferData bankTransferData = (BankTransferData) obj2;
                FundingSource fundingSource = this.f18841b;
                xi0.b bVar = fundingSource.f92241b;
                PocketSource pocketSource = fundingSource instanceof PocketSource ? (PocketSource) fundingSource : null;
                return BankTransferData.a(bankTransferData, 0L, bVar, fundingSource, this.f18842c, null, null, null, null, ((pocketSource == null || (dVar = pocketSource.d) == null) ? null : dVar.f163149h) == io3.i.EXTERNAL ? kq2.o.DIRECT_DEBIT_TOPUP : null, null, null, null, null, 1046499);
        }
    }

    public /* synthetic */ u0(FundingSource fundingSource, com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, AccountId accountId) {
        this.f18841b = fundingSource;
        this.f18842c = accountId;
    }
}
