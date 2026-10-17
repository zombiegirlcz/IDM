package com.revolut.feature.retail.cfd.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$Settings$Destination", "Lcom/revolut/feature/retail/cfd/api/navigation/CfdTradingFeatureConfig$CfdTradingDestination;", "<init>", "()V", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdTradingFeatureConfig$Settings$Destination implements CfdTradingFeatureConfig.CfdTradingDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CfdTradingFeatureConfig$Settings$Destination f82155a = new CfdTradingFeatureConfig$Settings$Destination();

    @NotNull
    public static final Parcelable.Creator<CfdTradingFeatureConfig$Settings$Destination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CfdTradingFeatureConfig$Settings$Destination.f82155a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdTradingFeatureConfig$Settings$Destination[i];
        }
    }

    private CfdTradingFeatureConfig$Settings$Destination() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
