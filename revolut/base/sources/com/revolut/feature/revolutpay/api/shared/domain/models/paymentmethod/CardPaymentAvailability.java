package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability;", "Landroid/os/Parcelable;", "NotAvailable", "DisabledAtMerchant", "Available", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability$Available;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability$DisabledAtMerchant;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability$NotAvailable;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardPaymentAvailability extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability$Available;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Available implements CardPaymentAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f84362a;

        @NotNull
        public static final Parcelable.Creator<Available> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(c.valueOf(parcel.readString()));
                }
                return new Available(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Available[i];
            }
        }

        public Available(List availableCardBrands) {
            Intrinsics.checkNotNullParameter(availableCardBrands, "availableCardBrands");
            this.f84362a = availableCardBrands;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Available) && Intrinsics.f(this.f84362a, ((Available) obj2).f84362a);
        }

        public final int hashCode() {
            return this.f84362a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f84362a, dest);
            while (itV.hasNext()) {
                dest.writeString(((c) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability$DisabledAtMerchant;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisabledAtMerchant implements CardPaymentAvailability {

        @NotNull
        public static final Parcelable.Creator<DisabledAtMerchant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84363a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisabledAtMerchant(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisabledAtMerchant[i];
            }
        }

        public DisabledAtMerchant(String merchantName) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f84363a = merchantName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DisabledAtMerchant) && Intrinsics.f(this.f84363a, ((DisabledAtMerchant) obj2).f84363a);
        }

        public final int hashCode() {
            return this.f84363a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84363a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability$NotAvailable;", "Lcom/revolut/feature/revolutpay/api/shared/domain/models/paymentmethod/CardPaymentAvailability;", "<init>", "()V", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable implements CardPaymentAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f84364a = new NotAvailable();

        @NotNull
        public static final Parcelable.Creator<NotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotAvailable.f84364a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotAvailable[i];
            }
        }

        private NotAvailable() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
