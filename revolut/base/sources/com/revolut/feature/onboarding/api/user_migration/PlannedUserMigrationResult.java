package com.revolut.feature.onboarding.api.user_migration;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "Landroid/os/Parcelable;", "AllRequirementsSatisfied", "UnsatisfiableMigration", "Error", "MigrationNotSupported", "NoPlannedMigrations", "OccupationRequired", "PlaceOfBirthRequired", "QesRequired", "TermsRequired", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$AllRequirementsSatisfied;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$Error;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$MigrationNotSupported;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$NoPlannedMigrations;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$OccupationRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$PlaceOfBirthRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$QesRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$TermsRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$UnsatisfiableMigration;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlannedUserMigrationResult extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$AllRequirementsSatisfied;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllRequirementsSatisfied implements PlannedUserMigrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllRequirementsSatisfied f78214a = new AllRequirementsSatisfied();

        @NotNull
        public static final Parcelable.Creator<AllRequirementsSatisfied> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllRequirementsSatisfied.f78214a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllRequirementsSatisfied[i];
            }
        }

        private AllRequirementsSatisfied() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$Error;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements PlannedUserMigrationResult {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f78215a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f78215a = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Error) && Intrinsics.f(this.f78215a, ((Error) obj2).f78215a);
        }

        public final int hashCode() {
            return this.f78215a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78215a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$MigrationNotSupported;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MigrationNotSupported implements PlannedUserMigrationResult {

        @NotNull
        public static final Parcelable.Creator<MigrationNotSupported> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnsupportedMigrationException f78216a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MigrationNotSupported((UnsupportedMigrationException) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MigrationNotSupported[i];
            }
        }

        public MigrationNotSupported(UnsupportedMigrationException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f78216a = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MigrationNotSupported) && Intrinsics.f(this.f78216a, ((MigrationNotSupported) obj2).f78216a);
        }

        public final int hashCode() {
            return this.f78216a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78216a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$NoPlannedMigrations;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoPlannedMigrations implements PlannedUserMigrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoPlannedMigrations f78217a = new NoPlannedMigrations();

        @NotNull
        public static final Parcelable.Creator<NoPlannedMigrations> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoPlannedMigrations.f78217a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoPlannedMigrations[i];
            }
        }

        private NoPlannedMigrations() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$OccupationRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OccupationRequired implements PlannedUserMigrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OccupationRequired f78218a = new OccupationRequired();

        @NotNull
        public static final Parcelable.Creator<OccupationRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OccupationRequired.f78218a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OccupationRequired[i];
            }
        }

        private OccupationRequired() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$PlaceOfBirthRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlaceOfBirthRequired implements PlannedUserMigrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlaceOfBirthRequired f78219a = new PlaceOfBirthRequired();

        @NotNull
        public static final Parcelable.Creator<PlaceOfBirthRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlaceOfBirthRequired.f78219a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceOfBirthRequired[i];
            }
        }

        private PlaceOfBirthRequired() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$QesRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QesRequired implements PlannedUserMigrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QesRequired f78220a = new QesRequired();

        @NotNull
        public static final Parcelable.Creator<QesRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QesRequired.f78220a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QesRequired[i];
            }
        }

        private QesRequired() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$TermsRequired;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TermsRequired implements PlannedUserMigrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermsRequired f78221a = new TermsRequired();

        @NotNull
        public static final Parcelable.Creator<TermsRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TermsRequired.f78221a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsRequired[i];
            }
        }

        private TermsRequired() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult$UnsatisfiableMigration;", "Lcom/revolut/feature/onboarding/api/user_migration/PlannedUserMigrationResult;", "<init>", "()V", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnsatisfiableMigration implements PlannedUserMigrationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnsatisfiableMigration f78222a = new UnsatisfiableMigration();

        @NotNull
        public static final Parcelable.Creator<UnsatisfiableMigration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnsatisfiableMigration.f78222a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnsatisfiableMigration[i];
            }
        }

        private UnsatisfiableMigration() {
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
}
