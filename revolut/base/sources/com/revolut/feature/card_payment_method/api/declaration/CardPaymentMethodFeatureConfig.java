package com.revolut.feature.card_payment_method.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import grl.b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_payment_method/api/declaration/CardPaymentMethodFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "SelectPaymentMethod", "Lcom/revolut/feature/card_payment_method/api/declaration/CardPaymentMethodFeatureConfig$SelectPaymentMethod;", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardPaymentMethodFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/api/declaration/CardPaymentMethodFeatureConfig$SelectPaymentMethod;", "Lcom/revolut/feature/card_payment_method/api/declaration/CardPaymentMethodFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectPaymentMethod extends CardPaymentMethodFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SelectPaymentMethod> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SelectPaymentMethodInputData f65237g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectPaymentMethod(SelectPaymentMethodInputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPaymentMethod[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentMethod(SelectPaymentMethodInputData inputData) {
            super(null, new SelectPaymentMethodNavigationDestination(inputData), false, Integer.valueOf(b4.EXPIRED_OR_INVALID_KEY_VALUE), 0, 53);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f65237g = inputData;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectPaymentMethod) && Intrinsics.f(this.f65237g, ((SelectPaymentMethod) obj2).f65237g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f65237g.f65244a.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65237g.writeToParcel(dest, i);
        }
    }
}
