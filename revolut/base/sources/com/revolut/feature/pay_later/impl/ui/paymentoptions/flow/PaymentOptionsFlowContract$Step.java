package com.revolut.feature.pay_later.impl.ui.paymentoptions.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/pay_later/impl/ui/paymentoptions/flow/PaymentOptionsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PaymentOptions", "Lcom/revolut/feature/pay_later/impl/ui/paymentoptions/flow/PaymentOptionsFlowContract$Step$PaymentOptions;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentOptionsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/paymentoptions/flow/PaymentOptionsFlowContract$Step$PaymentOptions;", "Lcom/revolut/feature/pay_later/impl/ui/paymentoptions/flow/PaymentOptionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentOptions extends PaymentOptionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f78885a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentOptions((BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentOptions[i];
            }
        }

        public PaymentOptions(BigDecimal serviceFee) {
            Intrinsics.checkNotNullParameter(serviceFee, "serviceFee");
            this.f78885a = serviceFee;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PaymentOptions) && Intrinsics.f(this.f78885a, ((PaymentOptions) obj2).f78885a);
        }

        public final int hashCode() {
            return this.f78885a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78885a);
        }
    }

    private PaymentOptionsFlowContract$Step() {
    }
}
