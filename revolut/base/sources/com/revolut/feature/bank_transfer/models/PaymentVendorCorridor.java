package com.revolut.feature.bank_transfer.models;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_transfer/models/PaymentVendorCorridor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentVendorCorridor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentVendorCorridor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f64082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f64083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64084c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentVendorCorridor((b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentVendorCorridor[i];
        }
    }

    public PaymentVendorCorridor(b country, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f64082a = country;
        this.f64083b = currency;
        this.f64084c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentVendorCorridor)) {
            return false;
        }
        PaymentVendorCorridor paymentVendorCorridor = (PaymentVendorCorridor) obj2;
        return Intrinsics.f(this.f64082a, paymentVendorCorridor.f64082a) && Intrinsics.f(this.f64083b, paymentVendorCorridor.f64083b) && this.f64084c == paymentVendorCorridor.f64084c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64084c) + l.j(this.f64083b, this.f64082a.f297794a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64082a);
        dest.writeSerializable(this.f64083b);
        dest.writeInt(this.f64084c ? 1 : 0);
    }
}
