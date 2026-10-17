package com.revolut.feature.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.DevelopmentOnlyFeatureDefinition;
import com.revolut.feature.toggles.models.LocalFeatureState;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class KycApi$FeatureToggle {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$DisableIdNowVideoConferenceCloseButton;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DisableIdNowVideoConferenceCloseButton extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DisableIdNowVideoConferenceCloseButton f77459c = new DisableIdNowVideoConferenceCloseButton();

        @NotNull
        public static final Parcelable.Creator<DisableIdNowVideoConferenceCloseButton> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DisableIdNowVideoConferenceCloseButton.f77459c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisableIdNowVideoConferenceCloseButton[i];
            }
        }

        private DisableIdNowVideoConferenceCloseButton() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("disableIdNowVideoConferenceCloseButton");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$EnableIncodeTestMode;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnableIncodeTestMode extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnableIncodeTestMode f77460a = new EnableIncodeTestMode();

        @NotNull
        public static final Parcelable.Creator<EnableIncodeTestMode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnableIncodeTestMode.f77460a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnableIncodeTestMode[i];
            }
        }

        private EnableIncodeTestMode() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            od0.a aVar = od0.a.f224253a;
            return new LocalFeatureState.Binary(od0.a.i());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$EnableOnfidoMotionAudioRecording;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EnableOnfidoMotionAudioRecording extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnableOnfidoMotionAudioRecording f77461c = new EnableOnfidoMotionAudioRecording();

        @NotNull
        public static final Parcelable.Creator<EnableOnfidoMotionAudioRecording> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnableOnfidoMotionAudioRecording.f77461c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnableOnfidoMotionAudioRecording[i];
            }
        }

        private EnableOnfidoMotionAudioRecording() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("enableOnfidoMotionAudioRecording");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$IncodeCombinedMethod;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncodeCombinedMethod extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final IncodeCombinedMethod f77462c = new IncodeCombinedMethod();

        @NotNull
        public static final Parcelable.Creator<IncodeCombinedMethod> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncodeCombinedMethod.f77462c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncodeCombinedMethod[i];
            }
        }

        private IncodeCombinedMethod() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("incodeCombinedMethod");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$KycKompotMigration;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KycKompotMigration extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final KycKompotMigration f77463c = new KycKompotMigration();

        @NotNull
        public static final Parcelable.Creator<KycKompotMigration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KycKompotMigration.f77463c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycKompotMigration[i];
            }
        }

        private KycKompotMigration() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("kycKompotMigration");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$KycPreOrderInformation;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KycPreOrderInformation extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final KycPreOrderInformation f77464c = new KycPreOrderInformation();

        @NotNull
        public static final Parcelable.Creator<KycPreOrderInformation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KycPreOrderInformation.f77464c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycPreOrderInformation[i];
            }
        }

        private KycPreOrderInformation() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("kycPreOrderInformation");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$KycStatusChecklist;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KycStatusChecklist extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final KycStatusChecklist f77465c = new KycStatusChecklist();

        @NotNull
        public static final Parcelable.Creator<KycStatusChecklist> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KycStatusChecklist.f77465c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycStatusChecklist[i];
            }
        }

        private KycStatusChecklist() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("kycStatusChecklist");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/KycApi$FeatureToggle$SimplifiedKyc;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SimplifiedKyc extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SimplifiedKyc f77466c = new SimplifiedKyc();

        @NotNull
        public static final Parcelable.Creator<SimplifiedKyc> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SimplifiedKyc.f77466c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimplifiedKyc[i];
            }
        }

        private SimplifiedKyc() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("simplifiedDocumentsSelection");
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

    private KycApi$FeatureToggle() {
    }

    public static List a() {
        return v.k(SimplifiedKyc.f77466c, EnableOnfidoMotionAudioRecording.f77461c, DisableIdNowVideoConferenceCloseButton.f77459c, KycStatusChecklist.f77465c, KycPreOrderInformation.f77464c, EnableIncodeTestMode.f77460a, IncodeCombinedMethod.f77462c, KycKompotMigration.f77463c);
    }
}
