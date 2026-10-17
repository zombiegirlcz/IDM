package com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PayWithAny", "MoveMoney", "Lcom/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlowContract$Step$PayWithAny;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayWithAnyFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlowContract$Step$MoveMoney;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoveMoney implements PayWithAnyFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentMethod f84475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f84476b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoveMoney((PaymentMethod) parcel.readParcelable(MoveMoney.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoney[i];
            }
        }

        public MoveMoney(PaymentMethod paymentMethod, d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f84475a = paymentMethod;
            this.f84476b = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoveMoney)) {
                return false;
            }
            MoveMoney moveMoney = (MoveMoney) obj2;
            return Intrinsics.f(this.f84475a, moveMoney.f84475a) && Intrinsics.f(this.f84476b, moveMoney.f84476b);
        }

        public final int hashCode() {
            PaymentMethod paymentMethod = this.f84475a;
            return this.f84476b.hashCode() + ((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84475a, i);
            dest.writeSerializable(this.f84476b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlowContract$Step$PayWithAny;", "Lcom/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlowContract$Step;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayWithAny implements PayWithAnyFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayWithAny f84477a = new PayWithAny();

        @NotNull
        public static final Parcelable.Creator<PayWithAny> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayWithAny.f84477a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayWithAny[i];
            }
        }

        private PayWithAny() {
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
