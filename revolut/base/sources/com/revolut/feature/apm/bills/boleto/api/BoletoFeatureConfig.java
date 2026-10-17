package com.revolut.feature.apm.bills.boleto.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "BoletoPayment", "Destination", "Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig$BoletoPayment;", "feature_apm_bills_boleto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BoletoFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig$BoletoPayment;", "Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_boleto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BoletoPayment extends BoletoFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<BoletoPayment> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final BillSearchBoletoResult f61162g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BoletoPayment((BillSearchBoletoResult) parcel.readParcelable(BoletoPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BoletoPayment[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BoletoPayment(BillSearchBoletoResult decodeResult) {
            super(null, new Destination.BoletoPaymentDestination(decodeResult), false, null, 0, 61);
            Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
            this.f61162g = decodeResult;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BoletoPayment) && Intrinsics.f(this.f61162g, ((BoletoPayment) obj2).f61162g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f61162g.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61162g, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "BoletoPaymentDestination", "Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig$Destination$BoletoPaymentDestination;", "feature_apm_bills_boleto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Destination implements KompotDestination, Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig$Destination$BoletoPaymentDestination;", "Lcom/revolut/feature/apm/bills/boleto/api/BoletoFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_boleto_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BoletoPaymentDestination extends Destination {

            @NotNull
            public static final Parcelable.Creator<BoletoPaymentDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BillSearchBoletoResult f61163a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new BoletoPaymentDestination((BillSearchBoletoResult) parcel.readParcelable(BoletoPaymentDestination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BoletoPaymentDestination[i];
                }
            }

            public BoletoPaymentDestination(BillSearchBoletoResult decodeResult) {
                Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
                this.f61163a = decodeResult;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof BoletoPaymentDestination) && Intrinsics.f(this.f61163a, ((BoletoPaymentDestination) obj2).f61163a);
            }

            public final int hashCode() {
                return this.f61163a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f61163a, i);
            }
        }

        private Destination() {
        }
    }
}
