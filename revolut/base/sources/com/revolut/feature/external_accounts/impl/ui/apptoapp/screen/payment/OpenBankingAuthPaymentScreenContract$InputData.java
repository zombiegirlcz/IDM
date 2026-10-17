package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OpenBankingAuthPaymentScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingAuthPaymentScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenBankingAuthPaymentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OpenBankingPayment f72530b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenBankingAuthPaymentScreenContract$InputData(parcel.readString(), (OpenBankingPayment) parcel.readParcelable(OpenBankingAuthPaymentScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingAuthPaymentScreenContract$InputData[i];
        }
    }

    public OpenBankingAuthPaymentScreenContract$InputData(String clientId, OpenBankingPayment payment) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f72529a = clientId;
        this.f72530b = payment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingAuthPaymentScreenContract$InputData)) {
            return false;
        }
        OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData = (OpenBankingAuthPaymentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f72529a, openBankingAuthPaymentScreenContract$InputData.f72529a) && Intrinsics.f(this.f72530b, openBankingAuthPaymentScreenContract$InputData.f72530b);
    }

    public final int hashCode() {
        return this.f72530b.hashCode() + (this.f72529a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72529a);
        dest.writeParcelable(this.f72530b, i);
    }
}
