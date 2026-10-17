package com.revolut.feature.onboarding.api.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import b0m.b;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import com.revolut.utils.tracking.ab_testing.experiments.FirebaseExperiment;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r81.d;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class OnboardingApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/onboarding/OnboardingApi$Toggles$SpecificCountryTerms;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpecificCountryTerms extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SpecificCountryTerms f78182c = new SpecificCountryTerms();

        @NotNull
        public static final Parcelable.Creator<SpecificCountryTerms> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpecificCountryTerms.f78182c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpecificCountryTerms[i];
            }
        }

        private SpecificCountryTerms() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return SpecificCountryTermsFirebaseExperiment.f78183c;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/onboarding/OnboardingApi$Toggles$SpecificCountryTermsFirebaseExperiment;", "Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpecificCountryTermsFirebaseExperiment extends FirebaseExperiment {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SpecificCountryTermsFirebaseExperiment f78183c = new SpecificCountryTermsFirebaseExperiment();

        @NotNull
        public static final Parcelable.Creator<SpecificCountryTermsFirebaseExperiment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpecificCountryTermsFirebaseExperiment.f78183c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpecificCountryTermsFirebaseExperiment[i];
            }
        }

        private SpecificCountryTermsFirebaseExperiment() {
        }

        @Override // com.revolut.feature.abexperiments.models.Experiment
        /* JADX INFO: renamed from: Q8 */
        public final Set getE() {
            d[] elements = {new d(b.EXPERIMENT_VALUE_A, "Specific terms disabled"), new d(b.EXPERIMENT_VALUE_B, "Specific terms enabled")};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.y0(elements);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.abexperiments.models.Experiment
        /* JADX INFO: renamed from: w7 */
        public final String getF60553a() {
            return "EID_COR_ENTITY_FOOTER";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/onboarding/OnboardingApi$Toggles$SpecificPortugalDisclosure;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpecificPortugalDisclosure extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SpecificPortugalDisclosure f78184c = new SpecificPortugalDisclosure();

        @NotNull
        public static final Parcelable.Creator<SpecificPortugalDisclosure> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpecificPortugalDisclosure.f78184c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpecificPortugalDisclosure[i];
            }
        }

        private SpecificPortugalDisclosure() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return SpecificPortugalDisclosureFirebaseExperiment.f78185c;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/onboarding/OnboardingApi$Toggles$SpecificPortugalDisclosureFirebaseExperiment;", "Lcom/revolut/utils/tracking/ab_testing/experiments/FirebaseExperiment;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpecificPortugalDisclosureFirebaseExperiment extends FirebaseExperiment {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SpecificPortugalDisclosureFirebaseExperiment f78185c = new SpecificPortugalDisclosureFirebaseExperiment();

        @NotNull
        public static final Parcelable.Creator<SpecificPortugalDisclosureFirebaseExperiment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpecificPortugalDisclosureFirebaseExperiment.f78185c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpecificPortugalDisclosureFirebaseExperiment[i];
            }
        }

        private SpecificPortugalDisclosureFirebaseExperiment() {
        }

        @Override // com.revolut.feature.abexperiments.models.Experiment
        /* JADX INFO: renamed from: Q8 */
        public final Set getE() {
            d[] elements = {new d(b.EXPERIMENT_VALUE_A, "Specific Portugal terms disabled"), new d(b.EXPERIMENT_VALUE_B, "Specific Portugal terms enabled")};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.y0(elements);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.abexperiments.models.Experiment
        /* JADX INFO: renamed from: w7 */
        public final String getF60553a() {
            return "EID_PT_COUNTRY_TERMS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private OnboardingApi$Toggles() {
    }

    public static List a() {
        return v.k(SpecificPortugalDisclosure.f78184c, SpecificCountryTerms.f78182c);
    }
}
