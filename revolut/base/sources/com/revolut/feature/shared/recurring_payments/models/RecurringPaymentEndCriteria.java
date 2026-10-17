package com.revolut.feature.shared.recurring_payments.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "<init>", "()V", "Date", "Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria$Date;", "feature_shared_recurring_payments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RecurringPaymentEndCriteria implements Parcelable, Serializable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria$Date;", "Lcom/revolut/feature/shared/recurring_payments/models/RecurringPaymentEndCriteria;", "", "toString", "()Ljava/lang/String;", "feature_shared_recurring_payments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Date extends RecurringPaymentEndCriteria {

        @NotNull
        public static final Parcelable.Creator<Date> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f86442a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Date((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Date[i];
            }
        }

        public Date(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f86442a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Date) && Intrinsics.f(this.f86442a, ((Date) obj2).f86442a);
        }

        public final int hashCode() {
            return this.f86442a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f86442a);
        }
    }

    private RecurringPaymentEndCriteria() {
    }
}
