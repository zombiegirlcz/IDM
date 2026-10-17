package a32;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FundingSource f1045b;

    public /* synthetic */ z(FundingSource fundingSource, int i) {
        this.f1044a = i;
        this.f1045b = fundingSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f1044a) {
            case 0:
                z22.a aVar = (z22.a) obj2;
                FundingSource fundingSource = this.f1045b;
                AccountId accountId = fundingSource.getK();
                long j2 = aVar.f318943b;
                xi0.b targetCurrency = aVar.f318944c;
                Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
                Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                return new z22.a(fundingSource, j2, targetCurrency, accountId);
            case 1:
                eq5.r update = (eq5.r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return eq5.r.a(update, null, null, null, null, null, null, this.f1045b, null, null, false, null, null, null, null, null, 1048319);
            case 2:
                return eq5.r.a((eq5.r) obj2, null, null, null, null, null, null, this.f1045b, null, null, false, null, null, null, null, null, 1048319);
            default:
                Long baseCurrencyAmount = (Long) obj2;
                Intrinsics.checkNotNullParameter(baseCurrencyAmount, "baseCurrencyAmount");
                io3.d dVar = ((PocketSource) this.f1045b).d;
                Long l2 = dVar.v;
                xi0.a aVar2 = xi0.b.Companion;
                String str = dVar.f163147c;
                aVar2.getClass();
                return l1l.o.a(new l1l.n(l2, xi0.a.a(str), baseCurrencyAmount.longValue())).f316033b;
        }
    }

    public /* synthetic */ z(g4k.p pVar, FundingSource fundingSource) {
        this.f1044a = 3;
        this.f1045b = fundingSource;
    }
}
