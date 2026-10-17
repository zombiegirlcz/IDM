package com.revolut.retail.feature.payments.payment_links.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$Details$ByTransferLink", "", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "BridgeDestination", "feature_payments_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentLinksFeatureConfig$Details$ByTransferLink extends KompotBridgeFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<PaymentLinksFeatureConfig$Details$ByTransferLink> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransferLinkDetails f102174g;

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$Details$ByTransferLink$BridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferLinkDetails f102175a;

        /* JADX INFO: loaded from: classes11.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BridgeDestination((TransferLinkDetails) parcel.readParcelable(BridgeDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BridgeDestination[i];
            }
        }

        public BridgeDestination(TransferLinkDetails transferLink) {
            Intrinsics.checkNotNullParameter(transferLink, "transferLink");
            this.f102175a = transferLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BridgeDestination) && Intrinsics.f(this.f102175a, ((BridgeDestination) obj2).f102175a);
        }

        public final int hashCode() {
            return this.f102175a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102175a, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentLinksFeatureConfig$Details$ByTransferLink((TransferLinkDetails) parcel.readParcelable(PaymentLinksFeatureConfig$Details$ByTransferLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentLinksFeatureConfig$Details$ByTransferLink[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLinksFeatureConfig$Details$ByTransferLink(TransferLinkDetails transferLink) {
        super((ActivityAnimation) null, (ParcelableDestination) new BridgeDestination(transferLink), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        this.f102174g = transferLink;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PaymentLinksFeatureConfig$Details$ByTransferLink) && Intrinsics.f(this.f102174g, ((PaymentLinksFeatureConfig$Details$ByTransferLink) obj2).f102174g);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        return this.f102174g.hashCode();
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102174g, i);
    }
}
