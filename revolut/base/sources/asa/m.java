package asa;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import efm.r;
import jid.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l1l.p;
import l1l.q;
import l1l.s;
import opf.c0;
import te0.w;
import wsg.n;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final osa.f f8903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f8904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vo9.a f8905c;
    public final z d;
    public final u5k.c e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f8906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1l.h f8907h;
    public final l1l.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f8908j;

    public m(osa.f flowInteractor, c0 transferSuggestedAmountsInteractor, vo9.a pocketMapper, z interactor, u5k.c transferWalletLimitsInteractor, n walletInteractor, l1l.a commonAmountDecimalValidator, l1l.d commonAmountMultipleValidator, s commonWalletLimitsValidator, q commonTransferNoteLengthValidator, l1l.k commonFundingSourceValidator, urf.f amountTransferLimitsValidator, wsa.c p2cBalanceValidator, l1l.h dealingCurrenciesValidator, l1l.h transferAvailabilityValidator, e errorStateMapper) {
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(commonAmountDecimalValidator, "commonAmountDecimalValidator");
        Intrinsics.checkNotNullParameter(commonAmountMultipleValidator, "commonAmountMultipleValidator");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        Intrinsics.checkNotNullParameter(commonTransferNoteLengthValidator, "commonTransferNoteLengthValidator");
        Intrinsics.checkNotNullParameter(commonFundingSourceValidator, "commonFundingSourceValidator");
        Intrinsics.checkNotNullParameter(amountTransferLimitsValidator, "amountTransferLimitsValidator");
        Intrinsics.checkNotNullParameter(p2cBalanceValidator, "p2cBalanceValidator");
        Intrinsics.checkNotNullParameter(dealingCurrenciesValidator, "dealingCurrenciesValidator");
        Intrinsics.checkNotNullParameter(transferAvailabilityValidator, "transferAvailabilityValidator");
        Intrinsics.checkNotNullParameter(errorStateMapper, "errorStateMapper");
        this.f8903a = flowInteractor;
        this.f8904b = transferSuggestedAmountsInteractor;
        this.f8905c = pocketMapper;
        this.d = interactor;
        this.e = transferWalletLimitsInteractor;
        this.f = walletInteractor;
        this.f8906g = commonWalletLimitsValidator;
        this.f8907h = dealingCurrenciesValidator;
        this.i = transferAvailabilityValidator;
        this.f8908j = errorStateMapper;
    }

    public static final long a(m mVar, FundingSource fundingSource) {
        mVar.getClass();
        if (fundingSource instanceof PocketSource) {
            return ((PocketSource) fundingSource).d.i;
        }
        if (fundingSource instanceof WealthPortfolio) {
            Long l2 = ((WealthPortfolio) fundingSource).f;
            if (l2 != null) {
                return l2.longValue();
            }
            return 0L;
        }
        if (fundingSource instanceof SavingsAccount) {
            return ((SavingsAccount) fundingSource).f92243g.f115082a;
        }
        if (fundingSource instanceof DeFiBalanceSource) {
            return ((DeFiBalanceSource) fundingSource).getF92243g().f115082a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ag1.k b(m mVar, PushToCardTransferData pushToCardTransferData, kqa.a aVar, long j2, g gVar) {
        mVar.getClass();
        Data data = gVar.f8895b;
        go.g gVar2 = new go.g(mVar.f8907h.a(new l1l.g(aVar != null ? Boolean.valueOf(aVar.f188354h) : null)).f316033b, 2);
        u5k.c cVar = mVar.e;
        r rVarH = w.h(gVar.f8894a);
        dj0.d dVar = pushToCardTransferData.f81532j;
        r rVarH2 = w.h(dVar);
        r rVarX = mVar.f.x(AccountId.Personal.f51414a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map = ((u5k.d) cVar).b(rVarH, rVarH2, rVarX).map(new aoa.h(new as9.a(mVar, pushToCardTransferData, 1), 27));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return new ag1.k(new Flow[]{gVar2, rd0.e.b(map), new go.g(l1l.a.a(new l1l.b(data, dVar)).f316033b, 2), new go.g(l1l.d.a(new l1l.c(data, dVar)).f316033b, 2), new go.g(urf.f.a(new l(data, pushToCardTransferData, aVar)).f316033b, 2), new go.g(wsa.c.a(new wsa.b(j2, dVar.f115082a, aVar)).f316033b, 2), new go.g(q.a(pushToCardTransferData.f81530g), 2), new go.g(pushToCardTransferData.e != null ? f0.f322471a : u.c(i1l.e.f157647a), 2), new go.g(mVar.i.b(new p(aVar != null ? aVar.f188357m : null)).f316033b, 2)}, 4);
    }

    public final wkm.l c(PushToCardTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Continuation continuation = null;
        return vkm.q.Q(new t38.e(transferData.f81528b > 0 ? this.f8903a.c(transferData) : new go.g(null, 2), 24, d(transferData), new a09.p(3, 9, continuation)), new h(continuation, this, transferData, 1));
    }

    public final t38.e d(PushToCardTransferData pushToCardTransferData) {
        hra.c params = new hra.c(pushToCardTransferData.f81527a, pushToCardTransferData.f81529c);
        Intrinsics.checkNotNullParameter(params, "params");
        h30.q qVar = (h30.q) this.d.f174461b;
        Intrinsics.checkNotNullParameter(params, "params");
        return new t38.e(rd0.e.b(((w4l.f) qVar.e).f(params, false)), 24, rd0.e.b(m70.a.g(this.f.U(AccountId.Personal.f51414a, true), null, null, 3)), new k(3, null));
    }
}
