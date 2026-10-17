package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ds6.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubPaymentFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubPaymentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f74311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f74313c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubPaymentFlowContract$InputData((wi0.b) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : j.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubPaymentFlowContract$InputData[i];
        }
    }

    public TaxHubPaymentFlowContract$InputData(wi0.b countryCode, String str, j jVar) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f74311a = countryCode;
        this.f74312b = str;
        this.f74313c = jVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubPaymentFlowContract$InputData)) {
            return false;
        }
        TaxHubPaymentFlowContract$InputData taxHubPaymentFlowContract$InputData = (TaxHubPaymentFlowContract$InputData) obj2;
        return Intrinsics.f(this.f74311a, taxHubPaymentFlowContract$InputData.f74311a) && Intrinsics.f(this.f74312b, taxHubPaymentFlowContract$InputData.f74312b) && this.f74313c == taxHubPaymentFlowContract$InputData.f74313c;
    }

    public final int hashCode() {
        int iHashCode = this.f74311a.f297794a.hashCode() * 31;
        String str = this.f74312b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f74313c;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74311a);
        dest.writeString(this.f74312b);
        j jVar = this.f74313c;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
    }
}
