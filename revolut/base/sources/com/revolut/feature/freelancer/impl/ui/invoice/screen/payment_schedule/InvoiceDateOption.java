package com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoiceDateOption;", "Landroid/os/Parcelable;", "DateOffset", "CustomDate", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoiceDateOption$CustomDate;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoiceDateOption$DateOffset;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvoiceDateOption extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoiceDateOption$CustomDate;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoiceDateOption;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomDate implements InvoiceDateOption {

        @NotNull
        public static final Parcelable.Creator<CustomDate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f73893a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomDate((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomDate[i];
            }
        }

        public CustomDate(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f73893a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomDate) && Intrinsics.f(this.f73893a, ((CustomDate) obj2).f73893a);
        }

        public final int hashCode() {
            return this.f73893a.hashCode();
        }

        @Override // com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoiceDateOption
        public final int q7() {
            return -1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73893a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoiceDateOption$DateOffset;", "Lcom/revolut/feature/freelancer/impl/ui/invoice/screen/payment_schedule/InvoiceDateOption;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateOffset implements InvoiceDateOption {

        @NotNull
        public static final Parcelable.Creator<DateOffset> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sr6.b f73894a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateOffset(sr6.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOffset[i];
            }
        }

        public DateOffset(sr6.b offset) {
            Intrinsics.checkNotNullParameter(offset, "offset");
            this.f73894a = offset;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateOffset) && this.f73894a == ((DateOffset) obj2).f73894a;
        }

        public final int hashCode() {
            return this.f73894a.hashCode();
        }

        @Override // com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoiceDateOption
        public final int q7() {
            return this.f73894a.b();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73894a.name());
        }
    }

    int q7();
}
