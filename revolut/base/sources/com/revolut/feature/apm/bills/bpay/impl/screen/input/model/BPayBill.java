package com.revolut.feature.apm.bills.bpay.impl.screen.input.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/input/model/BPayBill;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ServiceProvider", "PaymentMethodDetails", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayBill implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BPayBill> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceProvider f61225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61226c;
    public final boolean d;
    public final boolean e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/input/model/BPayBill$PaymentMethodDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentMethodDetails implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentMethodDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f61228b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentMethodDetails(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentMethodDetails[i];
            }
        }

        public PaymentMethodDetails(String billerCode, boolean z) {
            Intrinsics.checkNotNullParameter(billerCode, "billerCode");
            this.f61227a = billerCode;
            this.f61228b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentMethodDetails)) {
                return false;
            }
            PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) obj2;
            return Intrinsics.f(this.f61227a, paymentMethodDetails.f61227a) && this.f61228b == paymentMethodDetails.f61228b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f61228b) + (this.f61227a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61227a);
            dest.writeInt(this.f61228b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/input/model/BPayBill$ServiceProvider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ServiceProvider implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ServiceProvider> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61231c;
        public final LocalDateTime d;
        public final PaymentMethodDetails e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ServiceProvider(parcel.readString(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable(), PaymentMethodDetails.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ServiceProvider[i];
            }
        }

        public ServiceProvider(String id10, String name, String str, LocalDateTime localDateTime, PaymentMethodDetails paymentMethodDetails, String str2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(paymentMethodDetails, "paymentMethodDetails");
            this.f61229a = id10;
            this.f61230b = name;
            this.f61231c = str;
            this.d = localDateTime;
            this.e = paymentMethodDetails;
            this.f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ServiceProvider)) {
                return false;
            }
            ServiceProvider serviceProvider = (ServiceProvider) obj2;
            return Intrinsics.f(this.f61229a, serviceProvider.f61229a) && Intrinsics.f(this.f61230b, serviceProvider.f61230b) && Intrinsics.f(this.f61231c, serviceProvider.f61231c) && Intrinsics.f(this.d, serviceProvider.d) && Intrinsics.f(this.e, serviceProvider.e) && Intrinsics.f(this.f, serviceProvider.f);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f61229a.hashCode() * 31, 31, this.f61230b);
            String str = this.f61231c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            LocalDateTime localDateTime = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31)) * 31;
            String str2 = this.f;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61229a);
            dest.writeString(this.f61230b);
            dest.writeString(this.f61231c);
            dest.writeSerializable(this.d);
            this.e.writeToParcel(dest, i);
            dest.writeString(this.f);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            ServiceProvider serviceProviderCreateFromParcel = ServiceProvider.CREATOR.createFromParcel(parcel);
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new BPayBill(string, serviceProviderCreateFromParcel, z4, z6, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayBill[i];
        }
    }

    public BPayBill(String paymentMethod, ServiceProvider serviceProvider, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        this.f61224a = paymentMethod;
        this.f61225b = serviceProvider;
        this.f61226c = z;
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayBill)) {
            return false;
        }
        BPayBill bPayBill = (BPayBill) obj2;
        return Intrinsics.f(this.f61224a, bPayBill.f61224a) && Intrinsics.f(this.f61225b, bPayBill.f61225b) && this.f61226c == bPayBill.f61226c && this.d == bPayBill.d && this.e == bPayBill.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c((this.f61225b.hashCode() + (this.f61224a.hashCode() * 31)) * 31, 31, this.f61226c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61224a);
        this.f61225b.writeToParcel(dest, i);
        dest.writeInt(this.f61226c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
