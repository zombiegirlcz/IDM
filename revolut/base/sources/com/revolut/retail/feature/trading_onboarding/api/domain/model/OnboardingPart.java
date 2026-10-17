package com.revolut.retail.feature.trading_onboarding.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPartType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006.À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "Landroid/os/Parcelable;", "RiskDisclosureSigned", "ComplexBondsSurvey", "ComplexBondsCooldown", "RiskDisclosure", "KycDetails", "KycNationalities", "KycDocuments", "KycDocumentation", "Survey", "RoboRiskSurvey", "RoboSurvey", "PeriodicReview", "FATCA", "Acknowledgements", "W8BEN", "SpousalConsent", "Workflow", "Completed", "MarginSurvey", "MarginSurveyWithPrompt", "OTP", "ComplexEtpSurvey", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Acknowledgements;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Completed;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$ComplexBondsCooldown;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$ComplexBondsSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$ComplexEtpSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$FATCA;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycDetails;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycDocumentation;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycDocuments;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycNationalities;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$MarginSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$MarginSurveyWithPrompt;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$OTP;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$PeriodicReview;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RiskDisclosure;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RiskDisclosureSigned;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RoboRiskSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RoboSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$SpousalConsent;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Survey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$W8BEN;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Workflow;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnboardingPart extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Acknowledgements;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Acknowledgements implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Acknowledgements f104071a = new Acknowledgements();

        @NotNull
        public static final Parcelable.Creator<Acknowledgements> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Acknowledgements.f104071a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Acknowledgements[i];
            }
        }

        private Acknowledgements() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "ACKNOWLEDGEMENTS";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Completed;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Completed implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Completed f104072a = new Completed();

        @NotNull
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Completed.f104072a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        private Completed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "COMPLETED";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$ComplexBondsCooldown;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ComplexBondsCooldown implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComplexBondsCooldown f104073a = new ComplexBondsCooldown();

        @NotNull
        public static final Parcelable.Creator<ComplexBondsCooldown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ComplexBondsCooldown.f104073a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComplexBondsCooldown[i];
            }
        }

        private ComplexBondsCooldown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "COMPLEX_BONDS_COOLDOWN";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$ComplexBondsSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ComplexBondsSurvey implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComplexBondsSurvey f104074a = new ComplexBondsSurvey();

        @NotNull
        public static final Parcelable.Creator<ComplexBondsSurvey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ComplexBondsSurvey.f104074a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComplexBondsSurvey[i];
            }
        }

        private ComplexBondsSurvey() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "COMPLEX_BONDS_SURVEY";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$ComplexEtpSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ComplexEtpSurvey implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComplexEtpSurvey f104075a = new ComplexEtpSurvey();

        @NotNull
        public static final Parcelable.Creator<ComplexEtpSurvey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ComplexEtpSurvey.f104075a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ComplexEtpSurvey[i];
            }
        }

        private ComplexEtpSurvey() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "COMPLEX_ETP_SURVEY";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$FATCA;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FATCA implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FATCA f104076a = new FATCA();

        @NotNull
        public static final Parcelable.Creator<FATCA> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FATCA.f104076a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FATCA[i];
            }
        }

        private FATCA() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "FATCA";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycDetails;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KycDetails implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KycDetails f104077a = new KycDetails();

        @NotNull
        public static final Parcelable.Creator<KycDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KycDetails.f104077a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycDetails[i];
            }
        }

        private KycDetails() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "KYC_DETAILS";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycDocumentation;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KycDocumentation implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KycDocumentation f104078a = new KycDocumentation();

        @NotNull
        public static final Parcelable.Creator<KycDocumentation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KycDocumentation.f104078a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycDocumentation[i];
            }
        }

        private KycDocumentation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "KYC_DOCUMENTATION";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycDocuments;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KycDocuments implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KycDocuments f104079a = new KycDocuments();

        @NotNull
        public static final Parcelable.Creator<KycDocuments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KycDocuments.f104079a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycDocuments[i];
            }
        }

        private KycDocuments() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "KYC_DOCUMENTS";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$KycNationalities;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KycNationalities implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KycNationalities f104080a = new KycNationalities();

        @NotNull
        public static final Parcelable.Creator<KycNationalities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KycNationalities.f104080a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KycNationalities[i];
            }
        }

        private KycNationalities() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "KYC_NATIONALITIES";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$MarginSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MarginSurvey implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MarginSurvey f104081a = new MarginSurvey();

        @NotNull
        public static final Parcelable.Creator<MarginSurvey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarginSurvey.f104081a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginSurvey[i];
            }
        }

        private MarginSurvey() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "MARGIN_SURVEY";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$MarginSurveyWithPrompt;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MarginSurveyWithPrompt implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MarginSurveyWithPrompt f104082a = new MarginSurveyWithPrompt();

        @NotNull
        public static final Parcelable.Creator<MarginSurveyWithPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarginSurveyWithPrompt.f104082a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginSurveyWithPrompt[i];
            }
        }

        private MarginSurveyWithPrompt() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "MARGIN_DISCLAIMER_PROMPT";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$OTP;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OTP implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OTP f104083a = new OTP();

        @NotNull
        public static final Parcelable.Creator<OTP> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OTP.f104083a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OTP[i];
            }
        }

        private OTP() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "OTP";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$PeriodicReview;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PeriodicReview implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PeriodicReview f104084a = new PeriodicReview();

        @NotNull
        public static final Parcelable.Creator<PeriodicReview> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PeriodicReview.f104084a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeriodicReview[i];
            }
        }

        private PeriodicReview() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "PERIODIC_REVIEW";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RiskDisclosure;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RiskDisclosure implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RiskDisclosure f104085a = new RiskDisclosure();

        @NotNull
        public static final Parcelable.Creator<RiskDisclosure> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RiskDisclosure.f104085a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskDisclosure[i];
            }
        }

        private RiskDisclosure() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "RISK_DISCLOSURE";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RiskDisclosureSigned;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RiskDisclosureSigned implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RiskDisclosureSigned f104086a = new RiskDisclosureSigned();

        @NotNull
        public static final Parcelable.Creator<RiskDisclosureSigned> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RiskDisclosureSigned.f104086a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskDisclosureSigned[i];
            }
        }

        private RiskDisclosureSigned() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "RISK_DISCLOSURE_SIGNED";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RoboRiskSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final class RoboRiskSurvey implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RoboRiskSurvey f104087a = new RoboRiskSurvey();

        @NotNull
        public static final Parcelable.Creator<RoboRiskSurvey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoboRiskSurvey.f104087a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboRiskSurvey[i];
            }
        }

        private RoboRiskSurvey() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "ROBO_RISK_SURVEY";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$RoboSurvey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RoboSurvey implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RoboSurvey f104088a = new RoboSurvey();

        @NotNull
        public static final Parcelable.Creator<RoboSurvey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoboSurvey.f104088a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboSurvey[i];
            }
        }

        private RoboSurvey() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "ROBO_SURVEY";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$SpousalConsent;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpousalConsent implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpousalConsent f104089a = new SpousalConsent();

        @NotNull
        public static final Parcelable.Creator<SpousalConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpousalConsent.f104089a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpousalConsent[i];
            }
        }

        private SpousalConsent() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "SPOUSAL_CONSENT";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Survey;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Survey implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Survey f104090a = new Survey();

        @NotNull
        public static final Parcelable.Creator<Survey> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Survey.f104090a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Survey[i];
            }
        }

        private Survey() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "SURVEY";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(true);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$W8BEN;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class W8BEN implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final W8BEN f104091a = new W8BEN();

        @NotNull
        public static final Parcelable.Creator<W8BEN> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return W8BEN.f104091a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new W8BEN[i];
            }
        }

        private W8BEN() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "W8BEN";
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return new OnboardingPartType.BackendDriven(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart$Workflow;", "Lcom/revolut/retail/feature/trading_onboarding/api/domain/model/OnboardingPart;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow implements OnboardingPart {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104092a;

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
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
            this.f104092a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Workflow) && Intrinsics.f(this.f104092a, ((Workflow) obj2).f104092a);
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final String getName() {
            return "WORKFLOW";
        }

        public final int hashCode() {
            return this.f104092a.hashCode();
        }

        @Override // com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart
        public final OnboardingPartType n4() {
            return OnboardingPartType.FrontendDriven.f104094a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104092a);
        }
    }

    String getName();

    OnboardingPartType n4();
}
