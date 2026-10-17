package com.revolut.feature.revolutpay.api.shared.domain.models.ramp;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/ramp/RampOrderDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Recipient", "ExchangeRate", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RampOrderDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RampOrderDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f84410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f84412c;
    public final Recipient d;
    public final wk5.a e;
    public final ExchangeRate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f84413g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/ramp/RampOrderDetails$ExchangeRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExchangeRate implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ExchangeRate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f84414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f84415b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExchangeRate(parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExchangeRate[i];
            }
        }

        public ExchangeRate(long j2, long j3) {
            this.f84414a = j2;
            this.f84415b = j3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExchangeRate)) {
                return false;
            }
            ExchangeRate exchangeRate = (ExchangeRate) obj2;
            return this.f84414a == exchangeRate.f84414a && this.f84415b == exchangeRate.f84415b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f84415b) + (Long.hashCode(this.f84414a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f84414a);
            dest.writeLong(this.f84415b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/ramp/RampOrderDetails$Recipient;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Recipient implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Recipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84417b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recipient(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Recipient[i];
            }
        }

        public Recipient(String name, String address) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(address, "address");
            this.f84416a = name;
            this.f84417b = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Recipient)) {
                return false;
            }
            Recipient recipient = (Recipient) obj2;
            return Intrinsics.f(this.f84416a, recipient.f84416a) && Intrinsics.f(this.f84417b, recipient.f84417b);
        }

        public final int hashCode() {
            return this.f84417b.hashCode() + (this.f84416a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84416a);
            dest.writeString(this.f84417b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RampOrderDetails((d) parcel.readSerializable(), parcel.readLong(), parcel.readLong(), Recipient.CREATOR.createFromParcel(parcel), wk5.a.valueOf(parcel.readString()), ExchangeRate.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RampOrderDetails[i];
        }
    }

    public RampOrderDetails(d cryptoAmount, long j2, long j3, Recipient recipient, wk5.a network, ExchangeRate exchangeRate, boolean z) {
        Intrinsics.checkNotNullParameter(cryptoAmount, "cryptoAmount");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        this.f84410a = cryptoAmount;
        this.f84411b = j2;
        this.f84412c = j3;
        this.d = recipient;
        this.e = network;
        this.f = exchangeRate;
        this.f84413g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RampOrderDetails)) {
            return false;
        }
        RampOrderDetails rampOrderDetails = (RampOrderDetails) obj2;
        return Intrinsics.f(this.f84410a, rampOrderDetails.f84410a) && this.f84411b == rampOrderDetails.f84411b && this.f84412c == rampOrderDetails.f84412c && Intrinsics.f(this.d, rampOrderDetails.d) && this.e == rampOrderDetails.e && Intrinsics.f(this.f, rampOrderDetails.f) && this.f84413g == rampOrderDetails.f84413g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84413g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + a0.d.c(a0.d.c(this.f84410a.hashCode() * 31, 31, this.f84411b), 31, this.f84412c)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f84410a);
        dest.writeLong(this.f84411b);
        dest.writeLong(this.f84412c);
        this.d.writeToParcel(dest, i);
        dest.writeString(this.e.name());
        this.f.writeToParcel(dest, i);
        dest.writeInt(this.f84413g ? 1 : 0);
    }
}
