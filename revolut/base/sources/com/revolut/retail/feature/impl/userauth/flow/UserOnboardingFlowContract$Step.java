package com.revolut.retail.feature.impl.userauth.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.impl.userauth.shared.UserAuthUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Authentication", "OnboardingSteps", "NotificationsPermission", "PostActivation", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$Authentication;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$NotificationsPermission;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$OnboardingSteps;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$PostActivation;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UserOnboardingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$Authentication;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Authentication extends UserOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Authentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserAuthUseCase f101659a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Authentication((UserAuthUseCase) parcel.readParcelable(Authentication.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Authentication[i];
            }
        }

        public Authentication(UserAuthUseCase userAuthUseCase) {
            Intrinsics.checkNotNullParameter(userAuthUseCase, "userAuthUseCase");
            this.f101659a = userAuthUseCase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Authentication) && Intrinsics.f(this.f101659a, ((Authentication) obj2).f101659a);
        }

        public final int hashCode() {
            return this.f101659a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101659a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$NotificationsPermission;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotificationsPermission extends UserOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotificationsPermission f101660a = new NotificationsPermission();

        @NotNull
        public static final Parcelable.Creator<NotificationsPermission> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotificationsPermission.f101660a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotificationsPermission[i];
            }
        }

        private NotificationsPermission() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$OnboardingSteps;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnboardingSteps extends UserOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OnboardingSteps> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f101661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f101663c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnboardingSteps((Address) parcel.readParcelable(OnboardingSteps.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnboardingSteps[i];
            }
        }

        public OnboardingSteps(Address address, String fullPhoneNumber, String str, boolean z) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(fullPhoneNumber, "fullPhoneNumber");
            this.f101661a = address;
            this.f101662b = fullPhoneNumber;
            this.f101663c = z;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OnboardingSteps)) {
                return false;
            }
            OnboardingSteps onboardingSteps = (OnboardingSteps) obj2;
            return Intrinsics.f(this.f101661a, onboardingSteps.f101661a) && Intrinsics.f(this.f101662b, onboardingSteps.f101662b) && this.f101663c == onboardingSteps.f101663c && Intrinsics.f(this.d, onboardingSteps.d);
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.c(this.f101661a.hashCode() * 31, 31, this.f101662b), 31, this.f101663c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101661a, i);
            dest.writeString(this.f101662b);
            dest.writeInt(this.f101663c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step$PostActivation;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PostActivation extends UserOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PostActivation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f101664a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PostActivation(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostActivation[i];
            }
        }

        public PostActivation(boolean z) {
            this.f101664a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PostActivation) && this.f101664a == ((PostActivation) obj2).f101664a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101664a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101664a ? 1 : 0);
        }
    }

    private UserOnboardingFlowContract$Step() {
    }
}
