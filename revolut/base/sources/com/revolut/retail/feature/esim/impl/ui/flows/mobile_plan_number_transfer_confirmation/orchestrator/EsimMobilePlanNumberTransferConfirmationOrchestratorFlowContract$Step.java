package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingDynamicForm;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtp;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPacInfo;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyInfo;
import hgj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PortabilityInstruction", "PowerOfAttorney", "DynamicForm", "Pac", "Otp", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$DynamicForm;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$Otp;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$Pac;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$PortabilityInstruction;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$PowerOfAttorney;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$DynamicForm;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DynamicForm implements EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DynamicForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100750c;
        public final c d;
        public final boolean e;
        public final EsimPhoneNumberPortingDynamicForm f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DynamicForm(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(DynamicForm.class.getClassLoader()), c.valueOf(parcel.readString()), parcel.readInt() != 0, (EsimPhoneNumberPortingDynamicForm) parcel.readParcelable(DynamicForm.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DynamicForm[i];
            }
        }

        public DynamicForm(String subscriptionId, String phoneNumberToTransfer, EsimPhoneNumberPorting porting, c navigationIcon, boolean z, EsimPhoneNumberPortingDynamicForm dynamicForm) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberToTransfer, "phoneNumberToTransfer");
            Intrinsics.checkNotNullParameter(porting, "porting");
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            Intrinsics.checkNotNullParameter(dynamicForm, "dynamicForm");
            this.f100748a = subscriptionId;
            this.f100749b = phoneNumberToTransfer;
            this.f100750c = porting;
            this.d = navigationIcon;
            this.e = z;
            this.f = dynamicForm;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DynamicForm)) {
                return false;
            }
            DynamicForm dynamicForm = (DynamicForm) obj2;
            return Intrinsics.f(this.f100748a, dynamicForm.f100748a) && Intrinsics.f(this.f100749b, dynamicForm.f100749b) && Intrinsics.f(this.f100750c, dynamicForm.f100750c) && this.d == dynamicForm.d && this.e == dynamicForm.e && Intrinsics.f(this.f, dynamicForm.f);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: h0, reason: from getter */
        public final c getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c((this.d.hashCode() + y.c(this.f100750c, p.a.c(this.f100748a.hashCode() * 31, 31, this.f100749b), 31)) * 31, 31, this.e);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: n6, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100748a);
            dest.writeString(this.f100749b);
            dest.writeParcelable(this.f100750c, i);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: y1, reason: from getter */
        public final EsimPhoneNumberPorting getF100763c() {
            return this.f100750c;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$Otp;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Otp implements EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Otp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100753c;
        public final c d;
        public final boolean e;
        public final EsimPhoneNumberPortingOtp f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f100754g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Otp(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(Otp.class.getClassLoader()), c.valueOf(parcel.readString()), parcel.readInt() != 0, (EsimPhoneNumberPortingOtp) parcel.readParcelable(Otp.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Otp[i];
            }
        }

        public Otp(String subscriptionId, String phoneNumberToTransfer, EsimPhoneNumberPorting porting, c navigationIcon, boolean z, EsimPhoneNumberPortingOtp otp, String portingId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberToTransfer, "phoneNumberToTransfer");
            Intrinsics.checkNotNullParameter(porting, "porting");
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            Intrinsics.checkNotNullParameter(otp, "otp");
            Intrinsics.checkNotNullParameter(portingId, "portingId");
            this.f100751a = subscriptionId;
            this.f100752b = phoneNumberToTransfer;
            this.f100753c = porting;
            this.d = navigationIcon;
            this.e = z;
            this.f = otp;
            this.f100754g = portingId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Otp)) {
                return false;
            }
            Otp otp = (Otp) obj2;
            return Intrinsics.f(this.f100751a, otp.f100751a) && Intrinsics.f(this.f100752b, otp.f100752b) && Intrinsics.f(this.f100753c, otp.f100753c) && this.d == otp.d && this.e == otp.e && Intrinsics.f(this.f, otp.f) && Intrinsics.f(this.f100754g, otp.f100754g);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: h0, reason: from getter */
        public final c getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f100754g.hashCode() + ((this.f.hashCode() + j6.a.c((this.d.hashCode() + y.c(this.f100753c, p.a.c(this.f100751a.hashCode() * 31, 31, this.f100752b), 31)) * 31, 31, this.e)) * 31);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: n6, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100751a);
            dest.writeString(this.f100752b);
            dest.writeParcelable(this.f100753c, i);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
            dest.writeString(this.f100754g);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: y1, reason: from getter */
        public final EsimPhoneNumberPorting getF100763c() {
            return this.f100753c;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$Pac;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pac implements EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Pac> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100757c;
        public final c d;
        public final boolean e;
        public final EsimPhoneNumberPortingPacInfo f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pac(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(Pac.class.getClassLoader()), c.valueOf(parcel.readString()), parcel.readInt() != 0, (EsimPhoneNumberPortingPacInfo) parcel.readParcelable(Pac.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pac[i];
            }
        }

        public Pac(String subscriptionId, String phoneNumberToTransfer, EsimPhoneNumberPorting porting, c navigationIcon, boolean z, EsimPhoneNumberPortingPacInfo pacInfo) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberToTransfer, "phoneNumberToTransfer");
            Intrinsics.checkNotNullParameter(porting, "porting");
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            Intrinsics.checkNotNullParameter(pacInfo, "pacInfo");
            this.f100755a = subscriptionId;
            this.f100756b = phoneNumberToTransfer;
            this.f100757c = porting;
            this.d = navigationIcon;
            this.e = z;
            this.f = pacInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pac)) {
                return false;
            }
            Pac pac2 = (Pac) obj2;
            return Intrinsics.f(this.f100755a, pac2.f100755a) && Intrinsics.f(this.f100756b, pac2.f100756b) && Intrinsics.f(this.f100757c, pac2.f100757c) && this.d == pac2.d && this.e == pac2.e && Intrinsics.f(this.f, pac2.f);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: h0, reason: from getter */
        public final c getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c((this.d.hashCode() + y.c(this.f100757c, p.a.c(this.f100755a.hashCode() * 31, 31, this.f100756b), 31)) * 31, 31, this.e);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: n6, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100755a);
            dest.writeString(this.f100756b);
            dest.writeParcelable(this.f100757c, i);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: y1, reason: from getter */
        public final EsimPhoneNumberPorting getF100763c() {
            return this.f100757c;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$PortabilityInstruction;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilityInstruction implements EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PortabilityInstruction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100760c;
        public final c d;
        public final boolean e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortabilityInstruction(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(PortabilityInstruction.class.getClassLoader()), c.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortabilityInstruction[i];
            }
        }

        public PortabilityInstruction(String subscriptionId, String phoneNumberToTransfer, EsimPhoneNumberPorting porting, c navigationIcon, boolean z, String formId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberToTransfer, "phoneNumberToTransfer");
            Intrinsics.checkNotNullParameter(porting, "porting");
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            Intrinsics.checkNotNullParameter(formId, "formId");
            this.f100758a = subscriptionId;
            this.f100759b = phoneNumberToTransfer;
            this.f100760c = porting;
            this.d = navigationIcon;
            this.e = z;
            this.f = formId;
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
            return Intrinsics.f(this.f100758a, portabilityInstruction.f100758a) && Intrinsics.f(this.f100759b, portabilityInstruction.f100759b) && Intrinsics.f(this.f100760c, portabilityInstruction.f100760c) && this.d == portabilityInstruction.d && this.e == portabilityInstruction.e && Intrinsics.f(this.f, portabilityInstruction.f);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: h0, reason: from getter */
        public final c getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c((this.d.hashCode() + y.c(this.f100760c, p.a.c(this.f100758a.hashCode() * 31, 31, this.f100759b), 31)) * 31, 31, this.e);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: n6, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100758a);
            dest.writeString(this.f100759b);
            dest.writeParcelable(this.f100760c, i);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: y1, reason: from getter */
        public final EsimPhoneNumberPorting getF100763c() {
            return this.f100760c;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step$PowerOfAttorney;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/orchestrator/EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PowerOfAttorney implements EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PowerOfAttorney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPorting f100763c;
        public final c d;
        public final boolean e;
        public final EsimPhoneNumberPortingPowerOfAttorneyInfo f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PowerOfAttorney(parcel.readString(), parcel.readString(), (EsimPhoneNumberPorting) parcel.readParcelable(PowerOfAttorney.class.getClassLoader()), c.valueOf(parcel.readString()), parcel.readInt() != 0, (EsimPhoneNumberPortingPowerOfAttorneyInfo) parcel.readParcelable(PowerOfAttorney.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PowerOfAttorney[i];
            }
        }

        public PowerOfAttorney(String subscriptionId, String phoneNumberToTransfer, EsimPhoneNumberPorting porting, c navigationIcon, boolean z, EsimPhoneNumberPortingPowerOfAttorneyInfo powerOfAttorneyInfo) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(phoneNumberToTransfer, "phoneNumberToTransfer");
            Intrinsics.checkNotNullParameter(porting, "porting");
            Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
            Intrinsics.checkNotNullParameter(powerOfAttorneyInfo, "powerOfAttorneyInfo");
            this.f100761a = subscriptionId;
            this.f100762b = phoneNumberToTransfer;
            this.f100763c = porting;
            this.d = navigationIcon;
            this.e = z;
            this.f = powerOfAttorneyInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PowerOfAttorney)) {
                return false;
            }
            PowerOfAttorney powerOfAttorney = (PowerOfAttorney) obj2;
            return Intrinsics.f(this.f100761a, powerOfAttorney.f100761a) && Intrinsics.f(this.f100762b, powerOfAttorney.f100762b) && Intrinsics.f(this.f100763c, powerOfAttorney.f100763c) && this.d == powerOfAttorney.d && this.e == powerOfAttorney.e && Intrinsics.f(this.f, powerOfAttorney.f);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: h0, reason: from getter */
        public final c getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c((this.d.hashCode() + y.c(this.f100763c, p.a.c(this.f100761a.hashCode() * 31, 31, this.f100762b), 31)) * 31, 31, this.e);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: n6, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100761a);
            dest.writeString(this.f100762b);
            dest.writeParcelable(this.f100763c, i);
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step
        /* JADX INFO: renamed from: y1, reason: from getter */
        public final EsimPhoneNumberPorting getF100763c() {
            return this.f100763c;
        }
    }

    /* JADX INFO: renamed from: h0 */
    c getD();

    /* JADX INFO: renamed from: n6 */
    boolean getE();

    /* JADX INFO: renamed from: y1 */
    EsimPhoneNumberPorting getF100763c();
}
