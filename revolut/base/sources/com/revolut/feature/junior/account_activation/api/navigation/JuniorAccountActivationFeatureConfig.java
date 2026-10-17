package com.revolut.feature.junior.account_activation.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.time.LocalDate;
import kf8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Request", "RequestNavigationDestination", "AccountApprovedAlready", "AccountApprovedAlreadyDestination", "CountryMismatchDestination", "CompanyMismatchDestination", "ClaimDestination", "Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$AccountApprovedAlready;", "Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$Request;", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAccountActivationFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$AccountApprovedAlreadyDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountApprovedAlreadyDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountApprovedAlreadyDestination f76619a = new AccountApprovedAlreadyDestination();

        @NotNull
        public static final Parcelable.Creator<AccountApprovedAlreadyDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountApprovedAlreadyDestination.f76619a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountApprovedAlreadyDestination[i];
            }
        }

        private AccountApprovedAlreadyDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$ClaimDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ClaimDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76620a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimDestination[i];
            }
        }

        public ClaimDestination(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f76620a = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimDestination) && Intrinsics.f(this.f76620a, ((ClaimDestination) obj2).f76620a);
        }

        public final int hashCode() {
            return this.f76620a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76620a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$CompanyMismatchDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CompanyMismatchDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CompanyMismatchDestination f76621a = new CompanyMismatchDestination();

        @NotNull
        public static final Parcelable.Creator<CompanyMismatchDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CompanyMismatchDestination.f76621a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompanyMismatchDestination[i];
            }
        }

        private CompanyMismatchDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$CountryMismatchDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryMismatchDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryMismatchDestination f76622a = new CountryMismatchDestination();

        @NotNull
        public static final Parcelable.Creator<CountryMismatchDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryMismatchDestination.f76622a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryMismatchDestination[i];
            }
        }

        private CountryMismatchDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$Request;", "Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig;", "", "toString", "()Ljava/lang/String;", "InputState", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Request extends JuniorAccountActivationFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final JuniorBankingProfile f76623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final InputState f76624h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ActivityAnimation f76625j;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$Request$InputState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputState implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<InputState> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f76626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f76627b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LocalDate f76628c;
            public final b d;
            public final bj0.b e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InputState(parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), bj0.b.valueOf(parcel.readString()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputState[i];
                }
            }

            public InputState(String firstName, String lastName, LocalDate birthDate, b bVar, bj0.b gender, boolean z) {
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(lastName, "lastName");
                Intrinsics.checkNotNullParameter(birthDate, "birthDate");
                Intrinsics.checkNotNullParameter(gender, "gender");
                this.f76626a = firstName;
                this.f76627b = lastName;
                this.f76628c = birthDate;
                this.d = bVar;
                this.e = gender;
                this.f = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InputState)) {
                    return false;
                }
                InputState inputState = (InputState) obj2;
                return Intrinsics.f(this.f76626a, inputState.f76626a) && Intrinsics.f(this.f76627b, inputState.f76627b) && Intrinsics.f(this.f76628c, inputState.f76628c) && this.d == inputState.d && this.e == inputState.e && this.f == inputState.f;
            }

            public final int hashCode() {
                int iA = y.a(p.a.c(this.f76626a.hashCode() * 31, 31, this.f76627b), 31, this.f76628c);
                b bVar = this.d;
                return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iA + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f76626a);
                dest.writeString(this.f76627b);
                dest.writeSerializable(this.f76628c);
                b bVar = this.d;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
                dest.writeString(this.e.name());
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Request((JuniorBankingProfile) parcel.readParcelable(Request.class.getClassLoader()), parcel.readInt() == 0 ? null : InputState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (ActivityAnimation) parcel.readParcelable(Request.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Request[i];
            }
        }

        public /* synthetic */ Request(JuniorBankingProfile juniorBankingProfile, InputState inputState, int i) {
            this(juniorBankingProfile, (i & 2) != 0 ? null : inputState, (i & 4) != 0, null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF76625j() {
            return this.f76625j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Request)) {
                return false;
            }
            Request request = (Request) obj2;
            return Intrinsics.f(this.f76623g, request.f76623g) && Intrinsics.f(this.f76624h, request.f76624h) && this.i == request.i && Intrinsics.f(this.f76625j, request.f76625j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f76623g.hashCode() * 31;
            InputState inputState = this.f76624h;
            int iC = j6.a.c((iHashCode + (inputState == null ? 0 : inputState.hashCode())) * 31, 31, this.i);
            ActivityAnimation activityAnimation = this.f76625j;
            return iC + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76623g, i);
            InputState inputState = this.f76624h;
            if (inputState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputState.writeToParcel(dest, i);
            }
            dest.writeInt(this.i ? 1 : 0);
            dest.writeParcelable(this.f76625j, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(JuniorBankingProfile juniorProfile, InputState inputState, boolean z, ActivityAnimation activityAnimation) {
            super(activityAnimation, new RequestNavigationDestination(juniorProfile, inputState, z), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
            this.f76623g = juniorProfile;
            this.f76624h = inputState;
            this.i = z;
            this.f76625j = activityAnimation;
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$RequestNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestNavigationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<RequestNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBankingProfile f76629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Request.InputState f76630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f76631c;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestNavigationDestination((JuniorBankingProfile) parcel.readParcelable(RequestNavigationDestination.class.getClassLoader()), parcel.readInt() == 0 ? null : Request.InputState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestNavigationDestination[i];
            }
        }

        public RequestNavigationDestination(JuniorBankingProfile juniorProfile, Request.InputState inputState, boolean z) {
            Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
            this.f76629a = juniorProfile;
            this.f76630b = inputState;
            this.f76631c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RequestNavigationDestination)) {
                return false;
            }
            RequestNavigationDestination requestNavigationDestination = (RequestNavigationDestination) obj2;
            return Intrinsics.f(this.f76629a, requestNavigationDestination.f76629a) && Intrinsics.f(this.f76630b, requestNavigationDestination.f76630b) && this.f76631c == requestNavigationDestination.f76631c;
        }

        public final int hashCode() {
            int iHashCode = this.f76629a.hashCode() * 31;
            Request.InputState inputState = this.f76630b;
            return Boolean.hashCode(this.f76631c) + ((iHashCode + (inputState == null ? 0 : inputState.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76629a, i);
            Request.InputState inputState = this.f76630b;
            if (inputState == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputState.writeToParcel(dest, i);
            }
            dest.writeInt(this.f76631c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig$AccountApprovedAlready;", "Lcom/revolut/feature/junior/account_activation/api/navigation/JuniorAccountActivationFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountApprovedAlready extends JuniorAccountActivationFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AccountApprovedAlready> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f76618g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountApprovedAlready((ActivityAnimation) parcel.readParcelable(AccountApprovedAlready.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountApprovedAlready[i];
            }
        }

        public AccountApprovedAlready(ActivityAnimation activityAnimation) {
            super(activityAnimation, AccountApprovedAlreadyDestination.f76619a, false, null, 0, 60);
            this.f76618g = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF76625j() {
            return this.f76618g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountApprovedAlready) && Intrinsics.f(this.f76618g, ((AccountApprovedAlready) obj2).f76618g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f76618g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76618g, i);
        }

        public AccountApprovedAlready() {
            this(null);
        }
    }
}
