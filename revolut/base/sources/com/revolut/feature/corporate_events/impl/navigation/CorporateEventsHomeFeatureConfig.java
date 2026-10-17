package com.revolut.feature.corporate_events.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.corporate_events.impl.ui.flow.home.CorporateEventsHomeFlowContract$Input;
import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/impl/navigation/CorporateEventsHomeFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CorporateEventsHome", "CorporateEventsHomeDestination", "Lcom/revolut/feature/corporate_events/impl/navigation/CorporateEventsHomeFeatureConfig$CorporateEventsHome;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CorporateEventsHomeFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/impl/navigation/CorporateEventsHomeFeatureConfig$CorporateEventsHome;", "Lcom/revolut/feature/corporate_events/impl/navigation/CorporateEventsHomeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CorporateEventsHome extends CorporateEventsHomeFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CorporateEventsFeatureConfig.CorporateEventsConfig f66115g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CorporateEventsHome(CorporateEventsFeatureConfig.CorporateEventsConfig config) {
            super(null, new CorporateEventsHomeDestination(new CorporateEventsHomeFlowContract$Input(config)), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(config, "config");
            this.f66115g = config;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF99934h() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CorporateEventsHome) && Intrinsics.f(this.f66115g, ((CorporateEventsHome) obj2).f66115g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f66115g.hashCode();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/impl/navigation/CorporateEventsHomeFeatureConfig$CorporateEventsHomeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CorporateEventsHomeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CorporateEventsHomeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CorporateEventsHomeFlowContract$Input f66116a;

        /* JADX INFO: loaded from: classes21.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CorporateEventsHomeDestination(CorporateEventsHomeFlowContract$Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CorporateEventsHomeDestination[i];
            }
        }

        public CorporateEventsHomeDestination(CorporateEventsHomeFlowContract$Input input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f66116a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CorporateEventsHomeDestination) && Intrinsics.f(this.f66116a, ((CorporateEventsHomeDestination) obj2).f66116a);
        }

        public final int hashCode() {
            return this.f66116a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66116a.writeToParcel(dest, i);
        }
    }
}
