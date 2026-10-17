package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PortabilityInstruction", "NumberTransferConfirmation", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step$PortabilityInstruction;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NumberTransferConfirmation extends EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NumberTransferConfirmation f100775a = new NumberTransferConfirmation();

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NumberTransferConfirmation.f100775a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberTransferConfirmation[i];
            }
        }

        private NumberTransferConfirmation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step$PortabilityInstruction;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilityInstruction extends EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortabilityInstruction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100778c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortabilityInstruction(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortabilityInstruction[i];
            }
        }

        public PortabilityInstruction(String subscriptionId, String phoneNumberToTransfer, String formId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberToTransfer, "phoneNumberToTransfer");
            Intrinsics.checkNotNullParameter(formId, "formId");
            this.f100776a = subscriptionId;
            this.f100777b = phoneNumberToTransfer;
            this.f100778c = formId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortabilityInstruction)) {
                return false;
            }
            PortabilityInstruction portabilityInstruction = (PortabilityInstruction) obj2;
            return Intrinsics.f(this.f100776a, portabilityInstruction.f100776a) && Intrinsics.f(this.f100777b, portabilityInstruction.f100777b) && Intrinsics.f(this.f100778c, portabilityInstruction.f100778c);
        }

        public final int hashCode() {
            return this.f100778c.hashCode() + p.a.c(this.f100776a.hashCode() * 31, 31, this.f100777b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100776a);
            dest.writeString(this.f100777b);
            dest.writeString(this.f100778c);
        }
    }

    private EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step() {
    }
}
