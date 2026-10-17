package com.revolut.feature.shops.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/shops/api/config/ShopsFeatureConfig$NotificationsConsent$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsFeatureConfig$NotificationsConsent$Destination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ShopsFeatureConfig$NotificationsConsent$Destination f86992a = new ShopsFeatureConfig$NotificationsConsent$Destination();

    @NotNull
    public static final Parcelable.Creator<ShopsFeatureConfig$NotificationsConsent$Destination> CREATOR = new a();

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ShopsFeatureConfig$NotificationsConsent$Destination.f86992a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsFeatureConfig$NotificationsConsent$Destination[i];
        }
    }

    private ShopsFeatureConfig$NotificationsConsent$Destination() {
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
