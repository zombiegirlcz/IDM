package com.revolut.feature.retail.cfd.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import dfl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CashTradeDetails$Destination", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdTradingFeatureConfig$CashTradeDetails$Destination implements CfdTradingFeatureConfig.CfdTradingDestination {

    @NotNull
    public static final Parcelable.Creator<CfdTradingFeatureConfig$CashTradeDetails$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f82130a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdTradingFeatureConfig$CashTradeDetails$Destination((b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdTradingFeatureConfig$CashTradeDetails$Destination[i];
        }
    }

    public CfdTradingFeatureConfig$CashTradeDetails$Destination(b trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        this.f82130a = trade;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getF82130a() {
        return this.f82130a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CfdTradingFeatureConfig$CashTradeDetails$Destination) && Intrinsics.f(this.f82130a, ((CfdTradingFeatureConfig$CashTradeDetails$Destination) obj2).f82130a);
    }

    public final int hashCode() {
        return this.f82130a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f82130a);
    }
}
