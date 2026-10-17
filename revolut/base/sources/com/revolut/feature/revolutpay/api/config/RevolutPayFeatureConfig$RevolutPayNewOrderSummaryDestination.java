package com.revolut.feature.revolutpay.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/revolutpay/api/config/RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayOrderSummaryContract$InputData f84291a;

    @NotNull
    public static final Parcelable.Creator<RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination((RevolutPayOrderSummaryContract$InputData) parcel.readParcelable(RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination[i];
        }
    }

    public RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination(RevolutPayOrderSummaryContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f84291a = inputData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RevolutPayOrderSummaryContract$InputData getF84291a() {
        return this.f84291a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination) && Intrinsics.f(this.f84291a, ((RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination) obj2).f84291a);
    }

    public final int hashCode() {
        return this.f84291a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84291a, i);
    }
}
