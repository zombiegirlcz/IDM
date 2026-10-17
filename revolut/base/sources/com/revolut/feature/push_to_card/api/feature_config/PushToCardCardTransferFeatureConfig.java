package com.revolut.feature.push_to_card.api.feature_config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/feature_config/PushToCardCardTransferFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushToCardCardTransferFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<PushToCardCardTransferFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardOwner f81499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f81500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferMoneyPocket f81501c;
    public final FlowExtras d;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PushToCardCardTransferFeatureConfig((CardOwner) parcel.readParcelable(PushToCardCardTransferFeatureConfig.class.getClassLoader()), (TransferFlowType) parcel.readParcelable(PushToCardCardTransferFeatureConfig.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(PushToCardCardTransferFeatureConfig.class.getClassLoader()), (FlowExtras) parcel.readParcelable(PushToCardCardTransferFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushToCardCardTransferFeatureConfig[i];
        }
    }

    public PushToCardCardTransferFeatureConfig(CardOwner cardOwner, TransferFlowType transferFlowType, TransferMoneyPocket transferMoneyPocket, FlowExtras flowExtras) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f81499a = cardOwner;
        this.f81500b = transferFlowType;
        this.f81501c = transferMoneyPocket;
        this.d = flowExtras;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PushToCardCardTransferFeatureConfig)) {
            return false;
        }
        PushToCardCardTransferFeatureConfig pushToCardCardTransferFeatureConfig = (PushToCardCardTransferFeatureConfig) obj2;
        return Intrinsics.f(this.f81499a, pushToCardCardTransferFeatureConfig.f81499a) && Intrinsics.f(this.f81500b, pushToCardCardTransferFeatureConfig.f81500b) && Intrinsics.f(this.f81501c, pushToCardCardTransferFeatureConfig.f81501c) && Intrinsics.f(this.d, pushToCardCardTransferFeatureConfig.d);
    }

    public final int hashCode() {
        int iHashCode = this.f81499a.hashCode() * 31;
        TransferFlowType transferFlowType = this.f81500b;
        int iHashCode2 = (iHashCode + (transferFlowType == null ? 0 : transferFlowType.hashCode())) * 31;
        TransferMoneyPocket transferMoneyPocket = this.f81501c;
        int iHashCode3 = (iHashCode2 + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31;
        FlowExtras flowExtras = this.d;
        return iHashCode3 + (flowExtras != null ? flowExtras.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81499a, i);
        dest.writeParcelable(this.f81500b, i);
        dest.writeParcelable(this.f81501c, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ PushToCardCardTransferFeatureConfig(CardOwner cardOwner, TransferFlowType transferFlowType, TransferMoneyPocket transferMoneyPocket, FlowExtras flowExtras, int i) {
        this(cardOwner, (i & 2) != 0 ? null : transferFlowType, (i & 4) != 0 ? null : transferMoneyPocket, (i & 8) != 0 ? null : flowExtras);
    }
}
