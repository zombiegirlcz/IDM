package com.revolut.feature.contacts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/ContactFlowFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactFlowFeatureConfig extends KompotBridgeFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<ContactFlowFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ContactFlowConfiguration f65984g;

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/ContactFlowFeatureConfig$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContactFlowConfiguration f65985a;

        /* JADX INFO: loaded from: classes21.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BridgeDestination(ContactFlowConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BridgeDestination[i];
            }
        }

        public BridgeDestination(ContactFlowConfiguration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f65985a = config;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BridgeDestination) && Intrinsics.f(this.f65985a, ((BridgeDestination) obj2).f65985a);
        }

        public final int hashCode() {
            return this.f65985a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65985a.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactFlowFeatureConfig(ContactFlowConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContactFlowFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactFlowFeatureConfig(ContactFlowConfiguration config) {
        super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(config), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(config, "config");
        this.f65984g = config;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ContactFlowFeatureConfig) && Intrinsics.f(this.f65984g, ((ContactFlowFeatureConfig) obj2).f65984g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f65984g.hashCode();
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f65984g.writeToParcel(dest, i);
    }
}
