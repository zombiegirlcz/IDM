package com.revolut.feature.account_switching.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/account_switching/api/navigation/AccountSwitchingFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AccountSwitchingFlowDestination", "retail_feature_account_switching_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountSwitchingFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f60558g;

    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/account_switching/api/navigation/AccountSwitchingFeatureConfig$AccountSwitchingFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_account_switching_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountSwitchingFlowDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountSwitchingFlowDestination f60559a = new AccountSwitchingFlowDestination();

        @NotNull
        public static final Parcelable.Creator<AccountSwitchingFlowDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes20.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountSwitchingFlowDestination.f60559a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountSwitchingFlowDestination[i];
            }
        }

        private AccountSwitchingFlowDestination() {
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

    public AccountSwitchingFeatureConfig() {
        this(0);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF60558g() {
        return this.f60558g;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AccountSwitchingFeatureConfig) && this.f60558g == ((AccountSwitchingFeatureConfig) obj2).f60558g;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return Integer.hashCode(this.f60558g);
    }

    public AccountSwitchingFeatureConfig(int i) {
        super((ActivityAnimation) null, (ParcelableDestination) AccountSwitchingFlowDestination.f60559a, false, (Integer) null, 0, 61);
        this.f60558g = i;
    }
}
