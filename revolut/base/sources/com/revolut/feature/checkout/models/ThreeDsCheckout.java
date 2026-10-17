package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/ThreeDsCheckout;", "Lcom/revolut/feature/checkout/models/CheckoutConfig;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreeDsCheckout implements CheckoutConfig {

    @NotNull
    public static final Parcelable.Creator<ThreeDsCheckout> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f65882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f65883c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThreeDsCheckout((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThreeDsCheckout[i];
        }
    }

    public ThreeDsCheckout(d transactionAmount, d originalAmount, String merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        this.f65881a = merchant;
        this.f65882b = transactionAmount;
        this.f65883c = originalAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThreeDsCheckout)) {
            return false;
        }
        ThreeDsCheckout threeDsCheckout = (ThreeDsCheckout) obj2;
        return Intrinsics.f(this.f65881a, threeDsCheckout.f65881a) && Intrinsics.f(this.f65882b, threeDsCheckout.f65882b) && Intrinsics.f(this.f65883c, threeDsCheckout.f65883c);
    }

    public final int hashCode() {
        return this.f65883c.hashCode() + v7.c(this.f65881a.hashCode() * 31, 31, this.f65882b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65881a);
        dest.writeSerializable(this.f65882b);
        dest.writeSerializable(this.f65883c);
    }
}
