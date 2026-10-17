package com.revolut.feature.us_send_checks.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/us_send_checks/api/SendChecksFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "AddRecipient", "Lcom/revolut/feature/us_send_checks/api/SendChecksFeatureConfig$AddRecipient;", "feature_retail_us_send_checks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SendChecksFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/us_send_checks/api/SendChecksFeatureConfig$AddRecipient;", "Lcom/revolut/feature/us_send_checks/api/SendChecksFeatureConfig;", "<init>", "()V", "feature_retail_us_send_checks_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddRecipient extends SendChecksFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AddRecipient f94583g = new AddRecipient();

        @NotNull
        public static final Parcelable.Creator<AddRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddRecipient.f94583g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddRecipient[i];
            }
        }

        private AddRecipient() {
            super(null, AddRecipientDestination.f94581a, false, null, 0, 61);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
