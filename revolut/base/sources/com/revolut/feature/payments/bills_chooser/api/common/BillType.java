package com.revolut.feature.payments.bills_chooser.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/common/BillType;", "Landroid/os/Parcelable;", "<init>", "()V", "TransactionBill", "CustomBill", "RecurringPaymentBill", "Lcom/revolut/feature/payments/bills_chooser/api/common/BillType$CustomBill;", "Lcom/revolut/feature/payments/bills_chooser/api/common/BillType$RecurringPaymentBill;", "Lcom/revolut/feature/payments/bills_chooser/api/common/BillType$TransactionBill;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BillType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/common/BillType$CustomBill;", "Lcom/revolut/feature/payments/bills_chooser/api/common/BillType;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomBill extends BillType {

        @NotNull
        public static final Parcelable.Creator<CustomBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f79174b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomBill((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomBill[i];
            }
        }

        public CustomBill(d money, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(money, "money");
            this.f79173a = name;
            this.f79174b = money;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CustomBill)) {
                return false;
            }
            CustomBill customBill = (CustomBill) obj2;
            return Intrinsics.f(this.f79173a, customBill.f79173a) && Intrinsics.f(this.f79174b, customBill.f79174b);
        }

        public final int hashCode() {
            return this.f79174b.hashCode() + (this.f79173a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79173a);
            dest.writeSerializable(this.f79174b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/common/BillType$RecurringPaymentBill;", "Lcom/revolut/feature/payments/bills_chooser/api/common/BillType;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringPaymentBill extends BillType {

        @NotNull
        public static final Parcelable.Creator<RecurringPaymentBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f79175a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringPaymentBill((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringPaymentBill[i];
            }
        }

        public RecurringPaymentBill(p recurringPayment) {
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            this.f79175a = recurringPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RecurringPaymentBill) && Intrinsics.f(this.f79175a, ((RecurringPaymentBill) obj2).f79175a);
        }

        public final int hashCode() {
            return this.f79175a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79175a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/common/BillType$TransactionBill;", "Lcom/revolut/feature/payments/bills_chooser/api/common/BillType;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionBill extends BillType {

        @NotNull
        public static final Parcelable.Creator<TransactionBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a3 f79176a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionBill((a3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionBill[i];
            }
        }

        public TransactionBill(a3 transaction) {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f79176a = transaction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionBill) && Intrinsics.f(this.f79176a, ((TransactionBill) obj2).f79176a);
        }

        public final int hashCode() {
            return this.f79176a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79176a);
        }
    }

    private BillType() {
    }
}
