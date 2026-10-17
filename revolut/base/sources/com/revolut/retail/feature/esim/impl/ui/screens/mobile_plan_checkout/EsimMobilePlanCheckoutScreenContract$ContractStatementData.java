package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_checkout/EsimMobilePlanCheckoutScreenContract$ContractStatementData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanCheckoutScreenContract$ContractStatementData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanCheckoutScreenContract$ContractStatementData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101141c;
    public final long d;
    public final EsimDataPlanOfferInfo e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanCheckoutScreenContract$ContractStatementData(parcel.readLong(), (EsimDataPlanOfferInfo) parcel.readParcelable(EsimMobilePlanCheckoutScreenContract$ContractStatementData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanCheckoutScreenContract$ContractStatementData[i];
        }
    }

    public EsimMobilePlanCheckoutScreenContract$ContractStatementData(long j2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, String mobilePlanId, String str, String contractVersion) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(contractVersion, "contractVersion");
        this.f101139a = mobilePlanId;
        this.f101140b = str;
        this.f101141c = contractVersion;
        this.d = j2;
        this.e = esimDataPlanOfferInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanCheckoutScreenContract$ContractStatementData)) {
            return false;
        }
        EsimMobilePlanCheckoutScreenContract$ContractStatementData esimMobilePlanCheckoutScreenContract$ContractStatementData = (EsimMobilePlanCheckoutScreenContract$ContractStatementData) obj2;
        return Intrinsics.f(this.f101139a, esimMobilePlanCheckoutScreenContract$ContractStatementData.f101139a) && Intrinsics.f(this.f101140b, esimMobilePlanCheckoutScreenContract$ContractStatementData.f101140b) && Intrinsics.f(this.f101141c, esimMobilePlanCheckoutScreenContract$ContractStatementData.f101141c) && this.d == esimMobilePlanCheckoutScreenContract$ContractStatementData.d && Intrinsics.f(this.e, esimMobilePlanCheckoutScreenContract$ContractStatementData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f101139a.hashCode() * 31;
        String str = this.f101140b;
        int iC = d.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f101141c), 31, this.d);
        EsimDataPlanOfferInfo esimDataPlanOfferInfo = this.e;
        return iC + (esimDataPlanOfferInfo != null ? esimDataPlanOfferInfo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101139a);
        dest.writeString(this.f101140b);
        dest.writeString(this.f101141c);
        dest.writeLong(this.d);
        dest.writeParcelable(this.e, i);
    }
}
