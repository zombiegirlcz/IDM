package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PortabilityInstruction", "NumberTransferConfirmation", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step$PortabilityInstruction;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NumberTransferConfirmation extends EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NumberTransferConfirmation f100789a = new NumberTransferConfirmation();

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NumberTransferConfirmation.f100789a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step$PortabilityInstruction;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilityInstruction extends EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortabilityInstruction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100792c;

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
            this.f100790a = subscriptionId;
            this.f100791b = phoneNumberToTransfer;
            this.f100792c = formId;
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
            return Intrinsics.f(this.f100790a, portabilityInstruction.f100790a) && Intrinsics.f(this.f100791b, portabilityInstruction.f100791b) && Intrinsics.f(this.f100792c, portabilityInstruction.f100792c);
        }

        public final int hashCode() {
            return this.f100792c.hashCode() + p.a.c(this.f100790a.hashCode() * 31, 31, this.f100791b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100790a);
            dest.writeString(this.f100791b);
            dest.writeString(this.f100792c);
        }
    }

    private EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step() {
    }
}
