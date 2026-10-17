package com.revolut.feature.apm.bills.postal_check.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import xo1.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/domain/PostalCheckPaymentMethodDetails;", "Lcom/revolut/feature/apm/bills/core/api/model/BillTransferPaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PostalCheckPaymentMethodDetails implements BillTransferPaymentMethodDetails {

    @NotNull
    public static final Parcelable.Creator<PostalCheckPaymentMethodDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61513c;
    public final Long d;
    public final String e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61514g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PostalCheckPaymentMethodDetails(string, string2, string3, lValueOf, string4, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostalCheckPaymentMethodDetails[i];
        }
    }

    public PostalCheckPaymentMethodDetails(String str, String str2, String str3, Long l2, String str4, Boolean bool, String str5) {
        this.f61511a = str;
        this.f61512b = str2;
        this.f61513c = str3;
        this.d = l2;
        this.e = str4;
        this.f = bool;
        this.f61514g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostalCheckPaymentMethodDetails)) {
            return false;
        }
        PostalCheckPaymentMethodDetails postalCheckPaymentMethodDetails = (PostalCheckPaymentMethodDetails) obj2;
        return Intrinsics.f(this.f61511a, postalCheckPaymentMethodDetails.f61511a) && Intrinsics.f(this.f61512b, postalCheckPaymentMethodDetails.f61512b) && Intrinsics.f(this.f61513c, postalCheckPaymentMethodDetails.f61513c) && Intrinsics.f(this.d, postalCheckPaymentMethodDetails.d) && Intrinsics.f(this.e, postalCheckPaymentMethodDetails.e) && Intrinsics.f(this.f, postalCheckPaymentMethodDetails.f) && Intrinsics.f(this.f61514g, postalCheckPaymentMethodDetails.f61514g);
    }

    public final int hashCode() {
        String str = this.f61511a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61512b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61513c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f61514g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.BillTransferPaymentMethodDetails
    public final k r4() {
        return new gr1.a(this.f61511a, this.f61512b, this.f61513c, this.d, this.e, this.f, this.f61514g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61511a);
        dest.writeString(this.f61512b);
        dest.writeString(this.f61513c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        Boolean bool = this.f;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeString(this.f61514g);
    }
}
