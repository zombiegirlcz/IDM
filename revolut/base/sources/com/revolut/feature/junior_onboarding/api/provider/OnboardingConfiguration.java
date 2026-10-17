package com.revolut.feature.junior_onboarding.api.provider;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "PersonalDataFormat", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalDataFormat f76969a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration$PersonalDataFormat;", "Landroid/os/Parcelable;", "FirstNameAndLastName", "FirstNameAndSurnames", "Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration$PersonalDataFormat$FirstNameAndLastName;", "Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration$PersonalDataFormat$FirstNameAndSurnames;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PersonalDataFormat extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration$PersonalDataFormat$FirstNameAndLastName;", "Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration$PersonalDataFormat;", "<init>", "()V", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FirstNameAndLastName implements PersonalDataFormat {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FirstNameAndLastName f76970a = new FirstNameAndLastName();

            @NotNull
            public static final Parcelable.Creator<FirstNameAndLastName> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FirstNameAndLastName.f76970a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FirstNameAndLastName[i];
                }
            }

            private FirstNameAndLastName() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration$PersonalDataFormat$FirstNameAndSurnames;", "Lcom/revolut/feature/junior_onboarding/api/provider/OnboardingConfiguration$PersonalDataFormat;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FirstNameAndSurnames implements PersonalDataFormat {

            @NotNull
            public static final Parcelable.Creator<FirstNameAndSurnames> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f76971a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FirstNameAndSurnames(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FirstNameAndSurnames[i];
                }
            }

            public FirstNameAndSurnames(boolean z) {
                this.f76971a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof FirstNameAndSurnames) && this.f76971a == ((FirstNameAndSurnames) obj2).f76971a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f76971a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f76971a ? 1 : 0);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingConfiguration((PersonalDataFormat) parcel.readParcelable(OnboardingConfiguration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingConfiguration[i];
        }
    }

    public OnboardingConfiguration(PersonalDataFormat personalDataFormat) {
        Intrinsics.checkNotNullParameter(personalDataFormat, "personalDataFormat");
        this.f76969a = personalDataFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OnboardingConfiguration) && Intrinsics.f(this.f76969a, ((OnboardingConfiguration) obj2).f76969a);
    }

    public final int hashCode() {
        return this.f76969a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76969a, i);
    }
}
