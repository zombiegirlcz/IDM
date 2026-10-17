package com.revolut.feature.product.onboarding.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.user_declarations.api.models.NamePrefill;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "Landroid/os/Parcelable;", "Companion", "DeclarationName", "DeclarationDateOfBirth", "DeclarationCitizenship", "DeclarationAddress", "Form", "Workflow", "Terminal", "a", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationAddress;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationCitizenship;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationDateOfBirth;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationName;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$Form;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$Terminal;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$Workflow;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductOnboardingStep extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f81238a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationAddress;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationAddress implements ProductOnboardingStep {

        @NotNull
        public static final Parcelable.Creator<DeclarationAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uja.a f81220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScreenConfiguration f81221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AddressValue f81222c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationAddress(uja.a.valueOf(parcel.readString()), ScreenConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AddressValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationAddress[i];
            }
        }

        public DeclarationAddress(uja.a state, ScreenConfiguration screenConfiguration, AddressValue addressValue) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f81220a = state;
            this.f81221b = screenConfiguration;
            this.f81222c = addressValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclarationAddress)) {
                return false;
            }
            DeclarationAddress declarationAddress = (DeclarationAddress) obj2;
            return this.f81220a == declarationAddress.f81220a && Intrinsics.f(this.f81221b, declarationAddress.f81221b) && Intrinsics.f(this.f81222c, declarationAddress.f81222c);
        }

        public final int hashCode() {
            int iHashCode = (this.f81221b.hashCode() + (this.f81220a.hashCode() * 31)) * 31;
            AddressValue addressValue = this.f81222c;
            return iHashCode + (addressValue == null ? 0 : addressValue.f81213a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81220a.name());
            this.f81221b.writeToParcel(dest, i);
            AddressValue addressValue = this.f81222c;
            if (addressValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                addressValue.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationCitizenship;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationCitizenship implements ProductOnboardingStep {

        @NotNull
        public static final Parcelable.Creator<DeclarationCitizenship> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uja.a f81223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScreenConfiguration f81224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CitizenshipValue f81225c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationCitizenship(uja.a.valueOf(parcel.readString()), ScreenConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CitizenshipValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationCitizenship[i];
            }
        }

        public DeclarationCitizenship(uja.a state, ScreenConfiguration screenConfiguration, CitizenshipValue citizenshipValue) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f81223a = state;
            this.f81224b = screenConfiguration;
            this.f81225c = citizenshipValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclarationCitizenship)) {
                return false;
            }
            DeclarationCitizenship declarationCitizenship = (DeclarationCitizenship) obj2;
            return this.f81223a == declarationCitizenship.f81223a && Intrinsics.f(this.f81224b, declarationCitizenship.f81224b) && Intrinsics.f(this.f81225c, declarationCitizenship.f81225c);
        }

        public final int hashCode() {
            int iHashCode = (this.f81224b.hashCode() + (this.f81223a.hashCode() * 31)) * 31;
            CitizenshipValue citizenshipValue = this.f81225c;
            return iHashCode + (citizenshipValue == null ? 0 : citizenshipValue.f81214a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81223a.name());
            this.f81224b.writeToParcel(dest, i);
            CitizenshipValue citizenshipValue = this.f81225c;
            if (citizenshipValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                citizenshipValue.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationDateOfBirth;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationDateOfBirth implements ProductOnboardingStep {

        @NotNull
        public static final Parcelable.Creator<DeclarationDateOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uja.a f81226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScreenConfiguration f81227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DateOfBirthValue f81228c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationDateOfBirth(uja.a.valueOf(parcel.readString()), ScreenConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DateOfBirthValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationDateOfBirth[i];
            }
        }

        public DeclarationDateOfBirth(uja.a state, ScreenConfiguration screenConfiguration, DateOfBirthValue dateOfBirthValue) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f81226a = state;
            this.f81227b = screenConfiguration;
            this.f81228c = dateOfBirthValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclarationDateOfBirth)) {
                return false;
            }
            DeclarationDateOfBirth declarationDateOfBirth = (DeclarationDateOfBirth) obj2;
            return this.f81226a == declarationDateOfBirth.f81226a && Intrinsics.f(this.f81227b, declarationDateOfBirth.f81227b) && Intrinsics.f(this.f81228c, declarationDateOfBirth.f81228c);
        }

        public final int hashCode() {
            int iHashCode = (this.f81227b.hashCode() + (this.f81226a.hashCode() * 31)) * 31;
            DateOfBirthValue dateOfBirthValue = this.f81228c;
            return iHashCode + (dateOfBirthValue == null ? 0 : dateOfBirthValue.f81215a.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81226a.name());
            this.f81227b.writeToParcel(dest, i);
            DateOfBirthValue dateOfBirthValue = this.f81228c;
            if (dateOfBirthValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateOfBirthValue.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$DeclarationName;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationName implements ProductOnboardingStep {

        @NotNull
        public static final Parcelable.Creator<DeclarationName> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uja.a f81229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScreenConfiguration f81230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81231c;
        public final NamePrefill d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationName(uja.a.valueOf(parcel.readString()), ScreenConfiguration.CREATOR.createFromParcel(parcel), parcel.readString(), (NamePrefill) parcel.readParcelable(DeclarationName.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationName[i];
            }
        }

        public DeclarationName(uja.a state, ScreenConfiguration screenConfiguration, String format, NamePrefill namePrefill) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            Intrinsics.checkNotNullParameter(format, "format");
            this.f81229a = state;
            this.f81230b = screenConfiguration;
            this.f81231c = format;
            this.d = namePrefill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclarationName)) {
                return false;
            }
            DeclarationName declarationName = (DeclarationName) obj2;
            return this.f81229a == declarationName.f81229a && Intrinsics.f(this.f81230b, declarationName.f81230b) && Intrinsics.f(this.f81231c, declarationName.f81231c) && Intrinsics.f(this.d, declarationName.d);
        }

        public final int hashCode() {
            int iC = p.a.c((this.f81230b.hashCode() + (this.f81229a.hashCode() * 31)) * 31, 31, this.f81231c);
            NamePrefill namePrefill = this.d;
            return iC + (namePrefill == null ? 0 : namePrefill.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81229a.name());
            this.f81230b.writeToParcel(dest, i);
            dest.writeString(this.f81231c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$Form;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form implements ProductOnboardingStep {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uja.a f81232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f81234c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                uja.a aVarValueOf = uja.a.valueOf(parcel.readString());
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Form(aVarValueOf, string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(uja.a state, String formId, Map formParams) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(formId, "formId");
            Intrinsics.checkNotNullParameter(formParams, "formParams");
            this.f81232a = state;
            this.f81233b = formId;
            this.f81234c = formParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Form)) {
                return false;
            }
            Form form = (Form) obj2;
            return this.f81232a == form.f81232a && Intrinsics.f(this.f81233b, form.f81233b) && Intrinsics.f(this.f81234c, form.f81234c);
        }

        public final int hashCode() {
            return this.f81234c.hashCode() + p.a.c(this.f81232a.hashCode() * 31, 31, this.f81233b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81232a.name());
            dest.writeString(this.f81233b);
            Iterator itZ = j6.a.z(this.f81234c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$Terminal;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Terminal implements ProductOnboardingStep {

        @NotNull
        public static final Parcelable.Creator<Terminal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uja.a f81235a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Terminal(uja.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terminal[i];
            }
        }

        public Terminal(uja.a state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f81235a = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Terminal) && this.f81235a == ((Terminal) obj2).f81235a;
        }

        public final int hashCode() {
            return this.f81235a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81235a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep$Workflow;", "Lcom/revolut/feature/product/onboarding/domain/models/ProductOnboardingStep;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow implements ProductOnboardingStep {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uja.a f81236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81237b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(uja.a.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(uja.a state, String workflowId) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f81236a = state;
            this.f81237b = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Workflow)) {
                return false;
            }
            Workflow workflow = (Workflow) obj2;
            return this.f81236a == workflow.f81236a && Intrinsics.f(this.f81237b, workflow.f81237b);
        }

        public final int hashCode() {
            return this.f81237b.hashCode() + (this.f81236a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81236a.name());
            dest.writeString(this.f81237b);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.product.onboarding.domain.models.ProductOnboardingStep$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f81238a = new Companion();

        private Companion() {
        }
    }
}
