package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ServiceProviderPicker", "ContractTypePicker", "PortingPreferredSchedulePicker", "PhoneNumberTypePicker", "TrackPortabilityStatus", "PortabilityForm", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$ContractTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$PhoneNumberTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$PortabilityForm;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$PortingPreferredSchedulePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$ServiceProviderPicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$ContractTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContractTypePicker extends EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ContractTypePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f101266a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ContractTypePicker.class, parcel, arrayList, iE, 1);
                }
                return new ContractTypePicker(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContractTypePicker[i];
            }
        }

        public ContractTypePicker(List contractType) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            this.f101266a = contractType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContractTypePicker) && Intrinsics.f(this.f101266a, ((ContractTypePicker) obj2).f101266a);
        }

        public final int hashCode() {
            return this.f101266a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f101266a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$PhoneNumberTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumberTypePicker extends EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PhoneNumberTypePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPortingOwnerAccountType f101267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f101268b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType = (EsimPhoneNumberPortingOwnerAccountType) j6.a.f(parcel, "parcel", PhoneNumberTypePicker.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PhoneNumberTypePicker.class, parcel, arrayList, iE, 1);
                }
                return new PhoneNumberTypePicker(esimPhoneNumberPortingOwnerAccountType, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumberTypePicker[i];
            }
        }

        public PhoneNumberTypePicker(EsimPhoneNumberPortingOwnerAccountType selectedPhoneNumberType, List ownerAccountTypes) {
            Intrinsics.checkNotNullParameter(selectedPhoneNumberType, "selectedPhoneNumberType");
            Intrinsics.checkNotNullParameter(ownerAccountTypes, "ownerAccountTypes");
            this.f101267a = selectedPhoneNumberType;
            this.f101268b = ownerAccountTypes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhoneNumberTypePicker)) {
                return false;
            }
            PhoneNumberTypePicker phoneNumberTypePicker = (PhoneNumberTypePicker) obj2;
            return Intrinsics.f(this.f101267a, phoneNumberTypePicker.f101267a) && Intrinsics.f(this.f101268b, phoneNumberTypePicker.f101268b);
        }

        public final int hashCode() {
            return this.f101268b.hashCode() + (this.f101267a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101267a, i);
            Iterator itV = p.a.v(this.f101268b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$PortabilityForm;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilityForm extends EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortabilityForm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f101270b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new PortabilityForm(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortabilityForm[i];
            }
        }

        public PortabilityForm(String formId, Map formParams) {
            Intrinsics.checkNotNullParameter(formId, "formId");
            Intrinsics.checkNotNullParameter(formParams, "formParams");
            this.f101269a = formId;
            this.f101270b = formParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortabilityForm)) {
                return false;
            }
            PortabilityForm portabilityForm = (PortabilityForm) obj2;
            return Intrinsics.f(this.f101269a, portabilityForm.f101269a) && Intrinsics.f(this.f101270b, portabilityForm.f101270b);
        }

        public final int hashCode() {
            return this.f101270b.hashCode() + (this.f101269a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101269a);
            Iterator itZ = j6.a.z(this.f101270b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$PortingPreferredSchedulePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortingPreferredSchedulePicker extends EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortingPreferredSchedulePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPortingContractType f101271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberPortingPreferredSchedule f101272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f101273c;
        public final EsimPhoneNumberPortingInstruction d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = (EsimPhoneNumberPortingContractType) j6.a.f(parcel, "parcel", PortingPreferredSchedulePicker.class);
                EsimPhoneNumberPortingPreferredSchedule esimPhoneNumberPortingPreferredSchedule = (EsimPhoneNumberPortingPreferredSchedule) parcel.readParcelable(PortingPreferredSchedulePicker.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PortingPreferredSchedulePicker.class, parcel, arrayList, iE, 1);
                }
                return new PortingPreferredSchedulePicker(esimPhoneNumberPortingContractType, esimPhoneNumberPortingPreferredSchedule, arrayList, (EsimPhoneNumberPortingInstruction) parcel.readParcelable(PortingPreferredSchedulePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortingPreferredSchedulePicker[i];
            }
        }

        public PortingPreferredSchedulePicker(EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType, EsimPhoneNumberPortingPreferredSchedule preferredSchedule, List preferredScheduleOptions, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction) {
            Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
            Intrinsics.checkNotNullParameter(preferredScheduleOptions, "preferredScheduleOptions");
            this.f101271a = esimPhoneNumberPortingContractType;
            this.f101272b = preferredSchedule;
            this.f101273c = preferredScheduleOptions;
            this.d = esimPhoneNumberPortingInstruction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortingPreferredSchedulePicker)) {
                return false;
            }
            PortingPreferredSchedulePicker portingPreferredSchedulePicker = (PortingPreferredSchedulePicker) obj2;
            return Intrinsics.f(this.f101271a, portingPreferredSchedulePicker.f101271a) && Intrinsics.f(this.f101272b, portingPreferredSchedulePicker.f101272b) && Intrinsics.f(this.f101273c, portingPreferredSchedulePicker.f101273c) && Intrinsics.f(this.d, portingPreferredSchedulePicker.d);
        }

        public final int hashCode() {
            EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = this.f101271a;
            int iD = p.a.d((this.f101272b.hashCode() + ((esimPhoneNumberPortingContractType == null ? 0 : esimPhoneNumberPortingContractType.hashCode()) * 31)) * 31, 31, this.f101273c);
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.d;
            return iD + (esimPhoneNumberPortingInstruction != null ? esimPhoneNumberPortingInstruction.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101271a, i);
            dest.writeParcelable(this.f101272b, i);
            Iterator itV = p.a.v(this.f101273c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$ServiceProviderPicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ServiceProviderPicker extends EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ServiceProviderPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f101274a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ServiceProviderPicker.class, parcel, arrayList, iE, 1);
                }
                return new ServiceProviderPicker(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ServiceProviderPicker[i];
            }
        }

        public ServiceProviderPicker(List serviceProviders) {
            Intrinsics.checkNotNullParameter(serviceProviders, "serviceProviders");
            this.f101274a = serviceProviders;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ServiceProviderPicker) && Intrinsics.f(this.f101274a, ((ServiceProviderPicker) obj2).f101274a);
        }

        public final int hashCode() {
            return this.f101274a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f101274a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackPortabilityStatus extends EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TrackPortabilityStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f101275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f101276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f101277c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", TrackPortabilityStatus.class);
                Clause clause2 = (Clause) parcel.readParcelable(TrackPortabilityStatus.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TrackPortabilityStatus.class, parcel, arrayList, iE, 1);
                }
                return new TrackPortabilityStatus(clause, clause2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackPortabilityStatus[i];
            }
        }

        public TrackPortabilityStatus(Clause title, Clause clause, ArrayList portingSteps) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(portingSteps, "portingSteps");
            this.f101275a = title;
            this.f101276b = clause;
            this.f101277c = portingSteps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TrackPortabilityStatus)) {
                return false;
            }
            TrackPortabilityStatus trackPortabilityStatus = (TrackPortabilityStatus) obj2;
            return Intrinsics.f(this.f101275a, trackPortabilityStatus.f101275a) && Intrinsics.f(this.f101276b, trackPortabilityStatus.f101276b) && this.f101277c.equals(trackPortabilityStatus.f101277c);
        }

        public final int hashCode() {
            int iHashCode = this.f101275a.hashCode() * 31;
            Clause clause = this.f101276b;
            return this.f101277c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101275a, i);
            dest.writeParcelable(this.f101276b, i);
            Iterator itY = j6.a.y(this.f101277c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$ModalStep() {
    }
}
