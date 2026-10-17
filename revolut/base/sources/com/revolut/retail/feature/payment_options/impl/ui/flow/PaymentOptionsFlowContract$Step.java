package com.revolut.retail.feature.payment_options.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/payment_options/impl/ui/flow/PaymentOptionsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PaymentOptions", "VaultWithdrawal", "Lcom/revolut/retail/feature/payment_options/impl/ui/flow/PaymentOptionsFlowContract$Step$PaymentOptions;", "Lcom/revolut/retail/feature/payment_options/impl/ui/flow/PaymentOptionsFlowContract$Step$VaultWithdrawal;", "feature_retail_payment_options_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentOptionsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payment_options/impl/ui/flow/PaymentOptionsFlowContract$Step$PaymentOptions;", "Lcom/revolut/retail/feature/payment_options/impl/ui/flow/PaymentOptionsFlowContract$Step;", "<init>", "()V", "feature_retail_payment_options_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentOptions extends PaymentOptionsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentOptions f101883a = new PaymentOptions();

        @NotNull
        public static final Parcelable.Creator<PaymentOptions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentOptions.f101883a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentOptions[i];
            }
        }

        private PaymentOptions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payment_options/impl/ui/flow/PaymentOptionsFlowContract$Step$VaultWithdrawal;", "Lcom/revolut/retail/feature/payment_options/impl/ui/flow/PaymentOptionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_payment_options_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VaultWithdrawal extends PaymentOptionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VaultWithdrawal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101884a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VaultWithdrawal(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultWithdrawal[i];
            }
        }

        public VaultWithdrawal(String vaultId) {
            Intrinsics.checkNotNullParameter(vaultId, "vaultId");
            this.f101884a = vaultId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VaultWithdrawal) && Intrinsics.f(this.f101884a, ((VaultWithdrawal) obj2).f101884a);
        }

        public final int hashCode() {
            return this.f101884a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101884a);
        }
    }

    private PaymentOptionsFlowContract$Step() {
    }
}
