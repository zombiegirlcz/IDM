package com.revolut.feature.revolutpay.impl.domain.models.payment_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/payment_schedule/PaymentScheduleSelection;", "Landroid/os/Parcelable;", "PayNow", "PayLater", "Lcom/revolut/feature/revolutpay/impl/domain/models/payment_schedule/PaymentScheduleSelection$PayLater;", "Lcom/revolut/feature/revolutpay/impl/domain/models/payment_schedule/PaymentScheduleSelection$PayNow;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentScheduleSelection extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/payment_schedule/PaymentScheduleSelection$PayLater;", "Lcom/revolut/feature/revolutpay/impl/domain/models/payment_schedule/PaymentScheduleSelection;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayLater implements PaymentScheduleSelection {

        @NotNull
        public static final Parcelable.Creator<PayLater> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayLaterOffer f84445a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayLater((PayLaterOffer) parcel.readParcelable(PayLater.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayLater[i];
            }
        }

        public PayLater(PayLaterOffer offer) {
            Intrinsics.checkNotNullParameter(offer, "offer");
            this.f84445a = offer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayLater) && Intrinsics.f(this.f84445a, ((PayLater) obj2).f84445a);
        }

        public final int hashCode() {
            return this.f84445a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84445a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/payment_schedule/PaymentScheduleSelection$PayNow;", "Lcom/revolut/feature/revolutpay/impl/domain/models/payment_schedule/PaymentScheduleSelection;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayNow implements PaymentScheduleSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayNow f84446a = new PayNow();

        @NotNull
        public static final Parcelable.Creator<PayNow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayNow.f84446a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayNow[i];
            }
        }

        private PayNow() {
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
