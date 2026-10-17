package com.revolut.feature.revolutpay.api.shared.domain.models.payment_options;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment_options/PayLaterOffer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "t6c/b", "Instalment", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayLaterOffer implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6c.b f84354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84355c;
    public final d d;
    public final Double e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f84356g;

    @NotNull
    public static final Parcelable.Creator<PayLaterOffer> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment_options/PayLaterOffer$Instalment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instalment implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f84357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f84358b;

        @NotNull
        public static final Parcelable.Creator<Instalment> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instalment((d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instalment[i];
            }
        }

        public Instalment(d amount, LocalDate dueDate) {
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f84357a = dueDate;
            this.f84358b = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Instalment)) {
                return false;
            }
            Instalment instalment = (Instalment) obj2;
            return Intrinsics.f(this.f84357a, instalment.f84357a) && Intrinsics.f(this.f84358b, instalment.f84358b);
        }

        public final int hashCode() {
            return this.f84358b.hashCode() + (this.f84357a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f84357a);
            dest.writeSerializable(this.f84358b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            t6c.b bVarValueOf = t6c.b.valueOf(parcel.readString());
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            d dVar = (d) parcel.readSerializable();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = a.a(Instalment.CREATOR, parcel, arrayList, iA, i);
            }
            return new PayLaterOffer(string, bVarValueOf, z, dVar, dValueOf, bigDecimal, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayLaterOffer[i];
        }
    }

    public PayLaterOffer(String id10, t6c.b repayment, boolean z, d advertisedInstalmentAmount, Double d, BigDecimal apr, ArrayList instalments) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(repayment, "repayment");
        Intrinsics.checkNotNullParameter(advertisedInstalmentAmount, "advertisedInstalmentAmount");
        Intrinsics.checkNotNullParameter(apr, "apr");
        Intrinsics.checkNotNullParameter(instalments, "instalments");
        this.f84353a = id10;
        this.f84354b = repayment;
        this.f84355c = z;
        this.d = advertisedInstalmentAmount;
        this.e = d;
        this.f = apr;
        this.f84356g = instalments;
    }

    public final d a() {
        return this.f84355c ? ((Instalment) d0.b0(this.f84356g)).f84358b : new d(0L, this.d.f115083b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayLaterOffer)) {
            return false;
        }
        PayLaterOffer payLaterOffer = (PayLaterOffer) obj2;
        return Intrinsics.f(this.f84353a, payLaterOffer.f84353a) && this.f84354b == payLaterOffer.f84354b && this.f84355c == payLaterOffer.f84355c && Intrinsics.f(this.d, payLaterOffer.d) && Intrinsics.f(this.e, payLaterOffer.e) && Intrinsics.f(this.f, payLaterOffer.f) && this.f84356g.equals(payLaterOffer.f84356g);
    }

    public final int hashCode() {
        int iC = v7.c(j6.a.c((this.f84354b.hashCode() + (this.f84353a.hashCode() * 31)) * 31, 31, this.f84355c), 31, this.d);
        Double d = this.e;
        return this.f84356g.hashCode() + t61.a.d(this.f, (iC + (d == null ? 0 : d.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84353a);
        dest.writeString(this.f84354b.name());
        dest.writeInt(this.f84355c ? 1 : 0);
        dest.writeSerializable(this.d);
        Double d = this.e;
        if (d == null) {
            dest.writeInt(0);
        } else {
            a.v(dest, 1, d);
        }
        dest.writeSerializable(this.f);
        Iterator itY = j6.a.y(this.f84356g, dest);
        while (itY.hasNext()) {
            ((Instalment) itY.next()).writeToParcel(dest, i);
        }
    }
}
