package com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.common.models.domain.DeFiQuoteAmountLimitError;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuote;
import com.revolut.feature.transfer.core.models.FundingSource;
import d9.t0;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kyh.g;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/exchange_amount/model/DeFiExchangeOrderDraft;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeOrderDraft implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeOrderDraft> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiMoneyDetails f71763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiMoneyDetails f71764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f71765c;
    public final e d;
    public final DeFiAssetDetails e;
    public final FundingSource f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DeFiSwapQuote f71766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f71767h;
    public final DeFiQuoteAmountLimitError i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<DeFiMoneyDetails> creator = DeFiMoneyDetails.CREATOR;
            return new DeFiExchangeOrderDraft(creator.createFromParcel(parcel), creator.createFromParcel(parcel), g.valueOf(parcel.readString()), e.valueOf(parcel.readString()), (DeFiAssetDetails) parcel.readParcelable(DeFiExchangeOrderDraft.class.getClassLoader()), (FundingSource) parcel.readParcelable(DeFiExchangeOrderDraft.class.getClassLoader()), parcel.readInt() == 0 ? null : DeFiSwapQuote.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (DeFiQuoteAmountLimitError) parcel.readParcelable(DeFiExchangeOrderDraft.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeOrderDraft[i];
        }
    }

    public DeFiExchangeOrderDraft(DeFiMoneyDetails topMoneyDetails, DeFiMoneyDetails bottomMoneyDetails, g inputPosition, e side, DeFiAssetDetails assetOut, FundingSource balanceIn, DeFiSwapQuote deFiSwapQuote, boolean z, DeFiQuoteAmountLimitError deFiQuoteAmountLimitError) {
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(assetOut, "assetOut");
        Intrinsics.checkNotNullParameter(balanceIn, "balanceIn");
        this.f71763a = topMoneyDetails;
        this.f71764b = bottomMoneyDetails;
        this.f71765c = inputPosition;
        this.d = side;
        this.e = assetOut;
        this.f = balanceIn;
        this.f71766g = deFiSwapQuote;
        this.f71767h = z;
        this.i = deFiQuoteAmountLimitError;
    }

    public static DeFiExchangeOrderDraft a(DeFiExchangeOrderDraft deFiExchangeOrderDraft, DeFiMoneyDetails deFiMoneyDetails, DeFiMoneyDetails deFiMoneyDetails2, g gVar, DeFiAssetDetails deFiAssetDetails, FundingSource fundingSource, DeFiSwapQuote deFiSwapQuote, boolean z, DeFiQuoteAmountLimitError deFiQuoteAmountLimitError, int i) {
        if ((i & 1) != 0) {
            deFiMoneyDetails = deFiExchangeOrderDraft.f71763a;
        }
        DeFiMoneyDetails topMoneyDetails = deFiMoneyDetails;
        if ((i & 2) != 0) {
            deFiMoneyDetails2 = deFiExchangeOrderDraft.f71764b;
        }
        DeFiMoneyDetails bottomMoneyDetails = deFiMoneyDetails2;
        if ((i & 4) != 0) {
            gVar = deFiExchangeOrderDraft.f71765c;
        }
        g inputPosition = gVar;
        e side = deFiExchangeOrderDraft.d;
        if ((i & 16) != 0) {
            deFiAssetDetails = deFiExchangeOrderDraft.e;
        }
        DeFiAssetDetails assetOut = deFiAssetDetails;
        if ((i & 32) != 0) {
            fundingSource = deFiExchangeOrderDraft.f;
        }
        FundingSource balanceIn = fundingSource;
        DeFiSwapQuote deFiSwapQuote2 = (i & 64) != 0 ? deFiExchangeOrderDraft.f71766g : deFiSwapQuote;
        boolean z3 = (i & 128) != 0 ? deFiExchangeOrderDraft.f71767h : z;
        DeFiQuoteAmountLimitError deFiQuoteAmountLimitError2 = (i & 256) != 0 ? deFiExchangeOrderDraft.i : deFiQuoteAmountLimitError;
        deFiExchangeOrderDraft.getClass();
        Intrinsics.checkNotNullParameter(topMoneyDetails, "topMoneyDetails");
        Intrinsics.checkNotNullParameter(bottomMoneyDetails, "bottomMoneyDetails");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(assetOut, "assetOut");
        Intrinsics.checkNotNullParameter(balanceIn, "balanceIn");
        return new DeFiExchangeOrderDraft(topMoneyDetails, bottomMoneyDetails, inputPosition, side, assetOut, balanceIn, deFiSwapQuote2, z3, deFiQuoteAmountLimitError2);
    }

    public final int b() {
        int i = b46.a.f12182a[this.d.ordinal()];
        if (i == 1) {
            return t0.f(this.f);
        }
        if (i == 2) {
            return this.e.f71665a.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int c() {
        int i = b46.a.f12183b[this.f71765c.ordinal()];
        if (i == 1) {
            return j();
        }
        if (i == 2) {
            return b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final DeFiMoneyDetails d() {
        int i = b46.a.f12183b[this.f71765c.ordinal()];
        if (i == 1) {
            return this.f71763a;
        }
        if (i == 2) {
            return this.f71764b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        BigInteger bigInteger = d().f71769b;
        return bigInteger != null && bigInteger.signum() > 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiExchangeOrderDraft)) {
            return false;
        }
        DeFiExchangeOrderDraft deFiExchangeOrderDraft = (DeFiExchangeOrderDraft) obj2;
        return Intrinsics.f(this.f71763a, deFiExchangeOrderDraft.f71763a) && Intrinsics.f(this.f71764b, deFiExchangeOrderDraft.f71764b) && this.f71765c == deFiExchangeOrderDraft.f71765c && this.d == deFiExchangeOrderDraft.d && Intrinsics.f(this.e, deFiExchangeOrderDraft.e) && Intrinsics.f(this.f, deFiExchangeOrderDraft.f) && Intrinsics.f(this.f71766g, deFiExchangeOrderDraft.f71766g) && this.f71767h == deFiExchangeOrderDraft.f71767h && Intrinsics.f(this.i, deFiExchangeOrderDraft.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + y.g(this.d, (this.f71765c.hashCode() + ((this.f71764b.hashCode() + (this.f71763a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31;
        DeFiSwapQuote deFiSwapQuote = this.f71766g;
        int iC = j6.a.c((iHashCode + (deFiSwapQuote == null ? 0 : deFiSwapQuote.hashCode())) * 31, 31, this.f71767h);
        DeFiQuoteAmountLimitError deFiQuoteAmountLimitError = this.i;
        return iC + (deFiQuoteAmountLimitError != null ? deFiQuoteAmountLimitError.hashCode() : 0);
    }

    public final int j() {
        int i = b46.a.f12182a[this.d.ordinal()];
        if (i == 1) {
            return this.e.f71665a.d;
        }
        if (i == 2) {
            return t0.f(this.f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71763a.writeToParcel(dest, i);
        this.f71764b.writeToParcel(dest, i);
        dest.writeString(this.f71765c.name());
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        DeFiSwapQuote deFiSwapQuote = this.f71766g;
        if (deFiSwapQuote == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deFiSwapQuote.writeToParcel(dest, i);
        }
        dest.writeInt(this.f71767h ? 1 : 0);
        dest.writeParcelable(this.i, i);
    }

    public final boolean z() {
        int i = b46.a.f12182a[this.d.ordinal()];
        g gVar = this.f71765c;
        if (i == 1) {
            return gVar == g.TOP;
        }
        if (i == 2) {
            return gVar == g.BOTTOM;
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ DeFiExchangeOrderDraft(DeFiMoneyDetails deFiMoneyDetails, DeFiMoneyDetails deFiMoneyDetails2, g gVar, e eVar, DeFiAssetDetails deFiAssetDetails, FundingSource fundingSource) {
        this(deFiMoneyDetails, deFiMoneyDetails2, gVar, eVar, deFiAssetDetails, fundingSource, null, false, null);
    }
}
