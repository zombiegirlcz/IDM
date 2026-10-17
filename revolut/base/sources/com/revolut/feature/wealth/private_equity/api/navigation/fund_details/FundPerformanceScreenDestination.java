package com.revolut.feature.wealth.private_equity.api.navigation.fund_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/api/navigation/fund_details/FundPerformanceScreenDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FundPerformanceScreenDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<FundPerformanceScreenDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f95730b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FundPerformanceScreenDestination(parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FundPerformanceScreenDestination[i];
        }
    }

    public FundPerformanceScreenDestination(String ref2, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f95729a = ref2;
        this.f95730b = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FundPerformanceScreenDestination)) {
            return false;
        }
        FundPerformanceScreenDestination fundPerformanceScreenDestination = (FundPerformanceScreenDestination) obj2;
        return Intrinsics.f(this.f95729a, fundPerformanceScreenDestination.f95729a) && Intrinsics.f(this.f95730b, fundPerformanceScreenDestination.f95730b);
    }

    public final int hashCode() {
        int iHashCode = this.f95729a.hashCode() * 31;
        LocalDate localDate = this.f95730b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95729a);
        dest.writeSerializable(this.f95730b);
    }
}
