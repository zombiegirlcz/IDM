package com.revolut.feature.retail.cfd.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import dfl.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination implements CfdTradingFeatureConfig.CfdTradingDestination {

    @NotNull
    public static final Parcelable.Creator<CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f82151a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination((v) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination[i];
        }
    }

    public CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination(v trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        this.f82151a = trade;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getF82151a() {
        return this.f82151a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination) && Intrinsics.f(this.f82151a, ((CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination) obj2).f82151a);
    }

    public final int hashCode() {
        return this.f82151a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f82151a);
    }
}
