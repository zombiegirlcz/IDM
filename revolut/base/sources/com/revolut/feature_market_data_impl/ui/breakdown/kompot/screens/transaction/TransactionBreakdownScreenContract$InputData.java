package com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_market_data_impl/ui/breakdown/kompot/screens/transaction/TransactionBreakdownScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionBreakdownScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionBreakdownScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Breakdown.Transaction f97175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f97176b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionBreakdownScreenContract$InputData((Breakdown.Transaction) parcel.readParcelable(TransactionBreakdownScreenContract$InputData.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(TransactionBreakdownScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionBreakdownScreenContract$InputData[i];
        }
    }

    public TransactionBreakdownScreenContract$InputData(Breakdown.Transaction breakdown, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97175a = breakdown;
        this.f97176b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionBreakdownScreenContract$InputData)) {
            return false;
        }
        TransactionBreakdownScreenContract$InputData transactionBreakdownScreenContract$InputData = (TransactionBreakdownScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97175a, transactionBreakdownScreenContract$InputData.f97175a) && Intrinsics.f(this.f97176b, transactionBreakdownScreenContract$InputData.f97176b);
    }

    public final int hashCode() {
        return this.f97176b.hashCode() + (this.f97175a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97175a, i);
        dest.writeParcelable(this.f97176b, i);
    }
}
