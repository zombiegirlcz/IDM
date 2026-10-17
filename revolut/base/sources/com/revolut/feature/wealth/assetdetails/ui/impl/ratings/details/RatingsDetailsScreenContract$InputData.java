package com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/assetdetails/ui/impl/ratings/details/RatingsDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RatingsDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RatingsDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdh.a f95436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f95437b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RatingsDetailsScreenContract$InputData(wdh.a.valueOf(parcel.readString()), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RatingsDetailsScreenContract$InputData[i];
        }
    }

    public RatingsDetailsScreenContract$InputData(wdh.a ratingsProvider, n instrument) {
        Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f95436a = ratingsProvider;
        this.f95437b = instrument;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RatingsDetailsScreenContract$InputData)) {
            return false;
        }
        RatingsDetailsScreenContract$InputData ratingsDetailsScreenContract$InputData = (RatingsDetailsScreenContract$InputData) obj2;
        return this.f95436a == ratingsDetailsScreenContract$InputData.f95436a && Intrinsics.f(this.f95437b, ratingsDetailsScreenContract$InputData.f95437b);
    }

    public final int hashCode() {
        return this.f95437b.hashCode() + (this.f95436a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95436a.name());
        dest.writeSerializable(this.f95437b);
    }
}
