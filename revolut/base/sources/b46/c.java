package b46;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteException;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuote;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSourceAmount;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiMoneyDetails;
import com.revolut.feature.transfer.core.models.FundingSource;
import d9.t0;
import java.math.BigInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kyh.f;
import kyh.g;
import org.jmrtd.cbeff.ISO781611;
import wd6.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static DeFiExchangeOrderDraft a(DeFiExchangeOrderDraft draft, Data quoteData) {
        f fVar;
        int iB;
        Pair pair;
        BigInteger bigInteger;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(quoteData, "quoteData");
        DeFiSwapQuote deFiSwapQuote = (DeFiSwapQuote) quoteData.getContent();
        if (deFiSwapQuote != null) {
            g gVar = draft.f71765c;
            FundingSource fundingSource = draft.f;
            e eVar = draft.d;
            int i = a.f12183b[gVar.ordinal()];
            if (i == 1) {
                iB = draft.b();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iB = draft.j();
            }
            if (draft.z()) {
                DeFiSwapSourceAmount deFiSwapSourceAmount = deFiSwapQuote.f71724b;
                pair = new Pair(deFiSwapSourceAmount.f71742b, Integer.valueOf(deFiSwapSourceAmount.f71743c));
            } else {
                DeFiAssetAmount deFiAssetAmount = deFiSwapQuote.d;
                pair = new Pair(deFiAssetAmount.f71682c, Integer.valueOf(deFiAssetAmount.d));
            }
            BigInteger bigIntegerB = b(((Number) pair.f186386b).intValue(), iB, (BigInteger) pair.f186385a);
            int[] iArr = b.f12184a;
            int i2 = iArr[gVar.ordinal()];
            if (i2 == 1) {
                bigInteger = draft.f71763a.f71769b;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bigInteger = bigIntegerB;
            }
            int i3 = iArr[gVar.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bigIntegerB = draft.f71764b.f71769b;
            }
            BigInteger bigInteger2 = bigIntegerB;
            return DeFiExchangeOrderDraft.a(draft, DeFiMoneyDetails.a(draft.f71763a, null, bigInteger, c(bigInteger, eVar == e.SELL, fundingSource), false, 9), DeFiMoneyDetails.a(draft.f71764b, null, bigInteger2, c(bigInteger2, eVar == e.BUY, fundingSource), false, 9), null, null, null, deFiSwapQuote, false, null, 60);
        }
        if (quoteData.getError() == null) {
            return quoteData.getLoading() ? DeFiExchangeOrderDraft.a(draft, null, null, null, null, null, null, true, null, 383) : draft;
        }
        Throwable error = quoteData.getError();
        f fVarC = null;
        DeFiQuoteException deFiQuoteException = error instanceof DeFiQuoteException ? (DeFiQuoteException) error : null;
        DeFiQuoteAmountLimitError deFiQuoteAmountLimitError = deFiQuoteException != null ? deFiQuoteException.f71702a : null;
        if (deFiQuoteAmountLimitError != null) {
            if (deFiQuoteAmountLimitError instanceof DeFiQuoteAmountLimitError.BelowMinimum) {
                fVar = f.FAILED_CRYPTO_LOWER_LIMIT;
            } else {
                if (!(deFiQuoteAmountLimitError instanceof DeFiQuoteAmountLimitError.AboveMaximum)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = f.EXCEEDED_CRYPTO_LIMIT;
            }
            fVarC = fVar;
        }
        g gVar2 = draft.f71765c;
        FundingSource fundingSource2 = draft.f;
        e eVar2 = draft.d;
        int i5 = b.f12184a[gVar2.ordinal()];
        if (i5 == 1) {
            DeFiMoneyDetails deFiMoneyDetails = draft.f71763a;
            if (fVarC == null) {
                fVarC = c(deFiMoneyDetails.f71769b, eVar2 == e.SELL, fundingSource2);
                if (fVarC == null) {
                    fVarC = f.UNKNOWN;
                }
            }
            return DeFiExchangeOrderDraft.a(draft, DeFiMoneyDetails.a(deFiMoneyDetails, null, null, fVarC, false, 11), null, null, null, null, null, false, deFiQuoteAmountLimitError, 126);
        }
        if (i5 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        DeFiMoneyDetails deFiMoneyDetails2 = draft.f71764b;
        if (fVarC == null) {
            fVarC = c(deFiMoneyDetails2.f71769b, eVar2 == e.BUY, fundingSource2);
            if (fVarC == null) {
                fVarC = f.UNKNOWN;
            }
        }
        return DeFiExchangeOrderDraft.a(draft, null, DeFiMoneyDetails.a(deFiMoneyDetails2, null, null, fVarC, false, 11), null, null, null, null, false, deFiQuoteAmountLimitError, ISO781611.SMT_TAG);
    }

    public static BigInteger b(int i, int i2, BigInteger bigInteger) {
        int i3 = i2 - i;
        if (i3 > 0) {
            BigInteger bigIntegerPow = BigInteger.TEN.pow(i3);
            Intrinsics.checkNotNullExpressionValue(bigIntegerPow, "pow(...)");
            BigInteger bigIntegerMultiply = bigInteger.multiply(bigIntegerPow);
            Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
            return bigIntegerMultiply;
        }
        if (i3 >= 0) {
            return bigInteger;
        }
        BigInteger bigIntegerPow2 = BigInteger.TEN.pow(-i3);
        Intrinsics.checkNotNullExpressionValue(bigIntegerPow2, "pow(...)");
        BigInteger bigIntegerDivide = bigInteger.divide(bigIntegerPow2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerDivide, "divide(...)");
        return bigIntegerDivide;
    }

    public static f c(BigInteger bigInteger, boolean z, FundingSource fundingSource) {
        if (bigInteger == null || bigInteger.signum() <= 0 || !z || bigInteger.compareTo(t0.e(fundingSource)) <= 0) {
            return null;
        }
        return f.EXCEEDED_BALANCE;
    }

    public static DeFiExchangeOrderDraft d(DeFiExchangeOrderDraft draft, g inputPosition) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        return draft.f71765c == inputPosition ? draft : DeFiExchangeOrderDraft.a(draft, null, null, inputPosition, null, null, null, false, null, 507);
    }

    public static DeFiExchangeOrderDraft e(DeFiExchangeOrderDraft draft, BigInteger amount, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return DeFiExchangeOrderDraft.a(draft, DeFiMoneyDetails.a(draft.f71763a, null, null, null, false, 9), DeFiMoneyDetails.a(draft.f71764b, null, amount, c(amount, draft.d == e.BUY, draft.f), z, 1), null, null, null, null, amount.signum() > 0, null, 60);
    }

    public static DeFiExchangeOrderDraft f(DeFiExchangeOrderDraft draft, BigInteger amount, boolean z) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return DeFiExchangeOrderDraft.a(draft, DeFiMoneyDetails.a(draft.f71763a, null, amount, c(amount, draft.d == e.SELL, draft.f), z, 1), DeFiMoneyDetails.a(draft.f71764b, null, null, null, false, 9), null, null, null, null, amount.signum() > 0, null, 60);
    }
}
