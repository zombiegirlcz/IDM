package com.revolut.feature.recurring_payments.api.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPaymentWithExtra;", "Landroid/os/Parcelable;", "General", "LinkedTransaction", "Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPaymentWithExtra$General;", "Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPaymentWithExtra$LinkedTransaction;", "feature_recurring_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringPaymentWithExtra implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPaymentWithExtra$General;", "Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPaymentWithExtra;", "", "toString", "()Ljava/lang/String;", "feature_recurring_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class General extends RecurringPaymentWithExtra {

        @NotNull
        public static final Parcelable.Creator<General> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f81652a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new General((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new General[i];
            }
        }

        public General(p recurringPayment) {
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            this.f81652a = recurringPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof General) && Intrinsics.f(this.f81652a, ((General) obj2).f81652a);
        }

        public final int hashCode() {
            return this.f81652a.hashCode();
        }

        @Override // com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra
        /* JADX INFO: renamed from: m8, reason: from getter */
        public final p getF81653a() {
            return this.f81652a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81652a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPaymentWithExtra$LinkedTransaction;", "Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPaymentWithExtra;", "", "toString", "()Ljava/lang/String;", "feature_recurring_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedTransaction extends RecurringPaymentWithExtra {

        @NotNull
        public static final Parcelable.Creator<LinkedTransaction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f81653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a3 f81654b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedTransaction((p) parcel.readSerializable(), (a3) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedTransaction[i];
            }
        }

        public LinkedTransaction(p recurringPayment, a3 a3Var) {
            Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
            this.f81653a = recurringPayment;
            this.f81654b = a3Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedTransaction)) {
                return false;
            }
            LinkedTransaction linkedTransaction = (LinkedTransaction) obj2;
            return Intrinsics.f(this.f81653a, linkedTransaction.f81653a) && Intrinsics.f(this.f81654b, linkedTransaction.f81654b);
        }

        public final int hashCode() {
            int iHashCode = this.f81653a.hashCode() * 31;
            a3 a3Var = this.f81654b;
            return iHashCode + (a3Var == null ? 0 : a3Var.hashCode());
        }

        @Override // com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra
        /* JADX INFO: renamed from: m8, reason: from getter */
        public final p getF81653a() {
            return this.f81653a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81653a);
            dest.writeSerializable(this.f81654b);
        }
    }

    /* JADX INFO: renamed from: m8 */
    public abstract p getF81653a();
}
