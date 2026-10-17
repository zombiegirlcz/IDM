package com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m02.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/helpers/models/PaymentData;", "Landroid/os/Parcelable;", "Lm02/b;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentData implements Parcelable, b {

    @NotNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f78793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f78795c;
    public final AccountId d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            FundingSource fundingSource = (FundingSource) parcel.readParcelable(PaymentData.class.getClassLoader());
            long j2 = parcel.readLong();
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            AccountId accountId = (AccountId) parcel.readParcelable(PaymentData.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new PaymentData(fundingSource, j2, bVar, accountId, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentData[i];
        }
    }

    public PaymentData(FundingSource fundingSource, long j2, xi0.b targetCurrency, AccountId accountId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f78793a = fundingSource;
        this.f78794b = j2;
        this.f78795c = targetCurrency;
        this.d = accountId;
        this.e = z;
        this.f = z3;
    }

    public static PaymentData e(PaymentData paymentData, FundingSource fundingSource, long j2, xi0.b bVar, AccountId accountId, int i) {
        if ((i & 1) != 0) {
            fundingSource = paymentData.f78793a;
        }
        FundingSource fundingSource2 = fundingSource;
        if ((i & 2) != 0) {
            j2 = paymentData.f78794b;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            bVar = paymentData.f78795c;
        }
        xi0.b targetCurrency = bVar;
        if ((i & 8) != 0) {
            accountId = paymentData.d;
        }
        AccountId accountId2 = accountId;
        boolean z = paymentData.e;
        boolean z3 = paymentData.f;
        paymentData.getClass();
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        return new PaymentData(fundingSource2, j3, targetCurrency, accountId2, z, z3);
    }

    @Override // m02.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FundingSource getF78793a() {
        return this.f78793a;
    }

    @Override // m02.b
    public final xi0.b b() {
        return this.f78793a.f92241b;
    }

    @Override // m02.b
    public final d c() {
        return new d(this.f78794b, this.f78795c);
    }

    @Override // m02.b
    public final boolean d() {
        return !Intrinsics.f(this.f78795c, this.f78793a.f92241b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentData)) {
            return false;
        }
        PaymentData paymentData = (PaymentData) obj2;
        return Intrinsics.f(this.f78793a, paymentData.f78793a) && this.f78794b == paymentData.f78794b && Intrinsics.f(this.f78795c, paymentData.f78795c) && Intrinsics.f(this.d, paymentData.d) && this.e == paymentData.e && this.f == paymentData.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(l.b(this.d, l.j(this.f78795c, a0.d.c(this.f78793a.hashCode() * 31, 31, this.f78794b), 31), 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78793a, i);
        dest.writeLong(this.f78794b);
        dest.writeSerializable(this.f78795c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
