package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccountTransferLimit;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/screen/transfer/limit/TradeRevPointsAccountLimitInfoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradeRevPointsAccountLimitInfoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TradeRevPointsAccountLimitInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAccountTransferLimit f91176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f91177b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradeRevPointsAccountLimitInfoScreenContract$InputData((TradeRevPointsAccountTransferLimit) parcel.readParcelable(TradeRevPointsAccountLimitInfoScreenContract$InputData.class.getClassLoader()), k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradeRevPointsAccountLimitInfoScreenContract$InputData[i];
        }
    }

    public TradeRevPointsAccountLimitInfoScreenContract$InputData(TradeRevPointsAccountTransferLimit limit, k programmeUnit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(programmeUnit, "programmeUnit");
        this.f91176a = limit;
        this.f91177b = programmeUnit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradeRevPointsAccountLimitInfoScreenContract$InputData)) {
            return false;
        }
        TradeRevPointsAccountLimitInfoScreenContract$InputData tradeRevPointsAccountLimitInfoScreenContract$InputData = (TradeRevPointsAccountLimitInfoScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91176a, tradeRevPointsAccountLimitInfoScreenContract$InputData.f91176a) && this.f91177b == tradeRevPointsAccountLimitInfoScreenContract$InputData.f91177b;
    }

    public final int hashCode() {
        return this.f91177b.hashCode() + (this.f91176a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91176a, i);
        dest.writeString(this.f91177b.name());
    }
}
