package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101368c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData[i];
        }
    }

    public EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData(String str, String contractVersion, long j2) {
        Intrinsics.checkNotNullParameter(contractVersion, "contractVersion");
        this.f101366a = str;
        this.f101367b = contractVersion;
        this.f101368c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData)) {
            return false;
        }
        EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData = (EsimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData) obj2;
        return Intrinsics.f(this.f101366a, esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData.f101366a) && Intrinsics.f(this.f101367b, esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData.f101367b) && this.f101368c == esimMobilePlanPhoneNumberCheckoutScreenContract$ContractStatementData.f101368c;
    }

    public final int hashCode() {
        String str = this.f101366a;
        return Long.hashCode(this.f101368c) + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f101367b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101366a);
        dest.writeString(this.f101367b);
        dest.writeLong(this.f101368c);
    }
}
