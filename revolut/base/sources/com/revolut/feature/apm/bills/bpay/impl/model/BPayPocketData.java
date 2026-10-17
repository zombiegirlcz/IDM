package com.revolut.feature.apm.bills.bpay.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/model/BPayPocketData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayPocketData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BPayPocketData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f61215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentPocketInfo f61216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f61217c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            return new BPayPocketData((AccountId) parcel.readParcelable(BPayPocketData.class.getClassLoader()), (PaymentPocketInfo) parcel.readParcelable(BPayPocketData.class.getClassLoader()), dVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayPocketData[i];
        }
    }

    public BPayPocketData(AccountId accountId, PaymentPocketInfo paymentPocketInfo, d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(paymentPocketInfo, "paymentPocketInfo");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f61215a = pocket;
        this.f61216b = paymentPocketInfo;
        this.f61217c = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayPocketData)) {
            return false;
        }
        BPayPocketData bPayPocketData = (BPayPocketData) obj2;
        return Intrinsics.f(this.f61215a, bPayPocketData.f61215a) && Intrinsics.f(this.f61216b, bPayPocketData.f61216b) && Intrinsics.f(this.f61217c, bPayPocketData.f61217c);
    }

    public final int hashCode() {
        return this.f61217c.hashCode() + ((this.f61216b.hashCode() + (this.f61215a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f61215a);
        dest.writeParcelable(this.f61216b, i);
        dest.writeParcelable(this.f61217c, i);
    }
}
