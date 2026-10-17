package com.revolut.feature.revolutpay.api.shared.domain.models.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment/SplitBillPaymentParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillPaymentParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SplitBillPaymentParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f84346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84347c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillPaymentParams(parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillPaymentParams[i];
        }
    }

    public SplitBillPaymentParams(String idempotencyKey, long j2, Long l2) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f84345a = j2;
        this.f84346b = l2;
        this.f84347c = idempotencyKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillPaymentParams)) {
            return false;
        }
        SplitBillPaymentParams splitBillPaymentParams = (SplitBillPaymentParams) obj2;
        return this.f84345a == splitBillPaymentParams.f84345a && Intrinsics.f(this.f84346b, splitBillPaymentParams.f84346b) && Intrinsics.f(this.f84347c, splitBillPaymentParams.f84347c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f84345a) * 31;
        Long l2 = this.f84346b;
        return this.f84347c.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f84345a);
        Long l2 = this.f84346b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.f84347c);
    }
}
