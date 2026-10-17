package hbf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a f150680b;

    public /* synthetic */ t(com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar, int i) {
        this.f150679a = i;
        this.f150680b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150679a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, null, null, null, false, !((i) ((j2) this.f150680b.v.f22677a).getValue()).f, 31);
            default:
                TransferRequest transferRequest = (TransferRequest) obj2;
                Intrinsics.checkNotNullParameter(transferRequest, "transferRequest");
                if (transferRequest.f91520b != u8f.f.COMPLETED) {
                    return new go.g(f0.f322471a, 2);
                }
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen.a aVar = this.f150680b;
                h1h.b bVar = aVar.f91659t;
                InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                String transferRequestId = aVar.o.f91653a;
                companion.getClass();
                Intrinsics.checkNotNullParameter(transferRequestId, "transferRequestId");
                InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl = new InvestTransactionsFilter.InvestTransactionsFilterImpl(null, null, null, null, null, transferRequestId, null, 95);
                InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
                return bVar.c3(investTransactionsFilterImpl, w4l.h.f294642c, new h1h.c(InvestTransactionsListContract$Disclaimers.Companion.b(), 1));
        }
    }
}
