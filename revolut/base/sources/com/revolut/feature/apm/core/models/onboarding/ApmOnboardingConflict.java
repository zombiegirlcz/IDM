package com.revolut.feature.apm.core.models.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "Landroid/os/Parcelable;", "TaxIdMissing", "TaxIdMismatch", "PhoneMismatch", "PhoneAlreadyInUse", "BusinessAccountNotRegistered", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$BusinessAccountNotRegistered;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$PhoneAlreadyInUse;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$PhoneMismatch;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$TaxIdMismatch;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$TaxIdMissing;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmOnboardingConflict implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61960a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$BusinessAccountNotRegistered;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BusinessAccountNotRegistered extends ApmOnboardingConflict {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final BusinessAccountNotRegistered f61961b = new BusinessAccountNotRegistered();

        @NotNull
        public static final Parcelable.Creator<BusinessAccountNotRegistered> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BusinessAccountNotRegistered.f61961b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessAccountNotRegistered[i];
            }
        }

        private BusinessAccountNotRegistered() {
            super("IRIS_BUSINESS_ACCOUNT_NOT_REGISTERED");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$PhoneAlreadyInUse;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhoneAlreadyInUse extends ApmOnboardingConflict {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PhoneAlreadyInUse f61962b = new PhoneAlreadyInUse();

        @NotNull
        public static final Parcelable.Creator<PhoneAlreadyInUse> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PhoneAlreadyInUse.f61962b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneAlreadyInUse[i];
            }
        }

        private PhoneAlreadyInUse() {
            super("PHONE_ALREADY_IN_USE");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$PhoneMismatch;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhoneMismatch extends ApmOnboardingConflict {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PhoneMismatch f61963b = new PhoneMismatch();

        @NotNull
        public static final Parcelable.Creator<PhoneMismatch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PhoneMismatch.f61963b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneMismatch[i];
            }
        }

        private PhoneMismatch() {
            super("PHONE_MISMATCH");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$TaxIdMismatch;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TaxIdMismatch extends ApmOnboardingConflict {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TaxIdMismatch f61964b = new TaxIdMismatch();

        @NotNull
        public static final Parcelable.Creator<TaxIdMismatch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TaxIdMismatch.f61964b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxIdMismatch[i];
            }
        }

        private TaxIdMismatch() {
            super("TAX_ID_MISMATCH");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict$TaxIdMissing;", "Lcom/revolut/feature/apm/core/models/onboarding/ApmOnboardingConflict;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxIdMissing extends ApmOnboardingConflict {

        @NotNull
        public static final Parcelable.Creator<TaxIdMissing> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61965b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxIdMissing(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxIdMissing[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxIdMissing(String workflowId) {
            super("TAX_ID_MISSING");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f61965b = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxIdMissing) && Intrinsics.f(this.f61965b, ((TaxIdMissing) obj2).f61965b);
        }

        public final int hashCode() {
            return this.f61965b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61965b);
        }
    }

    public ApmOnboardingConflict(String str) {
        this.f61960a = str;
    }
}
