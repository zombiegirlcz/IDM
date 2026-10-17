package com.revolut.feature.payment.counterparty.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payment/counterparty/models/PaymentCounterpartySettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payment_counterparty_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentCounterpartySettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentCounterpartySettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79070c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentCounterpartySettings(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentCounterpartySettings[i];
        }
    }

    public PaymentCounterpartySettings(boolean z, boolean z3, boolean z4) {
        this.f79068a = z;
        this.f79069b = z3;
        this.f79070c = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentCounterpartySettings)) {
            return false;
        }
        PaymentCounterpartySettings paymentCounterpartySettings = (PaymentCounterpartySettings) obj2;
        return this.f79068a == paymentCounterpartySettings.f79068a && this.f79069b == paymentCounterpartySettings.f79069b && this.f79070c == paymentCounterpartySettings.f79070c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79070c) + j6.a.c(Boolean.hashCode(this.f79068a) * 31, 31, this.f79069b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f79068a ? 1 : 0);
        dest.writeInt(this.f79069b ? 1 : 0);
        dest.writeInt(this.f79070c ? 1 : 0);
    }
}
