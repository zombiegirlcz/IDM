package xah;

import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$Descriptor;
import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oc.f;
import x8h.y;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends f1h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ugc.a f303886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y f303887m;

    public c(ugc.a transactionsCommonNavigationProvider, y investTransactionsPagerInteractor) {
        Intrinsics.checkNotNullParameter(transactionsCommonNavigationProvider, "transactionsCommonNavigationProvider");
        Intrinsics.checkNotNullParameter(investTransactionsPagerInteractor, "investTransactionsPagerInteractor");
        this.f303886l = transactionsCommonNavigationProvider;
        this.f303887m = investTransactionsPagerInteractor;
    }

    @Override // f1h.b
    public final void Z2(f1h.d parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof f1h.d)) {
            throw new NoWhenBranchMatchedException();
        }
        y yVar = this.f303887m;
        yVar.getClass();
        if (((jte.d) yVar.f303403c).c(FeatureWealthApi$Toggles.InvestTradesHorizontalDetails.f95161c)) {
            n.P2(this, o2(new InvestTransactionDetailsPagerContract$Descriptor(new InvestTransactionDetailsPagerContract$InputData(parcel.f131269a, parcel.f131270b))), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
            return;
        }
        InvestTransaction transaction = parcel.f131269a;
        boolean z = parcel.f131271c;
        ugc.a aVar = this.f303886l;
        if (!z) {
            A2(aVar.q(transaction));
            return;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        f fVar = (f) aVar.f279998b;
        WealthAccountType accountType = transaction.getF91225a().b();
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        n.P2(this, o2(fVar.a(accountType).a().a(transaction)), null, null, 3);
    }
}
