package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingDynamicFormRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PortabilityInstruction", "NumberTransferConfirmation", "BusinessDetails", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step$BusinessDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step$PortabilityInstruction;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step$BusinessDetails;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessDetails extends EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BusinessDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPortingDynamicFormRequest f100734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f100735b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                EsimPhoneNumberPortingDynamicFormRequest esimPhoneNumberPortingDynamicFormRequestCreateFromParcel = EsimPhoneNumberPortingDynamicFormRequest.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BusinessDetails.class, parcel, arrayList, iE, 1);
                }
                return new BusinessDetails(esimPhoneNumberPortingDynamicFormRequestCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessDetails[i];
            }
        }

        public BusinessDetails(EsimPhoneNumberPortingDynamicFormRequest dynamicFormRequest, List attributes) {
            Intrinsics.checkNotNullParameter(dynamicFormRequest, "dynamicFormRequest");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.f100734a = dynamicFormRequest;
            this.f100735b = attributes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BusinessDetails)) {
                return false;
            }
            BusinessDetails businessDetails = (BusinessDetails) obj2;
            return Intrinsics.f(this.f100734a, businessDetails.f100734a) && Intrinsics.f(this.f100735b, businessDetails.f100735b);
        }

        public final int hashCode() {
            return this.f100735b.hashCode() + (this.f100734a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f100734a.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f100735b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step$NumberTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NumberTransferConfirmation extends EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NumberTransferConfirmation f100736a = new NumberTransferConfirmation();

        @NotNull
        public static final Parcelable.Creator<NumberTransferConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NumberTransferConfirmation.f100736a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step$PortabilityInstruction;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/dynamic_form/EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilityInstruction extends EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortabilityInstruction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100739c;

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
            this.f100737a = subscriptionId;
            this.f100738b = phoneNumberToTransfer;
            this.f100739c = formId;
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
            return Intrinsics.f(this.f100737a, portabilityInstruction.f100737a) && Intrinsics.f(this.f100738b, portabilityInstruction.f100738b) && Intrinsics.f(this.f100739c, portabilityInstruction.f100739c);
        }

        public final int hashCode() {
            return this.f100739c.hashCode() + p.a.c(this.f100737a.hashCode() * 31, 31, this.f100738b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100737a);
            dest.writeString(this.f100738b);
            dest.writeString(this.f100739c);
        }
    }

    private EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step() {
    }
}
