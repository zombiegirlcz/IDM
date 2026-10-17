package com.revolut.feature.pay_with_smile.api.domain.model;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_with_smile/api/domain/model/PaymentConfirmationChallenge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pay_with_smile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentConfirmationChallenge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentConfirmationChallenge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78952c;
    public final String d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f78954h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f78955j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentConfirmationChallenge(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentConfirmationChallenge[i];
        }
    }

    public PaymentConfirmationChallenge(String attemptId, String merchantTradingName, long j2, String currency, long j3, long j5, String deviceName, String deviceLocationAddress, String clientName, String clientIconUri) {
        Intrinsics.checkNotNullParameter(attemptId, "attemptId");
        Intrinsics.checkNotNullParameter(merchantTradingName, "merchantTradingName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceLocationAddress, "deviceLocationAddress");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(clientIconUri, "clientIconUri");
        this.f78950a = attemptId;
        this.f78951b = merchantTradingName;
        this.f78952c = j2;
        this.d = currency;
        this.e = j3;
        this.f = j5;
        this.f78953g = deviceName;
        this.f78954h = deviceLocationAddress;
        this.i = clientName;
        this.f78955j = clientIconUri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentConfirmationChallenge)) {
            return false;
        }
        PaymentConfirmationChallenge paymentConfirmationChallenge = (PaymentConfirmationChallenge) obj2;
        return Intrinsics.f(this.f78950a, paymentConfirmationChallenge.f78950a) && Intrinsics.f(this.f78951b, paymentConfirmationChallenge.f78951b) && this.f78952c == paymentConfirmationChallenge.f78952c && Intrinsics.f(this.d, paymentConfirmationChallenge.d) && this.e == paymentConfirmationChallenge.e && this.f == paymentConfirmationChallenge.f && Intrinsics.f(this.f78953g, paymentConfirmationChallenge.f78953g) && Intrinsics.f(this.f78954h, paymentConfirmationChallenge.f78954h) && Intrinsics.f(this.i, paymentConfirmationChallenge.i) && Intrinsics.f(this.f78955j, paymentConfirmationChallenge.f78955j);
    }

    public final int hashCode() {
        return this.f78955j.hashCode() + p.a.c(p.a.c(p.a.c(d.c(d.c(p.a.c(d.c(p.a.c(this.f78950a.hashCode() * 31, 31, this.f78951b), 31, this.f78952c), 31, this.d), 31, this.e), 31, this.f), 31, this.f78953g), 31, this.f78954h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78950a);
        dest.writeString(this.f78951b);
        dest.writeLong(this.f78952c);
        dest.writeString(this.d);
        dest.writeLong(this.e);
        dest.writeLong(this.f);
        dest.writeString(this.f78953g);
        dest.writeString(this.f78954h);
        dest.writeString(this.i);
        dest.writeString(this.f78955j);
    }
}
