package com.revolut.feature.subscriptions.impl.payment_balance_picker;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerInputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "sae/a", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentBalancePickerInputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentBalancePickerInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sae.a f89222c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentBalancePickerInputData(parcel.readString(), parcel.readString(), sae.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentBalancePickerInputData[i];
        }
    }

    public PaymentBalancePickerInputData(String str, String paymentId, sae.a type) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f89220a = str;
        this.f89221b = paymentId;
        this.f89222c = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentBalancePickerInputData)) {
            return false;
        }
        PaymentBalancePickerInputData paymentBalancePickerInputData = (PaymentBalancePickerInputData) obj2;
        return Intrinsics.f(this.f89220a, paymentBalancePickerInputData.f89220a) && Intrinsics.f(this.f89221b, paymentBalancePickerInputData.f89221b) && this.f89222c == paymentBalancePickerInputData.f89222c;
    }

    public final int hashCode() {
        String str = this.f89220a;
        return this.f89222c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f89221b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89220a);
        dest.writeString(this.f89221b);
        dest.writeString(this.f89222c.name());
    }
}
