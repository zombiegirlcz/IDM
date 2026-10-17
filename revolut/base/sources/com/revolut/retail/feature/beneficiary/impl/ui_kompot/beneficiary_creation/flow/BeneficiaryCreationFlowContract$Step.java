package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import do3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AccountFields", "MissingFields", "Address", "ConfirmationOfPayee", "DuplicateBeneficiary", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$AccountFields;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$Address;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$ConfirmationOfPayee;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$DuplicateBeneficiary;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$MissingFields;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BeneficiaryCreationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$AccountFields;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountFields implements BeneficiaryCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountFields> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BeneficiaryCreationKompotInputData.CreationConfiguration f99740a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountFields((BeneficiaryCreationKompotInputData.CreationConfiguration) parcel.readParcelable(AccountFields.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountFields[i];
            }
        }

        public AccountFields(BeneficiaryCreationKompotInputData.CreationConfiguration creationConfig) {
            Intrinsics.checkNotNullParameter(creationConfig, "creationConfig");
            this.f99740a = creationConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountFields) && Intrinsics.f(this.f99740a, ((AccountFields) obj2).f99740a);
        }

        public final int hashCode() {
            return this.f99740a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99740a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$Address;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address implements BeneficiaryCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BeneficiaryCreationFlowContract$CreationProcessState f99741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f99742b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(BeneficiaryCreationFlowContract$CreationProcessState.CREATOR.createFromParcel(parcel), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(BeneficiaryCreationFlowContract$CreationProcessState creationProcessState, wi0.b preselectedCountry) {
            Intrinsics.checkNotNullParameter(creationProcessState, "creationProcessState");
            Intrinsics.checkNotNullParameter(preselectedCountry, "preselectedCountry");
            this.f99741a = creationProcessState;
            this.f99742b = preselectedCountry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Address)) {
                return false;
            }
            Address address = (Address) obj2;
            return Intrinsics.f(this.f99741a, address.f99741a) && Intrinsics.f(this.f99742b, address.f99742b);
        }

        public final int hashCode() {
            return this.f99742b.f297794a.hashCode() + (this.f99741a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99741a.writeToParcel(dest, i);
            dest.writeSerializable(this.f99742b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$ConfirmationOfPayee;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationOfPayee implements BeneficiaryCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmationOfPayee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BeneficiaryCreationFlowContract$CreationProcessState f99743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConfirmationResult f99744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f99745c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmationOfPayee(BeneficiaryCreationFlowContract$CreationProcessState.CREATOR.createFromParcel(parcel), (ConfirmationResult) parcel.readParcelable(ConfirmationOfPayee.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationOfPayee[i];
            }
        }

        public ConfirmationOfPayee(BeneficiaryCreationFlowContract$CreationProcessState creationProcessState, ConfirmationResult confirmationResult, String loadingButtonTag) {
            Intrinsics.checkNotNullParameter(creationProcessState, "creationProcessState");
            Intrinsics.checkNotNullParameter(confirmationResult, "confirmationResult");
            Intrinsics.checkNotNullParameter(loadingButtonTag, "loadingButtonTag");
            this.f99743a = creationProcessState;
            this.f99744b = confirmationResult;
            this.f99745c = loadingButtonTag;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmationOfPayee)) {
                return false;
            }
            ConfirmationOfPayee confirmationOfPayee = (ConfirmationOfPayee) obj2;
            return Intrinsics.f(this.f99743a, confirmationOfPayee.f99743a) && Intrinsics.f(this.f99744b, confirmationOfPayee.f99744b) && Intrinsics.f(this.f99745c, confirmationOfPayee.f99745c);
        }

        public final int hashCode() {
            return this.f99745c.hashCode() + ((this.f99744b.hashCode() + (this.f99743a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99743a.writeToParcel(dest, i);
            dest.writeParcelable(this.f99744b, i);
            dest.writeString(this.f99745c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$DuplicateBeneficiary;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DuplicateBeneficiary implements BeneficiaryCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DuplicateBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f99746a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DuplicateBeneficiary((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DuplicateBeneficiary[i];
            }
        }

        public DuplicateBeneficiary(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f99746a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DuplicateBeneficiary) && Intrinsics.f(this.f99746a, ((DuplicateBeneficiary) obj2).f99746a);
        }

        public final int hashCode() {
            return this.f99746a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99746a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step$MissingFields;", "Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/flow/BeneficiaryCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MissingFields implements BeneficiaryCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MissingFields> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BeneficiaryCreationFlowContract$CreationProcessState f99747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f99748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f99749c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BeneficiaryCreationFlowContract$CreationProcessState beneficiaryCreationFlowContract$CreationProcessStateCreateFromParcel = BeneficiaryCreationFlowContract$CreationProcessState.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(MissingFields.class, parcel, arrayList, iE, 1);
                }
                return new MissingFields(beneficiaryCreationFlowContract$CreationProcessStateCreateFromParcel, arrayList, (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MissingFields[i];
            }
        }

        public MissingFields(BeneficiaryCreationFlowContract$CreationProcessState creationProcessState, List missingFields, n user) {
            Intrinsics.checkNotNullParameter(creationProcessState, "creationProcessState");
            Intrinsics.checkNotNullParameter(missingFields, "missingFields");
            Intrinsics.checkNotNullParameter(user, "user");
            this.f99747a = creationProcessState;
            this.f99748b = missingFields;
            this.f99749c = user;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MissingFields)) {
                return false;
            }
            MissingFields missingFields = (MissingFields) obj2;
            return Intrinsics.f(this.f99747a, missingFields.f99747a) && Intrinsics.f(this.f99748b, missingFields.f99748b) && Intrinsics.f(this.f99749c, missingFields.f99749c);
        }

        public final int hashCode() {
            return this.f99749c.hashCode() + p.a.d(this.f99747a.hashCode() * 31, 31, this.f99748b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99747a.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f99748b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeSerializable(this.f99749c);
        }
    }
}
