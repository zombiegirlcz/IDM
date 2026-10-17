package com.revolut.feature.trading_orders.api.ui.details_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/ui/details_pager/InvestOrderDetailsPagerFeatureContract$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOrderDetailsPagerFeatureContract$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InvestOrderDetailsPagerFeatureContract$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderDetailsPagerFeatureContract$InputData f91743a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOrderDetailsPagerFeatureContract$Destination(InvestOrderDetailsPagerFeatureContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderDetailsPagerFeatureContract$Destination[i];
        }
    }

    public InvestOrderDetailsPagerFeatureContract$Destination(InvestOrderDetailsPagerFeatureContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f91743a = inputData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InvestOrderDetailsPagerFeatureContract$InputData getF91743a() {
        return this.f91743a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InvestOrderDetailsPagerFeatureContract$Destination) && Intrinsics.f(this.f91743a, ((InvestOrderDetailsPagerFeatureContract$Destination) obj2).f91743a);
    }

    public final int hashCode() {
        return this.f91743a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91743a.writeToParcel(dest, i);
    }
}
