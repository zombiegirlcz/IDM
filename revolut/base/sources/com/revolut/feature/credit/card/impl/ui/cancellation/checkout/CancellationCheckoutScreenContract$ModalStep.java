package com.revolut.feature.credit.card.impl.ui.cancellation.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/checkout/CancellationCheckoutScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SkipRepayment", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/checkout/CancellationCheckoutScreenContract$ModalStep$SkipRepayment;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CancellationCheckoutScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/checkout/CancellationCheckoutScreenContract$ModalStep$SkipRepayment;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/checkout/CancellationCheckoutScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SkipRepayment extends CancellationCheckoutScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SkipRepayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f69106b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SkipRepayment((d) parcel.readSerializable(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SkipRepayment[i];
            }
        }

        public SkipRepayment(d repaymentAmount, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(repaymentAmount, "repaymentAmount");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69105a = repaymentAmount;
            this.f69106b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SkipRepayment)) {
                return false;
            }
            SkipRepayment skipRepayment = (SkipRepayment) obj2;
            return Intrinsics.f(this.f69105a, skipRepayment.f69105a) && Intrinsics.f(this.f69106b, skipRepayment.f69106b);
        }

        public final int hashCode() {
            return this.f69106b.f297794a.hashCode() + (this.f69105a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69105a);
            dest.writeSerializable(this.f69106b);
        }
    }

    private CancellationCheckoutScreenContract$ModalStep() {
    }
}
