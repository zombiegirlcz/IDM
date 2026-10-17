package com.revolut.feature.product.onboarding.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product.onboarding.domain.models.AddressValue;
import com.revolut.feature.product.onboarding.domain.models.CitizenshipValue;
import com.revolut.feature.product.onboarding.domain.models.DateOfBirthValue;
import com.revolut.feature.product.onboarding.domain.models.ScreenConfiguration;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.user_declarations.api.models.NamePrefill;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "DeclarationName", "DeclarationDob", "DeclarationCitizenship", "DeclarationAddress", "Workflow", "Form", "Terminal", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationAddress;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationCitizenship;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationDob;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationName;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$Form;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$Terminal;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$Workflow;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductOnboardingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationAddress;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationAddress extends ProductOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclarationAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AddressValue f81243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f81244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScreenConfiguration f81245c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationAddress(parcel.readInt() == 0 ? null : AddressValue.CREATOR.createFromParcel(parcel), (wi0.b) parcel.readSerializable(), ScreenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationAddress[i];
            }
        }

        public DeclarationAddress(AddressValue addressValue, wi0.b countryCode, ScreenConfiguration screenConfiguration) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f81243a = addressValue;
            this.f81244b = countryCode;
            this.f81245c = screenConfiguration;
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
            return Intrinsics.f(this.f81243a, declarationAddress.f81243a) && Intrinsics.f(this.f81244b, declarationAddress.f81244b) && Intrinsics.f(this.f81245c, declarationAddress.f81245c);
        }

        public final int hashCode() {
            AddressValue addressValue = this.f81243a;
            return this.f81245c.hashCode() + p.a.c((addressValue == null ? 0 : addressValue.f81213a.hashCode()) * 31, 31, this.f81244b.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AddressValue addressValue = this.f81243a;
            if (addressValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                addressValue.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f81244b);
            this.f81245c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationCitizenship;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationCitizenship extends ProductOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclarationCitizenship> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CitizenshipValue f81246a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationCitizenship(parcel.readInt() == 0 ? null : CitizenshipValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationCitizenship[i];
            }
        }

        public DeclarationCitizenship(CitizenshipValue citizenshipValue) {
            this.f81246a = citizenshipValue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeclarationCitizenship) && Intrinsics.f(this.f81246a, ((DeclarationCitizenship) obj2).f81246a);
        }

        public final int hashCode() {
            CitizenshipValue citizenshipValue = this.f81246a;
            if (citizenshipValue == null) {
                return 0;
            }
            return citizenshipValue.f81214a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            CitizenshipValue citizenshipValue = this.f81246a;
            if (citizenshipValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                citizenshipValue.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationDob;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationDob extends ProductOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclarationDob> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateOfBirthValue f81247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScreenConfiguration f81248b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationDob(parcel.readInt() == 0 ? null : DateOfBirthValue.CREATOR.createFromParcel(parcel), ScreenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationDob[i];
            }
        }

        public DeclarationDob(DateOfBirthValue dateOfBirthValue, ScreenConfiguration screenConfiguration) {
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f81247a = dateOfBirthValue;
            this.f81248b = screenConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeclarationDob)) {
                return false;
            }
            DeclarationDob declarationDob = (DeclarationDob) obj2;
            return Intrinsics.f(this.f81247a, declarationDob.f81247a) && Intrinsics.f(this.f81248b, declarationDob.f81248b);
        }

        public final int hashCode() {
            DateOfBirthValue dateOfBirthValue = this.f81247a;
            return this.f81248b.hashCode() + ((dateOfBirthValue == null ? 0 : dateOfBirthValue.f81215a.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DateOfBirthValue dateOfBirthValue = this.f81247a;
            if (dateOfBirthValue == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateOfBirthValue.writeToParcel(dest, i);
            }
            this.f81248b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$DeclarationName;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeclarationName extends ProductOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DeclarationName> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NamePrefill f81250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wi0.b f81251c;
        public final ScreenConfiguration d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeclarationName(parcel.readString(), (NamePrefill) parcel.readParcelable(DeclarationName.class.getClassLoader()), (wi0.b) parcel.readSerializable(), ScreenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeclarationName[i];
            }
        }

        public DeclarationName(String format, NamePrefill namePrefill, wi0.b countryCode, ScreenConfiguration screenConfiguration) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f81249a = format;
            this.f81250b = namePrefill;
            this.f81251c = countryCode;
            this.d = screenConfiguration;
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
            return Intrinsics.f(this.f81249a, declarationName.f81249a) && Intrinsics.f(this.f81250b, declarationName.f81250b) && Intrinsics.f(this.f81251c, declarationName.f81251c) && Intrinsics.f(this.d, declarationName.d);
        }

        public final int hashCode() {
            int iHashCode = this.f81249a.hashCode() * 31;
            NamePrefill namePrefill = this.f81250b;
            return this.d.hashCode() + p.a.c((iHashCode + (namePrefill == null ? 0 : namePrefill.hashCode())) * 31, 31, this.f81251c.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81249a);
            dest.writeParcelable(this.f81250b, i);
            dest.writeSerializable(this.f81251c);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$Form;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form extends ProductOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f81253b;

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
                return new Form(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(String formId, Map formParams) {
            Intrinsics.checkNotNullParameter(formId, "formId");
            Intrinsics.checkNotNullParameter(formParams, "formParams");
            this.f81252a = formId;
            this.f81253b = formParams;
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
            return Intrinsics.f(this.f81252a, form.f81252a) && Intrinsics.f(this.f81253b, form.f81253b);
        }

        public final int hashCode() {
            return this.f81253b.hashCode() + (this.f81252a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81252a);
            Iterator itZ = j6.a.z(this.f81253b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$Terminal;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step;", "<init>", "()V", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Terminal extends ProductOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Terminal f81254a = new Terminal();

        @NotNull
        public static final Parcelable.Creator<Terminal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Terminal.f81254a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Terminal[i];
            }
        }

        private Terminal() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step$Workflow;", "Lcom/revolut/feature/product/onboarding/flow/ProductOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_product_onboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends ProductOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81255a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f81255a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Workflow) && Intrinsics.f(this.f81255a, ((Workflow) obj2).f81255a);
        }

        public final int hashCode() {
            return this.f81255a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81255a);
        }
    }

    private ProductOnboardingFlowContract$Step() {
    }
}
