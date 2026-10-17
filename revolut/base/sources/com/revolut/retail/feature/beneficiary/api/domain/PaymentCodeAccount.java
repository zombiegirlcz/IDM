package com.revolut.retail.feature.beneficiary.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/api/domain/PaymentCodeAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentCodeAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentCodeAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99613b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentCodeAccount(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentCodeAccount[i];
        }
    }

    public PaymentCodeAccount(String accountNumber, String bic2) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(bic2, "bic");
        this.f99612a = accountNumber;
        this.f99613b = bic2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentCodeAccount)) {
            return false;
        }
        PaymentCodeAccount paymentCodeAccount = (PaymentCodeAccount) obj2;
        return Intrinsics.f(this.f99612a, paymentCodeAccount.f99612a) && Intrinsics.f(this.f99613b, paymentCodeAccount.f99613b);
    }

    public final int hashCode() {
        return this.f99613b.hashCode() + (this.f99612a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99612a);
        dest.writeString(this.f99613b);
    }
}
