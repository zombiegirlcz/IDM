package com.revolut.feature.payment.counterparty.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payment/counterparty/models/PaymentCounterpartyReferenceItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payment_counterparty_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentCounterpartyReferenceItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentCounterpartyReferenceItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79067c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentCounterpartyReferenceItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentCounterpartyReferenceItem[i];
        }
    }

    public PaymentCounterpartyReferenceItem(String name, String label, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f79065a = name;
        this.f79066b = label;
        this.f79067c = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentCounterpartyReferenceItem)) {
            return false;
        }
        PaymentCounterpartyReferenceItem paymentCounterpartyReferenceItem = (PaymentCounterpartyReferenceItem) obj2;
        return Intrinsics.f(this.f79065a, paymentCounterpartyReferenceItem.f79065a) && Intrinsics.f(this.f79066b, paymentCounterpartyReferenceItem.f79066b) && Intrinsics.f(this.f79067c, paymentCounterpartyReferenceItem.f79067c);
    }

    public final int hashCode() {
        return this.f79067c.hashCode() + p.a.c(this.f79065a.hashCode() * 31, 31, this.f79066b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79065a);
        dest.writeString(this.f79066b);
        dest.writeString(this.f79067c);
    }
}
