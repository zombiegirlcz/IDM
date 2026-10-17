package com.revolut.feature.trading_orders.api.investment_plan.projection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/investment_plan/projection/InvestmentProjectionsContract$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestmentProjectionsContract$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InvestmentProjectionsContract$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestmentProjectionsContract$InputData f91735a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestmentProjectionsContract$Destination(InvestmentProjectionsContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestmentProjectionsContract$Destination[i];
        }
    }

    public InvestmentProjectionsContract$Destination(InvestmentProjectionsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f91735a = inputData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InvestmentProjectionsContract$InputData getF91735a() {
        return this.f91735a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InvestmentProjectionsContract$Destination) && Intrinsics.f(this.f91735a, ((InvestmentProjectionsContract$Destination) obj2).f91735a);
    }

    public final int hashCode() {
        return this.f91735a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91735a.writeToParcel(dest, i);
    }
}
