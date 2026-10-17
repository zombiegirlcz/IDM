package com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Institutions", "CreateMandate", "Instructions", "Branches", "Iban", "InstitutionNotAvailableDialog", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Iban;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Instructions;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EasyBankTransferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Branches extends EasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Branches> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.b f72964c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Branches(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Branches[i];
            }
        }

        public Branches(String institutionId, String coreInstitutionName, io3.b coreInstitutionLogo, boolean z) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            Intrinsics.checkNotNullParameter(coreInstitutionLogo, "coreInstitutionLogo");
            this.f72962a = institutionId;
            this.f72963b = coreInstitutionName;
            this.f72964c = coreInstitutionLogo;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Branches)) {
                return false;
            }
            Branches branches = (Branches) obj2;
            return Intrinsics.f(this.f72962a, branches.f72962a) && Intrinsics.f(this.f72963b, branches.f72963b) && Intrinsics.f(this.f72964c, branches.f72964c) && this.d == branches.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f72964c.hashCode() + p.a.c(this.f72962a.hashCode() * 31, 31, this.f72963b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72962a);
            dest.writeString(this.f72963b);
            dest.writeSerializable(this.f72964c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateMandate extends EasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateMandate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72967c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateMandate(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateMandate[i];
            }
        }

        public CreateMandate(String institutionId, String coreInstitutionName, boolean z) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            this.f72965a = institutionId;
            this.f72966b = coreInstitutionName;
            this.f72967c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateMandate)) {
                return false;
            }
            CreateMandate createMandate = (CreateMandate) obj2;
            return Intrinsics.f(this.f72965a, createMandate.f72965a) && Intrinsics.f(this.f72966b, createMandate.f72966b) && this.f72967c == createMandate.f72967c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72967c) + p.a.c(this.f72965a.hashCode() * 31, 31, this.f72966b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72965a);
            dest.writeString(this.f72966b);
            dest.writeInt(this.f72967c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Iban;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Iban extends EasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Iban> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IbanScreenContract$InputData f72970c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Iban(parcel.readString(), parcel.readString(), IbanScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Iban[i];
            }
        }

        public Iban(String institutionId, String str, IbanScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f72968a = institutionId;
            this.f72969b = str;
            this.f72970c = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Iban)) {
                return false;
            }
            Iban iban = (Iban) obj2;
            return Intrinsics.f(this.f72968a, iban.f72968a) && Intrinsics.f(this.f72969b, iban.f72969b) && Intrinsics.f(this.f72970c, iban.f72970c);
        }

        public final int hashCode() {
            int iHashCode = this.f72968a.hashCode() * 31;
            String str = this.f72969b;
            return this.f72970c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72968a);
            dest.writeString(this.f72969b);
            this.f72970c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionNotAvailableDialog extends EasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionNotAvailableDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72971a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionNotAvailableDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionNotAvailableDialog[i];
            }
        }

        public InstitutionNotAvailableDialog(String institutionName) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72971a = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionNotAvailableDialog) && Intrinsics.f(this.f72971a, ((InstitutionNotAvailableDialog) obj2).f72971a);
        }

        public final int hashCode() {
            return this.f72971a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72971a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Institutions extends EasyBankTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Institutions f72972a = new Institutions();

        @NotNull
        public static final Parcelable.Creator<Institutions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Institutions.f72972a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Institutions[i];
            }
        }

        private Institutions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step$Instructions;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/easy_bank_transfer/EasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instructions extends EasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InstitutionInstructions f72975c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instructions(parcel.readString(), parcel.readString(), (InstitutionInstructions) parcel.readParcelable(Instructions.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instructions[i];
            }
        }

        public Instructions(String institutionId, String coreInstitutionName, InstitutionInstructions instructions, boolean z) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            this.f72973a = institutionId;
            this.f72974b = coreInstitutionName;
            this.f72975c = instructions;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Instructions)) {
                return false;
            }
            Instructions instructions = (Instructions) obj2;
            return Intrinsics.f(this.f72973a, instructions.f72973a) && Intrinsics.f(this.f72974b, instructions.f72974b) && Intrinsics.f(this.f72975c, instructions.f72975c) && this.d == instructions.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f72975c.hashCode() + p.a.c(this.f72973a.hashCode() * 31, 31, this.f72974b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72973a);
            dest.writeString(this.f72974b);
            dest.writeParcelable(this.f72975c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private EasyBankTransferFlowContract$Step() {
    }
}
