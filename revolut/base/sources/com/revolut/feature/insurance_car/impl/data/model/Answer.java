package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\r\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "Landroid/os/Parcelable;", "LicenceType", "LicenceDuration", "EmploymentStatus", "CurrentInsuranceState", "NoClaimsDiscount", "AdditionalClaimsDiscount", "ClaimsState", "ClaimType", "PenaltyPoints", "Mileage", "BinaryAnswer", "Lcom/revolut/feature/insurance_car/impl/data/model/AdditionalDriver$Relationship;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$AdditionalClaimsDiscount;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$BinaryAnswer;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$ClaimType;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$ClaimsState;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$CurrentInsuranceState;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$EmploymentStatus;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$LicenceDuration;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$LicenceType;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$Mileage;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$NoClaimsDiscount;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer$PenaltyPoints;", "Lcom/revolut/feature/insurance_car/impl/data/model/Occupation;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Answer extends Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$AdditionalClaimsDiscount;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "NONE", "ONE_YEAR", "TWO_YEARS", "THREE_YEARS", "FOUR_YEARS", "FIVE_YEARS_AND_MORE", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AdditionalClaimsDiscount implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AdditionalClaimsDiscount[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<AdditionalClaimsDiscount> CREATOR;
        public static final AdditionalClaimsDiscount FIVE_YEARS_AND_MORE;
        public static final AdditionalClaimsDiscount FOUR_YEARS;
        public static final AdditionalClaimsDiscount NONE;
        public static final AdditionalClaimsDiscount ONE_YEAR;
        public static final AdditionalClaimsDiscount THREE_YEARS;
        public static final AdditionalClaimsDiscount TWO_YEARS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return AdditionalClaimsDiscount.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalClaimsDiscount[i];
            }
        }

        static {
            AdditionalClaimsDiscount additionalClaimsDiscount = new AdditionalClaimsDiscount("NONE", 0);
            NONE = additionalClaimsDiscount;
            AdditionalClaimsDiscount additionalClaimsDiscount2 = new AdditionalClaimsDiscount("ONE_YEAR", 1);
            ONE_YEAR = additionalClaimsDiscount2;
            AdditionalClaimsDiscount additionalClaimsDiscount3 = new AdditionalClaimsDiscount("TWO_YEARS", 2);
            TWO_YEARS = additionalClaimsDiscount3;
            AdditionalClaimsDiscount additionalClaimsDiscount4 = new AdditionalClaimsDiscount("THREE_YEARS", 3);
            THREE_YEARS = additionalClaimsDiscount4;
            AdditionalClaimsDiscount additionalClaimsDiscount5 = new AdditionalClaimsDiscount("FOUR_YEARS", 4);
            FOUR_YEARS = additionalClaimsDiscount5;
            AdditionalClaimsDiscount additionalClaimsDiscount6 = new AdditionalClaimsDiscount("FIVE_YEARS_AND_MORE", 5);
            FIVE_YEARS_AND_MORE = additionalClaimsDiscount6;
            AdditionalClaimsDiscount[] additionalClaimsDiscountArr = {additionalClaimsDiscount, additionalClaimsDiscount2, additionalClaimsDiscount3, additionalClaimsDiscount4, additionalClaimsDiscount5, additionalClaimsDiscount6};
            $VALUES = additionalClaimsDiscountArr;
            $ENTRIES = s.n(additionalClaimsDiscountArr);
            CREATOR = new a();
        }

        public static AdditionalClaimsDiscount valueOf(String str) {
            return (AdditionalClaimsDiscount) Enum.valueOf(AdditionalClaimsDiscount.class, str);
        }

        public static AdditionalClaimsDiscount[] values() {
            return (AdditionalClaimsDiscount[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$BinaryAnswer;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "YES", "NO", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BinaryAnswer implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BinaryAnswer[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<BinaryAnswer> CREATOR;
        public static final BinaryAnswer NO;
        public static final BinaryAnswer YES;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return BinaryAnswer.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BinaryAnswer[i];
            }
        }

        static {
            BinaryAnswer binaryAnswer = new BinaryAnswer("YES", 0);
            YES = binaryAnswer;
            BinaryAnswer binaryAnswer2 = new BinaryAnswer("NO", 1);
            NO = binaryAnswer2;
            BinaryAnswer[] binaryAnswerArr = {binaryAnswer, binaryAnswer2};
            $VALUES = binaryAnswerArr;
            $ENTRIES = s.n(binaryAnswerArr);
            CREATOR = new a();
        }

        public static BinaryAnswer valueOf(String str) {
            return (BinaryAnswer) Enum.valueOf(BinaryAnswer.class, str);
        }

        public static BinaryAnswer[] values() {
            return (BinaryAnswer[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$ClaimType;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "NON_FAULT", "FAULT_ACCIDENT", "THEFT", "FIRE", "VANDALISM", "WINDSCREEN", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ClaimType implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ClaimType[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<ClaimType> CREATOR;
        public static final ClaimType FAULT_ACCIDENT;
        public static final ClaimType FIRE;
        public static final ClaimType NON_FAULT;
        public static final ClaimType THEFT;
        public static final ClaimType VANDALISM;
        public static final ClaimType WINDSCREEN;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ClaimType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimType[i];
            }
        }

        static {
            ClaimType claimType = new ClaimType("NON_FAULT", 0);
            NON_FAULT = claimType;
            ClaimType claimType2 = new ClaimType("FAULT_ACCIDENT", 1);
            FAULT_ACCIDENT = claimType2;
            ClaimType claimType3 = new ClaimType("THEFT", 2);
            THEFT = claimType3;
            ClaimType claimType4 = new ClaimType("FIRE", 3);
            FIRE = claimType4;
            ClaimType claimType5 = new ClaimType("VANDALISM", 4);
            VANDALISM = claimType5;
            ClaimType claimType6 = new ClaimType("WINDSCREEN", 5);
            WINDSCREEN = claimType6;
            ClaimType[] claimTypeArr = {claimType, claimType2, claimType3, claimType4, claimType5, claimType6};
            $VALUES = claimTypeArr;
            $ENTRIES = s.n(claimTypeArr);
            CREATOR = new a();
        }

        public static ClaimType valueOf(String str) {
            return (ClaimType) Enum.valueOf(ClaimType.class, str);
        }

        public static ClaimType[] values() {
            return (ClaimType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$ClaimsState;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "NO_CLAIMS", "ONE_CLAIM", "TWO_CLAIMS", "THREE_AND_MORE", "WINDSCREEN_ONLY", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ClaimsState implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ClaimsState[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<ClaimsState> CREATOR;
        public static final ClaimsState NO_CLAIMS;
        public static final ClaimsState ONE_CLAIM;
        public static final ClaimsState THREE_AND_MORE;
        public static final ClaimsState TWO_CLAIMS;
        public static final ClaimsState WINDSCREEN_ONLY;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ClaimsState.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimsState[i];
            }
        }

        static {
            ClaimsState claimsState = new ClaimsState("NO_CLAIMS", 0);
            NO_CLAIMS = claimsState;
            ClaimsState claimsState2 = new ClaimsState("ONE_CLAIM", 1);
            ONE_CLAIM = claimsState2;
            ClaimsState claimsState3 = new ClaimsState("TWO_CLAIMS", 2);
            TWO_CLAIMS = claimsState3;
            ClaimsState claimsState4 = new ClaimsState("THREE_AND_MORE", 3);
            THREE_AND_MORE = claimsState4;
            ClaimsState claimsState5 = new ClaimsState("WINDSCREEN_ONLY", 4);
            WINDSCREEN_ONLY = claimsState5;
            ClaimsState[] claimsStateArr = {claimsState, claimsState2, claimsState3, claimsState4, claimsState5};
            $VALUES = claimsStateArr;
            $ENTRIES = s.n(claimsStateArr);
            CREATOR = new a();
        }

        public static ClaimsState valueOf(String str) {
            return (ClaimsState) Enum.valueOf(ClaimsState.class, str);
        }

        public static ClaimsState[] values() {
            return (ClaimsState[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00032\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$CurrentInsuranceState;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "Companion", "a", "OWN_POLICY", "NO_INSURANCE", "NAMED_DRIVER", "NAMED_DRIVER_OR_INSURED_COMPANY_CAR", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CurrentInsuranceState implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrentInsuranceState[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<CurrentInsuranceState> CREATOR;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final CurrentInsuranceState NAMED_DRIVER;
        public static final CurrentInsuranceState NAMED_DRIVER_OR_INSURED_COMPANY_CAR;
        public static final CurrentInsuranceState NO_INSURANCE;
        public static final CurrentInsuranceState OWN_POLICY;

        /* JADX INFO: renamed from: com.revolut.feature.insurance_car.impl.data.model.Answer$CurrentInsuranceState$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return CurrentInsuranceState.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentInsuranceState[i];
            }
        }

        static {
            CurrentInsuranceState currentInsuranceState = new CurrentInsuranceState("OWN_POLICY", 0);
            OWN_POLICY = currentInsuranceState;
            CurrentInsuranceState currentInsuranceState2 = new CurrentInsuranceState("NO_INSURANCE", 1);
            NO_INSURANCE = currentInsuranceState2;
            CurrentInsuranceState currentInsuranceState3 = new CurrentInsuranceState("NAMED_DRIVER", 2);
            NAMED_DRIVER = currentInsuranceState3;
            CurrentInsuranceState currentInsuranceState4 = new CurrentInsuranceState("NAMED_DRIVER_OR_INSURED_COMPANY_CAR", 3);
            NAMED_DRIVER_OR_INSURED_COMPANY_CAR = currentInsuranceState4;
            CurrentInsuranceState[] currentInsuranceStateArr = {currentInsuranceState, currentInsuranceState2, currentInsuranceState3, currentInsuranceState4};
            $VALUES = currentInsuranceStateArr;
            $ENTRIES = s.n(currentInsuranceStateArr);
            INSTANCE = new Companion();
            CREATOR = new b();
        }

        public static CurrentInsuranceState valueOf(String str) {
            return (CurrentInsuranceState) Enum.valueOf(CurrentInsuranceState.class, str);
        }

        public static CurrentInsuranceState[] values() {
            return (CurrentInsuranceState[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$EmploymentStatus;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "EMPLOYED", "RETIRED", "UNEMPLOYED", "STUDENT", "HOUSEHOLD_DUTIES", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EmploymentStatus implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EmploymentStatus[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<EmploymentStatus> CREATOR;
        public static final EmploymentStatus EMPLOYED;
        public static final EmploymentStatus HOUSEHOLD_DUTIES;
        public static final EmploymentStatus RETIRED;
        public static final EmploymentStatus STUDENT;
        public static final EmploymentStatus UNEMPLOYED;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return EmploymentStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmploymentStatus[i];
            }
        }

        static {
            EmploymentStatus employmentStatus = new EmploymentStatus("EMPLOYED", 0);
            EMPLOYED = employmentStatus;
            EmploymentStatus employmentStatus2 = new EmploymentStatus("RETIRED", 1);
            RETIRED = employmentStatus2;
            EmploymentStatus employmentStatus3 = new EmploymentStatus("UNEMPLOYED", 2);
            UNEMPLOYED = employmentStatus3;
            EmploymentStatus employmentStatus4 = new EmploymentStatus("STUDENT", 3);
            STUDENT = employmentStatus4;
            EmploymentStatus employmentStatus5 = new EmploymentStatus("HOUSEHOLD_DUTIES", 4);
            HOUSEHOLD_DUTIES = employmentStatus5;
            EmploymentStatus[] employmentStatusArr = {employmentStatus, employmentStatus2, employmentStatus3, employmentStatus4, employmentStatus5};
            $VALUES = employmentStatusArr;
            $ENTRIES = s.n(employmentStatusArr);
            CREATOR = new a();
        }

        public static EmploymentStatus valueOf(String str) {
            return (EmploymentStatus) Enum.valueOf(EmploymentStatus.class, str);
        }

        public static EmploymentStatus[] values() {
            return (EmploymentStatus[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$LicenceDuration;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "LESS_THAN_ONE_YEAR", "ONE_YEAR", "FROM_TWO_TO_FOUR_YEARS", "FIVE_YEARS_AND_MORE", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LicenceDuration implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LicenceDuration[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<LicenceDuration> CREATOR;
        public static final LicenceDuration FIVE_YEARS_AND_MORE;
        public static final LicenceDuration FROM_TWO_TO_FOUR_YEARS;
        public static final LicenceDuration LESS_THAN_ONE_YEAR;
        public static final LicenceDuration ONE_YEAR;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return LicenceDuration.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LicenceDuration[i];
            }
        }

        static {
            LicenceDuration licenceDuration = new LicenceDuration("LESS_THAN_ONE_YEAR", 0);
            LESS_THAN_ONE_YEAR = licenceDuration;
            LicenceDuration licenceDuration2 = new LicenceDuration("ONE_YEAR", 1);
            ONE_YEAR = licenceDuration2;
            LicenceDuration licenceDuration3 = new LicenceDuration("FROM_TWO_TO_FOUR_YEARS", 2);
            FROM_TWO_TO_FOUR_YEARS = licenceDuration3;
            LicenceDuration licenceDuration4 = new LicenceDuration("FIVE_YEARS_AND_MORE", 3);
            FIVE_YEARS_AND_MORE = licenceDuration4;
            LicenceDuration[] licenceDurationArr = {licenceDuration, licenceDuration2, licenceDuration3, licenceDuration4};
            $VALUES = licenceDurationArr;
            $ENTRIES = s.n(licenceDurationArr);
            CREATOR = new a();
        }

        public static LicenceDuration valueOf(String str) {
            return (LicenceDuration) Enum.valueOf(LicenceDuration.class, str);
        }

        public static LicenceDuration[] values() {
            return (LicenceDuration[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$LicenceType;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "IRISH_FULL", "IRISH_LEARNER", "EU_FULL", "OTHER", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LicenceType implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LicenceType[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<LicenceType> CREATOR;
        public static final LicenceType EU_FULL;
        public static final LicenceType IRISH_FULL;
        public static final LicenceType IRISH_LEARNER;
        public static final LicenceType OTHER;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return LicenceType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LicenceType[i];
            }
        }

        static {
            LicenceType licenceType = new LicenceType("IRISH_FULL", 0);
            IRISH_FULL = licenceType;
            LicenceType licenceType2 = new LicenceType("IRISH_LEARNER", 1);
            IRISH_LEARNER = licenceType2;
            LicenceType licenceType3 = new LicenceType("EU_FULL", 2);
            EU_FULL = licenceType3;
            LicenceType licenceType4 = new LicenceType("OTHER", 3);
            OTHER = licenceType4;
            LicenceType[] licenceTypeArr = {licenceType, licenceType2, licenceType3, licenceType4};
            $VALUES = licenceTypeArr;
            $ENTRIES = s.n(licenceTypeArr);
            CREATOR = new a();
        }

        public static LicenceType valueOf(String str) {
            return (LicenceType) Enum.valueOf(LicenceType.class, str);
        }

        public static LicenceType[] values() {
            return (LicenceType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$Mileage;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "LESS_THAN_5000", "FROM_5000_TO_10000", "FROM_10000_TO_15000", "FROM_15000_TO_25000", "MORE_THAN_25000", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Mileage implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Mileage[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<Mileage> CREATOR;
        public static final Mileage FROM_10000_TO_15000;
        public static final Mileage FROM_15000_TO_25000;
        public static final Mileage FROM_5000_TO_10000;
        public static final Mileage LESS_THAN_5000;
        public static final Mileage MORE_THAN_25000;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Mileage.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mileage[i];
            }
        }

        static {
            Mileage mileage = new Mileage("LESS_THAN_5000", 0);
            LESS_THAN_5000 = mileage;
            Mileage mileage2 = new Mileage("FROM_5000_TO_10000", 1);
            FROM_5000_TO_10000 = mileage2;
            Mileage mileage3 = new Mileage("FROM_10000_TO_15000", 2);
            FROM_10000_TO_15000 = mileage3;
            Mileage mileage4 = new Mileage("FROM_15000_TO_25000", 3);
            FROM_15000_TO_25000 = mileage4;
            Mileage mileage5 = new Mileage("MORE_THAN_25000", 4);
            MORE_THAN_25000 = mileage5;
            Mileage[] mileageArr = {mileage, mileage2, mileage3, mileage4, mileage5};
            $VALUES = mileageArr;
            $ENTRIES = s.n(mileageArr);
            CREATOR = new a();
        }

        public static Mileage valueOf(String str) {
            return (Mileage) Enum.valueOf(Mileage.class, str);
        }

        public static Mileage[] values() {
            return (Mileage[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$NoClaimsDiscount;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "NONE", "ONE_YEAR", "TWO_YEARS", "THREE_YEARS", "FOUR_YEARS", "FIVE_YEARS", "SIX_YEARS_AND_MORE", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoClaimsDiscount implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NoClaimsDiscount[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<NoClaimsDiscount> CREATOR;
        public static final NoClaimsDiscount FIVE_YEARS;
        public static final NoClaimsDiscount FOUR_YEARS;
        public static final NoClaimsDiscount NONE;
        public static final NoClaimsDiscount ONE_YEAR;
        public static final NoClaimsDiscount SIX_YEARS_AND_MORE;
        public static final NoClaimsDiscount THREE_YEARS;
        public static final NoClaimsDiscount TWO_YEARS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return NoClaimsDiscount.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoClaimsDiscount[i];
            }
        }

        static {
            NoClaimsDiscount noClaimsDiscount = new NoClaimsDiscount("NONE", 0);
            NONE = noClaimsDiscount;
            NoClaimsDiscount noClaimsDiscount2 = new NoClaimsDiscount("ONE_YEAR", 1);
            ONE_YEAR = noClaimsDiscount2;
            NoClaimsDiscount noClaimsDiscount3 = new NoClaimsDiscount("TWO_YEARS", 2);
            TWO_YEARS = noClaimsDiscount3;
            NoClaimsDiscount noClaimsDiscount4 = new NoClaimsDiscount("THREE_YEARS", 3);
            THREE_YEARS = noClaimsDiscount4;
            NoClaimsDiscount noClaimsDiscount5 = new NoClaimsDiscount("FOUR_YEARS", 4);
            FOUR_YEARS = noClaimsDiscount5;
            NoClaimsDiscount noClaimsDiscount6 = new NoClaimsDiscount("FIVE_YEARS", 5);
            FIVE_YEARS = noClaimsDiscount6;
            NoClaimsDiscount noClaimsDiscount7 = new NoClaimsDiscount("SIX_YEARS_AND_MORE", 6);
            SIX_YEARS_AND_MORE = noClaimsDiscount7;
            NoClaimsDiscount[] noClaimsDiscountArr = {noClaimsDiscount, noClaimsDiscount2, noClaimsDiscount3, noClaimsDiscount4, noClaimsDiscount5, noClaimsDiscount6, noClaimsDiscount7};
            $VALUES = noClaimsDiscountArr;
            $ENTRIES = s.n(noClaimsDiscountArr);
            CREATOR = new a();
        }

        public static NoClaimsDiscount valueOf(String str) {
            return (NoClaimsDiscount) Enum.valueOf(NoClaimsDiscount.class, str);
        }

        public static NoClaimsDiscount[] values() {
            return (NoClaimsDiscount[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Answer$PenaltyPoints;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "NO_POINTS", "ONE_POINT", "TWO_POINTS", "THREE_POINTS", "FOUR_POINTS", "FIVE_POINTS", "SIX_POINTS", "SEVEN_AND_MORE", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PenaltyPoints implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PenaltyPoints[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<PenaltyPoints> CREATOR;
        public static final PenaltyPoints FIVE_POINTS;
        public static final PenaltyPoints FOUR_POINTS;
        public static final PenaltyPoints NO_POINTS;
        public static final PenaltyPoints ONE_POINT;
        public static final PenaltyPoints SEVEN_AND_MORE;
        public static final PenaltyPoints SIX_POINTS;
        public static final PenaltyPoints THREE_POINTS;
        public static final PenaltyPoints TWO_POINTS;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return PenaltyPoints.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PenaltyPoints[i];
            }
        }

        static {
            PenaltyPoints penaltyPoints = new PenaltyPoints("NO_POINTS", 0);
            NO_POINTS = penaltyPoints;
            PenaltyPoints penaltyPoints2 = new PenaltyPoints("ONE_POINT", 1);
            ONE_POINT = penaltyPoints2;
            PenaltyPoints penaltyPoints3 = new PenaltyPoints("TWO_POINTS", 2);
            TWO_POINTS = penaltyPoints3;
            PenaltyPoints penaltyPoints4 = new PenaltyPoints("THREE_POINTS", 3);
            THREE_POINTS = penaltyPoints4;
            PenaltyPoints penaltyPoints5 = new PenaltyPoints("FOUR_POINTS", 4);
            FOUR_POINTS = penaltyPoints5;
            PenaltyPoints penaltyPoints6 = new PenaltyPoints("FIVE_POINTS", 5);
            FIVE_POINTS = penaltyPoints6;
            PenaltyPoints penaltyPoints7 = new PenaltyPoints("SIX_POINTS", 6);
            SIX_POINTS = penaltyPoints7;
            PenaltyPoints penaltyPoints8 = new PenaltyPoints("SEVEN_AND_MORE", 7);
            SEVEN_AND_MORE = penaltyPoints8;
            PenaltyPoints[] penaltyPointsArr = {penaltyPoints, penaltyPoints2, penaltyPoints3, penaltyPoints4, penaltyPoints5, penaltyPoints6, penaltyPoints7, penaltyPoints8};
            $VALUES = penaltyPointsArr;
            $ENTRIES = s.n(penaltyPointsArr);
            CREATOR = new a();
        }

        public static PenaltyPoints valueOf(String str) {
            return (PenaltyPoints) Enum.valueOf(PenaltyPoints.class, str);
        }

        public static PenaltyPoints[] values() {
            return (PenaltyPoints[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }
}
