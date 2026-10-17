package com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/gia/margin_trading/impl/ui/borrowing_interest/WealthMarginBorrowingInterestScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_gia_margin_trading_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthMarginBorrowingInterestScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WealthMarginBorrowingInterestScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthMarginBorrowingInterest f95458b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthMarginBorrowingInterestScreenContract$InputData(parcel.readString(), (WealthMarginBorrowingInterest) parcel.readParcelable(WealthMarginBorrowingInterestScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthMarginBorrowingInterestScreenContract$InputData[i];
        }
    }

    public WealthMarginBorrowingInterestScreenContract$InputData(String portfolioId, WealthMarginBorrowingInterest borrowingInterest) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(borrowingInterest, "borrowingInterest");
        this.f95457a = portfolioId;
        this.f95458b = borrowingInterest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthMarginBorrowingInterestScreenContract$InputData)) {
            return false;
        }
        WealthMarginBorrowingInterestScreenContract$InputData wealthMarginBorrowingInterestScreenContract$InputData = (WealthMarginBorrowingInterestScreenContract$InputData) obj2;
        return Intrinsics.f(this.f95457a, wealthMarginBorrowingInterestScreenContract$InputData.f95457a) && Intrinsics.f(this.f95458b, wealthMarginBorrowingInterestScreenContract$InputData.f95458b);
    }

    public final int hashCode() {
        return this.f95458b.hashCode() + (this.f95457a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95457a);
        dest.writeParcelable(this.f95458b, i);
    }
}
