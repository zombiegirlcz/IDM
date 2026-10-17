package com.revolut.feature.alipay.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/alipay/impl/ui/PaymentFlowContract$StartType", "Landroid/os/Parcelable;", "PendingPayment", "Lcom/revolut/feature/alipay/impl/ui/PaymentFlowContract$StartType$PendingPayment;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentFlowContract$StartType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/PaymentFlowContract$StartType$PendingPayment;", "Lcom/revolut/feature/alipay/impl/ui/PaymentFlowContract$StartType;", "", "toString", "()Ljava/lang/String;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingPayment implements PaymentFlowContract$StartType {

        @NotNull
        public static final Parcelable.Creator<PendingPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmPaymentAuthorisationSummary f61063a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingPayment((ApmPaymentAuthorisationSummary) parcel.readParcelable(PendingPayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingPayment[i];
            }
        }

        public PendingPayment(ApmPaymentAuthorisationSummary pendingPayment) {
            Intrinsics.checkNotNullParameter(pendingPayment, "pendingPayment");
            this.f61063a = pendingPayment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingPayment) && Intrinsics.f(this.f61063a, ((PendingPayment) obj2).f61063a);
        }

        public final int hashCode() {
            return this.f61063a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61063a, i);
        }
    }
}
