package com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_market_data_impl/ui/breakdown/kompot/screens/transaction_price_description/TransactionPriceDescriptionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionPriceDescriptionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionPriceDescriptionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Breakdown.TransactionPriceDescription f97177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f97178b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionPriceDescriptionScreenContract$InputData((Breakdown.TransactionPriceDescription) parcel.readParcelable(TransactionPriceDescriptionScreenContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TransactionPriceDescriptionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionPriceDescriptionScreenContract$InputData[i];
        }
    }

    public TransactionPriceDescriptionScreenContract$InputData(Breakdown.TransactionPriceDescription breakdown, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97177a = breakdown;
        this.f97178b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionPriceDescriptionScreenContract$InputData)) {
            return false;
        }
        TransactionPriceDescriptionScreenContract$InputData transactionPriceDescriptionScreenContract$InputData = (TransactionPriceDescriptionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97177a, transactionPriceDescriptionScreenContract$InputData.f97177a) && Intrinsics.f(this.f97178b, transactionPriceDescriptionScreenContract$InputData.f97178b);
    }

    public final int hashCode() {
        return this.f97178b.hashCode() + (this.f97177a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97177a, i);
        dest.writeParcelable(this.f97178b, i);
    }
}
