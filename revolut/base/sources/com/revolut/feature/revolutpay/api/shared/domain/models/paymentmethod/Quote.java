package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/Quote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Rate", "Charges", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Quote implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rate f84398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f84399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f84400c;
    public final Charges d;

    @NotNull
    public static final Parcelable.Creator<Quote> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/Quote$Charges;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Charges implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f84401a;

        @NotNull
        public static final Parcelable.Creator<Charges> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Charges((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Charges[i];
            }
        }

        public Charges(dj0.d total) {
            Intrinsics.checkNotNullParameter(total, "total");
            this.f84401a = total;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Charges) && Intrinsics.f(this.f84401a, ((Charges) obj2).f84401a);
        }

        public final int hashCode() {
            return this.f84401a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f84401a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/Quote$Rate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rate implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f84402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f84403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f84404c;

        @NotNull
        public static final Parcelable.Creator<Rate> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rate(parcel.readDouble(), (xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rate[i];
            }
        }

        public Rate(double d, xi0.b from, xi0.b to6) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            this.f84402a = d;
            this.f84403b = from;
            this.f84404c = to6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Rate)) {
                return false;
            }
            Rate rate = (Rate) obj2;
            return Double.compare(this.f84402a, rate.f84402a) == 0 && Intrinsics.f(this.f84403b, rate.f84403b) && Intrinsics.f(this.f84404c, rate.f84404c);
        }

        public final int hashCode() {
            return this.f84404c.hashCode() + h30.l.j(this.f84403b, Double.hashCode(this.f84402a) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f84402a);
            dest.writeSerializable(this.f84403b);
            dest.writeSerializable(this.f84404c);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Quote(Rate.CREATOR.createFromParcel(parcel), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Charges.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Quote[i];
        }
    }

    public Quote(Rate rate, dj0.d billAmount, dj0.d billAmountWithCharges, Charges charges) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        Intrinsics.checkNotNullParameter(billAmountWithCharges, "billAmountWithCharges");
        this.f84398a = rate;
        this.f84399b = billAmount;
        this.f84400c = billAmountWithCharges;
        this.d = charges;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Quote)) {
            return false;
        }
        Quote quote = (Quote) obj2;
        return Intrinsics.f(this.f84398a, quote.f84398a) && Intrinsics.f(this.f84399b, quote.f84399b) && Intrinsics.f(this.f84400c, quote.f84400c) && Intrinsics.f(this.d, quote.d);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f84398a.hashCode() * 31, 31, this.f84399b), 31, this.f84400c);
        Charges charges = this.d;
        return iC + (charges == null ? 0 : charges.f84401a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84398a.writeToParcel(dest, i);
        dest.writeSerializable(this.f84399b);
        dest.writeSerializable(this.f84400c);
        Charges charges = this.d;
        if (charges == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            charges.writeToParcel(dest, i);
        }
    }
}
