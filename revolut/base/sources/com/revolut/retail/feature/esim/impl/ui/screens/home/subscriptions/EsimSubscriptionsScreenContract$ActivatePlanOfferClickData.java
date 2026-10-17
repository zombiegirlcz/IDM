package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ActivatePlanOfferClickData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionsScreenContract$ActivatePlanOfferClickData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionsScreenContract$ActivatePlanOfferClickData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimDataPlanOfferInfo f101025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimContractMetadata f101026c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionsScreenContract$ActivatePlanOfferClickData(parcel.readString(), (EsimDataPlanOfferInfo) parcel.readParcelable(EsimSubscriptionsScreenContract$ActivatePlanOfferClickData.class.getClassLoader()), (EsimContractMetadata) parcel.readParcelable(EsimSubscriptionsScreenContract$ActivatePlanOfferClickData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionsScreenContract$ActivatePlanOfferClickData[i];
        }
    }

    public EsimSubscriptionsScreenContract$ActivatePlanOfferClickData(String dataPlanId, EsimDataPlanOfferInfo planOfferInfo, EsimContractMetadata contractMetadata) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        Intrinsics.checkNotNullParameter(planOfferInfo, "planOfferInfo");
        Intrinsics.checkNotNullParameter(contractMetadata, "contractMetadata");
        this.f101024a = dataPlanId;
        this.f101025b = planOfferInfo;
        this.f101026c = contractMetadata;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionsScreenContract$ActivatePlanOfferClickData)) {
            return false;
        }
        EsimSubscriptionsScreenContract$ActivatePlanOfferClickData esimSubscriptionsScreenContract$ActivatePlanOfferClickData = (EsimSubscriptionsScreenContract$ActivatePlanOfferClickData) obj2;
        return Intrinsics.f(this.f101024a, esimSubscriptionsScreenContract$ActivatePlanOfferClickData.f101024a) && Intrinsics.f(this.f101025b, esimSubscriptionsScreenContract$ActivatePlanOfferClickData.f101025b) && Intrinsics.f(this.f101026c, esimSubscriptionsScreenContract$ActivatePlanOfferClickData.f101026c);
    }

    public final int hashCode() {
        return this.f101026c.hashCode() + ((this.f101025b.hashCode() + (this.f101024a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101024a);
        dest.writeParcelable(this.f101025b, i);
        dest.writeParcelable(this.f101026c, i);
    }
}
