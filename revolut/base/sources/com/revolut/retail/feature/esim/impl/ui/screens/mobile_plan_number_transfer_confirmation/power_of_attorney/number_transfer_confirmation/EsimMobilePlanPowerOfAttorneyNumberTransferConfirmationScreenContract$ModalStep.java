package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation;

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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ServiceProviderPicker", "ContractTypePicker", "PortingPreferredSchedulePicker", "PhoneNumberTypePicker", "TrackPortabilityStatus", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$ContractTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$PhoneNumberTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$PortingPreferredSchedulePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$ServiceProviderPicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$ContractTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContractTypePicker extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ContractTypePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f101344a;

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

        public ContractTypePicker(ArrayList contractType) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            this.f101344a = contractType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContractTypePicker) && this.f101344a.equals(((ContractTypePicker) obj2).f101344a);
        }

        public final int hashCode() {
            return this.f101344a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f101344a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$PhoneNumberTypePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumberTypePicker extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PhoneNumberTypePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPortingOwnerAccountType f101345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f101346b;

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

        public PhoneNumberTypePicker(EsimPhoneNumberPortingOwnerAccountType selectedPhoneNumberType, ArrayList ownerAccountTypes) {
            Intrinsics.checkNotNullParameter(selectedPhoneNumberType, "selectedPhoneNumberType");
            Intrinsics.checkNotNullParameter(ownerAccountTypes, "ownerAccountTypes");
            this.f101345a = selectedPhoneNumberType;
            this.f101346b = ownerAccountTypes;
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
            return Intrinsics.f(this.f101345a, phoneNumberTypePicker.f101345a) && this.f101346b.equals(phoneNumberTypePicker.f101346b);
        }

        public final int hashCode() {
            return this.f101346b.hashCode() + (this.f101345a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101345a, i);
            Iterator itY = j6.a.y(this.f101346b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$PortingPreferredSchedulePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortingPreferredSchedulePicker extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortingPreferredSchedulePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPortingContractType f101347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberPortingPreferredSchedule f101348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPortingInstruction f101349c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortingPreferredSchedulePicker((EsimPhoneNumberPortingContractType) parcel.readParcelable(PortingPreferredSchedulePicker.class.getClassLoader()), (EsimPhoneNumberPortingPreferredSchedule) parcel.readParcelable(PortingPreferredSchedulePicker.class.getClassLoader()), (EsimPhoneNumberPortingInstruction) parcel.readParcelable(PortingPreferredSchedulePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortingPreferredSchedulePicker[i];
            }
        }

        public PortingPreferredSchedulePicker(EsimPhoneNumberPortingContractType selectedContractType, EsimPhoneNumberPortingPreferredSchedule preferredSchedule, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction) {
            Intrinsics.checkNotNullParameter(selectedContractType, "selectedContractType");
            Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
            this.f101347a = selectedContractType;
            this.f101348b = preferredSchedule;
            this.f101349c = esimPhoneNumberPortingInstruction;
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
            return Intrinsics.f(this.f101347a, portingPreferredSchedulePicker.f101347a) && Intrinsics.f(this.f101348b, portingPreferredSchedulePicker.f101348b) && Intrinsics.f(this.f101349c, portingPreferredSchedulePicker.f101349c);
        }

        public final int hashCode() {
            int iHashCode = (this.f101348b.hashCode() + (this.f101347a.hashCode() * 31)) * 31;
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f101349c;
            return iHashCode + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101347a, i);
            dest.writeParcelable(this.f101348b, i);
            dest.writeParcelable(this.f101349c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$ServiceProviderPicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ServiceProviderPicker extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ServiceProviderPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f101350a;

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

        public ServiceProviderPicker(ArrayList serviceProviders) {
            Intrinsics.checkNotNullParameter(serviceProviders, "serviceProviders");
            this.f101350a = serviceProviders;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ServiceProviderPicker) && this.f101350a.equals(((ServiceProviderPicker) obj2).f101350a);
        }

        public final int hashCode() {
            return this.f101350a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f101350a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackPortabilityStatus extends EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TrackPortabilityStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f101351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f101352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f101353c;

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
            this.f101351a = title;
            this.f101352b = clause;
            this.f101353c = portingSteps;
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
            return Intrinsics.f(this.f101351a, trackPortabilityStatus.f101351a) && Intrinsics.f(this.f101352b, trackPortabilityStatus.f101352b) && this.f101353c.equals(trackPortabilityStatus.f101353c);
        }

        public final int hashCode() {
            int iHashCode = this.f101351a.hashCode() * 31;
            Clause clause = this.f101352b;
            return this.f101353c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101351a, i);
            dest.writeParcelable(this.f101352b, i);
            Iterator itY = j6.a.y(this.f101353c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep() {
    }
}
