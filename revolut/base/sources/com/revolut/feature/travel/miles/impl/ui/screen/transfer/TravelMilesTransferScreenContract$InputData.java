package com.revolut.feature.travel.miles.impl.ui.screen.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/transfer/TravelMilesTransferScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesTransferScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesTransferScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesAccountV2 f94384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94385c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesTransferScreenContract$InputData(parcel.readString(), (TravelMilesAccountV2) parcel.readParcelable(TravelMilesTransferScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesTransferScreenContract$InputData[i];
        }
    }

    public TravelMilesTransferScreenContract$InputData(String accountId, TravelMilesAccountV2 travelMilesAccountV2, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f94383a = accountId;
        this.f94384b = travelMilesAccountV2;
        this.f94385c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesTransferScreenContract$InputData)) {
            return false;
        }
        TravelMilesTransferScreenContract$InputData travelMilesTransferScreenContract$InputData = (TravelMilesTransferScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94383a, travelMilesTransferScreenContract$InputData.f94383a) && Intrinsics.f(this.f94384b, travelMilesTransferScreenContract$InputData.f94384b) && Intrinsics.f(this.f94385c, travelMilesTransferScreenContract$InputData.f94385c);
    }

    public final int hashCode() {
        int iHashCode = this.f94383a.hashCode() * 31;
        TravelMilesAccountV2 travelMilesAccountV2 = this.f94384b;
        int iHashCode2 = (iHashCode + (travelMilesAccountV2 == null ? 0 : travelMilesAccountV2.hashCode())) * 31;
        String str = this.f94385c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94383a);
        dest.writeParcelable(this.f94384b, i);
        dest.writeString(this.f94385c);
    }
}
