package com.revolut.feature.retail.savings.api.navigation.feature_config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/api/navigation/feature_config/SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData f83171a;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination((SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData) parcel.readParcelable(SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination[i];
        }
    }

    public SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination(SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f83171a = config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination) && Intrinsics.f(this.f83171a, ((SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination) obj2).f83171a);
    }

    public final int hashCode() {
        return this.f83171a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83171a, i);
    }
}
