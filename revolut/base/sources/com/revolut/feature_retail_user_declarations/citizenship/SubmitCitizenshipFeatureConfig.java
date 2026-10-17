package com.revolut.feature_retail_user_declarations.citizenship;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/citizenship/SubmitCitizenshipFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubmitCitizenshipFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<SubmitCitizenshipFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SubmitCitizenshipFlowInputData f97495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f97496h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubmitCitizenshipFeatureConfig(SubmitCitizenshipFlowInputData.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmitCitizenshipFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCitizenshipFeatureConfig(SubmitCitizenshipFlowInputData configuration, int i) {
        super((ActivityAnimation) null, (ParcelableDestination) new SubmitCitizenshipDestination(configuration), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f97495g = configuration;
        this.f97496h = i;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c */
    public final Integer getF89982h() {
        return Integer.valueOf(this.f97496h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubmitCitizenshipFeatureConfig)) {
            return false;
        }
        SubmitCitizenshipFeatureConfig submitCitizenshipFeatureConfig = (SubmitCitizenshipFeatureConfig) obj2;
        return Intrinsics.f(this.f97495g, submitCitizenshipFeatureConfig.f97495g) && this.f97496h == submitCitizenshipFeatureConfig.f97496h;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return Integer.hashCode(this.f97496h) + (this.f97495g.hashCode() * 31);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97495g.writeToParcel(dest, i);
        dest.writeInt(this.f97496h);
    }
}
