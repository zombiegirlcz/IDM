package com.revolut.feature.stock_lending.impl.ui.v2.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/stock_lending/impl/ui/v2/flow/StockLendingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StockLendingFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StockLendingFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAccountType f88411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingProductCode f88412b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StockLendingFlowContract$InputData((TradingAccountType) parcel.readParcelable(StockLendingFlowContract$InputData.class.getClassLoader()), (TradingProductCode) parcel.readParcelable(StockLendingFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StockLendingFlowContract$InputData[i];
        }
    }

    public StockLendingFlowContract$InputData(TradingAccountType accountType, TradingProductCode productCode) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(productCode, "productCode");
        this.f88411a = accountType;
        this.f88412b = productCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StockLendingFlowContract$InputData)) {
            return false;
        }
        StockLendingFlowContract$InputData stockLendingFlowContract$InputData = (StockLendingFlowContract$InputData) obj2;
        return Intrinsics.f(this.f88411a, stockLendingFlowContract$InputData.f88411a) && Intrinsics.f(this.f88412b, stockLendingFlowContract$InputData.f88412b);
    }

    public final int hashCode() {
        return this.f88412b.hashCode() + (this.f88411a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88411a, i);
        dest.writeParcelable(this.f88412b, i);
    }
}
