package com.revolut.feature.defi.exchange.impl.ui.exchange_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuoteParams;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/defi/exchange/impl/ui/exchange_summary/DeFiExchangeSummaryContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeFiExchangeSummaryContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeFiExchangeSummaryContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSwapQuoteParams f71771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiExchangeOrderDraft f71772b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeFiExchangeSummaryContract$InputData(DeFiSwapQuoteParams.CREATOR.createFromParcel(parcel), DeFiExchangeOrderDraft.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeFiExchangeSummaryContract$InputData[i];
        }
    }

    public DeFiExchangeSummaryContract$InputData(DeFiSwapQuoteParams quoteParams, DeFiExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(quoteParams, "quoteParams");
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f71771a = quoteParams;
        this.f71772b = draft;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeFiExchangeSummaryContract$InputData)) {
            return false;
        }
        DeFiExchangeSummaryContract$InputData deFiExchangeSummaryContract$InputData = (DeFiExchangeSummaryContract$InputData) obj2;
        return Intrinsics.f(this.f71771a, deFiExchangeSummaryContract$InputData.f71771a) && Intrinsics.f(this.f71772b, deFiExchangeSummaryContract$InputData.f71772b);
    }

    public final int hashCode() {
        return this.f71772b.hashCode() + (this.f71771a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71771a.writeToParcel(dest, i);
        this.f71772b.writeToParcel(dest, i);
    }
}
