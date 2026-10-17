package com.revolut.feature.global_markets.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/global_markets/api/navigation/GlobalMarketsOverviewFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "feature_global_markets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlobalMarketsOverviewFeatureConfig implements FeatureConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GlobalMarketsOverviewFeatureConfig f74567a = new GlobalMarketsOverviewFeatureConfig();

    @NotNull
    public static final Parcelable.Creator<GlobalMarketsOverviewFeatureConfig> CREATOR = new a();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return GlobalMarketsOverviewFeatureConfig.f74567a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GlobalMarketsOverviewFeatureConfig[i];
        }
    }

    private GlobalMarketsOverviewFeatureConfig() {
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
