package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$UiConfiguration;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PersonalDetails", "DetailsConfirmation", "TermsAndConditions", "JuniorMatchPrompt", "OverRegistrationAgePrompt", "InviteJunior", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$DetailsConfirmation;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$InviteJunior;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$JuniorMatchPrompt;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$OverRegistrationAgePrompt;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$PersonalDetails;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$TermsAndConditions;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorPersonalDataCreationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$DetailsConfirmation;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailsConfirmation implements JuniorPersonalDataCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DetailsConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PersonalDetailsForm f77006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JuniorDetailsConfirmationScreenContract$UiConfiguration f77007b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DetailsConfirmation(PersonalDetailsForm.CREATOR.createFromParcel(parcel), JuniorDetailsConfirmationScreenContract$UiConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailsConfirmation[i];
            }
        }

        public DetailsConfirmation(PersonalDetailsForm personalDetailsForm, JuniorDetailsConfirmationScreenContract$UiConfiguration uiConfiguration) {
            Intrinsics.checkNotNullParameter(personalDetailsForm, "personalDetailsForm");
            Intrinsics.checkNotNullParameter(uiConfiguration, "uiConfiguration");
            this.f77006a = personalDetailsForm;
            this.f77007b = uiConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailsConfirmation)) {
                return false;
            }
            DetailsConfirmation detailsConfirmation = (DetailsConfirmation) obj2;
            return Intrinsics.f(this.f77006a, detailsConfirmation.f77006a) && Intrinsics.f(this.f77007b, detailsConfirmation.f77007b);
        }

        public final int hashCode() {
            return this.f77007b.hashCode() + (this.f77006a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77006a.writeToParcel(dest, i);
            this.f77007b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$InviteJunior;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InviteJunior implements JuniorPersonalDataCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InviteJunior f77008a = new InviteJunior();

        @NotNull
        public static final Parcelable.Creator<InviteJunior> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InviteJunior.f77008a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteJunior[i];
            }
        }

        private InviteJunior() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$JuniorMatchPrompt;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorMatchPrompt implements JuniorPersonalDataCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JuniorMatchPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PersonalDetailsForm f77009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f77010b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorMatchPrompt(PersonalDetailsForm.CREATOR.createFromParcel(parcel), (PromptMarketingScreenContract$InputData) parcel.readParcelable(JuniorMatchPrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorMatchPrompt[i];
            }
        }

        public JuniorMatchPrompt(PersonalDetailsForm personalDetailsForm, PromptMarketingScreenContract$InputData promptInputData) {
            Intrinsics.checkNotNullParameter(personalDetailsForm, "personalDetailsForm");
            Intrinsics.checkNotNullParameter(promptInputData, "promptInputData");
            this.f77009a = personalDetailsForm;
            this.f77010b = promptInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorMatchPrompt)) {
                return false;
            }
            JuniorMatchPrompt juniorMatchPrompt = (JuniorMatchPrompt) obj2;
            return Intrinsics.f(this.f77009a, juniorMatchPrompt.f77009a) && Intrinsics.f(this.f77010b, juniorMatchPrompt.f77010b);
        }

        public final int hashCode() {
            return this.f77010b.hashCode() + (this.f77009a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77009a.writeToParcel(dest, i);
            dest.writeParcelable(this.f77010b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$OverRegistrationAgePrompt;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverRegistrationAgePrompt implements JuniorPersonalDataCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OverRegistrationAgePrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f77011a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverRegistrationAgePrompt((PromptMarketingScreenContract$InputData) parcel.readParcelable(OverRegistrationAgePrompt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverRegistrationAgePrompt[i];
            }
        }

        public OverRegistrationAgePrompt(PromptMarketingScreenContract$InputData promptInputData) {
            Intrinsics.checkNotNullParameter(promptInputData, "promptInputData");
            this.f77011a = promptInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OverRegistrationAgePrompt) && Intrinsics.f(this.f77011a, ((OverRegistrationAgePrompt) obj2).f77011a);
        }

        public final int hashCode() {
            return this.f77011a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77011a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$PersonalDetails;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PersonalDetails implements JuniorPersonalDataCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PersonalDetails f77012a = new PersonalDetails();

        @NotNull
        public static final Parcelable.Creator<PersonalDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PersonalDetails.f77012a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalDetails[i];
            }
        }

        private PersonalDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step$TermsAndConditions;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/JuniorPersonalDataCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions implements JuniorPersonalDataCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PersonalDetailsForm f77013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f77014b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PersonalDetailsForm personalDetailsFormCreateFromParcel = PersonalDetailsForm.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new TermsAndConditions(personalDetailsFormCreateFromParcel, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        public TermsAndConditions(PersonalDetailsForm personalDetailsForm, Map consents) {
            Intrinsics.checkNotNullParameter(personalDetailsForm, "personalDetailsForm");
            Intrinsics.checkNotNullParameter(consents, "consents");
            this.f77013a = personalDetailsForm;
            this.f77014b = consents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj2;
            return Intrinsics.f(this.f77013a, termsAndConditions.f77013a) && Intrinsics.f(this.f77014b, termsAndConditions.f77014b);
        }

        public final int hashCode() {
            return this.f77014b.hashCode() + (this.f77013a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f77013a.writeToParcel(dest, i);
            Iterator itZ = j6.a.z(this.f77014b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
            }
        }
    }
}
