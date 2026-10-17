package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPowerOfAttorneyRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PortabilityInstruction", "NumberTransferConfirmation", "Terms", "AdditionalDetails", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$AdditionalDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$PortabilityInstruction;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$Terms;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$AdditionalDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalDetails extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f100802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberPortingPowerOfAttorneyRequest f100803b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AdditionalDetails.class, parcel, arrayList, iE, 1);
                }
                return new AdditionalDetails(EsimPhoneNumberPortingPowerOfAttorneyRequest.CREATOR.createFromParcel(parcel), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalDetails[i];
            }
        }

        public AdditionalDetails(EsimPhoneNumberPortingPowerOfAttorneyRequest phoneNumberPortingPowerOfAttorneyRequest, List attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(phoneNumberPortingPowerOfAttorneyRequest, "phoneNumberPortingPowerOfAttorneyRequest");
            this.f100802a = attributes;
            this.f100803b = phoneNumberPortingPowerOfAttorneyRequest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalDetails)) {
                return false;
            }
            AdditionalDetails additionalDetails = (AdditionalDetails) obj2;
            return Intrinsics.f(this.f100802a, additionalDetails.f100802a) && Intrinsics.f(this.f100803b, additionalDetails.f100803b);
        }

        public final int hashCode() {
            return this.f100803b.hashCode() + (this.f100802a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f100802a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            this.f100803b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NumberTransferConfirmation extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NumberTransferConfirmation f100804a = new NumberTransferConfirmation();

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NumberTransferConfirmation.f100804a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$PortabilityInstruction;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilityInstruction extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortabilityInstruction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100807c;

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
            this.f100805a = subscriptionId;
            this.f100806b = phoneNumberToTransfer;
            this.f100807c = formId;
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
            return Intrinsics.f(this.f100805a, portabilityInstruction.f100805a) && Intrinsics.f(this.f100806b, portabilityInstruction.f100806b) && Intrinsics.f(this.f100807c, portabilityInstruction.f100807c);
        }

        public final int hashCode() {
            return this.f100807c.hashCode() + p.a.c(this.f100805a.hashCode() * 31, 31, this.f100806b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100805a);
            dest.writeString(this.f100806b);
            dest.writeString(this.f100807c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step$Terms;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terms extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Terms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPortingPowerOfAttorneyRequest f100808a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Terms(EsimPhoneNumberPortingPowerOfAttorneyRequest.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terms[i];
            }
        }

        public Terms(EsimPhoneNumberPortingPowerOfAttorneyRequest phoneNumberPortingPowerOfAttorneyRequest) {
            Intrinsics.checkNotNullParameter(phoneNumberPortingPowerOfAttorneyRequest, "phoneNumberPortingPowerOfAttorneyRequest");
            this.f100808a = phoneNumberPortingPowerOfAttorneyRequest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Terms) && Intrinsics.f(this.f100808a, ((Terms) obj2).f100808a);
        }

        public final int hashCode() {
            return this.f100808a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100808a.writeToParcel(dest, i);
        }
    }

    private EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step() {
    }
}
