package com.revolut.feature.junior_onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mh8.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Creation", "PostOnboarding", "AppInvite", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$AppInvite;", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$Creation;", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$PostOnboarding;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorOnboardingDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$AppInvite;", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AppInvite implements JuniorOnboardingDestination {

        @NotNull
        public static final Parcelable.Creator<AppInvite> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputData f76960a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$AppInvite$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "NextStep", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f76961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f76962b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final NextStep f76963c;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$AppInvite$InputData$NextStep;", "Landroid/os/Parcelable;", "AppAccess", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$AppInvite$InputData$NextStep$AppAccess;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface NextStep extends Parcelable {

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$AppInvite$InputData$NextStep$AppAccess;", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$AppInvite$InputData$NextStep;", "<init>", "()V", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class AppAccess implements NextStep {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final AppAccess f76964a = new AppAccess();

                    @NotNull
                    public static final Parcelable.Creator<AppAccess> CREATOR = new a();

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            parcel.readInt();
                            return AppAccess.f76964a;
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new AppAccess[i];
                        }
                    }

                    private AppAccess() {
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

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData(parcel.readString(), parcel.readString(), (NextStep) parcel.readParcelable(InputData.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(String juniorName, String juniorId, NextStep nextStep) {
                Intrinsics.checkNotNullParameter(juniorName, "juniorName");
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                this.f76961a = juniorName;
                this.f76962b = juniorId;
                this.f76963c = nextStep;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InputData)) {
                    return false;
                }
                InputData inputData = (InputData) obj2;
                return Intrinsics.f(this.f76961a, inputData.f76961a) && Intrinsics.f(this.f76962b, inputData.f76962b) && Intrinsics.f(this.f76963c, inputData.f76963c);
            }

            public final int hashCode() {
                int iC = p.a.c(this.f76961a.hashCode() * 31, 31, this.f76962b);
                NextStep nextStep = this.f76963c;
                return iC + (nextStep == null ? 0 : nextStep.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f76961a);
                dest.writeString(this.f76962b);
                dest.writeParcelable(this.f76963c, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AppInvite(InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppInvite[i];
            }
        }

        public AppInvite(InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f76960a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InputData getF76960a() {
            return this.f76960a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AppInvite) && Intrinsics.f(this.f76960a, ((AppInvite) obj2).f76960a);
        }

        public final int hashCode() {
            return this.f76960a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f76960a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$Creation;", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Creation implements JuniorOnboardingDestination {

        @NotNull
        public static final Parcelable.Creator<Creation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f76965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f76966b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Creation(h.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Creation[i];
            }
        }

        public Creation() {
            this((h) null, 3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h getF76965a() {
            return this.f76965a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Creation)) {
                return false;
            }
            Creation creation = (Creation) obj2;
            return this.f76965a == creation.f76965a && this.f76966b == creation.f76966b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76966b) + (this.f76965a.hashCode() * 31);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF76966b() {
            return this.f76966b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76965a.name());
            dest.writeInt(this.f76966b ? 1 : 0);
        }

        public Creation(h onboardingProductArticle, boolean z) {
            Intrinsics.checkNotNullParameter(onboardingProductArticle, "onboardingProductArticle");
            this.f76965a = onboardingProductArticle;
            this.f76966b = z;
        }

        public /* synthetic */ Creation(h hVar, int i) {
            this((i & 1) != 0 ? h.Once : hVar, (i & 2) != 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$PostOnboarding;", "Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostOnboarding implements JuniorOnboardingDestination {

        @NotNull
        public static final Parcelable.Creator<PostOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputData f76967a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/api/navigation/JuniorOnboardingDestination$PostOnboarding$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f76968a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputData(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(String juniorId) {
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                this.f76968a = juniorId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InputData) && Intrinsics.f(this.f76968a, ((InputData) obj2).f76968a);
            }

            public final int hashCode() {
                return this.f76968a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f76968a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostOnboarding(InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostOnboarding[i];
            }
        }

        public PostOnboarding(InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f76967a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InputData getF76967a() {
            return this.f76967a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostOnboarding) && Intrinsics.f(this.f76967a, ((PostOnboarding) obj2).f76967a);
        }

        public final int hashCode() {
            return this.f76967a.f76968a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f76967a.writeToParcel(dest, i);
        }
    }
}
