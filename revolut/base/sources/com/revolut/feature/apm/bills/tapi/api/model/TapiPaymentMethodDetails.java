package com.revolut.feature.apm.bills.tapi.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/tapi/api/model/TapiPaymentMethodDetails;", "Lcom/revolut/feature/apm/bills/core/api/model/BillTransferPaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_tapi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TapiPaymentMethodDetails implements BillTransferPaymentMethodDetails {

    @NotNull
    public static final Parcelable.Creator<TapiPaymentMethodDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61536c;
    public final String d;
    public final xo1.a e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TapiPaymentMethodDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : xo1.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TapiPaymentMethodDetails[i];
        }
    }

    public TapiPaymentMethodDetails(String str, String str2, String str3, String str4, xo1.a aVar, String str5) {
        this.f61534a = str;
        this.f61535b = str2;
        this.f61536c = str3;
        this.d = str4;
        this.e = aVar;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TapiPaymentMethodDetails)) {
            return false;
        }
        TapiPaymentMethodDetails tapiPaymentMethodDetails = (TapiPaymentMethodDetails) obj2;
        return Intrinsics.f(this.f61534a, tapiPaymentMethodDetails.f61534a) && Intrinsics.f(this.f61535b, tapiPaymentMethodDetails.f61535b) && Intrinsics.f(this.f61536c, tapiPaymentMethodDetails.f61536c) && Intrinsics.f(this.d, tapiPaymentMethodDetails.d) && this.e == tapiPaymentMethodDetails.e && Intrinsics.f(this.f, tapiPaymentMethodDetails.f);
    }

    public final int hashCode() {
        String str = this.f61534a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61535b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61536c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        xo1.a aVar = this.e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails
    public final k r4() {
        xo1.a aVar = this.e;
        return new pr1.a(this.f61534a, this.f61535b, this.f61536c, this.d, aVar != null ? aVar.name() : null, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61534a);
        dest.writeString(this.f61535b);
        dest.writeString(this.f61536c);
        dest.writeString(this.d);
        xo1.a aVar = this.e;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f);
    }
}
