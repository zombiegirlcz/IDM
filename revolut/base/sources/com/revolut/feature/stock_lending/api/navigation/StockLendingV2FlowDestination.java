package com.revolut.feature.stock_lending.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stock_lending/api/navigation/StockLendingV2FlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_lending_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockLendingV2FlowDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<StockLendingV2FlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountType f88397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingProductCode f88398b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockLendingV2FlowDestination((TradingAccountType) parcel.readParcelable(StockLendingV2FlowDestination.class.getClassLoader()), (TradingProductCode) parcel.readParcelable(StockLendingV2FlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockLendingV2FlowDestination[i];
        }
    }

    public StockLendingV2FlowDestination(TradingAccountType accountType, TradingProductCode productCode) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        this.f88397a = accountType;
        this.f88398b = productCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockLendingV2FlowDestination)) {
            return false;
        }
        StockLendingV2FlowDestination stockLendingV2FlowDestination = (StockLendingV2FlowDestination) obj2;
        return Intrinsics.f(this.f88397a, stockLendingV2FlowDestination.f88397a) && Intrinsics.f(this.f88398b, stockLendingV2FlowDestination.f88398b);
    }

    public final int hashCode() {
        return this.f88398b.hashCode() + (this.f88397a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88397a, i);
        dest.writeParcelable(this.f88398b, i);
    }
}
